package Forms;

import SLogic.ConvertTime;
import DAO.DAONhanVien;
import Model.NhanVien;
import SLogic.History;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UpdateNhanVien extends javax.swing.JDialog {

    vQLNhanVien formNV;
    NhanVien nhanvien;

    public UpdateNhanVien(vQLNhanVien parent, java.awt.Frame frame) {
        super(frame, true);
        initComponents();
        formNV = parent;
    }

    public UpdateNhanVien(vQLNhanVien parent, java.awt.Frame frame, NhanVien nhanvien) {
        super(frame, true);
        initComponents();
        formNV = parent;
        this.nhanvien = nhanvien;
        loadText();
        txtTaikhoan.setEnabled(false);
        lbTitle.setText("UPDATE THÔNG TIN NV");
        btSubmit.setText("UPDATE");
    }

    private void loadText() {
        txtTaikhoan.setText(nhanvien.getTaikhoan());
        txtTenNV.setText(nhanvien.getHotenvn());
        txtNgaySinh.setText(ConvertTime.changeToDMY(nhanvien.getNgaysinhnv()));
        cbGioiTinh.setSelectedItem(nhanvien.getGioitinhnv());
        cbLoaiNV.setSelectedItem(nhanvien.getLoainguoidung());
        txtMatkhau.setText(nhanvien.getMatkhau());
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
        txtTaikhoan = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtMatkhau = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        cbLoaiNV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM NHÂN VIÊN");

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

        txtTaikhoan.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 40));

        txtTenNV.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 40));

        txtNgaySinh.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });
        jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 40));

        txtMatkhau.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtMatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 320, 40));

        jLabel3.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tài khoản");
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
        jLabel7.setText("Mật khẩu");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, -1));

        jLabel8.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Loại");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 140, 40));

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
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 40));

        cbLoaiNV.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        cbLoaiNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nhanvien", "admin" }));
        jPanel1.add(cbLoaiNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Xác nhận hủy", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
        String tk = txtTaikhoan.getText();
        String hoten = txtTenNV.getText();
        String ns = ConvertTime.changeToYMD(txtNgaySinh.getText());
        String gt = cbGioiTinh.getSelectedItem().toString();
        String mk = txtMatkhau.getText();
        String loai = cbLoaiNV.getSelectedItem().toString();

        if (tk.isBlank() || hoten.isBlank() || gt.isBlank() || mk.isBlank() || loai.isBlank()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (ns == null) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
            } else {
                //check xong thong tin
                if (btSubmit.getText().equals("THÊM")) {
                    if (DAONhanVien.getInstance().getByID(tk) != null) {
                        JOptionPane.showMessageDialog(this, "Nhân viên đã tồn tại!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
                    } else {
                        NhanVien nv = new NhanVien(tk, hoten, ns, gt, mk, loai);
                        int kq = DAONhanVien.getInstance().insert(nv);
                        if (kq == -1) {
                            JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else {
                            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                            History.addAction("THÊM nhân viên có mã " + tk);
                            formNV.loadTableNhanVien();
                            this.dispose();
                        }
                    }
                }
                if (btSubmit.getText().equals("UPDATE")) {
                    NhanVien nv = new NhanVien(tk, hoten, ns, gt, mk, loai);
                    int kq = DAONhanVien.getInstance().update(nv);
                    if (kq == -1) {
                        JOptionPane.showMessageDialog(this, "Sửa thất bại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                        History.addAction("SỬA nhân viên có mã " + tk);
                        formNV.loadTableNhanVien();
                        this.dispose();
                    }
                }

            }
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbLoaiNV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtMatkhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
