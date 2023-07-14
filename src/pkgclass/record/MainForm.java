package pkgclass.record;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;
import com.mycompany.classrecord.MyButton;
import java.awt.event.*;

public class MainForm extends javax.swing.JFrame {

    String name = "Juan";
    String homeDir = System.getProperty("user.home");       //getting the home directory of the user's laptop
    
    ArrayList <String> ListOfFile = new ArrayList<>();

    public MainForm() 
    {
        initComponents();
        TeachersNameLabel.setText("Teacher " + name);
        
        ListOfFile = getListOfFiles();
        
        MyButton textButton;
        Border border = new EmptyBorder(5,10,5,10);
        for(String str: ListOfFile)
        {
            textButton = new MyButton();
            textButton.setForeground(Color.black);
            textButton.setBackground(new Color(9,166,254));
            textButton.setBorder(border);
            textButton.setPreferredSize(new Dimension(180, 60));
            textButton.setOpaque(true);
            textButton.setFont(new Font("Verdana", 1, 16));
            textButton.setRadius(30);
            textButton.setText(str);
            ListPanel.add(textButton);
            ListPanel.add(Box.createVerticalStrut(10));
            
            textButton.addMouseListener(new MouseAdapter() 
            {
                @Override
                public void mouseClicked(MouseEvent e) 
                {
                    HeaderLabel.setText(str);
                    Parent.removeAll();
                    Parent.add(HomePanel);
                    Parent.repaint();
                    Parent.revalidate();
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        SidebarPanel = new javax.swing.JPanel();
        Top_Icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        WelcomeBackLabel = new javax.swing.JLabel();
        TeachersNameLabel = new javax.swing.JLabel();
        AddClassButton = new com.mycompany.classrecord.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ListPanel = new javax.swing.JPanel();
        Parent = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new pkgclass.record.Table();
        searchText = new pkgclass.record.SearchText();
        myButton1 = new com.mycompany.classrecord.MyButton();
        myButton2 = new com.mycompany.classrecord.MyButton();
        jLabel8 = new javax.swing.JLabel();
        AddClassPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ClassNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClassCodeTextBox = new javax.swing.JTextField();
        SaveButton = new com.mycompany.classrecord.MyButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ClassInstructorTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddStudentPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        StudentFNameTextBox = new javax.swing.JTextField();
        StudentGradeTextBox = new javax.swing.JTextField();
        StudentAbsentTextBox = new javax.swing.JTextField();
        SaveButton1 = new com.mycompany.classrecord.MyButton();
        StudentLNameTextBox = new javax.swing.JTextField();
        StudentMInitialTextBox = new javax.swing.JTextField();
        StudentSexTextBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidebarPanel.setBackground(new java.awt.Color(230, 232, 240));
        SidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Top_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Picture1.png"))); // NOI18N
        SidebarPanel.add(Top_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 20, 150, 119));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        SidebarPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 222, 179, 10));

        WelcomeBackLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        WelcomeBackLabel.setForeground(java.awt.SystemColor.activeCaptionText);
        WelcomeBackLabel.setText("Welcome back");
        SidebarPanel.add(WelcomeBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        TeachersNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SidebarPanel.add(TeachersNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 30));

        AddClassButton.setBackground(new java.awt.Color(9, 166, 254));
        AddClassButton.setForeground(new java.awt.Color(0, 0, 0));
        AddClassButton.setText("Add class");
        AddClassButton.setBorderColor(new java.awt.Color(0, 0, 0));
        AddClassButton.setBorderPainted(false);
        AddClassButton.setColor(new java.awt.Color(9, 166, 254));
        AddClassButton.setColorClick(java.awt.SystemColor.activeCaption);
        AddClassButton.setColorOver(java.awt.SystemColor.activeCaption);
        AddClassButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddClassButton.setRadius(30);
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });
        SidebarPanel.add(AddClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 130, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Logout");
        SidebarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-logout-50 (1).png"))); // NOI18N
        SidebarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 30, -1));

        ListPanel.setBackground(new java.awt.Color(204, 204, 204));
        SidebarPanel.add(ListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 300));

        jPanel1.add(SidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setForeground(new java.awt.Color(102, 102, 102));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Grade", "No. Of Absents"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(table1);

        HomePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 460));

        searchText.setBackground(new java.awt.Color(153, 153, 153));
        searchText.setForeground(new java.awt.Color(0, 0, 0));
        searchText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HomePanel.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 40));

        myButton1.setBackground(new java.awt.Color(9, 166, 254));
        myButton1.setForeground(new java.awt.Color(0, 0, 0));
        myButton1.setText("Search");
        myButton1.setBorderColor(new java.awt.Color(153, 153, 153));
        myButton1.setBorderPainted(false);
        myButton1.setColorClick(new java.awt.Color(153, 153, 153));
        myButton1.setColorOver(new java.awt.Color(255, 255, 255));
        myButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        myButton1.setRadius(30);
        HomePanel.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 40));

        myButton2.setBackground(new java.awt.Color(9, 166, 254));
        myButton2.setForeground(new java.awt.Color(0, 0, 0));
        myButton2.setText("Add Student");
        myButton2.setBorderColor(new java.awt.Color(153, 153, 153));
        myButton2.setBorderPainted(false);
        myButton2.setColorClick(new java.awt.Color(153, 153, 153));
        myButton2.setColorOver(new java.awt.Color(255, 255, 255));
        myButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        myButton2.setRadius(30);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        HomePanel.add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-add-45.png"))); // NOI18N
        jLabel8.setToolTipText("");
        HomePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 40, 40));

        Parent.add(HomePanel, "card2");

        AddClassPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter class name");
        AddClassPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, 30));

        ClassNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ClassNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddClassPanel.add(ClassNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter class code");
        AddClassPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        ClassCodeTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassCodeTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ClassCodeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddClassPanel.add(ClassCodeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, 30));

        SaveButton.setForeground(new java.awt.Color(0, 0, 0));
        SaveButton.setText("Save");
        SaveButton.setBorderColor(new java.awt.Color(0, 0, 0));
        SaveButton.setBorderPainted(false);
        SaveButton.setColorClick(new java.awt.Color(102, 102, 102));
        SaveButton.setColorOver(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SaveButton.setRadius(30);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        AddClassPanel.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Class Information");
        AddClassPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter class instructor");
        AddClassPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        ClassInstructorTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassInstructorTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ClassInstructorTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddClassPanel.add(ClassInstructorTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/subheader_image@2x.png"))); // NOI18N
        AddClassPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 30, 690, 500));

        Parent.add(AddClassPanel, "card3");

        AddStudentPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Student Information");
        AddStudentPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("First name");
        AddStudentPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Grade");
        AddStudentPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("No. of Absents");
        AddStudentPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        StudentFNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentFNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentFNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentFNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 30));

        StudentGradeTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentGradeTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentGradeTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentGradeTextBoxActionPerformed(evt);
            }
        });
        AddStudentPanel.add(StudentGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 30));

        StudentAbsentTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentAbsentTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 50, 30));

        SaveButton1.setForeground(new java.awt.Color(0, 0, 0));
        SaveButton1.setText("Save");
        SaveButton1.setBorderColor(new java.awt.Color(0, 0, 0));
        SaveButton1.setBorderPainted(false);
        SaveButton1.setColorClick(new java.awt.Color(102, 102, 102));
        SaveButton1.setColorOver(new java.awt.Color(255, 255, 255));
        SaveButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SaveButton1.setRadius(30);
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });
        AddStudentPanel.add(SaveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 40));

        StudentLNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentLNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentLNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentLNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 200, 30));

        StudentMInitialTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentMInitialTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentMInitialTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentMInitialTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 40, 30));

        StudentSexTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentSexTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddStudentPanel.add(StudentSexTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("M.I");
        AddStudentPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Last name");
        AddStudentPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Sex");
        AddStudentPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Bubbles2.png"))); // NOI18N
        AddStudentPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 620, 600));

        Parent.add(AddStudentPanel, "card4");

        jPanel1.add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 630, 600));

        HeaderPanel.setBackground(new java.awt.Color(225, 230, 253));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setBackground(new java.awt.Color(51, 51, 51));
        HeaderLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(102, 102, 102));
        HeaderPanel.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 40));

        jPanel1.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 620, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 690));

        setSize(new java.awt.Dimension(887, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        //checking if textbox has texts in it
        if(ClassNameTextBox.getText().isEmpty()|| ClassCodeTextBox.getText().isEmpty() || ClassInstructorTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly enter all necessary fields!");
        }
        else
        {
            String classCode = ClassCodeTextBox.getText();                                      //getting class code for the name of the file
            String databaseDir = homeDir + File.separator + "Database";                     //concatinating home dirctory with the name Database
            String filePath = databaseDir + File.separator + "\\" + classCode +".txt";  //making a string filepath for the file
            
            File file = new File(filePath);                                                                        //making a string filepath for the file
            File folder = new File(databaseDir);                                                           //making a string filepath for the folder
            
            boolean doesExist = file.exists();
            if(!folder.exists())
            {
                folder.mkdirs();                                                                                //creating database folder
            }
            
            
            if(doesExist)
            {
                JOptionPane.showMessageDialog(null, "Kindly choose another class code.");
            }
            else
            {
                try 
                {
                    file.createNewFile();     //actual creating of txt file
                    JOptionPane.showMessageDialog(null, "Class sucessfully created!");
                    
                    Parent.removeAll();
                    Parent.add(HomePanel);
                    Parent.repaint();
                    Parent.revalidate();
                    
                    ClassNameTextBox.setText(null);
                    ClassCodeTextBox.setText(null);
                    ClassInstructorTextBox.setText(null);
                    
                    ListOfFile.clear();
                    ListOfFile = getListOfFiles();
                } 
                catch (IOException ex) 
                {
                    ex.getStackTrace();
                }
            }
            
            
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        Parent.removeAll();
        Parent.add(AddStudentPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_myButton2ActionPerformed

    private void StudentGradeTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentGradeTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentGradeTextBoxActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        if(StudentFNameTextBox.getText().isEmpty() || StudentLNameTextBox.getText().isEmpty() || StudentMInitialTextBox.getText().isEmpty() || StudentSexTextBox.getText().isEmpty() || StudentGradeTextBox.getText().isEmpty() || StudentAbsentTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all fields!");
        }
        else if(StudentMInitialTextBox.getText().length() > 1)
        {
            JOptionPane.showMessageDialog(null,"Please enter the first letter of the middle name only!");
        }
        else if((!StudentSexTextBox.getText().equals("M")) || (!StudentSexTextBox.getText().equals("m")) || (!StudentSexTextBox.getText().equals("F")) || (!StudentSexTextBox.getText().equals("f")))
        {
            JOptionPane.showMessageDialog(null,"Please enter M or F only for sex!");
        }
        else
        {
            String fName = StudentFNameTextBox.getText();
            String LName = StudentLNameTextBox.getText();
            String MInitial = StudentMInitialTextBox.getText();
            String Sex = StudentSexTextBox.getText();
            double Grade;
            int Absent;
           
            try
            {
                Grade = Double.parseDouble(StudentGradeTextBox.getText());
                if(Grade > 5.00 || Grade < 1.00)
                {
                    JOptionPane.showMessageDialog(null,"Please enter a valid grade!");
                }
            }
            catch(NumberFormatException nfe)
            {
                  JOptionPane.showMessageDialog(null,"Please enter a valid number format!");
            }
            
            try
            {
                Absent = Integer.parseInt(StudentAbsentTextBox.getText());
                if(Absent < 0)
                {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                }
            }
            catch(NumberFormatException nfe)
            {
                 JOptionPane.showMessageDialog(null, "Please enter a number format!");
            }
        }
    }//GEN-LAST:event_SaveButton1ActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        Parent.removeAll();
        Parent.add(AddClassPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_AddClassButtonActionPerformed

    private ArrayList <String> getListOfFiles()
    {
        ArrayList <String> listOfFile = new ArrayList<String>();
        String databaseDir = homeDir + File.separator + "Database";
        
        File fldr = new File(databaseDir);
        File [] files = fldr.listFiles();
        
        for(File file: files)
        {
            if(file.isFile() && file.getName().endsWith(".txt"))
            {
                listOfFile.add(file.getName().substring(0, file.getName().lastIndexOf('.')));
            }
        }
        
        return listOfFile;
    }
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.classrecord.MyButton AddClassButton;
    private javax.swing.JPanel AddClassPanel;
    private javax.swing.JPanel AddStudentPanel;
    private javax.swing.JTextField ClassCodeTextBox;
    private javax.swing.JTextField ClassInstructorTextBox;
    private javax.swing.JTextField ClassNameTextBox;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JPanel Parent;
    private com.mycompany.classrecord.MyButton SaveButton;
    private com.mycompany.classrecord.MyButton SaveButton1;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JTextField StudentAbsentTextBox;
    private javax.swing.JTextField StudentFNameTextBox;
    private javax.swing.JTextField StudentGradeTextBox;
    private javax.swing.JTextField StudentLNameTextBox;
    private javax.swing.JTextField StudentMInitialTextBox;
    private javax.swing.JTextField StudentSexTextBox;
    private javax.swing.JLabel TeachersNameLabel;
    private javax.swing.JLabel Top_Icon;
    private javax.swing.JLabel WelcomeBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTree jTree1;
    private com.mycompany.classrecord.MyButton myButton1;
    private com.mycompany.classrecord.MyButton myButton2;
    private pkgclass.record.SearchText searchText;
    private pkgclass.record.Table table1;
    // End of variables declaration//GEN-END:variables
}
