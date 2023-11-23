package View;

import Model.NhanVien;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author @VHSkirik
 */
public class Main extends javax.swing.JFrame {

    public static NhanVien nhanvien;
    Color defaultColor;
    Color clickColor;

    public Main(NhanVien nhanvien) {
        initComponents();
        this.setIconImage(new ImageIcon("src/Icons/Main.png").getImage());
        this.nhanvien = nhanvien;
//        lbTitle.setText(this.nhanvien.getLoainguoidung().toUpperCase());
//        lbTenNV.setText(this.nhanvien.getHotenvn());
        defaultColor = new Color(0, 153, 255);
        clickColor = new Color(26, 188, 156);
        
    }

    public void logOut() {
        int check = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }

    private void hienthiQLNV() {
        vQLNhanVien qlnhanvien = new vQLNhanVien();
        pnMainContent.removeAll();
        pnMainContent.add(qlnhanvien).setVisible(true);
    }

    private void hienthiQLKH() {
        vQLKhachHang qlkhachhang = new vQLKhachHang();
        pnMainContent.removeAll();
        pnMainContent.add(qlkhachhang).setVisible(true);
    }

    private void hienthiQLDV() {
        vQLDichVu qldichvu = new vQLDichVu();
        pnMainContent.removeAll();
        pnMainContent.add(qldichvu).setVisible(true);
    }

    private void hienthiQLP() {
        vQLPhong qlphong = new vQLPhong();
        pnMainContent.removeAll();
        pnMainContent.add(qlphong).setVisible(true);
    }
    
