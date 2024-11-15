package Forms;

import DAO.DAODichVu;
import Model.DichVu;
import SLogic.History;
import SLogic.XuatExcel;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @VHSkirik
 */
public class vQLDichVu extends javax.swing.JInternalFrame {

    DefaultTableModel dtm;
    ArrayList<DichVu> dsDichVu;

    public vQLDichVu() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        this.dtm = (DefaultTableModel) tbDichVu.getModel();
        hienthiDV();
    }

    private void hienthiDV() {
        dsDichVu = DAODichVu.getInstance().getAll();
        dtm.setRowCount(0);
        for (DichVu dv : dsDichVu) {
            dtm.addRow(new Object[]{
                dv.getMadichvu(),
                dv.getTendichvu(),
                dv.getGiadichvu()});
        }
    }

    private boolean kiemtraText() {
        boolean rs = true;
        String madichvu = txtMaDV.getText();
        String tendichvu = txtTenDV.getText();
        if (madichvu.isBlank() || tendichvu.isBlank()) {
            rs = false;
        }
        try {
            Integer.parseInt(txtGia.getText());
        } catch (Exception e) {
            rs = false;
        }
        return rs;
    }

    private void clearText() {
        txtMaDV.setText("");
        txtTenDV.setText("");
        txtGia.setText("");
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
        tbDichVu = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        txtMaDV = new javax.swing.JTextField();
        txtTenDV = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btReset = new javax.swing.JButton();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Dịch Vụ", "Tên Dịch Vụ", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDichVu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 850, 500));

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
        jToolBar1.add(jSeparator1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excel.png"))); // NOI18N
        jButton2.setText("Xuất Excel");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 90));
        jPanel1.add(txtMaDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 210, 30));
        jPanel1.add(txtTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 210, 30));
        jPanel1.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Giá");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã dịch vụ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tên dịch vụ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 90, -1));

        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_reset.png"))); // NOI18N
        btReset.setText("RESET");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel1.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int currentRow = tbDichVu.getSelectedRow();
        if (currentRow == -1) {
            JOptionPane.showMessageDialog(this, "Chưa chọn dịch vụ cần xóa");
        } else {
            if (JOptionPane.showConfirmDialog(this, "Xác nhận xóa?", "Xác Nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String madichvu = dtm.getValueAt(currentRow, 0).toString();
                //kiểm tra
                int rs = DAODichVu.getInstance().delete(madichvu);
                if (rs == -1) {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    History.addAction("XÓA dịch vụ mã " + madichvu);
                    clearText();
                    hienthiDV();
                }
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if (kiemtraText() == false) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại thông tin");
        } else {
            //kiểm tra trùng lặp mã
            String madichvu = txtMaDV.getText().trim();
            if (DAODichVu.getInstance().getByID(madichvu) != null) {
                JOptionPane.showMessageDialog(this, "Dịch vụ đã tồn tại");
            } else {
                //xac nhan them
                int rsXacNhan = JOptionPane.showConfirmDialog(this, "Thêm bản ghi?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
                if (rsXacNhan == JOptionPane.YES_OPTION) {
                    //tiến hành thêm
                    String tendichvu = txtTenDV.getText().trim();
                    int giaphong = Integer.parseInt(txtGia.getText().trim());
                    DichVu dv = new DichVu(madichvu, tendichvu, giaphong);
                    //kiểm tra kết quả thêm
                    int rs = DAODichVu.getInstance().insert(dv);
                    if (rs == -1) {
                        JOptionPane.showMessageDialog(this, "Thêm thất bại");
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        History.addAction("THÊM dịch vụ mã " + madichvu);
                        clearText();
                        hienthiDV();
                    }
                }
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
        int currentRow = tbDichVu.getSelectedRow();
        if (currentRow != -1) {
            String madichvu = dtm.getValueAt(currentRow, 0).toString();
            String tendichvu = dtm.getValueAt(currentRow, 1).toString();
            String gia = dtm.getValueAt(currentRow, 2).toString();
            txtMaDV.setText(madichvu);
            txtTenDV.setText(tendichvu);
            txtGia.setText(gia);
        }
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if (kiemtraText() == false) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại thông tin");
        } else {
            //kiểm tra mã
            String madichvu = txtMaDV.getText().trim();
            if (DAODichVu.getInstance().getByID(madichvu) == null) {
                JOptionPane.showMessageDialog(this, "Mã dịch vụ không đúng");
            } else {
                //xac nhan them
                int rsXacNhan = JOptionPane.showConfirmDialog(this, "Sửa bản ghi?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
                if (rsXacNhan == JOptionPane.YES_OPTION) {
                    //tiến hành thêm
                    String tendichvu = txtTenDV.getText().trim();
                    int giaphong = Integer.parseInt(txtGia.getText().trim());
                    DichVu dv = new DichVu(madichvu, tendichvu, giaphong);
                    //kiểm tra kết quả thêm
                    int rs = DAODichVu.getInstance().update(dv);
                    if (rs == -1) {
                        JOptionPane.showMessageDialog(this, "Sửa thất bại");
                    } else {
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        History.addAction("SỦA dịch vụ mã " + madichvu);
                        clearText();
                        hienthiDV();
                    }
                }
            }
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        clearText();
    }//GEN-LAST:event_btResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
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

                boolean rs = XuatExcel.dsDichVu(dsDichVu, fileSave);
                if (rs) {
                    JOptionPane.showMessageDialog(this, "Xuất file thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Xuất file thất bại");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbDichVu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextField txtTenDV;
    // End of variables declaration//GEN-END:variables
}
