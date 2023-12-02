package Forms;

import DAO.DAOHoaDon;
import DAO.DAOKhachHang;
import DAO.DAOPhong;
import SLogic.ConvertTime;
import Model.HoaDon;
import Model.KhachHang;
import Model.Phong;
import SLogic.XuatExcel;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @VHSkirik
 */
public class vThongKe extends javax.swing.JInternalFrame {

    ArrayList<HoaDon> dsHoaDon;
    ArrayList<HoaDon> dsHoaDonHienTai;
    ArrayList<Phong> dsPhong;
    ArrayList<KhachHang> dsKhachHang;
    DefaultTableModel dtm_Hoadon;
    DefaultTableModel dtm_Khachhang;
    DefaultTableModel dtm_Phong;
    int doanhThu;
    String doanhthuString;

    public vThongKe() {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        initComponents();
        dtm_Hoadon = (DefaultTableModel) tbHoaDon.getModel();
        dtm_Khachhang = (DefaultTableModel) tbKhachhang.getModel();
        dtm_Phong = (DefaultTableModel) tbPhong.getModel();
        dsHoaDonHienTai = new ArrayList<>();
        doanhthuString = "";
        initData();
        initTable();
        tinhDoanhThu();
        initLabel();
    }

    private void initLabel() {
        lbTongHD.setText(dsHoaDon.size() + "");
        lbTKKhachHang.setText(dsKhachHang.size() + "");
        lbPhongThue.setText(DAOPhong.getInstance().getSLThue() + "");
    }

    private void initData() {
        dsHoaDon = new ArrayList<>();
        for (HoaDon hd : DAOHoaDon.getInstance().getAll()) {
            if (hd.getDathanhtoan() == 1) {
                dsHoaDon.add(hd);
            }
        }
        dsHoaDonHienTai.addAll(dsHoaDon);
        dsPhong = DAOPhong.getInstance().getAll();
        dsKhachHang = DAOKhachHang.getInstance().getAll();
    }

    private void initTableHoaDon() {
        dtm_Hoadon.setRowCount(0);
        for (HoaDon hd : dsHoaDon) {
            dtm_Hoadon.addRow(new Object[]{
                hd.getMahd(),
                hd.getMakh(),
                hd.getManv(),
                hd.getMaphong(),
                hd.getGiaphong(),
                ConvertTime.changeToDMY(hd.getNgaythue()),
                ConvertTime.changeToDMY(hd.getNgaytra()),
                hd.getThanhtien(),
                hd.getDathanhtoan()});
        }
    }

    private void initTableKhachHang() {
        for (KhachHang kh : dsKhachHang) {
            dtm_Khachhang.addRow(new Object[]{
                kh.getMakh(),
                kh.getTenkh(),
                kh.getNgaysinhkh(),
                kh.getCmt(),
                kh.getQuoctich(),
                kh.getGioitinh(),
                kh.getSodienthoai()});
        }
    }

    private void initTablePhong() {
        for (Phong phong : dsPhong) {
            dtm_Phong.addRow(new Object[]{
                phong.getMaphong(),
                phong.getTenphong(),
                phong.getMaloaiphong(),
                phong.getTinhtrang()});
        }
    }

    private void initTable() {
        initTableHoaDon();
        initTableKhachHang();
        initTablePhong();
    }

    private void thongkeDoanhThu() {
        try {
            Date dateBatDau = dcBatDau.getDate();
            Date dateKetThuc = dcKetThuc.getDate();
            if (dateBatDau == null || dateKetThuc == null) {
                JOptionPane.showMessageDialog(this, "Hãy chọn khoảng thời gian cần xem");
                return;
            }
            //hien thi hoa don thoa man dieu kien ngay
            dtm_Hoadon.setRowCount(0);
            dsHoaDonHienTai = new ArrayList<>();
            for (HoaDon hd : dsHoaDon) {
                String ngaythue = ConvertTime.changeToDMY(hd.getNgaythue());
                String ngaytra = ConvertTime.changeToDMY(hd.getNgaytra());

                Date dateNgayThue = ConvertTime.toDate(ngaythue);
                dateNgayThue.setHours(23);
                dateNgayThue.setMinutes(59);
                dateNgayThue.setSeconds(59);

                Date dateNgayTra = ConvertTime.toDate(ngaytra);
                dateNgayTra.setHours(0);
                dateNgayTra.setMinutes(0);
                dateNgayTra.setSeconds(0);

                if (!dateNgayThue.before(dateBatDau) && !dateNgayTra.after(dateKetThuc)) {
                    dsHoaDonHienTai.add(hd);
                    dtm_Hoadon.addRow(new Object[]{
                        hd.getMahd(),
                        hd.getMakh(),
                        hd.getManv(),
                        hd.getMaphong(),
                        hd.getGiaphong(),
                        ConvertTime.changeToDMY(hd.getNgaythue()),
                        ConvertTime.changeToDMY(hd.getNgaytra()),
                        hd.getThanhtien(),
                        hd.getDathanhtoan()});
                }
            }
        } catch (Exception e) {

        }
        tinhDoanhThu();
    }