    private void hienthiQLHD(){
        vQLHoaDon qlhoadon = new vQLHoaDon();
        pnMainContent.removeAll();
        pnMainContent.add(qlhoadon).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnButton = new javax.swing.JPanel();
        pnButtonLogout = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnButtonNV = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnButtonKH = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbTenNV = new javax.swing.JLabel();
        pnButtonHome = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnButtonPhong = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnButtonDichVu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý khách sạn");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnButton.setBackground(new java.awt.Color(0, 153, 255));
        pnButton.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnButtonAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pnButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnButtonLogout.setBackground(new java.awt.Color(255, 102, 102));
        pnButtonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnButtonLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnButtonLogoutMousePressed(evt);
            }
        });
        pnButtonLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_logout.png"))); // NOI18N
        jLabel8.setText(" ĐĂNG XUẤT");
        pnButtonLogout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 32));

        pnButton.add(pnButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 230, 50));

        pnButtonNV.setBackground(new java.awt.Color(0, 153, 255));
        pnButtonNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnButtonNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnButtonNVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonNVMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnButtonNVMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_nhanvien2.png"))); // NOI18N
        jLabel9.setText("NHÂN VIÊN");
        jLabel9.setIconTextGap(10);

        javax.swing.GroupLayout pnButtonNVLayout = new javax.swing.GroupLayout(pnButtonNV);
        pnButtonNV.setLayout(pnButtonNVLayout);
        pnButtonNVLayout.setHorizontalGroup(
            pnButtonNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonNVLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        pnButtonNVLayout.setVerticalGroup(
            pnButtonNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonNVLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(pnButtonNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 60));

        pnButtonKH.setBackground(new java.awt.Color(0, 153, 255));
        pnButtonKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnButtonKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonKHMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnButtonKHMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_khachhang2.png"))); // NOI18N
        jLabel10.setText("KHÁCH HÀNG");
        jLabel10.setIconTextGap(10);

        javax.swing.GroupLayout pnButtonKHLayout = new javax.swing.GroupLayout(pnButtonKH);
        pnButtonKH.setLayout(pnButtonKHLayout);
        pnButtonKHLayout.setHorizontalGroup(
            pnButtonKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonKHLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnButtonKHLayout.setVerticalGroup(
            pnButtonKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonKHLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(pnButtonKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 60));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/admin.png"))); // NOI18N
        lbTitle.setText("Loại NV");
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTitle.setIconTextGap(1);
        lbTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 100));

        lbTenNV.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lbTenNV.setForeground(new java.awt.Color(255, 255, 255));
        lbTenNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenNV.setText("Name");
        jPanel1.add(lbTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 30));

        pnButton.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 130));

        pnButtonHome.setBackground(new java.awt.Color(0, 153, 255));
        pnButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonHomeMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_Home.png"))); // NOI18N
        jLabel11.setText("TRANG CHỦ");
        jLabel11.setIconTextGap(10);

        javax.swing.GroupLayout pnButtonHomeLayout = new javax.swing.GroupLayout(pnButtonHome);
        pnButtonHome.setLayout(pnButtonHomeLayout);
        pnButtonHomeLayout.setHorizontalGroup(
            pnButtonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonHomeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnButtonHomeLayout.setVerticalGroup(
            pnButtonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonHomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(pnButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 60));

        pnButtonPhong.setBackground(new java.awt.Color(0, 153, 255));
        pnButtonPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnButtonPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonPhongMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnButtonPhongMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_phong.png"))); // NOI18N
        jLabel12.setText("PHÒNG");
        jLabel12.setIconTextGap(10);

        javax.swing.GroupLayout pnButtonPhongLayout = new javax.swing.GroupLayout(pnButtonPhong);
        pnButtonPhong.setLayout(pnButtonPhongLayout);
        pnButtonPhongLayout.setHorizontalGroup(
            pnButtonPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonPhongLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnButtonPhongLayout.setVerticalGroup(
            pnButtonPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonPhongLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(pnButtonPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 230, 60));

        pnButtonDichVu.setBackground(new java.awt.Color(0, 153, 255));
        pnButtonDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnButtonDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnButtonDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnButtonDichVuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnButtonDichVuMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_dichvu.png"))); // NOI18N
        jLabel13.setText("DỊCH VỤ");
        jLabel13.setIconTextGap(10);

        javax.swing.GroupLayout pnButtonDichVuLayout = new javax.swing.GroupLayout(pnButtonDichVu);
        pnButtonDichVu.setLayout(pnButtonDichVuLayout);
        pnButtonDichVuLayout.setHorizontalGroup(
            pnButtonDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonDichVuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnButtonDichVuLayout.setVerticalGroup(
            pnButtonDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonDichVuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(pnButtonDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 60));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_phong.png"))); // NOI18N
        jLabel14.setText("HÓA ĐƠN");
        jLabel14.setIconTextGap(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnButton.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 60));

        getContentPane().add(pnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        pnMainContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnMainContentLayout = new javax.swing.GroupLayout(pnMainContent);
        pnMainContent.setLayout(pnMainContentLayout);
        pnMainContentLayout.setHorizontalGroup(
            pnMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        pnMainContentLayout.setVerticalGroup(
            pnMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(pnMainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 870, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnButtonAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnButtonAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnButtonAncestorAdded

    private void pnButtonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonLogoutMouseEntered
        pnButtonLogout.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_pnButtonLogoutMouseEntered

    private void pnButtonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonLogoutMouseExited
        // TODO add your handling code here:
        pnButtonLogout.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_pnButtonLogoutMouseExited

    private void pnButtonNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonNVMouseEntered
        pnButtonNV.setBackground(clickColor);
    }//GEN-LAST:event_pnButtonNVMouseEntered

    private void pnButtonNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonNVMouseExited
        pnButtonNV.setBackground(defaultColor);
    }//GEN-LAST:event_pnButtonNVMouseExited

    private void pnButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonLogoutMouseClicked
        logOut();
    }//GEN-LAST:event_pnButtonLogoutMouseClicked

    private void pnButtonLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonLogoutMousePressed
        logOut();
    }//GEN-LAST:event_pnButtonLogoutMousePressed

    private void pnButtonNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonNVMouseClicked
        hienthiQLNV();
    }//GEN-LAST:event_pnButtonNVMouseClicked

    private void pnButtonNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonNVMousePressed
        hienthiQLNV();
    }//GEN-LAST:event_pnButtonNVMousePressed

    private void pnButtonKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonKHMouseEntered
        pnButtonKH.setBackground(clickColor);
    }//GEN-LAST:event_pnButtonKHMouseEntered

    private void pnButtonKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonKHMouseExited
        pnButtonKH.setBackground(defaultColor);
    }//GEN-LAST:event_pnButtonKHMouseExited

    private void pnButtonKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonKHMousePressed
        hienthiQLKH();
    }//GEN-LAST:event_pnButtonKHMousePressed

    private void pnButtonHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonHomeMouseEntered
        pnButtonHome.setBackground(clickColor);
    }//GEN-LAST:event_pnButtonHomeMouseEntered

    private void pnButtonHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonHomeMouseExited
        pnButtonHome.setBackground(defaultColor);
    }//GEN-LAST:event_pnButtonHomeMouseExited

    private void pnButtonDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonDichVuMouseClicked
        hienthiQLDV();
    }//GEN-LAST:event_pnButtonDichVuMouseClicked

    private void pnButtonDichVuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonDichVuMousePressed
        hienthiQLDV();
    }//GEN-LAST:event_pnButtonDichVuMousePressed

    private void pnButtonPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonPhongMouseClicked
        hienthiQLP();
    }//GEN-LAST:event_pnButtonPhongMouseClicked

    private void pnButtonPhongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonPhongMousePressed
        hienthiQLP();
    }//GEN-LAST:event_pnButtonPhongMousePressed

    private void pnButtonPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonPhongMouseEntered
        pnButtonPhong.setBackground(clickColor);
    }//GEN-LAST:event_pnButtonPhongMouseEntered

    private void pnButtonPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonPhongMouseExited
        pnButtonPhong.setBackground(defaultColor);
    }//GEN-LAST:event_pnButtonPhongMouseExited

    private void pnButtonDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonDichVuMouseEntered
        pnButtonDichVu.setBackground(clickColor);
    }//GEN-LAST:event_pnButtonDichVuMouseEntered

    private void pnButtonDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnButtonDichVuMouseExited
        pnButtonDichVu.setBackground(defaultColor);
    }//GEN-LAST:event_pnButtonDichVuMouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        hienthiQLHD();
    }//GEN-LAST:event_jPanel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(new NhanVien("admin")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTenNV;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnButtonDichVu;
    private javax.swing.JPanel pnButtonHome;
    private javax.swing.JPanel pnButtonKH;
    private javax.swing.JPanel pnButtonLogout;
    private javax.swing.JPanel pnButtonNV;
    private javax.swing.JPanel pnButtonPhong;
    private javax.swing.JPanel pnMainContent;
    // End of variables declaration//GEN-END:variables
}
