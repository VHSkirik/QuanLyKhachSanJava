package Forms;

import DAO.DAOLoaiPhong;
import DAO.DAOPhong;
import Model.LoaiPhong;
import Model.Phong;
import SLogic.History;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @VHSkirik
 */
public class vQLPhong extends javax.swing.JInternalFrame {

    DefaultTableModel dtm_Loaiphong;
    DefaultTableModel dtm_Phong;
    ArrayList<Phong> dsPhong;

    public vQLPhong() {
        initComponents();
        tbPhong.setAutoCreateRowSorter(true);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        dtm_Loaiphong = (DefaultTableModel) tbLoaiphong.getModel();
        dtm_Phong = (DefaultTableModel) tbPhong.getModel();
        tbLoaiphong.setAutoCreateRowSorter(true);
        tbPhong.setAutoCreateRowSorter(true);
        hienthiLoaiPhong();
        hienthiPhong();
    }

    public void resetText() {
        txtMaloai.setText("");
        txtTenLoai.setText("");
        txtGia.setText("");
        txtMota.setText("");
    }

    public String[] getDSMaLoai() {
        int soHang = tbLoaiphong.getRowCount();
        String dsMaloai[] = new String[soHang];
        for (int i = 0; i < soHang; i++) {
            dsMaloai[i] = dtm_Loaiphong.getValueAt(i, 0).toString();
        }
        return dsMaloai;
    }

    public boolean kiemtraText() {
        boolean rs = true;
        if (txtMaloai.getText().isBlank() || txtTenLoai.getText().isBlank() || txtGia.getText().isBlank() || txtMota.getText().isBlank()) {
            rs = false;
        } else {
            try {
                Integer.parseInt(txtGia.getText());
            } catch (Exception e) {
                rs = false;
            }
        }
        return rs;
    }

    public void hienthiLoaiPhong() {
        ArrayList<LoaiPhong> dsLoaiPhong = DAOLoaiPhong.getInstance().getAll();
        dtm_Loaiphong.setRowCount(0);
        for (LoaiPhong lp : dsLoaiPhong) {
            dtm_Loaiphong.addRow(new Object[]{
                lp.getMaloaiphong(),
                lp.getTenloaiphong(),
                lp.getGiaphong(),
                lp.getMota()});
        }
    }

    public void hienthiPhong() {
        dsPhong = DAOPhong.getInstance().getAll();
        dtm_Phong.setRowCount(0);
        for (Phong phong : dsPhong) {
            dtm_Phong.addRow(new Object[]{
                phong.getMaphong(),
                phong.getTenphong(),
                phong.getMaloaiphong(),
                phong.getTinhtrang()});
        }
    }

