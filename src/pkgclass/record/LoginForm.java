package pkgclass.record;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import javax.swing.*;

public class LoginForm extends javax.swing.JFrame 
{
    String homeDir = System.getProperty("user.home");
    
    public LoginForm() 
    {
        initComponents();
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
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginButton = new pkgclass.record.MyButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameTextBox = new pkgclass.record.FTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateAccountButton = new pkgclass.record.MyButton();
        ForgotPasswordButton = new javax.swing.JButton();
        PasswordTextBox = new pkgclass.record.PasswordTextField();
        CreateAccountPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        UsernameTextBox1 = new pkgclass.record.FTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LoginButton1 = new pkgclass.record.MyButton();
        CreateAccountButton1 = new pkgclass.record.MyButton();
        PasswordTextBox1 = new pkgclass.record.PasswordTextField();
        RecoveryKeyTextBox = new pkgclass.record.PasswordTextField();
        jLabel32 = new javax.swing.JLabel();
        RecoveryPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        UsernameTextBox2 = new pkgclass.record.FTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        RecoveryKeyTextBox1 = new pkgclass.record.PasswordTextField();
        jLabel29 = new javax.swing.JLabel();
        RecoverButton = new pkgclass.record.MyButton();
        BackToLogin = new javax.swing.JButton();
        NewPassword = new pkgclass.record.PasswordTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 232, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(34, 63, 135));
        jLabel9.setText("M-Class");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(197, 76, 89));
        jLabel10.setText("Record");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/WelcomeBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 580, -1));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 650));

        ParentPanelOfSidePanel.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanelOfSidePanel.setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(34, 63, 135));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 63, 135));
        jLabel1.setText("Welcome back!");
        LoginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 53));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/2. 67fbeadd2221ba3294bffe2c5d1ac5cd.png"))); // NOI18N
        LoginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(197, 76, 89));
        jLabel3.setText("Nice seeing you again");
        LoginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 30));

        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorderPainted(false);
        LoginButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        LoginButton.setRadius(30);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Login to your account");
        LoginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, -1));
        LoginPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        UsernameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LoginPanel.add(UsernameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        LoginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username");
        LoginPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/user (1).png"))); // NOI18N
        LoginPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/lock.png"))); // NOI18N
        LoginPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        CreateAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.setBorderPainted(false);
        CreateAccountButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreateAccountButton.setRadius(30);
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(CreateAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 40));

        ForgotPasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        ForgotPasswordButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ForgotPasswordButton.setForeground(new java.awt.Color(0, 0, 0));
        ForgotPasswordButton.setText("Forgot Password?");
        ForgotPasswordButton.setBorder(null);
        ForgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasswordButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(ForgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 120, 30));

        PasswordTextBox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LoginPanel.add(PasswordTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 250, 40));

        ParentPanelOfSidePanel.add(LoginPanel, "card2");

        CreateAccountPanel.setBackground(new java.awt.Color(255, 255, 255));
        CreateAccountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(32, 122, 202));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 122, 202));
        jLabel13.setText("Welcome user!");
        CreateAccountPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 53));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 51));
        jLabel14.setText("Nice seeing you here");
        CreateAccountPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Create your own account");
        CreateAccountPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, -1));
        CreateAccountPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Username");
        CreateAccountPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        UsernameTextBox1.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        CreateAccountPanel.add(UsernameTextBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/user (1).png"))); // NOI18N
        CreateAccountPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Recovery key");
        CreateAccountPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/secret.png"))); // NOI18N
        CreateAccountPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/lock.png"))); // NOI18N
        CreateAccountPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Password");
        CreateAccountPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, 30));

        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("Login");
        LoginButton1.setBorderPainted(false);
        LoginButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        LoginButton1.setRadius(30);
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });
        CreateAccountPanel.add(LoginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, 40));

        CreateAccountButton1.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccountButton1.setText("Create Account");
        CreateAccountButton1.setBorderPainted(false);
        CreateAccountButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreateAccountButton1.setRadius(30);
        CreateAccountButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButton1ActionPerformed(evt);
            }
        });
        CreateAccountPanel.add(CreateAccountButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, 40));

        PasswordTextBox1.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        CreateAccountPanel.add(PasswordTextBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 250, 40));

        RecoveryKeyTextBox.setForeground(new java.awt.Color(0, 0, 0));
        RecoveryKeyTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        CreateAccountPanel.add(RecoveryKeyTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 250, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/2. 67fbeadd2221ba3294bffe2c5d1ac5cd.png"))); // NOI18N
        CreateAccountPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 100));

        ParentPanelOfSidePanel.add(CreateAccountPanel, "card3");

        RecoveryPanel.setBackground(new java.awt.Color(255, 255, 255));
        RecoveryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(32, 122, 202));
        jLabel23.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(32, 122, 202));
        jLabel23.setText("Welcome user!");
        RecoveryPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, 53));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 51));
        jLabel24.setText("Nice seeing you here");
        RecoveryPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Recover your account");
        RecoveryPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, -1));
        RecoveryPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        jLabel26.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Username");
        RecoveryPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));

        UsernameTextBox2.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextBox2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        RecoveryPanel.add(UsernameTextBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/user (1).png"))); // NOI18N
        RecoveryPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        jLabel28.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Enter new password");
        RecoveryPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 170, 30));

        RecoveryKeyTextBox1.setForeground(new java.awt.Color(0, 0, 0));
        RecoveryKeyTextBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        RecoveryPanel.add(RecoveryKeyTextBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 250, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/secret.png"))); // NOI18N
        RecoveryPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        RecoverButton.setForeground(new java.awt.Color(255, 255, 255));
        RecoverButton.setText("Recover");
        RecoverButton.setBorderPainted(false);
        RecoverButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        RecoverButton.setRadius(30);
        RecoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecoverButtonActionPerformed(evt);
            }
        });
        RecoveryPanel.add(RecoverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, 40));

        BackToLogin.setBackground(new java.awt.Color(255, 255, 255));
        BackToLogin.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        BackToLogin.setForeground(new java.awt.Color(0, 0, 0));
        BackToLogin.setText("Back to login?");
        BackToLogin.setBorder(null);
        BackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToLoginActionPerformed(evt);
            }
        });
        RecoveryPanel.add(BackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 100, 30));

        NewPassword.setForeground(new java.awt.Color(0, 0, 0));
        NewPassword.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        RecoveryPanel.add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 250, 40));

        jLabel30.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Recovery key");
        RecoveryPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/lock.png"))); // NOI18N
        RecoveryPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/2. 67fbeadd2221ba3294bffe2c5d1ac5cd.png"))); // NOI18N
        RecoveryPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 100));

        ParentPanelOfSidePanel.add(RecoveryPanel, "card4");

        BackgroundPanel.add(ParentPanelOfSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 430, 650));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        setSize(new java.awt.Dimension(965, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if(UsernameTextBox.getText().isEmpty() || PasswordTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all needed fields!");
        }
        else
        {
            String usernameFromFile = null;
            String passwordFromFile = null;
            String recovery = null;
            
            String databaseDir = homeDir + File.separator + "ClassRecordUserInfo";
            String filePath = databaseDir + File.separator + "\\" + UsernameTextBox.getText() +".txt";
            File file = new File(filePath);
            
            if(!file.exists())
            {
                JOptionPane.showMessageDialog(null,"Username does not exists!");
            }
            else
            {
                String str;
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    do
                    {
                        usernameFromFile = br.readLine();
                        passwordFromFile = br.readLine();
                        recovery = br.readLine();
                    }while((str = br.readLine()) != null);
                    br.close();
                }
                catch(IOException e)
                {
                    e.getStackTrace();
                }
                String username = hash(UsernameTextBox.getText());
                String password = hash(PasswordTextBox.getText());
                
                if(usernameFromFile.equals(username) && passwordFromFile.equals(password))
                {
                    new MainForm(UsernameTextBox.getText()).setVisible(true);
                    setVisible(false);
                    
                    UsernameTextBox.setText("");
                    PasswordTextBox.setText("");
                    
                    recovery = null;
                    usernameFromFile = null;
                    passwordFromFile = null;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password did not match!");
                }
            }
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        ParentPanelOfSidePanel.removeAll();
        ParentPanelOfSidePanel.add(CreateAccountPanel);
        ParentPanelOfSidePanel.repaint();
        ParentPanelOfSidePanel.revalidate();
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void ForgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasswordButtonActionPerformed
        ParentPanelOfSidePanel.removeAll();
        ParentPanelOfSidePanel.add(RecoveryPanel);
        ParentPanelOfSidePanel.repaint();
        ParentPanelOfSidePanel.revalidate();
    }//GEN-LAST:event_ForgotPasswordButtonActionPerformed

    private void CreateAccountButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButton1ActionPerformed
        if(UsernameTextBox1.getText().isEmpty() || PasswordTextBox1.getText().isEmpty() || RecoveryKeyTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter all needed fields!");
        }
        else
        {
            if(PasswordTextBox1.getText().length() < 8)
            {
                JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters!");
            }
            else
            {
                if(createFile(UsernameTextBox1.getText(), PasswordTextBox1.getText(), RecoveryKeyTextBox.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Account successfully created!");

                    UsernameTextBox1.setText("");
                    PasswordTextBox1.setText("");
                    RecoveryKeyTextBox.setText("");

                    ParentPanelOfSidePanel.removeAll();
                    ParentPanelOfSidePanel.add(LoginPanel);
                    ParentPanelOfSidePanel.repaint();
                    ParentPanelOfSidePanel.revalidate();
                }
            }
        }
    }//GEN-LAST:event_CreateAccountButton1ActionPerformed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        ParentPanelOfSidePanel.removeAll();
        ParentPanelOfSidePanel.add(LoginPanel);
        ParentPanelOfSidePanel.repaint();
        ParentPanelOfSidePanel.revalidate();
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void RecoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecoverButtonActionPerformed
        if(UsernameTextBox2.getText().isEmpty() || RecoveryKeyTextBox1.getText().isEmpty() || NewPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all need fields!");
        }
        else
        {
            String databaseDir = homeDir + File.separator + "ClassRecordUserInfo";
            String filePath = databaseDir + File.separator + "\\" + UsernameTextBox2.getText() +".txt";
            File file = new File(filePath);
            
            if(!file.exists())
            {
                JOptionPane.showMessageDialog(null,"Username does not exists!");
            }
            else
            {
                String usernameFromFile = null;
                String passwordFromFile = null;
                String recovery = null;
                String str;
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    do
                    {
                        usernameFromFile = br.readLine();
                        passwordFromFile = br.readLine();
                        recovery = br.readLine();
                    }while((str = br.readLine()) != null);
                    br.close();
                }
                catch(IOException e)
                {
                    e.getStackTrace();
                }
                
                String username = hash(UsernameTextBox2.getText());
                String password = hash(NewPassword.getText());
                String recoveryKey = hash(RecoveryKeyTextBox1.getText());
                
                if(recovery.equals(recoveryKey))
                {
                    deleteFromFile(UsernameTextBox2.getText());
                    try
                    {
                        BufferedWriter input = new BufferedWriter(new FileWriter(file));
                        input.write(username + "\n" + password + "\n" + recoveryKey);
                        input.flush();
                        input.close();
                    }
                    catch(IOException e)
                    {
                        e.getStackTrace();
                    }
                    
                    recovery = null;
                    usernameFromFile = null;
                    passwordFromFile = null;
                    
                    UsernameTextBox2.setText("");
                    NewPassword.setText("");
                    RecoveryKeyTextBox1.setText("");
                    
                    JOptionPane.showMessageDialog(null,"Successfully recovered account!");
                    
                    ParentPanelOfSidePanel.removeAll();
                    ParentPanelOfSidePanel.add(LoginPanel);
                    ParentPanelOfSidePanel.repaint();
                    ParentPanelOfSidePanel.revalidate();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Recovery key did not match!");
                }
            }
        }
    }//GEN-LAST:event_RecoverButtonActionPerformed

    private void BackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToLoginActionPerformed
        UsernameTextBox2.setText("");
        RecoveryKeyTextBox1.setText("");
        NewPassword.setText("");
        
        ParentPanelOfSidePanel.removeAll();
        ParentPanelOfSidePanel.add(LoginPanel);
        ParentPanelOfSidePanel.repaint();
        ParentPanelOfSidePanel.revalidate();
    }//GEN-LAST:event_BackToLoginActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
    
    private void deleteFromFile(String filename)
    {
        String databaseDir = homeDir + File.separator + "ClassRecordUserInfo";
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        
        try (FileWriter fileWriter = new FileWriter(file, false)) 
        {
            fileWriter.write("");
        } 
        catch (IOException e) 
        {
            e.getStackTrace();
        }
    }
    
    private boolean createFile(String username, String password, String recoveryKey)
    {
        boolean isCreated = true;
        String databaseDir = homeDir + File.separator + "ClassRecordUserInfo";
        File folder = new File(databaseDir);
        
        if (!folder.exists()) 
        {
            folder.mkdirs();
        }
        
        String filePath = databaseDir + File.separator + "\\" + username +".txt";
        File file = new File(filePath);
        
        if(file.exists())
        {
            JOptionPane.showMessageDialog(null, "Username already taken!");
            isCreated =  false;
        }
        else
        {  
            try
            {
                username = hash(username);
                password = hash(password);
                recoveryKey = hash(recoveryKey);
                BufferedWriter input = new BufferedWriter(new FileWriter(file));
                input.write(username + "\n" + password + "\n" + recoveryKey);
                input.flush();
                input.close();
            }
            catch(IOException e)
            {
                e.getStackTrace();
            }
        }
        return isCreated;
    }
    
    private String hash(String input)
    {
        String hash = null;
        try 
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) 
            {
                String hex = String.format("%02x", hashByte);
                hexString.append(hex);
            }
            
            hash = hexString.toString();
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.getStackTrace();
        }
        return hash;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToLogin;
    private javax.swing.JPanel BackgroundPanel;
    private pkgclass.record.MyButton CreateAccountButton;
    private pkgclass.record.MyButton CreateAccountButton1;
    private javax.swing.JPanel CreateAccountPanel;
    private javax.swing.JButton ForgotPasswordButton;
    private pkgclass.record.MyButton LoginButton;
    private pkgclass.record.MyButton LoginButton1;
    private javax.swing.JPanel LoginPanel;
    private pkgclass.record.PasswordTextField NewPassword;
    private javax.swing.JPanel ParentPanelOfSidePanel;
    private pkgclass.record.PasswordTextField PasswordTextBox;
    private pkgclass.record.PasswordTextField PasswordTextBox1;
    private pkgclass.record.MyButton RecoverButton;
    private pkgclass.record.PasswordTextField RecoveryKeyTextBox;
    private pkgclass.record.PasswordTextField RecoveryKeyTextBox1;
    private javax.swing.JPanel RecoveryPanel;
    private pkgclass.record.FTextField UsernameTextBox;
    private pkgclass.record.FTextField UsernameTextBox1;
    private pkgclass.record.FTextField UsernameTextBox2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