    private void tinhDoanhThu() {
        doanhThu = 0;
        try {
            for (int i = 0; i < tbHoaDon.getRowCount(); i++) {
                doanhThu += Integer.parseInt(dtm_Hoadon.getValueAt(i, 7).toString());
            }
        } catch (Exception e) {

        }
        //phan cach bo hang nghin
        doanhthuString = NumberFormat.getNumberInstance(Locale.GERMAN).format(doanhThu);
        txtDanhSo.setText(doanhthuString + " VND");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbTongHD = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTKKhachHang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbPhongThue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tabMain = new javax.swing.JTabbedPane();
        pnHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        btXemchitiet = new javax.swing.JButton();
        dcBatDau = new com.toedter.calendar.JDateChooser();
        dcKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        pnKhachHang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKhachhang = new javax.swing.JTable();
        pnPhong = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPhong = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btXuatExcel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtDanhSo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/thanhtoan64px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 70));

        lbTongHD.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        lbTongHD.setForeground(new java.awt.Color(255, 255, 255));
        lbTongHD.setText("100");
        jPanel2.add(lbTongHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, 30));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hóa đơn đã trả");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 270, 90));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TKkhachhang.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 70));

        lbTKKhachHang.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        lbTKKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbTKKhachHang.setText("100");
        jPanel3.add(lbTKKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, 30));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Khách hàng");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 90));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPhongThue.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        lbPhongThue.setForeground(new java.awt.Color(255, 255, 255));
        lbPhongThue.setText("100");
        jPanel4.add(lbPhongThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 140, 30));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phòng đang thuê");
        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bedroom.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 270, 90));

        pnHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã KH", "Mã NV", "Mã Phòng", "Giá", "Ngày thuê", "Ngày trả", "Thành tiền", "Thanh toán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbHoaDon);

        pnHoaDon.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, 840, 310));

        btXemchitiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXemchitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info.png"))); // NOI18N
        btXemchitiet.setText("Xem Chi tiết");
        btXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemchitietActionPerformed(evt);
            }
        });
        pnHoaDon.add(btXemchitiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 166, 60));

        dcBatDau.setDateFormatString("dd-MM-yyy");
        dcBatDau.setMinSelectableDate(new java.util.Date(-62135791139000L));
        pnHoaDon.add(dcBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 200, -1));

        dcKetThuc.setDateFormatString("dd-MM-yyyy");
        pnHoaDon.add(dcKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ngày kết thúc");
        pnHoaDon.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ngày bắt đầu");
        pnHoaDon.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 90, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_reset.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnHoaDon.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 140, 40));

        btThongKe.setBackground(new java.awt.Color(255, 255, 255));
        btThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/test.png"))); // NOI18N
        btThongKe.setText("Thống kê");
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });
        pnHoaDon.add(btThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 140, 40));

        tabMain.addTab("Hóa Đơn", pnHoaDon);

        pnKhachHang.setBackground(new java.awt.Color(255, 255, 255));

        tbKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày sinh", "Căn cước", "Quốc tịch", "Giới tính", "SDT"
            }
        ));
        jScrollPane2.setViewportView(tbKhachhang);

        javax.swing.GroupLayout pnKhachHangLayout = new javax.swing.GroupLayout(pnKhachHang);
        pnKhachHang.setLayout(pnKhachHangLayout);
        pnKhachHangLayout.setHorizontalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnKhachHangLayout.setVerticalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Khách Hàng", pnKhachHang);

        pnPhong.setBackground(new java.awt.Color(255, 255, 255));

        tbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên Phòng", "Mã loại phòng", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbPhong);

        javax.swing.GroupLayout pnPhongLayout = new javax.swing.GroupLayout(pnPhong);
        pnPhong.setLayout(pnPhongLayout);
        pnPhongLayout.setHorizontalGroup(
            pnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhongLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnPhongLayout.setVerticalGroup(
            pnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        tabMain.addTab("Phòng", pnPhong);

        jPanel1.add(tabMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 850, 430));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xuất thống kê dữ liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar1.setRollover(true);

        btXuatExcel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btXuatExcel.setForeground(new java.awt.Color(0, 0, 0));
        btXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excel.png"))); // NOI18N
        btXuatExcel.setText("Xuất Excel");
        btXuatExcel.setFocusable(false);
        btXuatExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXuatExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btXuatExcel);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDanhSo.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        txtDanhSo.setForeground(new java.awt.Color(204, 0, 51));
        txtDanhSo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDanhSo.setText(" 1000.000.000 VND");
        jPanel5.add(txtDanhSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 300, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Doanh Số:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 420, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemchitietActionPerformed
        int currentRow = tbHoaDon.getSelectedRow();
        if (currentRow == -1) {
            JOptionPane.showMessageDialog(this, "Chưa chọn hóa đơn cần xem");
        } else {
            String mahd = dtm_Hoadon.getValueAt(currentRow, 0).toString();
            HoaDon hd = DAOHoaDon.getInstance().getByID(mahd);
            xemCTHD xem = new xemCTHD(new JFrame(), hd);
            xem.setVisible(true);
        }
    }//GEN-LAST:event_btXemchitietActionPerformed

    private void btXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatExcelActionPerformed
        int currentTab = tabMain.getSelectedIndex();
        if (currentTab == -1) {
            JOptionPane.showMessageDialog(this, "Chưa có danh sách nào được chọn");
            return;
        }

        try {
            //chọn nơi lưu
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Chọn nơi lưu");
            //định dạng
            fileChooser.setFileFilter(new FileNameExtensionFilter("Excel file (.xlsx)", "xlsx"));
            int luachon = fileChooser.showSaveDialog(this);
            if (luachon == JFileChooser.APPROVE_OPTION) {
                //kiểm tra tên file đã đặt
                File fileSave = fileChooser.getSelectedFile();
                String url = fileSave.getAbsolutePath();
                if (!url.endsWith(".xlsx")) {
                    fileSave = new File(url + ".xlsx");
                }

                //nếu đang chọn bảng hóa đơn
                if (currentTab == 0) {
                    //lay ngay thang
                    String ngayBatDau = ConvertTime.changeToDMY(ConvertTime.toString(dcBatDau.getDate()));
                    String ngayKetThuc = ConvertTime.changeToDMY(ConvertTime.toString(dcKetThuc.getDate()));
                    if (ngayBatDau == null)
                        ngayBatDau = "";
                    if (ngayKetThuc == null)
                        ngayKetThuc = "";
                    //
                    
                    boolean rs = XuatExcel.dsHoaDon(dsHoaDonHienTai, fileSave, ngayBatDau, ngayKetThuc, doanhthuString);
                    if (rs) {
                        JOptionPane.showMessageDialog(this, "Xuất file thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Xuất file thất bại");
                    }
                }
                //bảng khách hàng
                if (currentTab == 1) {
                    boolean rs = XuatExcel.dsKhacHang(dsKhachHang, fileSave);
                    if (rs) {
                        JOptionPane.showMessageDialog(this, "Xuất file thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Xuất file thất bại");
                    }
                }
                //bảng phòng
                if (currentTab == 2) {
                    boolean rs = XuatExcel.dsPhong(dsPhong, fileSave);
                    if (rs) {
                        JOptionPane.showMessageDialog(this, "Xuất file thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Xuất file thất bại");
                    }
                }
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btXuatExcelActionPerformed

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        thongkeDoanhThu();
    }//GEN-LAST:event_btThongKeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dcBatDau.setDate(null);
        dcKetThuc.setDate(null);
        initTableHoaDon();
        dsHoaDonHienTai.removeAll(dsHoaDonHienTai);
        dsHoaDonHienTai.addAll(dsHoaDon);
        tinhDoanhThu();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btXemchitiet;
    private javax.swing.JButton btXuatExcel;
    private com.toedter.calendar.JDateChooser dcBatDau;
    private com.toedter.calendar.JDateChooser dcKetThuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbPhongThue;
    private javax.swing.JLabel lbTKKhachHang;
    private javax.swing.JLabel lbTongHD;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnKhachHang;
    private javax.swing.JPanel pnPhong;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbKhachhang;
    private javax.swing.JTable tbPhong;
    private javax.swing.JLabel txtDanhSo;
    // End of variables declaration//GEN-END:variables
}
