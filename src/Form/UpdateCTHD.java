package Form;

import Logic.LogicHoaDon;
import DAO.DAOChiTietHoaDon;
import DAO.DAODichVu;
import Model.ChiTietHoaDon;
import Model.DichVu;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author @VHSkirik
 */
public class UpdateCTHD extends javax.swing.JDialog {

    private vQLHoaDon fromHoaDon;
    LinkedHashMap<String, String> hmDichVu = new LinkedHashMap<>();
    ChiTietHoaDon cthdCu;

    public UpdateCTHD(vQLHoaDon parent, JFrame frame, String mahd) {
        super(frame, true);
        this.fromHoaDon = parent;
        initComponents();
        txtMahd.setText(mahd);
    }

    public UpdateCTHD(vQLHoaDon parent, JFrame frame, ChiTietHoaDon cthd) {
        super(frame, true);
        this.fromHoaDon = parent;
        this.cthdCu = cthd;
        initComponents();
        setDataUpdate();

    }

    public void loadComboBox() {
        for (String s : hmDichVu.keySet()) {
            cbMadv.addItem(s);
        }
    }

    //load gia khi chon ma tu combobox
    public void loadDsGia() {
        String gia = hmDichVu.get(cbMadv.getSelectedItem());
        txtDongia.setText(gia);
    }

    //nhung thay doi khi chuyen sang update
    private void setDataUpdate() {
        lbTitle.setText("SỬA CHI TIẾT HÓA ĐƠN");
        btSubmit.setText("UPDATE");
        txtMahd.setText(cthdCu.getMahd());
        cbMadv.setSelectedItem(cthdCu.getMadichvu());
        txtSoluong.setText(cthdCu.getSoluong() + "");
    }

    //khoi tao gia tri hashmap va them vao combox khi mo form
    private void setupData() {
        ArrayList<DichVu> dsDichVu = DAODichVu.getInstance().getAll();
        for (DichVu dv : dsDichVu) {
            hmDichVu.put(dv.getMadichvu(), dv.getGiadichvu() + "");
        }
        loadComboBox();
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
        lbTitle = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        txtDongia = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btHuy = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        cbMadv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM CHI TIẾT HÓA ĐƠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        txtMahd.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtMahd.setEnabled(false);
        jPanel1.add(txtMahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 40));

        txtDongia.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtDongia.setEnabled(false);
        txtDongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        txtSoluong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 40));

        jLabel3.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã hóa đơn");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mã dịch vụ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, -1));

        jLabel6.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Đơn giá");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, -1));

        jLabel7.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Số lượng");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, -1));

        btHuy.setBackground(new java.awt.Color(255, 0, 51));
        btHuy.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 255, 255));
        btHuy.setText("HỦY");
        btHuy.setBorder(null);
        btHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, 40));

        btSubmit.setBackground(new java.awt.Color(153, 153, 255));
        btSubmit.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btSubmit.setText("THÊM");
        btSubmit.setBorder(null);
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 40));

        cbMadv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMadvActionPerformed(evt);
            }
        });
        jPanel1.add(cbMadv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDongiaActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Xác nhận hủy", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed

        try {
            String mahd = txtMahd.getText();
            String madv = cbMadv.getSelectedItem().toString();
            int dongia = Integer.parseInt(txtDongia.getText());
            int soluong = Integer.parseInt(txtSoluong.getText());
            if (mahd.isBlank() || madv.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa điền đủ thông tin");
            } else {
                ChiTietHoaDon cthdMoi = new ChiTietHoaDon(mahd, madv, dongia, soluong);
                if (btSubmit.getText().equals("UPDATE")) {
                    DAOChiTietHoaDon.getInstance().delete(cthdCu.getMahd(), cthdCu.getMadichvu());
                }
                int rs = LogicHoaDon.themCTHD(cthdMoi);
                if (rs == -1) {
                    JOptionPane.showMessageDialog(this, btSubmit.getText() + " thất bại");
                } else {
                    JOptionPane.showMessageDialog(this, btSubmit.getText() + " thành công");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Hãy kiểm tra lại thông tin");
            return;
        }
        fromHoaDon.hienthiCTHD();
        this.dispose();
    }//GEN-LAST:event_btSubmitActionPerformed

    private void cbMadvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMadvActionPerformed
        loadDsGia();
    }//GEN-LAST:event_cbMadvActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setupData();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbMadv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtSoluong;
    // End of variables declaration//GEN-END:variables
}
