package pkgclass.record;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.*;
import java.util.*;

public class MainForm extends javax.swing.JFrame {

    String name = "Juan";
    String homeDir = System.getProperty("user.home");       //getting the home directory of the user's laptop
    
    ArrayList <String> ListOfFile = new ArrayList<>();
    
    public MainForm() 
    {
        initComponents();
        TeachersNameLabel.setText("Teacher " + name);
        
        ListOfFile = getListOfFiles();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String item : ListOfFile) 
        {
            listModel.addElement(item);
        }
        list.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Top_Icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        WelcomeBackLabel = new javax.swing.JLabel();
        TeachersNameLabel = new javax.swing.JLabel();
        AddClassButton = new com.mycompany.classrecord.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(187, 187, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Top_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Picture1.png"))); // NOI18N
        jPanel2.add(Top_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 20, 150, 119));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 222, 179, 10));

        WelcomeBackLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        WelcomeBackLabel.setForeground(java.awt.SystemColor.activeCaptionText);
        WelcomeBackLabel.setText("Welcome back");
        jPanel2.add(WelcomeBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        TeachersNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel2.add(TeachersNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 30));

        AddClassButton.setForeground(new java.awt.Color(51, 51, 51));
        AddClassButton.setText("Add class");
        AddClassButton.setBorderColor(new java.awt.Color(0, 0, 0));
        AddClassButton.setBorderPainted(false);
        AddClassButton.setColor(new java.awt.Color(187, 187, 187));
        AddClassButton.setColorClick(java.awt.SystemColor.activeCaption);
        AddClassButton.setColorOver(java.awt.SystemColor.activeCaption);
        AddClassButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddClassButton.setRadius(30);
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AddClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 130, 40));

        list.setBackground(new java.awt.Color(187, 187, 187));
        list.setBorder(null);
        list.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        list.setForeground(new java.awt.Color(0, 0, 0));
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list.setName(""); // NOI18N
        jScrollPane1.setViewportView(list);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 270));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Logout");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-logout-50 (1).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

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

        myButton1.setForeground(new java.awt.Color(0, 0, 0));
        myButton1.setText("Search");
        myButton1.setBorderColor(new java.awt.Color(153, 153, 153));
        myButton1.setBorderPainted(false);
        myButton1.setColorClick(new java.awt.Color(153, 153, 153));
        myButton1.setColorOver(new java.awt.Color(255, 255, 255));
        myButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        myButton1.setRadius(30);
        HomePanel.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 40));

        myButton2.setForeground(new java.awt.Color(0, 0, 0));
        myButton2.setText("Add Student");
        myButton2.setBorderColor(new java.awt.Color(153, 153, 153));
        myButton2.setBorderPainted(false);
        myButton2.setColorClick(new java.awt.Color(153, 153, 153));
        myButton2.setColorOver(new java.awt.Color(255, 255, 255));
        myButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        myButton2.setRadius(30);
        HomePanel.add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-add-45.png"))); // NOI18N
        jLabel8.setToolTipText("");
        HomePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, 40));

        Parent.add(HomePanel, "card2");

        AddClassPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter class name");
        AddClassPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 180, 30));

        ClassNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassNameTextBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ClassNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddClassPanel.add(ClassNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter class code");
        AddClassPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        ClassCodeTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassCodeTextBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
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
        AddClassPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 190, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter class instructor");
        AddClassPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        ClassInstructorTextBox.setBackground(new java.awt.Color(255, 255, 255));
        ClassInstructorTextBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ClassInstructorTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddClassPanel.add(ClassInstructorTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/subheader_image@2x.png"))); // NOI18N
        AddClassPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 120, 690, 500));

        Parent.add(AddClassPanel, "card3");

        jPanel1.add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 630, 600));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 620, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 690));

        setSize(new java.awt.Dimension(887, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        Parent.removeAll();
        Parent.add(AddClassPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_AddClassButtonActionPerformed

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
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

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
    private javax.swing.JTextField ClassCodeTextBox;
    private javax.swing.JTextField ClassInstructorTextBox;
    private javax.swing.JTextField ClassNameTextBox;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel Parent;
    private com.mycompany.classrecord.MyButton SaveButton;
    private javax.swing.JLabel TeachersNameLabel;
    private javax.swing.JLabel Top_Icon;
    private javax.swing.JLabel WelcomeBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> list;
    private com.mycompany.classrecord.MyButton myButton1;
    private com.mycompany.classrecord.MyButton myButton2;
    private pkgclass.record.SearchText searchText;
    private pkgclass.record.Table table1;
    // End of variables declaration//GEN-END:variables
}
