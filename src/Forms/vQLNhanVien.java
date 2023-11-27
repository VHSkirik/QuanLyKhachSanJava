package Forms;

import SLogic.ConvertTime;
import SLogic.SearchNhanVien;
import DAO.DAONhanVien;
import Model.NhanVien;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @VHSkirik
 */
public class vQLNhanVien extends javax.swing.JInternalFrame {

    DefaultTableModel dtm;

    public vQLNhanVien() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        dtm = (DefaultTableModel) tbNhanVien.getModel();
        loadDataTable();
    }

    public void loadDataTable() {
        ArrayList<NhanVien> dsNhanVien = DAONhanVien.getInstance().getAll();
        dtm.setRowCount(0);
        for (NhanVien nv : dsNhanVien) {
            dtm.addRow(new Object[]{
                nv.getTaikhoan(),
                nv.getHotenvn(),
                nv.getNgaysinhnv(),
                nv.getGioitinhnv(),
                nv.getMatkhau(),
                nv.getLoainguoidung()});
        }
    }

    private void setDataTable(ArrayList<NhanVien> dsHienthi) {
        dtm.setRowCount(0);
        for (NhanVien nv : dsHienthi) {
            dtm.addRow(new Object[]{
                nv.getTaikhoan(),
                nv.getHotenvn(),
                ConvertTime.changeToDMY(nv.getNgaysinhnv()),
                nv.getGioitinhnv(),
                nv.getMatkhau(),
                nv.getLoainguoidung()});
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
        tbNhanVien = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbLoaiTK = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        btReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(870, 644));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài Khoản", "Họ Tên", "Ngày Sinh", "Giới Tính", "Mật Khẩu", "Loại ND"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 850, 510));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar1.setRollover(true);

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThem.setForeground(new java.awt.Color(0, 0, 0));
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThem.setFocusable(false);
        btThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jToolBar1.add(btThem);

        btSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSua.setForeground(new java.awt.Color(0, 0, 0));
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_sua.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSua.setFocusable(false);
        btSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });
        jToolBar1.add(btSua);

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_xoa.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btXoa.setFocusable(false);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jToolBar1.add(btXoa);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbLoaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ Tên" }));
        jPanel2.add(cbLoaiTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel2.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 390, 40));

        btReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_reset.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReset.setIconTextGap(10);
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel2.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 690, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int currentRow = tbNhanVien.getSelectedRow();
        if (currentRow == -1) {
            JOptionPane.showMessageDialog(this, "Chưa có nhân viên nào được chọn!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        } else {
            int rs = JOptionPane.showConfirmDialog(this, "Xác nhận xóa", "Thông Báo", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                String taikhoan = dtm.getValueAt(currentRow, 0).toString();
                int kq = DAONhanVien.getInstance().delete(taikhoan);
                if (kq == -1) {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadDataTable();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        UpdateNhanVien formUpdate = new UpdateNhanVien(this, new JFrame());
        formUpdate.setVisible(true);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int currentRow = tbNhanVien.getSelectedRow();
        if (currentRow == -1) {
            JOptionPane.showMessageDialog(this, "Chưa bọn khách hàng cần sửa!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            String tk = dtm.getValueAt(currentRow, 0).toString();
            NhanVien nv = DAONhanVien.getInstance().getByID(tk);
            UpdateNhanVien formUpdate = new UpdateNhanVien(this, new JFrame(), nv);
            formUpdate.setVisible(true);
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        String luachon = cbLoaiTK.getSelectedItem().toString();
        String noidungTK = txtTimKiem.getText().trim().toLowerCase();
        ArrayList<NhanVien> result = new ArrayList<>();
        switch (luachon) {
            case "Họ Tên":
                result = SearchNhanVien.getAllbyName(noidungTK);
                break;
        }
        setDataTable(result);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        txtTimKiem.setText("");
        loadDataTable();
    }//GEN-LAST:event_btResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbLoaiTK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}