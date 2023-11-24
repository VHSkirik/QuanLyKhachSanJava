/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

/**
 *
 * @author @VHSkirik
 */
public class UpdateHoaDon extends javax.swing.JDialog {

    /**
     * Creates new form UpdateHoaDon
     */
    public UpdateHoaDon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        txtMakh = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btHuy = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtGiaphong = new javax.swing.JTextField();
        txtNgaythue = new javax.swing.JTextField();
        txtNgaytra = new javax.swing.JTextField();
        txtThanhtien = new javax.swing.JTextField();
        cbMaPhong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chbThanhToan = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("SỬA HÓA ĐƠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        txtMahd.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtMahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 40));

        txtMakh.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtMakh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 40));

        txtManv.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtManv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManvActionPerformed(evt);
            }
        });
        jPanel1.add(txtManv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        jLabel4.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mã khách hàng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        jLabel6.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mã nhân viên");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, -1));

        jLabel7.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giá phòng");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, -1));

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
        jPanel1.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 140, 40));

        btSubmit.setBackground(new java.awt.Color(153, 153, 255));
        btSubmit.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btSubmit.setText("SỬA");
        btSubmit.setBorder(null);
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 140, 40));

        jLabel8.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mã phòng");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, -1));

        txtGiaphong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtGiaphong.setEnabled(false);
        jPanel1.add(txtGiaphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 320, 40));

        txtNgaythue.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtNgaythue, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 320, 40));

        txtNgaytra.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtNgaytra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 320, 40));

        txtThanhtien.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jPanel1.add(txtThanhtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 320, 40));

        jPanel1.add(cbMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 40));

        jLabel5.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mã hóa đơn");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, -1));

        jLabel9.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ngày thuê");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, -1));

        jLabel10.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ngày trả");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, -1));

        jLabel11.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Thành tiền");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, -1));

        chbThanhToan.setFont(new java.awt.Font("SF Mono", 0, 14)); // NOI18N
        chbThanhToan.setText("Đã Thanh Toán");
        jPanel1.add(chbThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtManvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManvActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateHoaDon dialog = new UpdateHoaDon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbMaPhong;
    private javax.swing.JCheckBox chbThanhToan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtGiaphong;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNgaythue;
    private javax.swing.JTextField txtNgaytra;
    private javax.swing.JTextField txtThanhtien;
    // End of variables declaration//GEN-END:variables
}
