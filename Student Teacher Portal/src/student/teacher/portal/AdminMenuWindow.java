package student.teacher.portal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Abbas Zaheer
 */
public class AdminMenuWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenuWindow
     */
  
    private static Admin admin;
    
    
   Color OnEnteredColor;
   Color OnExitedColor;
        
        public AdminMenuWindow() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
         OnEnteredColor= new Color(190,190,190);
         OnExitedColor = new Color(220,220,220);
         
         admin = SignIn.getAdmin();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNL_Wrapper = new javax.swing.JPanel();
        PNL_Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BTN_Settings = new javax.swing.JButton();
        PNL_Footer = new javax.swing.JPanel();
        BTN_LogOut = new javax.swing.JButton();
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyTop = new javax.swing.JPanel();
        PNL_BodyBelow = new javax.swing.JPanel();
        PNL_Profile = new javax.swing.JPanel();
        BTN_Profile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PNL_Student = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BTN_Student = new javax.swing.JButton();
        PNL_Teacher = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BTN_Teacher = new javax.swing.JButton();
        PNL_DegreeProgram = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BTN_DegreeProgram = new javax.swing.JButton();
        PNL_AssignCourses = new javax.swing.JPanel();
        BTN_AssignCourses = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PNL_Requests = new javax.swing.JPanel();
        BTN_Requests = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrator");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Teacher Portal");

        jPanel1.setBackground(new java.awt.Color(13, 56, 247));

        BTN_Settings.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Settings_30px.png"))); // NOI18N
        BTN_Settings.setBorder(null);
        BTN_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTN_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout PNL_HeaderLayout = new javax.swing.GroupLayout(PNL_Header);
        PNL_Header.setLayout(PNL_HeaderLayout);
        PNL_HeaderLayout.setHorizontalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PNL_HeaderLayout.setVerticalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNL_HeaderLayout.createSequentialGroup()
                        .addGroup(PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PNL_HeaderLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PNL_HeaderLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(PNL_HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PNL_Wrapper.add(PNL_Header, java.awt.BorderLayout.PAGE_START);

        PNL_Footer.setBackground(new java.awt.Color(255, 255, 255));

        BTN_LogOut.setBackground(new java.awt.Color(13, 56, 247));
        BTN_LogOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_LogOut.setForeground(new java.awt.Color(255, 255, 255));
        BTN_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Logout_Rounded_Left_20px.png"))); // NOI18N
        BTN_LogOut.setText("  Log Out");
        BTN_LogOut.setBorder(null);
        BTN_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addContainerGap(909, Short.MAX_VALUE)
                .addComponent(BTN_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BTN_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PNL_Wrapper.add(PNL_Footer, java.awt.BorderLayout.PAGE_END);

        PNL_LeftPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PNL_LeftPaneLayout = new javax.swing.GroupLayout(PNL_LeftPane);
        PNL_LeftPane.setLayout(PNL_LeftPaneLayout);
        PNL_LeftPaneLayout.setHorizontalGroup(
            PNL_LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PNL_LeftPaneLayout.setVerticalGroup(
            PNL_LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_LeftPane, java.awt.BorderLayout.LINE_START);

        PNL_RightPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PNL_RightPaneLayout = new javax.swing.GroupLayout(PNL_RightPane);
        PNL_RightPane.setLayout(PNL_RightPaneLayout);
        PNL_RightPaneLayout.setHorizontalGroup(
            PNL_RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PNL_RightPaneLayout.setVerticalGroup(
            PNL_RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyTop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PNL_BodyTopLayout = new javax.swing.GroupLayout(PNL_BodyTop);
        PNL_BodyTop.setLayout(PNL_BodyTopLayout);
        PNL_BodyTopLayout.setHorizontalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        PNL_BodyTopLayout.setVerticalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PNL_MainBodyPane.add(PNL_BodyTop, java.awt.BorderLayout.PAGE_START);

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.GridLayout(2, 4, 9, 9));

        PNL_Profile.setBackground(new java.awt.Color(220, 220, 220));

        BTN_Profile.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Profile.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Male User_60px.png"))); // NOI18N
        BTN_Profile.setBorder(null);
        BTN_Profile.setBorderPainted(false);
        BTN_Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_ProfileMouseReleased(evt);
            }
        });
        BTN_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ProfileActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Profile");

        javax.swing.GroupLayout PNL_ProfileLayout = new javax.swing.GroupLayout(PNL_Profile);
        PNL_Profile.setLayout(PNL_ProfileLayout);
        PNL_ProfileLayout.setHorizontalGroup(
            PNL_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN_Profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_ProfileLayout.setVerticalGroup(
            PNL_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_ProfileLayout.createSequentialGroup()
                .addComponent(BTN_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_Profile);

        PNL_Student.setBackground(new java.awt.Color(220, 220, 220));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student");

        BTN_Student.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Student.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Student Male_50px.png"))); // NOI18N
        BTN_Student.setBorder(null);
        BTN_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_StudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_StudentMouseExited(evt);
            }
        });
        BTN_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_StudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_StudentLayout = new javax.swing.GroupLayout(PNL_Student);
        PNL_Student.setLayout(PNL_StudentLayout);
        PNL_StudentLayout.setHorizontalGroup(
            PNL_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addComponent(BTN_Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PNL_StudentLayout.setVerticalGroup(
            PNL_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_StudentLayout.createSequentialGroup()
                .addComponent(BTN_Student, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_Student);

        PNL_Teacher.setBackground(new java.awt.Color(220, 220, 220));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Teacher");

        BTN_Teacher.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Teacher.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Training_50px.png"))); // NOI18N
        BTN_Teacher.setBorder(null);
        BTN_Teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_TeacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_TeacherMouseExited(evt);
            }
        });
        BTN_Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TeacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_TeacherLayout = new javax.swing.GroupLayout(PNL_Teacher);
        PNL_Teacher.setLayout(PNL_TeacherLayout);
        PNL_TeacherLayout.setHorizontalGroup(
            PNL_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_Teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PNL_TeacherLayout.setVerticalGroup(
            PNL_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_TeacherLayout.createSequentialGroup()
                .addComponent(BTN_Teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_Teacher);

        PNL_DegreeProgram.setBackground(new java.awt.Color(220, 220, 220));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Degree Program");

        BTN_DegreeProgram.setBackground(new java.awt.Color(220, 220, 220));
        BTN_DegreeProgram.setForeground(new java.awt.Color(13, 56, 247));
        BTN_DegreeProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Contract_52px.png"))); // NOI18N
        BTN_DegreeProgram.setBorder(null);
        BTN_DegreeProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_DegreeProgramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_DegreeProgramMouseExited(evt);
            }
        });
        BTN_DegreeProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DegreeProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_DegreeProgramLayout = new javax.swing.GroupLayout(PNL_DegreeProgram);
        PNL_DegreeProgram.setLayout(PNL_DegreeProgramLayout);
        PNL_DegreeProgramLayout.setHorizontalGroup(
            PNL_DegreeProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_DegreeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_DegreeProgramLayout.setVerticalGroup(
            PNL_DegreeProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_DegreeProgramLayout.createSequentialGroup()
                .addComponent(BTN_DegreeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_DegreeProgram);

        PNL_AssignCourses.setBackground(new java.awt.Color(220, 220, 220));

        BTN_AssignCourses.setBackground(new java.awt.Color(220, 220, 220));
        BTN_AssignCourses.setForeground(new java.awt.Color(13, 56, 247));
        BTN_AssignCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Invoice_47px.png"))); // NOI18N
        BTN_AssignCourses.setBorder(null);
        BTN_AssignCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_AssignCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_AssignCoursesMouseExited(evt);
            }
        });
        BTN_AssignCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AssignCoursesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Courses");

        javax.swing.GroupLayout PNL_AssignCoursesLayout = new javax.swing.GroupLayout(PNL_AssignCourses);
        PNL_AssignCourses.setLayout(PNL_AssignCoursesLayout);
        PNL_AssignCoursesLayout.setHorizontalGroup(
            PNL_AssignCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_AssignCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_AssignCoursesLayout.setVerticalGroup(
            PNL_AssignCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_AssignCoursesLayout.createSequentialGroup()
                .addComponent(BTN_AssignCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_AssignCourses);

        PNL_Requests.setBackground(new java.awt.Color(220, 220, 220));

        BTN_Requests.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Requests.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Requests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Pull Request_50px.png"))); // NOI18N
        BTN_Requests.setBorder(null);
        BTN_Requests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_RequestsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_RequestsMouseExited(evt);
            }
        });
        BTN_Requests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RequestsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Requests");

        javax.swing.GroupLayout PNL_RequestsLayout = new javax.swing.GroupLayout(PNL_Requests);
        PNL_Requests.setLayout(PNL_RequestsLayout);
        PNL_RequestsLayout.setHorizontalGroup(
            PNL_RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addGroup(PNL_RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BTN_Requests, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );
        PNL_RequestsLayout.setVerticalGroup(
            PNL_RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_RequestsLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PNL_RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PNL_RequestsLayout.createSequentialGroup()
                    .addComponent(BTN_Requests, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addGap(41, 41, 41)))
        );

        PNL_BodyBelow.add(PNL_Requests);

        PNL_MainBodyPane.add(PNL_BodyBelow, java.awt.BorderLayout.CENTER);

        PNL_Wrapper.add(PNL_MainBodyPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_StudentActionPerformed
        new StudentWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_StudentActionPerformed

    private void BTN_TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TeacherActionPerformed
         new TeacherWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_TeacherActionPerformed

    private void BTN_DegreeProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DegreeProgramActionPerformed
        new DegreeWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_DegreeProgramActionPerformed

    private void BTN_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LogOutActionPerformed
        this.dispose();
        new SignIn().setVisible(true);
    }//GEN-LAST:event_BTN_LogOutActionPerformed

    private void BTN_AssignCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AssignCoursesActionPerformed
    new CoursesWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AssignCoursesActionPerformed

    private void BTN_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ProfileActionPerformed
        
        new ProfileWindow(admin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_ProfileActionPerformed

    private void BTN_RequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_RequestsActionPerformed

    private void BTN_ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseEntered
       
       BTN_Profile.setBackground(OnEnteredColor);
       PNL_Profile.setBackground(OnEnteredColor);
        
    }//GEN-LAST:event_BTN_ProfileMouseEntered

    private void BTN_ProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseReleased
        
    }//GEN-LAST:event_BTN_ProfileMouseReleased

    private void BTN_ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseExited
       
       BTN_Profile.setBackground(OnExitedColor);
       PNL_Profile.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_ProfileMouseExited

    private void BTN_StudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_StudentMouseEntered
       
       BTN_Student.setBackground(OnEnteredColor);
       PNL_Student.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_StudentMouseEntered

    private void BTN_StudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_StudentMouseExited
        
      BTN_Student.setBackground(OnExitedColor);
       PNL_Student.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_StudentMouseExited

    private void BTN_TeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TeacherMouseEntered
       
       BTN_Teacher.setBackground(OnEnteredColor);
       PNL_Teacher.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_TeacherMouseEntered

    private void BTN_TeacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TeacherMouseExited
        
        BTN_Teacher.setBackground(OnExitedColor);
        PNL_Teacher.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_TeacherMouseExited

    private void BTN_DegreeProgramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DegreeProgramMouseEntered
       
       BTN_DegreeProgram.setBackground(OnEnteredColor);
       PNL_DegreeProgram.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_DegreeProgramMouseEntered

    private void BTN_DegreeProgramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DegreeProgramMouseExited
        
       BTN_DegreeProgram.setBackground(OnExitedColor);
       PNL_DegreeProgram.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_DegreeProgramMouseExited

    private void BTN_AssignCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AssignCoursesMouseEntered
       
       BTN_AssignCourses.setBackground(OnEnteredColor);
       PNL_AssignCourses.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_AssignCoursesMouseEntered

    private void BTN_AssignCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_AssignCoursesMouseExited
        
       BTN_AssignCourses.setBackground(OnExitedColor);
       PNL_AssignCourses.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_AssignCoursesMouseExited

    private void BTN_RequestsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_RequestsMouseEntered
       
       BTN_Requests.setBackground(OnEnteredColor);
       PNL_Requests.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_RequestsMouseEntered

    private void BTN_RequestsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_RequestsMouseExited
       
       BTN_Requests.setBackground(OnExitedColor);
       PNL_Requests.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_RequestsMouseExited

    private void BTN_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseClicked
        ProfileWindow adminProfile = new ProfileWindow(admin);
        adminProfile.setVisible(true);
    }//GEN-LAST:event_BTN_ProfileMouseClicked

    private void BTN_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SettingsActionPerformed
         new Settings(admin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_SettingsActionPerformed

  public static Admin getAdmin() {
        return admin;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AssignCourses;
    private javax.swing.JButton BTN_DegreeProgram;
    private javax.swing.JButton BTN_LogOut;
    private javax.swing.JButton BTN_Profile;
    private javax.swing.JButton BTN_Requests;
    private javax.swing.JButton BTN_Settings;
    private javax.swing.JButton BTN_Student;
    private javax.swing.JButton BTN_Teacher;
    private javax.swing.JPanel PNL_AssignCourses;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_BodyTop;
    private javax.swing.JPanel PNL_DegreeProgram;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_Profile;
    private javax.swing.JPanel PNL_Requests;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Student;
    private javax.swing.JPanel PNL_Teacher;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}