    public void hienthiDuLieuLoaiPhong() {
        int currenRowLP = tbLoaiphong.getSelectedRow();
        if (currenRowLP != -1) {
            txtMaloai.setText(dtm_Loaiphong.getValueAt(currenRowLP, 0).toString());
            txtTenLoai.setText(dtm_Loaiphong.getValueAt(currenRowLP, 1).toString());
            txtGia.setText(dtm_Loaiphong.getValueAt(currenRowLP, 2).toString());
            txtMota.setText(dtm_Loaiphong.getValueAt(currenRowLP, 3).toString());
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhong = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btThemPhong = new javax.swing.JButton();
        vtSuaPhong = new javax.swing.JButton();
        btXoaPhong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btResetPhong = new javax.swing.JButton();
        cbTKPhong = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLoaiphong = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        btThemLoai = new javax.swing.JButton();
        btSuaLoai = new javax.swing.JButton();
        btXoaLoai = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btResetLoai = new javax.swing.JButton();
        txtMaloai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Mã Loại", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPhong);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 850, 280));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar1.setRollover(true);

        btThemPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThemPhong.setForeground(new java.awt.Color(0, 0, 0));
        btThemPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        btThemPhong.setText("Thêm");
        btThemPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThemPhong.setFocusable(false);
        btThemPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThemPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btThemPhong);

        vtSuaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vtSuaPhong.setForeground(new java.awt.Color(0, 0, 0));
        vtSuaPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_sua.png"))); // NOI18N
        vtSuaPhong.setText("Sửa");
        vtSuaPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vtSuaPhong.setFocusable(false);
        vtSuaPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vtSuaPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        vtSuaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtSuaPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(vtSuaPhong);

        btXoaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXoaPhong.setForeground(new java.awt.Color(0, 0, 0));
        btXoaPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_xoa.png"))); // NOI18N
        btXoaPhong.setText("Xóa");
        btXoaPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btXoaPhong.setFocusable(false);
        btXoaPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoaPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btXoaPhong);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btResetPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btResetPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_reset.png"))); // NOI18N
        btResetPhong.setText("Reset");
        btResetPhong.setIconTextGap(10);
        btResetPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetPhongActionPerformed(evt);
            }
        });
        jPanel2.add(btResetPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, 50));

        cbTKPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Phòng" }));
        jPanel2.add(cbTKPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel2.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 370, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 690, 80));

        tbLoaiphong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại", "Tên Loại", "Giá", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoaiphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiphongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLoaiphong);
        if (tbLoaiphong.getColumnModel().getColumnCount() > 0) {
            tbLoaiphong.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbLoaiphong.getColumnModel().getColumn(1).setPreferredWidth(5);
            tbLoaiphong.getColumnModel().getColumn(2).setPreferredWidth(5);
            tbLoaiphong.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 850, 150));

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng Loại Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar2.setRollover(true);

        btThemLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThemLoai.setForeground(new java.awt.Color(0, 0, 0));
        btThemLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        btThemLoai.setText("Thêm");
        btThemLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThemLoai.setFocusable(false);
        btThemLoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThemLoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThemLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemLoaiActionPerformed(evt);
            }
        });
        jToolBar2.add(btThemLoai);

        btSuaLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSuaLoai.setForeground(new java.awt.Color(0, 0, 0));
        btSuaLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_sua.png"))); // NOI18N
        btSuaLoai.setText("Sửa");
        btSuaLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSuaLoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSuaLoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSuaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaLoaiActionPerformed(evt);
            }
        });
        jToolBar2.add(btSuaLoai);

        btXoaLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXoaLoai.setForeground(new java.awt.Color(0, 0, 0));
        btXoaLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_xoa.png"))); // NOI18N
        btXoaLoai.setText("Xóa");
        btXoaLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btXoaLoai.setFocusable(false);
        btXoaLoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoaLoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXoaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaLoaiActionPerformed(evt);
            }
        });
        jToolBar2.add(btXoaLoai);
        jToolBar2.add(jSeparator2);

        btResetLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btResetLoai.setForeground(new java.awt.Color(0, 0, 0));
        btResetLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_reset.png"))); // NOI18N
        btResetLoai.setText("Reset");
        btResetLoai.setFocusable(false);
        btResetLoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btResetLoai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btResetLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetLoaiActionPerformed(evt);
            }
        });
        jToolBar2.add(btResetLoai);

        jPanel1.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 80));

        txtMaloai.setNextFocusableComponent(txtTenLoai);
        txtMaloai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaloaiKeyPressed(evt);
            }
        });
        jPanel1.add(txtMaloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, -1));
        jPanel1.add(txtTenLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 180, -1));

        txtGia.setNextFocusableComponent(txtMota);
        jPanel1.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 180, -1));

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane3.setViewportView(txtMota);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 350, 70));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mã loại");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tên loại");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mô tả");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 50, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Giá");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaPhongActionPerformed
        int currentRowPhong = tbPhong.getSelectedRow();
        if (currentRowPhong == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn bản ghi cần xóa");
        } else {
            String maphong = dtm_Phong.getValueAt(currentRowPhong, 0).toString();
            int rsXacnhan = JOptionPane.showConfirmDialog(this, "Xác nhận xóa phòng có mã " + maphong + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (rsXacnhan == JOptionPane.YES_OPTION) {
                //thực hiện xóa.
                int rsXoa = DAOPhong.getInstance().delete(maphong);
                if (rsXoa == -1) {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    History.addAction("XÓA phòng mã " + maphong);
                    hienthiPhong();
                }
            }
        }
    }//GEN-LAST:event_btXoaPhongActionPerformed

    private void btXoaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaLoaiActionPerformed
        int currentRowLoai = tbLoaiphong.getSelectedRow();
        //kiem tra chon
        if (currentRowLoai == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn bản ghi cần xóa");
        } else {
            String maloaiphong = dtm_Loaiphong.getValueAt(currentRowLoai, 0).toString();
            //xác nhận xóa
            int rsXacnhan = JOptionPane.showConfirmDialog(this, "Xác nhận xóa loại phòng có mã " + maloaiphong + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (rsXacnhan == JOptionPane.YES_OPTION) {
                //thực hiện xóa.
                int rsXoa = DAOLoaiPhong.getInstance().delete(maloaiphong);
                if (rsXoa == -1) {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    History.addAction("XÓA loại phòng mã " + maloaiphong);
                    hienthiLoaiPhong();
                }
            }
        }
    }//GEN-LAST:event_btXoaLoaiActionPerformed

    private void btResetLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetLoaiActionPerformed
        resetText();
        txtMaloai.requestFocus();
    }//GEN-LAST:event_btResetLoaiActionPerformed

    private void btThemLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemLoaiActionPerformed
        //kiểm tra đầu vào
        if (kiemtraText() == false) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại thông tin");
        } else {
            //Xác nhận thêm
            int rs = JOptionPane.showConfirmDialog(this, "Thêm bản ghi hiện tại?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                //Kiem tra ton tai
                String maloaiphong = txtMaloai.getText();
                if (DAOLoaiPhong.getInstance().getByID(maloaiphong) != null) {
                    JOptionPane.showMessageDialog(this, "Loại phòng đã tồn tại");
                } else {
                    //Thực hiện thêm
                    String tenloaiphong = txtTenLoai.getText();
                    int giaphong = Integer.parseInt(txtGia.getText());
                    String mota = txtMota.getText();
                    LoaiPhong lp = new LoaiPhong(maloaiphong, tenloaiphong, giaphong, mota);
                    int kqThem = DAOLoaiPhong.getInstance().insert(lp);
                    //Kiểm tra kết quả thêm
                    if (kqThem == -1) {
                        JOptionPane.showMessageDialog(this, "Thêm thất bại");
                    } else {
                        //thông báo và làm mới danh sách
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        History.addAction("THÊM loại phòng mã " + maloaiphong);
                        resetText();
                        hienthiLoaiPhong();
                    }
                }
            }
        }
    }//GEN-LAST:event_btThemLoaiActionPerformed

    private void btSuaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaLoaiActionPerformed
        //kiem tra dien du thong tin
        if (kiemtraText() == false) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại thông tin");
        } else {
            //Xác Nhận sửa?
            int rsXacnhan = JOptionPane.showConfirmDialog(this, "Xác nhận sửa?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (rsXacnhan == JOptionPane.YES_OPTION) {
                //kiểm tra mã loại
                String maloaiphong = txtMaloai.getText();
                if (DAOLoaiPhong.getInstance().getByID(maloaiphong) == null) {
                    JOptionPane.showMessageDialog(this, "Mã loại phòng không đúng");
                } else {
                    //cập nhật
                    String tenloaiphong = txtTenLoai.getText();
                    int gia = Integer.parseInt(txtGia.getText());
                    String mota = txtMota.getText();
                    LoaiPhong lp = new LoaiPhong(maloaiphong, tenloaiphong, gia, mota);
                    int rsSua = DAOLoaiPhong.getInstance().update(lp);
                    if (rsSua == -1) {
                        JOptionPane.showMessageDialog(this, "Sửa thất bại");
                    } else {
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        History.addAction("Sửa loại phòng mã " + maloaiphong);
                        hienthiLoaiPhong();
                    }
                }
            }
        }
    }//GEN-LAST:event_btSuaLoaiActionPerformed

    private void tbLoaiphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiphongMouseClicked
        hienthiDuLieuLoaiPhong();
    }//GEN-LAST:event_tbLoaiphongMouseClicked

    private void txtMaloaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaloaiKeyPressed

    }//GEN-LAST:event_txtMaloaiKeyPressed

    private void btThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemPhongActionPerformed
        //Khoi tao dialog để thêm
        UpdatePhong themphong = new UpdatePhong(this, new JFrame(), getDSMaLoai(), null);
        themphong.setVisible(true);
    }//GEN-LAST:event_btThemPhongActionPerformed

    private void vtSuaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtSuaPhongActionPerformed
        int currentRowPhong = tbPhong.getSelectedRow();
        //kiểm tra chọn
        if (currentRowPhong == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn phòng cần sửa");
        } else {
            //khởi tạo dialog để sửa
            String maphong = dtm_Phong.getValueAt(currentRowPhong, 0).toString();
            UpdatePhong suaphong = new UpdatePhong(this, new JFrame(), getDSMaLoai(), maphong);
            suaphong.setVisible(true);
        }
    }//GEN-LAST:event_vtSuaPhongActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed

    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        //Hiển thị danh sách phòng theo txtTimKiem
        String text = txtTimKiem.getText().trim().toLowerCase();
        dtm_Phong.setRowCount(0);
        for (Phong phong : dsPhong) {
            if (phong.getMaphong().toLowerCase().contains(text)) {
                dtm_Phong.addRow(new Object[]{
                    phong.getMaphong(),
                    phong.getTenphong(),
                    phong.getMaloaiphong(),
                    phong.getTinhtrang()});
            }
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btResetPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetPhongActionPerformed
        txtTimKiem.setText("");
        hienthiPhong();
    }//GEN-LAST:event_btResetPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btResetLoai;
    private javax.swing.JButton btResetPhong;
    private javax.swing.JButton btSuaLoai;
    private javax.swing.JButton btThemLoai;
    private javax.swing.JButton btThemPhong;
    private javax.swing.JButton btXoaLoai;
    private javax.swing.JButton btXoaPhong;
    private javax.swing.JComboBox<String> cbTKPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tbLoaiphong;
    private javax.swing.JTable tbPhong;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaloai;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtTenLoai;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JButton vtSuaPhong;
    // End of variables declaration//GEN-END:variables
}
