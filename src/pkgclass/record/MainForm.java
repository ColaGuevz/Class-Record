package pkgclass.record;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class MainForm extends javax.swing.JFrame {

    String homeDir = System.getProperty("user.home");       //getting the home directory of the user's laptop
    
    ArrayList <String> ListOfFile = new ArrayList<>();
    boolean mouseClicked = false;

    private int selectedRowForDeletion = -1;
    private String Foldername = null;
    
    boolean hasSaved = true;

    public MainForm(String folderName) 
    {
        initComponents();
        this.Foldername = folderName;
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
        
        StudentTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        StudentTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        StudentTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        StudentTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        StudentTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        StudentTable.getColumnModel().getColumn(5).setPreferredWidth(200);
        StudentTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        
        StudentTable.getColumnModel().getColumn(7).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(8).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(9).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(10).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(11).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(12).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(13).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(14).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(15).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(16).setPreferredWidth(180);
        StudentTable.getColumnModel().getColumn(17).setPreferredWidth(250);
        StudentTable.getColumnModel().getColumn(18).setPreferredWidth(180);
        
        AddClassButton.setBackground(new Color(34,63,135));
        TeachersNameLabel.setText(folderName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        TopParent = new javax.swing.JPanel();
        SidebarPanel = new javax.swing.JPanel();
        Top_Icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        WelcomeBackLabel = new javax.swing.JLabel();
        TeachersNameLabel = new javax.swing.JLabel();
        AddClassButton = new pkgclass.record.MyButton();
        jLabel7 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        ListPanel = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        AddStudentButton = new pkgclass.record.MyButton();
        SaveStudInfoButton = new pkgclass.record.MyButton();
        DeleteClassButton = new pkgclass.record.MyButton();
        DeleteStudentButton = new pkgclass.record.MyButton();
        ViewClassInformationButton = new pkgclass.record.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        SearchTextBox = new pkgclass.record.SearchText();
        ExportButton = new pkgclass.record.MyButton();
        AddClassPanel = new javax.swing.JPanel();
        SaveClassInfoButton = new pkgclass.record.MyButton();
        ClassNameTextBox = new pkgclass.record.FTextField();
        ClassCodeTextBox = new pkgclass.record.FTextField();
        ClassInstructorTextBox = new pkgclass.record.FTextField();
        ClassScheduleTextBox = new pkgclass.record.FTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ClassInfoBgHolder = new javax.swing.JLabel();
        AddStudentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        AddButton = new pkgclass.record.MyButton();
        StudentFNameTextBox = new pkgclass.record.FTextField();
        StudentLNameTextBox = new pkgclass.record.FTextField();
        StudentMInitialTextBox = new pkgclass.record.FTextField();
        IdNumberTextBox = new pkgclass.record.FTextField();
        GenderTextBox = new pkgclass.record.FTextField();
        ContactNumberTextBox = new pkgclass.record.FTextField();
        FirstQuarterGradeTextBox = new pkgclass.record.FTextField();
        SecondQuarterGradeTextBox = new pkgclass.record.FTextField();
        ThirdQuarterGradeTextBox = new pkgclass.record.FTextField();
        FourthQuarterGradeTextBox = new pkgclass.record.FTextField();
        FirstQuarterAbsentTextBox = new pkgclass.record.FTextField();
        SecondQuarterAbsentTextBox = new pkgclass.record.FTextField();
        ThirdQuarterAbsentTextBox = new pkgclass.record.FTextField();
        FourthQuarterAbsentTextBox = new pkgclass.record.FTextField();
        SchoolYearTextBox = new pkgclass.record.FTextField();
        GuardianNameTextBox = new pkgclass.record.FTextField();
        GuardianContactInformationTextBox = new pkgclass.record.FTextField();
        StudentInfoBgHolder = new javax.swing.JLabel();
        ViewClassInformationPanel = new javax.swing.JPanel();
        ClassNameHolder = new pkgclass.record.FTextField();
        ClassCodeHolder = new pkgclass.record.FTextField();
        ClassInstructorHolder = new pkgclass.record.FTextField();
        ClassScheduleHolder = new pkgclass.record.FTextField();
        SaveClassInfoChangeButton = new pkgclass.record.MyButton();
        EditClassInfoButton = new pkgclass.record.MyButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        ViewClassInfoBgHolder = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopParent.setBackground(new java.awt.Color(0, 0, 0));
        TopParent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidebarPanel.setBackground(new java.awt.Color(199, 203, 216));
        SidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Top_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/user.png"))); // NOI18N
        SidebarPanel.add(Top_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 140));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        SidebarPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 222, 179, 10));

        WelcomeBackLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        WelcomeBackLabel.setForeground(java.awt.SystemColor.activeCaptionText);
        WelcomeBackLabel.setText("Welcome back");
        SidebarPanel.add(WelcomeBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        TeachersNameLabel.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        TeachersNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        SidebarPanel.add(TeachersNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        AddClassButton.setForeground(new java.awt.Color(255, 255, 255));
        AddClassButton.setText("Add class");
        AddClassButton.setBorderPainted(false);
        AddClassButton.setColor(new java.awt.Color(34, 63, 135));
        AddClassButton.setColorClick(java.awt.SystemColor.activeCaption);
        AddClassButton.setColorOver(java.awt.SystemColor.activeCaption);
        AddClassButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        AddClassButton.setRadius(30);
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });
        SidebarPanel.add(AddClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/icons8-logout-50 (1).png"))); // NOI18N
        SidebarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 30, -1));

        ScrollPane.setBackground(new java.awt.Color(230, 232, 240));
        ScrollPane.setForeground(new java.awt.Color(230, 232, 240));

        ListPanel.setBackground(new java.awt.Color(230, 232, 240));
        ListPanel.setLayout(new javax.swing.BoxLayout(ListPanel, javax.swing.BoxLayout.LINE_AXIS));
        ScrollPane.setViewportView(ListPanel);

        SidebarPanel.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 300));

        LogoutButton.setBackground(new java.awt.Color(199, 203, 216));
        LogoutButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(0, 0, 0));
        LogoutButton.setText("Logout");
        LogoutButton.setBorder(null);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        SidebarPanel.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 618, -1, 30));

        TopParent.add(SidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        AddStudentButton.setText("Add Student");
        AddStudentButton.setBorderPainted(false);
        AddStudentButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        AddStudentButton.setRadius(30);
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });
        HomePanel.add(AddStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 120, 40));

        SaveStudInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveStudInfoButton.setText("Save");
        SaveStudInfoButton.setBorderPainted(false);
        SaveStudInfoButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        SaveStudInfoButton.setRadius(30);
        SaveStudInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveStudInfoButtonActionPerformed(evt);
            }
        });
        HomePanel.add(SaveStudInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, 40));

        DeleteClassButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteClassButton.setText("Delete Class");
        DeleteClassButton.setBorderPainted(false);
        DeleteClassButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        DeleteClassButton.setRadius(30);
        DeleteClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteClassButtonActionPerformed(evt);
            }
        });
        HomePanel.add(DeleteClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 140, 40));

        DeleteStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteStudentButton.setText("Remove Student");
        DeleteStudentButton.setBorderPainted(false);
        DeleteStudentButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        DeleteStudentButton.setRadius(30);
        DeleteStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentButtonActionPerformed(evt);
            }
        });
        HomePanel.add(DeleteStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, 40));

        ViewClassInformationButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewClassInformationButton.setText("Class Information");
        ViewClassInformationButton.setBorderPainted(false);
        ViewClassInformationButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        ViewClassInformationButton.setRadius(30);
        ViewClassInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassInformationButtonActionPerformed(evt);
            }
        });
        HomePanel.add(ViewClassInformationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 180, 40));

        StudentTable.setAutoCreateRowSorter(true);
        StudentTable.setBackground(new java.awt.Color(255, 255, 255));
        StudentTable.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        StudentTable.setForeground(new java.awt.Color(0, 0, 0));
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Student ID", "Last Name", "First Name", "Middle Initial", "Contact No.", "Sex", "1st Quarter Grade", "2nd Quarter Grade", "3rd Quarter Grade", "4th Quarter Grade", "Final Grade", "1st Quarter Absent", "2nd Quarter Absent", "3rd Quarter Absent", "4th Quarter Absent", "School Year", "Guardian Name", "Guardian Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.setAutoResizeMode(0);
        StudentTable.setGridColor(new java.awt.Color(0, 0, 0));
        StudentTable.setRowHeight(30);
        StudentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        StudentTable.setShowGrid(true);
        StudentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(0).setResizable(false);
        }

        HomePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 680, 420));

        SearchTextBox.setBackground(new java.awt.Color(255, 255, 255));
        SearchTextBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SearchTextBox.setForeground(new java.awt.Color(0, 0, 0));
        SearchTextBox.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        SearchTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextBoxKeyReleased(evt);
            }
        });
        HomePanel.add(SearchTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 40));

        ExportButton.setForeground(new java.awt.Color(255, 255, 255));
        ExportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/24x24-printer.png"))); // NOI18N
        ExportButton.setBorderPainted(false);
        ExportButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ExportButton.setRadius(30);
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });
        HomePanel.add(ExportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 50, 40));

        Parent.add(HomePanel, "card2");

        AddClassPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaveClassInfoButton.setForeground(new java.awt.Color(255, 255, 255));
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
        AddClassPanel.add(SaveClassInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, 40));

        ClassNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ClassNameTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddClassPanel.add(ClassNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 40));

        ClassCodeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ClassCodeTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddClassPanel.add(ClassCodeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 40));

        ClassInstructorTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ClassInstructorTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddClassPanel.add(ClassInstructorTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 220, 40));

        ClassScheduleTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ClassScheduleTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddClassPanel.add(ClassScheduleTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 220, 40));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Enter class schedule");
        jPanel17.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddClassPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 180, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter class instructor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        AddClassPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, 30));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter class name");
        jPanel18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        AddClassPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter class code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddClassPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Class Information");
        AddClassPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 190, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/file.png"))); // NOI18N
        AddClassPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 50));

        ClassInfoBgHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/ClassInfoBackground.jpg"))); // NOI18N
        AddClassPanel.add(ClassInfoBgHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 600));

        Parent.add(AddClassPanel, "card3");

        AddStudentPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/Student_Info_Icon_(50x50).png"))); // NOI18N
        AddStudentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 50, 40));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Sex");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddStudentPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 70, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("School year");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        AddStudentPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, 30));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Absents");
        jPanel29.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        AddStudentPanel.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, 40));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Firstname");
        jPanel28.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddStudentPanel.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Student Information");
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        AddStudentPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Id Number");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddStudentPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("2nd Quarter:");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        AddStudentPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("3rd Quarter:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        AddStudentPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("4th Quarter:");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        AddStudentPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 40));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Guardian Contact Information");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        AddStudentPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 250, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Guardian Name");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        AddStudentPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 150, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Grade");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        AddStudentPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 60, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Contact Information");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        AddStudentPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 170, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Middle Name");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        AddStudentPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 130, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Lastname");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        AddStudentPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 30));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("1st Quarter:");
        jPanel13.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        AddStudentPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 40));

        AddButton.setForeground(new java.awt.Color(255, 255, 255));
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
        AddStudentPanel.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, 40));

        StudentFNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        StudentFNameTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(StudentFNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 40));

        StudentLNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        StudentLNameTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(StudentLNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 190, 40));

        StudentMInitialTextBox.setForeground(new java.awt.Color(0, 0, 0));
        StudentMInitialTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(StudentMInitialTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 210, 40));

        IdNumberTextBox.setForeground(new java.awt.Color(0, 0, 0));
        IdNumberTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(IdNumberTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 40));

        GenderTextBox.setForeground(new java.awt.Color(0, 0, 0));
        GenderTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(GenderTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 90, 40));

        ContactNumberTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ContactNumberTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(ContactNumberTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 180, 40));

        FirstQuarterGradeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        FirstQuarterGradeTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(FirstQuarterGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 60, 40));

        SecondQuarterGradeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        SecondQuarterGradeTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        SecondQuarterGradeTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondQuarterGradeTextBoxActionPerformed(evt);
            }
        });
        AddStudentPanel.add(SecondQuarterGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 60, 40));

        ThirdQuarterGradeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ThirdQuarterGradeTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(ThirdQuarterGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 60, 40));

        FourthQuarterGradeTextBox.setForeground(new java.awt.Color(0, 0, 0));
        FourthQuarterGradeTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(FourthQuarterGradeTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 60, 40));

        FirstQuarterAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        FirstQuarterAbsentTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(FirstQuarterAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 60, 40));

        SecondQuarterAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        SecondQuarterAbsentTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(SecondQuarterAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 60, 40));

        ThirdQuarterAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        ThirdQuarterAbsentTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(ThirdQuarterAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 60, 40));

        FourthQuarterAbsentTextBox.setForeground(new java.awt.Color(0, 0, 0));
        FourthQuarterAbsentTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(FourthQuarterAbsentTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 60, 40));

        SchoolYearTextBox.setForeground(new java.awt.Color(0, 0, 0));
        SchoolYearTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(SchoolYearTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 110, 40));

        GuardianNameTextBox.setForeground(new java.awt.Color(0, 0, 0));
        GuardianNameTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(GuardianNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 240, 40));

        GuardianContactInformationTextBox.setForeground(new java.awt.Color(0, 0, 0));
        GuardianContactInformationTextBox.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        AddStudentPanel.add(GuardianContactInformationTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 240, 40));

        StudentInfoBgHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/StudentInfoBackground.jpg"))); // NOI18N
        AddStudentPanel.add(StudentInfoBgHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        Parent.add(AddStudentPanel, "card4");

        ViewClassInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        ViewClassInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClassNameHolder.setForeground(new java.awt.Color(0, 0, 0));
        ClassNameHolder.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ViewClassInformationPanel.add(ClassNameHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 330, 40));

        ClassCodeHolder.setForeground(new java.awt.Color(0, 0, 0));
        ClassCodeHolder.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ViewClassInformationPanel.add(ClassCodeHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 330, 40));

        ClassInstructorHolder.setForeground(new java.awt.Color(0, 0, 0));
        ClassInstructorHolder.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ViewClassInformationPanel.add(ClassInstructorHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 300, 40));

        ClassScheduleHolder.setForeground(new java.awt.Color(0, 0, 0));
        ClassScheduleHolder.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ViewClassInformationPanel.add(ClassScheduleHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 300, 40));

        SaveClassInfoChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveClassInfoChangeButton.setText("Save");
        SaveClassInfoChangeButton.setBorderColor(new java.awt.Color(0, 0, 0));
        SaveClassInfoChangeButton.setBorderPainted(false);
        SaveClassInfoChangeButton.setColor(new java.awt.Color(34, 63, 135));
        SaveClassInfoChangeButton.setColorClick(java.awt.SystemColor.activeCaption);
        SaveClassInfoChangeButton.setColorOver(java.awt.SystemColor.activeCaption);
        SaveClassInfoChangeButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SaveClassInfoChangeButton.setRadius(30);
        SaveClassInfoChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveClassInfoChangeButtonActionPerformed(evt);
            }
        });
        ViewClassInformationPanel.add(SaveClassInfoChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 130, 40));

        EditClassInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        EditClassInfoButton.setText("Edit");
        EditClassInfoButton.setBorderColor(new java.awt.Color(0, 0, 0));
        EditClassInfoButton.setBorderPainted(false);
        EditClassInfoButton.setColor(new java.awt.Color(34, 63, 135));
        EditClassInfoButton.setColorClick(java.awt.SystemColor.activeCaption);
        EditClassInfoButton.setColorOver(java.awt.SystemColor.activeCaption);
        EditClassInfoButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditClassInfoButton.setRadius(30);
        EditClassInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditClassInfoButtonActionPerformed(evt);
            }
        });
        ViewClassInformationPanel.add(EditClassInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 130, 40));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Class Information");
        ViewClassInformationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 190, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/file.png"))); // NOI18N
        ViewClassInformationPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 50));

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Class Code:");
        ViewClassInformationPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 40));

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Class Schedule:");
        ViewClassInformationPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 140, 40));

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Class name:");
        ViewClassInformationPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 40));

        jLabel28.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Class Instructor:");
        ViewClassInformationPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 140, 40));

        ViewClassInfoBgHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/GEM-logo-Only-600sq-2019.png"))); // NOI18N
        ViewClassInformationPanel.add(ViewClassInfoBgHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 610, 600));

        Parent.add(ViewClassInformationPanel, "card5");

        TopParent.add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 700, 600));

        HeaderPanel.setBackground(new java.awt.Color(109, 116, 151));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(249, 113, 98));
        jLabel17.setText("Record");
        HeaderPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, 50));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("M-Class");
        HeaderPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 170, 50));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgclass/record/image/2. 67fbeadd2221ba3294bffe2c5d1ac5cd.png"))); // NOI18N
        HeaderPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -10, 90, 90));

        HeaderLabel.setBackground(new java.awt.Color(51, 51, 51));
        HeaderLabel.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 0));
        HeaderPanel.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        HeaderPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, 20));

        TopParent.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 700, 90));

        getContentPane().add(TopParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 690));

        setSize(new java.awt.Dimension(966, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveClassInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveClassInfoButtonActionPerformed
        //checking if textbox has texts in it
        if(ClassNameTextBox.getText().isEmpty()|| ClassCodeTextBox.getText().isEmpty() || ClassInstructorTextBox.getText().isEmpty() || ClassScheduleTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly enter all necessary fields!");
        }
        else if(ClassCodeTextBox.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null,"Kindly make the class code shorter");
        }
        else
        {
            String classCode = ClassCodeTextBox.getText();                                      //getting class code for the name of the file
            String className = ClassNameTextBox.getText();
            String classInstructor = ClassInstructorTextBox.getText();
            String classSched = ClassScheduleTextBox.getText();
            
            String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;                     //concatinating home dirctory with the name Database
            String filePath = databaseDir + File.separator + "\\" + classCode +".txt";  //making a string filepath for the file
            
            String classDatabaseDir = databaseDir + File.separator + "\\" + classCode + "Information";
            String classInfoFileName = classDatabaseDir + File.separator + "\\" + classCode +".txt";
            
            File file = new File(filePath);                                                                        //making a string filepath for the file
            File file1 = new File(classInfoFileName);
            
            File folder = new File(databaseDir);                                                           //making a string filepath for the folder
            File folder1 = new File(classDatabaseDir);
            
            boolean doesExist = file.exists();
            if(!folder.exists())
            {
                folder.mkdirs();                                                                                //creating database folder
            }
            
            boolean doesClassExists =  file1.exists();
            if(!folder1.exists())
            {
                folder1.mkdirs();
            }
            
            
            if(doesExist || doesClassExists)
            {
                JOptionPane.showMessageDialog(null, "Kindly choose another class code.");
            }
            else
            {
                try 
                {
                    file.createNewFile();     //actual creating of txt file
                    file1.createNewFile();
                    
                    try
                    {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
                        writer.write(classCode  + "\n" + className + "\n" + classInstructor + "\n" + classSched + "\n");
                        writer.close();
                    }
                    catch(IOException e)
                    {
                        e.getStackTrace();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Class sucessfully created!");
                    
                    Parent.removeAll();
                    Parent.add(HomePanel);
                    Parent.repaint();
                    Parent.revalidate();
                    
                    ClassNameTextBox.setText("");
                    ClassCodeTextBox.setText("");
                    ClassInstructorTextBox.setText("");
                    ClassScheduleTextBox.setText("");
                    
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
        if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly choose a class first!");
        }
        else if(!hasSaved)
        {
            JOptionPane.showMessageDialog(null, "Kindly save your work please!");
        }
        else
        {
            Parent.removeAll();
            Parent.add(AddStudentPanel);
            Parent.repaint();
            Parent.revalidate();
        }
    }//GEN-LAST:event_AddStudentButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(StudentFNameTextBox.getText().isEmpty() || StudentLNameTextBox.getText().isEmpty() || StudentMInitialTextBox.getText().isEmpty() || IdNumberTextBox.getText().isEmpty() || GenderTextBox.getText().isEmpty() || SchoolYearTextBox.getText().isEmpty() || GuardianNameTextBox.getText().isEmpty() || GuardianContactInformationTextBox.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all necessarry fields!");
        }
        else if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please choose class first!");
        }
        else
        {
            String IDNumber = IdNumberTextBox.getText();
            String FName = StudentFNameTextBox.getText();
            String LName = StudentLNameTextBox.getText();
            String MInitial = StudentMInitialTextBox.getText();
            String Gender = GenderTextBox.getText();
            String SchoolYear = SchoolYearTextBox.getText();
            String GuardianName = GuardianNameTextBox.getText();
            String GuardianContactNumber = GuardianContactInformationTextBox.getText();
            
            double FirstQuarterGrade = 0.0;
            double SecondQuarterGrade = 0.0;
            double ThirdQuarterGrade = 0.0;
            double FourthQuarterGrade = 0.0;
            
            boolean isFirstQuarterGradeValid = true;
            boolean isSecondQuarterGradeValid = true;
            boolean isThirdQuarterGradeValid = true;
            boolean isFourthQuarterGradeValid = true;
            
            int FirstQuarterAbsent = 0;
            int SecondQuarterAbsent = 0;
            int ThirdQuarterAbsent = 0;
            int FourthQuarterAbsent = 0;
            
            boolean isFirstQuarterAbsentValid = true;
            boolean isSecondQuarterAbsentValid = true;
            boolean isThirdQuarterAbsentValid = true;
            boolean isFourthQuarterAbsentValid = true;
            
            String ContactNumber = ContactNumberTextBox.getText();

            //FIRST QUARTER
            try
            {
                FirstQuarterGrade = Double.parseDouble(FirstQuarterGradeTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isFirstQuarterGradeValid = false;
            }
            
            //SECOND QUARTER
            try
            {
                SecondQuarterGrade = Double.parseDouble(SecondQuarterGradeTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isSecondQuarterGradeValid = false;
            }
            
            //THIRD QUARTER
            try
            {
                ThirdQuarterGrade = Double.parseDouble(ThirdQuarterGradeTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isThirdQuarterGradeValid = false;
            }
            
            //FOURTH QUARTER
            try
            {
                FourthQuarterGrade = Double.parseDouble(FourthQuarterGradeTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isFourthQuarterGradeValid = false;
            }
            
            //1ST QUARTER ABSENT
            try
            {
                FirstQuarterAbsent = Integer.parseInt(FirstQuarterAbsentTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isFirstQuarterAbsentValid = false;
            }
            
            //2ND QUARTER ABSENT
            try
            {
                SecondQuarterAbsent = Integer.parseInt(SecondQuarterAbsentTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isSecondQuarterAbsentValid = false;
            }
            
            //3RD QUARTER ABSENT
            try
            {
                ThirdQuarterAbsent = Integer.parseInt(ThirdQuarterAbsentTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isThirdQuarterAbsentValid = false;
            }
            
            //4TH QUARTER ABSENT
            try
            {
                FourthQuarterAbsent = Integer.parseInt(FourthQuarterAbsentTextBox.getText());
            }
            catch(NumberFormatException nfe)
            {
                isFourthQuarterAbsentValid = false;
            }
            
            //CHECKER
            if(!isFirstQuarterGradeValid || !isSecondQuarterGradeValid || !isThirdQuarterGradeValid || !isFourthQuarterGradeValid)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format for grades!");
            }
            else if((FirstQuarterGrade < 0.00 || FirstQuarterGrade > 100.00) || (SecondQuarterGrade < 0.00 || SecondQuarterGrade > 100.00) || (ThirdQuarterGrade < 0.00 || ThirdQuarterGrade > 100.00) ||(FourthQuarterGrade < 0.00 || FourthQuarterGrade > 100.00))
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format for grades!");
            }
            else if(!isFirstQuarterAbsentValid || !isSecondQuarterAbsentValid || !isThirdQuarterAbsentValid || !isFourthQuarterAbsentValid)
            {
                JOptionPane.showMessageDialog(null,"Please enter a valid number format for number of absent!");
            }
            else if(FirstQuarterAbsent < 0 || SecondQuarterAbsent < 0 || ThirdQuarterAbsent < 0 || FourthQuarterAbsent < 0)
            {
                JOptionPane.showMessageDialog(null,"Absent must be a positive number!");
            }
            else
            {
                double FinalGrade = (FirstQuarterGrade + SecondQuarterGrade + ThirdQuarterGrade + FourthQuarterGrade) / 4.00;
                DefaultTableModel model  = (DefaultTableModel)StudentTable.getModel();
                model.addRow(new Object []{
                    model.getRowCount()+1, 
                    IDNumber, 
                    LName, 
                    FName, 
                    MInitial, 
                    ContactNumber , 
                    Gender,
                    FirstQuarterGrade, 
                    SecondQuarterGrade, 
                    ThirdQuarterGrade, 
                    FourthQuarterGrade, 
                    FinalGrade,
                    FirstQuarterAbsent, 
                    SecondQuarterAbsent, 
                    ThirdQuarterAbsent, 
                    FourthQuarterAbsent,
                    SchoolYear,
                    GuardianName,
                    GuardianContactNumber
                });
                
                StudentFNameTextBox.setText("");
                StudentLNameTextBox.setText("");
                StudentMInitialTextBox.setText("");
                IdNumberTextBox.setText("");
                GenderTextBox.setText("");
                ContactNumberTextBox.setText("");
                FirstQuarterGradeTextBox.setText("");
                SecondQuarterGradeTextBox.setText("");
                ThirdQuarterGradeTextBox.setText("");
                FourthQuarterGradeTextBox.setText("");
                FirstQuarterAbsentTextBox.setText("");
                SecondQuarterAbsentTextBox.setText("");
                ThirdQuarterAbsentTextBox.setText("");
                FourthQuarterAbsentTextBox.setText("");
                SchoolYearTextBox.setText("");
                GuardianNameTextBox.setText("");
                GuardianContactInformationTextBox.setText("");
                
                IDNumber = null;
                FName = null;
                LName = null;
                MInitial = null;
                Gender = null;
                
                ContactNumber = null;

                FirstQuarterGrade = 0.0;
                SecondQuarterGrade = 0.0;
                ThirdQuarterGrade = 0.0;
                FourthQuarterGrade = 0.0;
                FinalGrade = 0.0;

                isFirstQuarterGradeValid = true;
                isSecondQuarterGradeValid = true;
                isThirdQuarterGradeValid = true;
                isFourthQuarterGradeValid = true;

                FirstQuarterAbsent = 0;
                SecondQuarterAbsent = 0;
                ThirdQuarterAbsent = 0;
                FourthQuarterAbsent = 0;

                isFirstQuarterAbsentValid = true;
                isSecondQuarterAbsentValid = true;
                isThirdQuarterAbsentValid = true;
                isFourthQuarterAbsentValid = true;
                
                SchoolYear = null;
                GuardianName = null;
                GuardianContactNumber = null;

                
                hasSaved = false;
                JOptionPane.showMessageDialog(null, "Succesfully added student to the class " + HeaderLabel.getText() + ".");
                
                Parent.removeAll();
                Parent.add(HomePanel);
                Parent.repaint();
                Parent.revalidate();
            }
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        if(!hasSaved)
        {
            JOptionPane.showMessageDialog(null, "Kindly save your work first!");
        }
        else
        {
            Parent.removeAll();
            Parent.add(AddClassPanel);
            Parent.repaint();
            Parent.revalidate();
        }
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
           hasSaved = false;
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
            hasSaved = true;
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
                        String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;                    
                        String filePath = databaseDir + File.separator + "\\" + HeaderLabel.getText() +".txt";
                        
                        String classDatabaseDir = databaseDir + File.separator + "\\" + HeaderLabel.getText() + "Information";
                        String classInfoFileName = classDatabaseDir + File.separator + "\\" + HeaderLabel.getText() +".txt";
                        
                        File file = new File(filePath); 
                        File file1 = new File(classInfoFileName);
                        File file2 = new File(classDatabaseDir);
                        
                        file.delete();
                        file1.delete();
                        file2.delete();
                        clearTable();
                        
                        HeaderLabel.setText("");
                        ListPanel.remove(button);
                        ListPanel.revalidate();
                        ListPanel.repaint();
                        JOptionPane.showMessageDialog(null, "Succesfully removed class!");
                    }
                 }
            }
        }
    }//GEN-LAST:event_DeleteClassButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        if(!hasSaved)
        {
            JOptionPane.showMessageDialog(null, "Kindly save your work first!");
        }
        else
        {
            new LoginForm().setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewClassInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClassInformationButtonActionPerformed
        if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kindly choose class first!");
        }
        else if(!hasSaved)
        {
            JOptionPane.showMessageDialog(null, "Kindly save your work first!");
        }
        else
        {
            Parent.removeAll();
            Parent.add(ViewClassInformationPanel);
            Parent.repaint();
            Parent.revalidate();
            String classInstructor = null;
            String className = null;
            String classCode = HeaderLabel.getText();
            String classSchedule = null;
            
            String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;
            String classDatabaseDir = databaseDir + File.separator + "\\" + classCode + "Information";
            String classInfoFileName = classDatabaseDir + File.separator + "\\" + classCode +".txt";
            
            String str;
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(classInfoFileName));
                do
                {
                    classCode = reader.readLine();
                    className = reader.readLine();
                    classInstructor = reader.readLine();
                    classSchedule = reader.readLine();
                }while((str = reader.readLine()) != null);
                reader.close();
            }
            catch(IOException e)
            {
                e.getStackTrace();
            }
            
            ClassCodeHolder.setText(classCode);
            ClassNameHolder.setText(className);
            ClassInstructorHolder.setText(classInstructor);
            ClassScheduleHolder.setText(classSchedule);
            
            ClassCodeHolder.setEditable(false);
            ClassNameHolder.setEditable(false);
            ClassInstructorHolder.setEditable(false);
            ClassScheduleHolder.setEditable(false);
        }
    }//GEN-LAST:event_ViewClassInformationButtonActionPerformed

    private void SecondQuarterGradeTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondQuarterGradeTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondQuarterGradeTextBoxActionPerformed

    private void SaveClassInfoChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveClassInfoChangeButtonActionPerformed
         if(ClassCodeHolder.getText().isEmpty() || ClassNameHolder.getText().isEmpty() || ClassInstructorHolder.getText().isEmpty() ||  ClassScheduleHolder.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all fields");
        }
        else
        {
            String oldClassCode = HeaderLabel.getText();
            
            String newClassCode = ClassCodeHolder.getText();
            
            //old text file that contains student information
            String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername; //General folder
            String oldFileContainingStudentInfo = databaseDir + File.separator + "\\" + oldClassCode +".txt";//OLD TEXT FILE
            String newFileNameInFileContainingStudentInfo = databaseDir + File.separator + "\\" + newClassCode +".txt";//NEW TEXT FILE
            
            File oldFileInStudentDatabase = new File(oldFileContainingStudentInfo);
            File newFileInStudentDatabase = new File(newFileNameInFileContainingStudentInfo);
            oldFileInStudentDatabase.renameTo(newFileInStudentDatabase);
            
            String classDatabaseDir = databaseDir + File.separator + "\\" + oldClassCode + "Information";
            String newClassDatabaseDir = databaseDir + File.separator + "\\" + newClassCode + "Information";
            String oldFileContainingClassInfo = classDatabaseDir + File.separator + "\\" + oldClassCode +".txt";
            String newFileNameContainingClassInfo = classDatabaseDir + File.separator + "\\" + newClassCode +".txt";
            
            //CLASS INFORMATION RENAMING
            File oldFileInClassDatabase = new File(oldFileContainingClassInfo);
            File newFileInClassDatabase = new File(newFileNameContainingClassInfo);
            oldFileInClassDatabase.renameTo(newFileInClassDatabase);
            
            //FOLDER RENAMING
            File oldFolderOfClassDatabase = new File(classDatabaseDir);
            File newFolderOfClassDatabase = new File(newClassDatabaseDir);
            oldFolderOfClassDatabase.renameTo(newFolderOfClassDatabase);
            
            ListOfFile.clear();
            ListOfFile = getListOfFiles();
            ListPanel.removeAll();
            ListPanel.revalidate();
            ListPanel.repaint();
            InitializeSidePanel();
            
            String folderContainingClassInfo = databaseDir + File.separator + "\\" + ClassCodeHolder.getText() + "Information";
            String fileContainingClassInfo = folderContainingClassInfo + File.separator + "\\" + ClassCodeHolder.getText() + ".txt";
            File actualFileContainingClassInfo = new File(fileContainingClassInfo);
            
            try (FileWriter fileWriter = new FileWriter(actualFileContainingClassInfo, false)) 
            {
                fileWriter.write("");
                fileWriter.close();
            } 
            catch (IOException e) 
            {
                e.getStackTrace();
            }
            
            try
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter(actualFileContainingClassInfo));
                writer.write(ClassCodeHolder.getText() + "\n" + ClassNameHolder.getText() + "\n" + ClassInstructorHolder.getText() + ClassScheduleHolder.getText() + "\n");
                writer.close();
                JOptionPane.showMessageDialog(null, "Edited class information successfully!");
            }
            catch(IOException e)
            {
                e.getStackTrace();
            }
            HeaderLabel.setText(ClassCodeHolder.getText());
            
            ClassCodeHolder.setText("");
            ClassNameHolder.setText("");
            ClassInstructorHolder.setText("");
            ClassScheduleHolder.setText("");
            
            Parent.removeAll();
            Parent.add(HomePanel);
            Parent.repaint();
            Parent.revalidate();
        }
    }//GEN-LAST:event_SaveClassInfoChangeButtonActionPerformed

    private void EditClassInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditClassInfoButtonActionPerformed
        ClassCodeHolder.setEditable(true);
        ClassNameHolder.setEditable(true);
        ClassInstructorHolder.setEditable(true);
        ClassScheduleHolder.setEditable(true);
    }//GEN-LAST:event_EditClassInfoButtonActionPerformed

    private void SearchTextBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextBoxKeyReleased
        filter(SearchTextBox.getText());
    }//GEN-LAST:event_SearchTextBoxKeyReleased

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        if(HeaderLabel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please choose class first");
        }
        else
        {
            MessageFormat header = new MessageFormat(HeaderLabel.getText());
            MessageFormat footer = new MessageFormat(HeaderLabel.getText());
            try
            {
                PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                set.add(OrientationRequested.LANDSCAPE);
                StudentTable.print(JTable.PrintMode.FIT_WIDTH, header,footer, true, set, true);
            }
            catch(java.awt.print.PrinterException e)
            {
                JOptionPane.showMessageDialog(null,"Export failed!");
            }
            
        }
        
    }//GEN-LAST:event_ExportButtonActionPerformed

    private ArrayList <String> getListOfFiles()
    {
        ArrayList <String> listOfFile = new ArrayList<String>();
        String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;
        File folder = new File(databaseDir);   
        
        if(!folder.exists())
        {
            folder.mkdirs();                                                                                //creating database folder
        }
        
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
        String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        String demarcation = ",";
        ArrayList <Student> stud = new ArrayList<Student>();
        
        String IDNumber = null;
        String LName = null;
        String FName = null;
        String MInitial = null;
        String ContactNumber = null;
        String Gender = null;
        double FirstQuarterGrade = 0.0;
        double SecondQuarterGrade = 0.0;
        double ThirdQuarterGrade = 0.0;
        double FourthQuarterGrade = 0.0;
        double FinalGrade = 0.0;
        int FirstQuarterAbsent = 0;
        int SecondQuarterAbsent = 0;
        int ThirdQuarterAbsent = 0;
        int FourthQuarterAbsent = 0;
        String SchoolYear = null;
        String GuardianName = null;
        String GuardianContactNumber = null;
        
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
                            IDNumber = parts;
                            ctr++;
                        }
                        case 1 -> {
                            LName = parts;
                            ctr++;
                        }
                        case 2 -> {
                            FName = parts;
                            ctr++;
                        }
                        case 3 ->{
                            MInitial = parts;
                            ctr++;
                        }
                        case 4 ->{
                            ContactNumber = parts;
                            ctr++;
                        }
                        case 5 ->{
                            Gender = parts;
                            ctr++;
                        }
                        case 6 ->{
                            FirstQuarterGrade = Double.valueOf(parts);
                            ctr++;
                        }
                        case 7 ->{
                            SecondQuarterGrade = Double.valueOf(parts);
                            ctr++;
                        }
                        case 8 ->{
                            ThirdQuarterGrade = Double.valueOf(parts);
                            ctr++;
                        }
                        case 9 ->{
                            FourthQuarterGrade = Double.valueOf(parts);
                            ctr++;
                        }
                        case 10 ->{
                            FinalGrade = Double.valueOf(parts);
                            ctr++;
                        }
                        case 11 ->{
                            FirstQuarterAbsent = Integer.valueOf(parts);
                            ctr++;
                        }
                        case 12 ->{
                            SecondQuarterAbsent = Integer.valueOf(parts);
                            ctr++;
                        }
                        case 13 ->{
                            ThirdQuarterAbsent = Integer.valueOf(parts);
                            ctr++;
                        }
                        case 14 ->{
                            FourthQuarterAbsent = Integer.valueOf(parts);
                            ctr++;
                        }
                        case 15 ->{
                            SchoolYear = parts;
                            ctr++;
                        }
                        case 16 ->{
                            GuardianName = parts;
                            ctr++;
                        }
                        case 17 ->{
                            GuardianContactNumber = parts;
                            ctr++;
                        }
                        default -> {
                        }
                    }
                    startIndex = endIndex + 1;
                    endIndex  = line.indexOf(demarcation, startIndex);
                }
                String parts = line.substring(startIndex);
                GuardianContactNumber = parts;
                Student s1 = new Student(
                        IDNumber, 
                        LName, 
                        FName, 
                        MInitial, 
                        ContactNumber, 
                        Gender, 
                        FirstQuarterGrade,
                        SecondQuarterGrade,
                        ThirdQuarterGrade,
                        FourthQuarterGrade,
                        FirstQuarterAbsent,
                        SecondQuarterAbsent,
                        ThirdQuarterAbsent,
                        FourthQuarterAbsent,
                        SchoolYear,
                        GuardianName,
                        GuardianContactNumber
                );
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
        String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        try
        {
            BufferedWriter input = new BufferedWriter(new FileWriter(file));
            for(Student studs: stud)
            {
                input.write(
                        studs.getStudentID() + "," + 
                        studs.getLastname() + "," + 
                        studs.getFirstname() + "," + 
                        studs.getMiddleInitial() + "," + 
                        studs.getContactNumber() + "," + 
                        studs.getGender() + "," + 
                        studs.getFirstQuarterGrade() + "," + 
                        studs.getSecondQuarterGrade() + "," +
                        studs.getThirdQuarterGrade() + "," +
                        studs.getFourthQuarterGrade() + "," +
                        studs.getFinalGrade() + "," +
                        studs.getFirstQuarterAbsent() + "," +
                        studs.getSecondQuarterAbsent() + "," +
                        studs.getThirdQuarterAbsent() + "," +
                        studs.getFourthQuarterAbsent() + "," +
                        studs.getSchoolYear() + "," +
                        studs.getGuardianName() + "," +
                        studs.getGuardianContactNumber() + "\n"
                );
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
        String databaseDir = homeDir + File.separator + "ClassRecordDatabaseOf" + Foldername;
        String filePath = databaseDir + File.separator + "\\" + filename + ".txt";
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file, false)) 
        {
            fileWriter.write("");
            fileWriter.close();
        } 
        catch (IOException e) 
        {
            e.getStackTrace();
        }
    }
    
    private void populateTable(ArrayList <Student> stud)
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        Object rowData[] = new Object[19];
        int count = 1;
        for(int i  = 0 ; i < stud.size(); i++)
        {
            rowData[0] = count;
            rowData[1] = stud.get(i).getStudentID();
            rowData[2] = stud.get(i).getLastname();
            rowData[3] = stud.get(i).getFirstname();
            rowData[4] = stud.get(i).getMiddleInitial();
            rowData[5] = stud.get(i).getContactNumber();
            rowData[6] = stud.get(i).getGender();
            rowData[7] = stud.get(i).getFirstQuarterGrade();
            rowData[8] = stud.get(i).getSecondQuarterGrade();
            rowData[9] = stud.get(i).getThirdQuarterGrade();
            rowData[10] = stud.get(i).getFourthQuarterGrade();
            rowData[11] = stud.get(i).getFinalGrade();
            rowData[12] = stud.get(i).getFirstQuarterAbsent();
            rowData[13] = stud.get(i).getSecondQuarterAbsent();
            rowData[14] = stud.get(i).getThirdQuarterAbsent();
            rowData[15] = stud.get(i).getFourthQuarterAbsent();
            rowData[16] = stud.get(i).getSchoolYear();
            rowData[17] = stud.get(i).getGuardianName();
            rowData[18] = stud.get(i).getGuardianContactNumber();
            model.addRow(rowData);
            count++;
        }
    }
    
    private void theader()
    {
        JTableHeader thead = StudentTable.getTableHeader();
        thead.setForeground(new Color(0,0,0));
        thead.setBackground(new Color(230,232,240));
        thead.setFont(new Font("Rockwell", Font.BOLD, 14));
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
            textButton.setForeground(new Color(255,255,255));
            textButton.setBackground(new Color(34,63,135));
            textButton.setOpaque(true);
            textButton.setFont(new Font("Rockwell", 1, 18));
            textButton.setRadius(30);
            
            textButton.setText(str);
            ListPanel.add(textButton);
            ListPanel.add(Box.createVerticalStrut(5));
            
            textButton.addMouseListener(new MouseAdapter() 
            {
                @Override
                public void mouseClicked(MouseEvent e) 
                {
                    Parent.removeAll();
                    Parent.add(HomePanel);
                    Parent.repaint();
                    Parent.revalidate();
                    mouseClicked = true;
                    
                    if(mouseClicked)
                    {
                        if(!hasSaved)
                        {
                            JOptionPane.showMessageDialog(null, "Kindly save your work first!");
                        }
                        else
                        {
                            HeaderLabel.setText(str);
                            ArrayList <Student> students = new ArrayList <Student>();
                            students = readFile(HeaderLabel.getText());
                            clearTable();
                            populateTable(students);
                            students.clear();
                            mouseClicked = false;
                        }
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
        
        String IDNumber = null;
        String LName = null;
        String FName = null;
        String MInitial = null;
        String ContactNumber = null;
        String Gender = null;
        double FirstQuarterGrade = 0.0;
        double SecondQuarterGrade = 0.0;
        double ThirdQuarterGrade = 0.0;
        double FourthQuarterGrade = 0.0;
        double FinalGrade = 0.0;
        int FirstQuarterAbsent = 0;
        int SecondQuarterAbsent = 0;
        int ThirdQuarterAbsent = 0;
        int FourthQuarterAbsent = 0;
        String SchoolYear = null;
        String GuardianName = null;
        String GuardianContactNumber = null;
        
        
        for(int i = 0; i < rowCount; i++)
        {
            if(model.getValueAt(i,1) != null && model.getValueAt(i,2) != null && model.getValueAt(i,3) != null && model.getValueAt(i,4) != null && model.getValueAt(i,5) != null)
            {
                IDNumber = String.valueOf(model.getValueAt(i, 1));//id number
                LName = String.valueOf(model.getValueAt(i, 2));//lastname
                FName = String.valueOf(model.getValueAt(i, 3));//firstname
                MInitial = String.valueOf(model.getValueAt(i, 4));//middle name
                ContactNumber = String.valueOf(model.getValueAt(i, 5));//contact number
                
                Gender = String.valueOf(model.getValueAt(i, 6));//gender
                //Quarterly grade
                String firstGradeTemp =  String.valueOf(model.getValueAt(i, 7));
                FirstQuarterGrade = Double.valueOf(firstGradeTemp);
                
                String secondGradeTemp = String.valueOf(model.getValueAt(i, 8));
                SecondQuarterGrade = Double.valueOf(secondGradeTemp);
                
                String thirdGradeTemp = String.valueOf(model.getValueAt(i, 9));
                ThirdQuarterGrade = Double.valueOf(thirdGradeTemp);
                
                String fourthGradeTemp = String.valueOf(model.getValueAt(i, 10));
                FourthQuarterGrade = Double.valueOf(fourthGradeTemp);
                
                //Quarterly absent
                String firstQuarterAbsent = String.valueOf(model.getValueAt(i, 12));
                FirstQuarterAbsent = Integer.valueOf(firstQuarterAbsent);
                
                String secondQuarterAbsent = String.valueOf(model.getValueAt(i, 13));
                SecondQuarterAbsent = Integer.valueOf(secondQuarterAbsent);
                
                String thirdQuarterAbsent = String.valueOf(model.getValueAt(i, 14));
                ThirdQuarterAbsent = Integer.valueOf(thirdQuarterAbsent);
                
                String fourthQuarterAbsent = String.valueOf(model.getValueAt(i, 15));
                FourthQuarterAbsent = Integer.valueOf(fourthQuarterAbsent);
                
                SchoolYear = String.valueOf(model.getValueAt(i, 16));
                GuardianName = String.valueOf(model.getValueAt(i, 17));
                GuardianContactNumber = String.valueOf(model.getValueAt(i, 18));
                
                Student s = new Student(
                        IDNumber, 
                        LName, 
                        FName, 
                        MInitial, 
                        ContactNumber, 
                        Gender, 
                        FirstQuarterGrade,
                        SecondQuarterGrade,
                        ThirdQuarterGrade,
                        FourthQuarterGrade,
                        FirstQuarterAbsent,
                        SecondQuarterAbsent,
                        ThirdQuarterAbsent,
                        FourthQuarterAbsent,
                        SchoolYear,
                        GuardianName,
                        GuardianContactNumber
                );
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
    
    private void filter(String query)
    {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        StudentTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkgclass.record.MyButton AddButton;
    private pkgclass.record.MyButton AddClassButton;
    private javax.swing.JPanel AddClassPanel;
    private pkgclass.record.MyButton AddStudentButton;
    private javax.swing.JPanel AddStudentPanel;
    private pkgclass.record.FTextField ClassCodeHolder;
    private pkgclass.record.FTextField ClassCodeTextBox;
    private javax.swing.JLabel ClassInfoBgHolder;
    private pkgclass.record.FTextField ClassInstructorHolder;
    private pkgclass.record.FTextField ClassInstructorTextBox;
    private pkgclass.record.FTextField ClassNameHolder;
    private pkgclass.record.FTextField ClassNameTextBox;
    private pkgclass.record.FTextField ClassScheduleHolder;
    private pkgclass.record.FTextField ClassScheduleTextBox;
    private pkgclass.record.FTextField ContactNumberTextBox;
    private pkgclass.record.MyButton DeleteClassButton;
    private pkgclass.record.MyButton DeleteStudentButton;
    private pkgclass.record.MyButton EditClassInfoButton;
    private pkgclass.record.MyButton ExportButton;
    private pkgclass.record.FTextField FirstQuarterAbsentTextBox;
    private pkgclass.record.FTextField FirstQuarterGradeTextBox;
    private pkgclass.record.FTextField FourthQuarterAbsentTextBox;
    private pkgclass.record.FTextField FourthQuarterGradeTextBox;
    private pkgclass.record.FTextField GenderTextBox;
    private pkgclass.record.FTextField GuardianContactInformationTextBox;
    private pkgclass.record.FTextField GuardianNameTextBox;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel HomePanel;
    private pkgclass.record.FTextField IdNumberTextBox;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel Parent;
    private pkgclass.record.MyButton SaveClassInfoButton;
    private pkgclass.record.MyButton SaveClassInfoChangeButton;
    private pkgclass.record.MyButton SaveStudInfoButton;
    private pkgclass.record.FTextField SchoolYearTextBox;
    private javax.swing.JScrollPane ScrollPane;
    private pkgclass.record.SearchText SearchTextBox;
    private pkgclass.record.FTextField SecondQuarterAbsentTextBox;
    private pkgclass.record.FTextField SecondQuarterGradeTextBox;
    private javax.swing.JPanel SidebarPanel;
    private pkgclass.record.FTextField StudentFNameTextBox;
    private javax.swing.JLabel StudentInfoBgHolder;
    private pkgclass.record.FTextField StudentLNameTextBox;
    private pkgclass.record.FTextField StudentMInitialTextBox;
    private javax.swing.JTable StudentTable;
    private javax.swing.JLabel TeachersNameLabel;
    private pkgclass.record.FTextField ThirdQuarterAbsentTextBox;
    private pkgclass.record.FTextField ThirdQuarterGradeTextBox;
    private javax.swing.JPanel TopParent;
    private javax.swing.JLabel Top_Icon;
    private javax.swing.JLabel ViewClassInfoBgHolder;
    private pkgclass.record.MyButton ViewClassInformationButton;
    private javax.swing.JPanel ViewClassInformationPanel;
    private javax.swing.JLabel WelcomeBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
