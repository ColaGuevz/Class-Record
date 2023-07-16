package pkgclass.record;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;
import com.mycompany.classrecord.MyButton;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class MainForm extends javax.swing.JFrame {

    String name = "Juan";
    String homeDir = System.getProperty("user.home");       //getting the home directory of the user's laptop
    
    ArrayList <String> ListOfFile = new ArrayList<>();
    boolean mouseClicked = false;

    private int selectedRowForDeletion = -1;

    public MainForm() 
    {
        initComponents();
        TeachersNameLabel.setText("Teacher " + name);
        StudentTable.setGridColor(Color.BLACK);
        theader();

        ListPanel.setLayout(new GridLayout(0,1));
        ListPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        ScrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        ScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
        {
            @Override
            protected void configureScrollBarColors() 
            {
                // Set the color of the scroll bar track and thumb to match the parent container
                this.thumbColor = ScrollPane.getBackground();
                this.trackColor = ScrollPane.getBackground();
            }
        });
        InitializeSidePanel();
        
        StudentTable.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> 
        {
            if (StudentTable.getSelectedRow() != -1) 
            {
                selectedRowForDeletion = StudentTable.getSelectedRow();
            }
            
        });
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
        ScrollPane = new javax.swing.JScrollPane();
        ListPanel = new javax.swing.JPanel();
        Parent = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        AddStudentButton = new com.mycompany.classrecord.MyButton();
        jLabel8 = new javax.swing.JLabel();
        SaveStudInfoButton = new com.mycompany.classrecord.MyButton();
        DeleteClassButton = new com.mycompany.classrecord.MyButton();
        DeleteStudentButton = new com.mycompany.classrecord.MyButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        HeaderLabel = new javax.swing.JLabel();
        AddClassPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ClassNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClassCodeTextBox = new javax.swing.JTextField();
        SaveClassInfoButton = new com.mycompany.classrecord.MyButton();
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
        AddButton = new com.mycompany.classrecord.MyButton();
        StudentLNameTextBox = new javax.swing.JTextField();
        StudentMInitialTextBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

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

        AddClassButton.setText("Add class");
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
        SidebarPanel.add(AddClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 130, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Logout");
        SidebarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-logout-50 (1).png"))); // NOI18N
        SidebarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 30, -1));

        ScrollPane.setBackground(new java.awt.Color(230, 232, 240));
        ScrollPane.setForeground(new java.awt.Color(230, 232, 240));

        ListPanel.setBackground(new java.awt.Color(230, 232, 240));
        ListPanel.setLayout(new javax.swing.BoxLayout(ListPanel, javax.swing.BoxLayout.LINE_AXIS));
        ScrollPane.setViewportView(ListPanel);

        SidebarPanel.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 300));

        jPanel1.add(SidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStudentButton.setText("Add Student");
        AddStudentButton.setBorderPainted(false);
        AddStudentButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddStudentButton.setRadius(30);
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });
        HomePanel.add(AddStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-add-45.png"))); // NOI18N
        jLabel8.setToolTipText("");
        HomePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 40, 40));

        SaveStudInfoButton.setText("Save");
        SaveStudInfoButton.setBorderPainted(false);
        SaveStudInfoButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SaveStudInfoButton.setRadius(30);
        SaveStudInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveStudInfoButtonActionPerformed(evt);
            }
        });
        HomePanel.add(SaveStudInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 80, 40));

        DeleteClassButton.setText("Delete Class");
        DeleteClassButton.setBorderPainted(false);
        DeleteClassButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DeleteClassButton.setRadius(30);
        DeleteClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteClassButtonActionPerformed(evt);
            }
        });
        HomePanel.add(DeleteClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 130, 40));

        DeleteStudentButton.setText("Remove Student");
        DeleteStudentButton.setBorderPainted(false);
        DeleteStudentButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DeleteStudentButton.setRadius(30);
        DeleteStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentButtonActionPerformed(evt);
            }
        });
        HomePanel.add(DeleteStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        HomePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 20));

        StudentTable.setAutoCreateRowSorter(true);
        StudentTable.setBackground(new java.awt.Color(255, 255, 255));
        StudentTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentTable.setForeground(new java.awt.Color(0, 0, 0));
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Last Name", "First Name", "Middle Initial", "Grade", "Absent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.setGridColor(new java.awt.Color(0, 0, 0));
        StudentTable.setRowHeight(30);
        StudentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        StudentTable.setShowGrid(true);
        StudentTable.setShowHorizontalLines(true);
        StudentTable.setShowVerticalLines(true);
        StudentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(0).setResizable(false);
            StudentTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            StudentTable.getColumnModel().getColumn(4).setResizable(false);
            StudentTable.getColumnModel().getColumn(4).setPreferredWidth(3);
            StudentTable.getColumnModel().getColumn(5).setResizable(false);
            StudentTable.getColumnModel().getColumn(5).setPreferredWidth(3);
        }

        HomePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 420));

        HeaderLabel.setBackground(new java.awt.Color(51, 51, 51));
        HeaderLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 0));
        HomePanel.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 40));

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

        SaveClassInfoButton.setText("Save");
        SaveClassInfoButton.setBorderColor(new java.awt.Color(0, 0, 0));
        SaveClassInfoButton.setBorderPainted(false);
        SaveClassInfoButton.setColorClick(new java.awt.Color(102, 102, 102));
        SaveClassInfoButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SaveClassInfoButton.setRadius(30);
        SaveClassInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveClassInfoButtonActionPerformed(evt);
            }
        });
        AddClassPanel.add(SaveClassInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 40));

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
        AddStudentPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("No. of Absents");
        AddStudentPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        StudentFNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentFNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentFNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentFNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        StudentGradeTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentGradeTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentGradeTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentGradeTextBoxActionPerformed(evt);
            }
        });
        AddStudentPanel.add(StudentGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 30));

        StudentAbsentTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentAbsentTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 30));

        AddButton.setText("Add");
        AddButton.setBorderColor(new java.awt.Color(0, 0, 0));
        AddButton.setBorderPainted(false);
        AddButton.setColorClick(new java.awt.Color(102, 102, 102));
        AddButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddButton.setRadius(30);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        AddStudentPanel.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, 40));

        StudentLNameTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentLNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentLNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentLNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 30));

        StudentMInitialTextBox.setBackground(new java.awt.Color(255, 255, 255));
        StudentMInitialTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentMInitialTextBox.setForeground(new java.awt.Color(0, 0, 0));
        AddStudentPanel.add(StudentMInitialTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Middle Name");
        AddStudentPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Last name");
        AddStudentPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Bubbles2.png"))); // NOI18N
        AddStudentPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 620, 600));

        Parent.add(AddStudentPanel, "card4");

        jPanel1.add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 630, 600));

        HeaderPanel.setBackground(new java.awt.Color(225, 230, 253));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Class Record");
        HeaderPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 180, 50));

        jPanel1.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 620, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 690));

        setSize(new java.awt.Dimension(887, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveClassInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveClassInfoButtonActionPerformed
        //checking if textbox has texts in it
        if(ClassNameTextBox.getText().isEmpty()|| ClassCodeTextBox.getText().isEmpty() || ClassInstructorTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly enter all necessary fields!");
        }
        else if(ClassCodeTextBox.getText().length() > 8)
        {
            JOptionPane.showMessageDialog(null,"Kindly make the class code shorter");
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
                    ListPanel.removeAll();
                    ListPanel.revalidate();
                    ListPanel.repaint();
                    InitializeSidePanel();
                } 
                catch (IOException ex) 
                {
                    ex.getStackTrace();
                }
            }
            
            
        }
    }//GEN-LAST:event_SaveClassInfoButtonActionPerformed

    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButtonActionPerformed
        Parent.removeAll();
        Parent.add(AddStudentPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_AddStudentButtonActionPerformed

    private void StudentGradeTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentGradeTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentGradeTextBoxActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(StudentFNameTextBox.getText().isEmpty() || StudentLNameTextBox.getText().isEmpty() || StudentGradeTextBox.getText().isEmpty() || StudentAbsentTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all fields!");
        }
        else if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please choose class first!");
        }
        else
        {
            String FName = StudentFNameTextBox.getText();
            String LName = StudentLNameTextBox.getText();
            String MInitial = StudentMInitialTextBox.getText();
            double Grade = 0.0;
            int Absent = 0;
            boolean isGradeValid = true;
            boolean isAbsentValid = true;

            try
            {
                Grade = Double.parseDouble(StudentGradeTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isGradeValid = false;
            }
            
            try
            {
                Absent = Integer.parseInt(StudentAbsentTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isAbsentValid = false;
            }
            
            if(!isGradeValid || !isAbsentValid)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format!");
            }
            else if(Grade > 5.00 || Grade < 1.00)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format for grade!");
            }
            else if(Absent < 0)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format for number of absent!");
            }
            else
            {
                DefaultTableModel model  = (DefaultTableModel)StudentTable.getModel();
                model.addRow(new Object []{FName, LName, MInitial,Grade,Absent});
                
                StudentFNameTextBox.setText(null);
                StudentLNameTextBox.setText(null);
                StudentMInitialTextBox.setText(null);
                StudentGradeTextBox.setText(null);
                StudentAbsentTextBox.setText(null);
                
                FName = null;
                LName = null;
                MInitial = null;
                Grade = 0.0;
                Absent = 0;
                
                JOptionPane.showMessageDialog(null, "Succesfully added student to the class " + HeaderLabel.getText() + ".");
                
                Parent.removeAll();
                Parent.add(HomePanel);
                Parent.repaint();
                Parent.revalidate();
                
                isGradeValid = true;
                isAbsentValid = true;
            }
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        Parent.removeAll();
        Parent.add(AddClassPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_AddClassButtonActionPerformed

    private void DeleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentButtonActionPerformed
        //Perform delete action for the selected row
        if(selectedRowForDeletion != -1)
        {
            deleteRow(selectedRowForDeletion);
            ArrayList <Student> st = getDataFromTable();
            clearTable();
            populateTable(st);
            st.clear();
            selectedRowForDeletion = -1;
            JOptionPane.showMessageDialog(null,"Succesfully deleted student from the list!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Choose a row to delete first!");
        }
    }//GEN-LAST:event_DeleteStudentButtonActionPerformed

    private void SaveStudInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveStudInfoButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        
        if(model.getRowCount() > 0 || isTableEdited())
        {
            ArrayList <Student> st = getDataFromTable();
            String filename = HeaderLabel.getText();
            deleteFromFile(filename);
            clearTable();
            populateTable(st);
            writeToFile(st, filename);
            st.clear();
            JOptionPane.showMessageDialog(null,"Succesfully saved!");
        }
    }//GEN-LAST:event_SaveStudInfoButtonActionPerformed

    private void DeleteClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteClassButtonActionPerformed
        if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly choose a class first!");
        }
        else
        {
            Component[] components = ListPanel.getComponents();
            for (Component component : components) 
            {
                if (component instanceof MyButton) 
                {
                    MyButton button = (MyButton) component;
                    if(button.getText().equals(HeaderLabel.getText()))
                    {
                        ListPanel.remove(button);
                         ListPanel.revalidate();
                        ListPanel.repaint();
                        JOptionPane.showMessageDialog(null, "Succesfully removed class!");
                    }
                 }
            }
        }
    }//GEN-LAST:event_DeleteClassButtonActionPerformed

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
    
    private ArrayList <Student> readFile(String filename)
    {
        String databaseDir = homeDir + File.separator + "Database";
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        String demarcation = ",";
        ArrayList <Student> stud = new ArrayList<Student>();
        
        String fname = null;
        String lname = null;
        String minitial = null;
        double grade = 0.0;
        int absent = 0;
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null)
            {
                int ctr = 0;
                int startIndex = 0;
                int endIndex = line.indexOf(demarcation, startIndex);
                
                while(endIndex != -1)
                {
                    String parts = line.substring(startIndex, endIndex);
                    switch (ctr) 
                    {
                        case 0 -> {
                            fname = parts;
                            ctr++;
                        }
                        case 1 -> {
                            lname = parts;
                            ctr++;
                        }
                        case 2 -> {
                            minitial = parts;
                            ctr++;
                        }
                        case 3 ->{
                            grade = Double.valueOf(parts);
                        }
                        default -> {
                        }
                    }
                    startIndex = endIndex + 1;
                    endIndex  = line.indexOf(demarcation, startIndex);
                }
                String parts = line.substring(startIndex);
                absent = Integer.valueOf(parts);
                Student s1 = new Student(fname, lname, minitial, grade, absent);
                stud.add(s1);
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.getStackTrace();
        }
        
        return stud;
    }
    
    private int writeToFile(ArrayList <Student> stud, String filename)
    {
        int isFileCreated = 1;
        String databaseDir = homeDir + File.separator + "Database";
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        try
        {
            BufferedWriter input = new BufferedWriter(new FileWriter(file));
            for(Student studs: stud)
            {
                input.write(studs.getFirstname() + "," + studs.getLastname() + "," + studs.getMiddleInitial() + "," + studs.getGrade() + "," + studs.getAbsent() + "\n");
            }
            input.flush();
            input.close();
        }
        catch(IOException e)
        {
            e.getStackTrace();
            isFileCreated = 0;
        }
        return isFileCreated;
    }

    private void deleteFromFile(String filename)
    {
        String databaseDir = homeDir + File.separator + "Database";
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
    
    private void populateTable(ArrayList <Student> stud)
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        Object rowData[] = new Object[6];
     
        for(int i  = 0 ; i < stud.size(); i++)
        {
            rowData[0] = i;
            rowData[1] = stud.get(i).getLastname();
            rowData[2] = stud.get(i).getFirstname();
            rowData[3] = stud.get(i).getMiddleInitial();
            rowData[4] = stud.get(i).getGrade();
            rowData[5] = stud.get(i).getAbsent();
            model.addRow(rowData);
        }
    }
    
    private void theader()
    {
        JTableHeader thead = StudentTable.getTableHeader();
        thead.setForeground(new Color(0,0,0));
        thead.setBackground(new Color(230,232,240));
        thead.setFont(new Font("Verdana", Font.BOLD, 14));
        thead.setOpaque(true);
        thead.getColumnModel().setColumnMargin(30);
        thead.setPreferredSize(new Dimension(100, 30));
    }
    
    private void InitializeSidePanel()
    {
        ListOfFile = getListOfFiles();
        for(String str: ListOfFile)
        {
            MyButton textButton = new MyButton();
            textButton.setForeground(Color.black);
            textButton.setBackground(new Color(9,166,254));
            textButton.setOpaque(true);
            textButton.setFont(new Font("Verdana", 1, 18));
            textButton.setRadius(30);
            
            textButton.setText(str);
            ListPanel.add(textButton);
            ListPanel.add(Box.createVerticalStrut(5));
            
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
                    mouseClicked = true;
                    
                    if(mouseClicked)
                    {
                        ArrayList <Student> students = new ArrayList <Student>();
                        students = readFile(HeaderLabel.getText());
                        clearTable();
                        populateTable(students);
                        students.clear();
                        mouseClicked = false;
                    }
                }
            });
        }  
    }
    
    private void clearTable()
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        while(model.getRowCount() > 0)
        {
            model.removeRow(0);
        }
    }
    
    private ArrayList <Student> getDataFromTable()
    {
        ArrayList <Student> students = new ArrayList<Student>();
        
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        int rowCount = model.getRowCount();
        
        String fname;
        String lname;
        String midname;
        double grade;
        int absent;
        
        
        for(int i = 0; i < rowCount; i++)
        {
            if(((model.getValueAt(i,0) != null && model.getValueAt(i,1) != null && model.getValueAt(i,2) != null && model.getValueAt(i,3) != null && model.getValueAt(i,4) != null)))
            {
                fname = String.valueOf(model.getValueAt(i, 0));
                lname = String.valueOf(model.getValueAt(i, 1));
                midname = String.valueOf(model.getValueAt(i, 2));
                String g = String.valueOf(model.getValueAt(i, 3));
                grade = Double.valueOf(g);
                String a = String.valueOf(model.getValueAt(i, 4));
                absent = Integer.valueOf(a);
                Student s = new Student(fname, lname, midname, grade, absent);
                students.add(s);
            }
        }    
        return students;
    }
    
    private boolean isTableEdited()
    {
        final boolean[] tableEdited = {false};
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        model.addTableModelListener((TableModelEvent e) -> 
        {
            if (e.getType() == TableModelEvent.UPDATE) 
            {
                tableEdited[0] = true;
            }
        });
        return tableEdited[0];
    }
    
    private void deleteRow(int rowIndex) 
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        model.removeRow(rowIndex);
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.classrecord.MyButton AddButton;
    private com.mycompany.classrecord.MyButton AddClassButton;
    private javax.swing.JPanel AddClassPanel;
    private com.mycompany.classrecord.MyButton AddStudentButton;
    private javax.swing.JPanel AddStudentPanel;
    private javax.swing.JTextField ClassCodeTextBox;
    private javax.swing.JTextField ClassInstructorTextBox;
    private javax.swing.JTextField ClassNameTextBox;
    private com.mycompany.classrecord.MyButton DeleteClassButton;
    private com.mycompany.classrecord.MyButton DeleteStudentButton;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JPanel Parent;
    private com.mycompany.classrecord.MyButton SaveClassInfoButton;
    private com.mycompany.classrecord.MyButton SaveStudInfoButton;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JTextField StudentAbsentTextBox;
    private javax.swing.JTextField StudentFNameTextBox;
    private javax.swing.JTextField StudentGradeTextBox;
    private javax.swing.JTextField StudentLNameTextBox;
    private javax.swing.JTextField StudentMInitialTextBox;
    private javax.swing.JTable StudentTable;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
