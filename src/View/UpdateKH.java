/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.ConvertTime;
import DAO.DAOKhachHang;
import Model.KhachHang;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author @VHSkirik
 */
public class UpdateKH extends javax.swing.JDialog {

    vQLKhachHang formKH;
    KhachHang kh;

    public UpdateKH(vQLKhachHang parent, JFrame frame) {
        super(frame, true);
        initComponents();
        formKH = parent;
    }

    public UpdateKH(vQLKhachHang parent, JFrame frame, KhachHang kh) {
        super(frame, true);
        initComponents();
        formKH = parent;
        this.kh = kh;
        btSubmit.setText("SỬA");
        lbTitle.setText("SỬA THÔNG TIN KHÁCH HÀNG");
        loadText();
    }

    private void loadText() {
        txtMaKH.setText(kh.getMakh());
        txtMaKH.setEnabled(false);
        txtTenKH.setText(kh.getTenkh());
        cbGioiTinh.setSelectedItem(kh.getGioitinh());
        txtSDT.setText(kh.getSodienthoai());
        txtQuocTich.setText(kh.getQuoctich());
        txtCanCuoc.setText(kh.getCmt());
        txtNgaySinh.setText(kh.getNgaysinhkh());
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
        txtSDT = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtCanCuoc = new javax.swing.JTextField();
        txtQuocTich = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM KHÁCH HÀNG");

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

        txtSDT.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 320, 40));

        txtMaKH.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 40));

        txtTenKH.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 40));

        txtNgaySinh.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });
        jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 40));

        txtCanCuoc.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtCanCuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 320, 40));

        txtQuocTich.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtQuocTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 320, 40));

        jLabel2.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Số điện thoại");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 310, -1));

        jLabel3.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã khách hàng");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Họ Tên");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, -1));

        jLabel5.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giới tính");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        cbGioiTinh.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        jLabel6.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ngày sinh (dd-mm-yyyy)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

        jLabel7.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Căn cước");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, -1));

        jLabel8.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Quốc tịch");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HỦY");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 140, 40));

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
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
        String ma = txtMaKH.getText();
        String ten = txtTenKH.getText();
        String gt = cbGioiTinh.getSelectedItem().toString();
        String ns = ConvertTime.changeToYMD(txtNgaySinh.getText().trim());
        String cmt = txtCanCuoc.getText();
        String qt = txtQuocTich.getText();
        String sdt = txtSDT.getText();

        if (ma.isBlank() || gt.isBlank() || ten.isBlank() || cmt.isBlank() || qt.isBlank() || sdt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (ns == null) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
            } else {
                //dien du thong tin
                if (btSubmit.getText().equals("THÊM")) {
                    //Bấm thêm
                    if (DAOKhachHang.getInstance().getByID(ma) != null) {
                        JOptionPane.showMessageDialog(this, "Khách hàng đã tồn tại!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
                    } else {
                        KhachHang kh = new KhachHang(ma, ten, ns, cmt, qt, gt, sdt);
                        int kq = DAOKhachHang.getInstance().insert(kh);
                        if (kq == -1) {
                            JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else {
                            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                //Sua
                if (btSubmit.getText().equals("SỬA")) {
                    KhachHang kh = new KhachHang(ma, ten, ns, cmt, qt, gt, sdt);
                    int kq = DAOKhachHang.getInstance().update(kh);
                    if (kq == -1) {
                        JOptionPane.showMessageDialog(this, "Sửa thất bại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                formKH.loadDataTable();
                this.dispose();
            }
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtCanCuoc;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
