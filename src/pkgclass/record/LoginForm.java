package pkgclass.record;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm extends javax.swing.JFrame 
{

    public LoginForm() 
    {
        initComponents();
        PasswordTextBox.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyTyped(KeyEvent e) 
            {
                char c = e.getKeyChar();
                if (c != KeyEvent.CHAR_UNDEFINED && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_DELETE && c != KeyEvent.VK_ESCAPE) {
                    e.setKeyChar('*');
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ParentPanelOfSidePanel = new javax.swing.JPanel();
        RightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginButton = new com.mycompany.classrecord.MyButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameTextBox = new com.mycompany.classrecord.FTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordTextBox = new com.mycompany.classrecord.FTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateAccountButton = new com.mycompany.classrecord.MyButton();
        jButton1 = new javax.swing.JButton();
        CreateAccountPanel = new javax.swing.JPanel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 690));
        setPreferredSize(new java.awt.Dimension(870, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 232, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(139, 116, 214));
        jLabel9.setText("Class");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(249, 113, 98));
        jLabel10.setText("record");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/knowledge.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 260, 260));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 650));

        ParentPanelOfSidePanel.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanelOfSidePanel.setLayout(new java.awt.CardLayout());

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(32, 122, 202));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 122, 202));
        jLabel1.setText("Welcome back!");
        RightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 53));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Icon 1 (1).png"))); // NOI18N
        RightPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Nice seeing you again");
        RightPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 30));

        LoginButton.setText("Login");
        LoginButton.setBorderPainted(false);
        LoginButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        LoginButton.setRadius(30);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        RightPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Login to your account");
        RightPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, -1));
        RightPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        UsernameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        RightPanel.add(UsernameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 230, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        RightPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username");
        RightPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        PasswordTextBox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        PasswordTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextBoxActionPerformed(evt);
            }
        });
        RightPanel.add(PasswordTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 230, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/user (1).png"))); // NOI18N
        RightPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/lock.png"))); // NOI18N
        RightPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        CreateAccountButton.setText("Create Account");
        CreateAccountButton.setBorderPainted(false);
        CreateAccountButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreateAccountButton.setRadius(30);
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });
        RightPanel.add(CreateAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Forgot Password?");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        RightPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 120, 30));

        ParentPanelOfSidePanel.add(RightPanel, "card2");

        CreateAccountPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CreateAccountPanelLayout = new javax.swing.GroupLayout(CreateAccountPanel);
        CreateAccountPanel.setLayout(CreateAccountPanelLayout);
        CreateAccountPanelLayout.setHorizontalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        CreateAccountPanelLayout.setVerticalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        ParentPanelOfSidePanel.add(CreateAccountPanel, "card3");

        BackgroundPanel.add(ParentPanelOfSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 410, 650));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 650));

        setSize(new java.awt.Dimension(893, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        new MainForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextBoxActionPerformed

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        ParentPanelOfSidePanel.removeAll();
        ParentPanelOfSidePanel.add(CreateAccountPanel);
        ParentPanelOfSidePanel.repaint();
        ParentPanelOfSidePanel.revalidate();
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private com.mycompany.classrecord.MyButton CreateAccountButton;
    private javax.swing.JPanel CreateAccountPanel;
    private com.mycompany.classrecord.MyButton LoginButton;
    private javax.swing.JPanel ParentPanelOfSidePanel;
    private com.mycompany.classrecord.FTextField PasswordTextBox;
    private javax.swing.JPanel RightPanel;
    private com.mycompany.classrecord.FTextField UsernameTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
