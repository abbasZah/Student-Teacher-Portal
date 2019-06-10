/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author shahr
 */
public class StudentMenuWindow extends javax.swing.JFrame {

    /**
     * Creates new form StudentMenuWindow
     */
    Student student;
    
    Color OnEnteredColor;
    Color OnExitedColor;
    
    public StudentMenuWindow(Student stu) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        student = stu;
        
        OnEnteredColor= new Color(190,190,190);
        OnExitedColor = new Color(220,220,220);
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
        BTN_roadMap = new javax.swing.JButton();
        PNL_DegreeProgram = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BTN_Transcript = new javax.swing.JButton();
        PNL_AssignCourses = new javax.swing.JPanel();
        BTN_MyCourses = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PNL_Requests = new javax.swing.JPanel();
        BTN_Requests = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
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
        jLabel6.setText("Timetable");

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
        jLabel8.setText("Road Map");

        BTN_roadMap.setBackground(new java.awt.Color(220, 220, 220));
        BTN_roadMap.setForeground(new java.awt.Color(13, 56, 247));
        BTN_roadMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Training_50px.png"))); // NOI18N
        BTN_roadMap.setBorder(null);
        BTN_roadMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_roadMapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_roadMapMouseExited(evt);
            }
        });
        BTN_roadMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_roadMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_TeacherLayout = new javax.swing.GroupLayout(PNL_Teacher);
        PNL_Teacher.setLayout(PNL_TeacherLayout);
        PNL_TeacherLayout.setHorizontalGroup(
            PNL_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_roadMap, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PNL_TeacherLayout.setVerticalGroup(
            PNL_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_TeacherLayout.createSequentialGroup()
                .addComponent(BTN_roadMap, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_Teacher);

        PNL_DegreeProgram.setBackground(new java.awt.Color(220, 220, 220));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Transcript");

        BTN_Transcript.setBackground(new java.awt.Color(220, 220, 220));
        BTN_Transcript.setForeground(new java.awt.Color(13, 56, 247));
        BTN_Transcript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Contract_52px.png"))); // NOI18N
        BTN_Transcript.setBorder(null);
        BTN_Transcript.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_TranscriptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_TranscriptMouseExited(evt);
            }
        });
        BTN_Transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_DegreeProgramLayout = new javax.swing.GroupLayout(PNL_DegreeProgram);
        PNL_DegreeProgram.setLayout(PNL_DegreeProgramLayout);
        PNL_DegreeProgramLayout.setHorizontalGroup(
            PNL_DegreeProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_DegreeProgramLayout.setVerticalGroup(
            PNL_DegreeProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_DegreeProgramLayout.createSequentialGroup()
                .addComponent(BTN_Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_BodyBelow.add(PNL_DegreeProgram);

        PNL_AssignCourses.setBackground(new java.awt.Color(220, 220, 220));

        BTN_MyCourses.setBackground(new java.awt.Color(220, 220, 220));
        BTN_MyCourses.setForeground(new java.awt.Color(13, 56, 247));
        BTN_MyCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Invoice_47px.png"))); // NOI18N
        BTN_MyCourses.setBorder(null);
        BTN_MyCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_MyCoursesMouseExited(evt);
            }
        });
        BTN_MyCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MyCoursesActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("My Courses");

        javax.swing.GroupLayout PNL_AssignCoursesLayout = new javax.swing.GroupLayout(PNL_AssignCourses);
        PNL_AssignCourses.setLayout(PNL_AssignCoursesLayout);
        PNL_AssignCoursesLayout.setHorizontalGroup(
            PNL_AssignCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN_MyCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        PNL_AssignCoursesLayout.setVerticalGroup(
            PNL_AssignCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_AssignCoursesLayout.createSequentialGroup()
                .addComponent(BTN_MyCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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

    private void BTN_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SettingsActionPerformed
        new Settings(student).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_SettingsActionPerformed

    private void BTN_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LogOutActionPerformed
        this.dispose();
        new SignIn().setVisible(true);
    }//GEN-LAST:event_BTN_LogOutActionPerformed

    private void BTN_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseClicked
        ProfileWindow adminProfile = new ProfileWindow(student);
        adminProfile.setVisible(true);
    }//GEN-LAST:event_BTN_ProfileMouseClicked

    private void BTN_ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseEntered

        BTN_Profile.setBackground(OnEnteredColor);
        PNL_Profile.setBackground(OnEnteredColor);

    }//GEN-LAST:event_BTN_ProfileMouseEntered

    private void BTN_ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseExited

        BTN_Profile.setBackground(OnExitedColor);
        PNL_Profile.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_ProfileMouseExited

    private void BTN_ProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ProfileMouseReleased

    }//GEN-LAST:event_BTN_ProfileMouseReleased

    private void BTN_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ProfileActionPerformed
        new ProfileWindow(student).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_ProfileActionPerformed

    private void BTN_StudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_StudentMouseEntered

        BTN_Student.setBackground(OnEnteredColor);
        PNL_Student.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_StudentMouseEntered

    private void BTN_StudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_StudentMouseExited

        BTN_Student.setBackground(OnExitedColor);
        PNL_Student.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_StudentMouseExited

    private void BTN_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_StudentActionPerformed
        
    }//GEN-LAST:event_BTN_StudentActionPerformed

    private void BTN_roadMapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_roadMapMouseEntered

        BTN_roadMap.setBackground(OnEnteredColor);
        PNL_Teacher.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_roadMapMouseEntered

    private void BTN_roadMapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_roadMapMouseExited

        BTN_roadMap.setBackground(OnExitedColor);
        PNL_Teacher.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_roadMapMouseExited

    private void BTN_roadMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_roadMapActionPerformed
        
    }//GEN-LAST:event_BTN_roadMapActionPerformed

    private void BTN_TranscriptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TranscriptMouseEntered

        BTN_Transcript.setBackground(OnEnteredColor);
        PNL_DegreeProgram.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_TranscriptMouseEntered

    private void BTN_TranscriptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_TranscriptMouseExited

        BTN_Transcript.setBackground(OnExitedColor);
        PNL_DegreeProgram.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_TranscriptMouseExited

    private void BTN_TranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TranscriptActionPerformed
        
    }//GEN-LAST:event_BTN_TranscriptActionPerformed

    private void BTN_MyCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseEntered

        BTN_MyCourses.setBackground(OnEnteredColor);
        PNL_AssignCourses.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_MyCoursesMouseEntered

    private void BTN_MyCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MyCoursesMouseExited

        BTN_MyCourses.setBackground(OnExitedColor);
        PNL_AssignCourses.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_MyCoursesMouseExited

    private void BTN_MyCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MyCoursesActionPerformed
        
    }//GEN-LAST:event_BTN_MyCoursesActionPerformed

    private void BTN_RequestsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_RequestsMouseEntered

        BTN_Requests.setBackground(OnEnteredColor);
        PNL_Requests.setBackground(OnEnteredColor);
    }//GEN-LAST:event_BTN_RequestsMouseEntered

    private void BTN_RequestsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_RequestsMouseExited

        BTN_Requests.setBackground(OnExitedColor);
        PNL_Requests.setBackground(OnExitedColor);
    }//GEN-LAST:event_BTN_RequestsMouseExited

    private void BTN_RequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RequestsActionPerformed
        
    }//GEN-LAST:event_BTN_RequestsActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_LogOut;
    private javax.swing.JButton BTN_MyCourses;
    private javax.swing.JButton BTN_Profile;
    private javax.swing.JButton BTN_Requests;
    private javax.swing.JButton BTN_Settings;
    private javax.swing.JButton BTN_Student;
    private javax.swing.JButton BTN_Transcript;
    private javax.swing.JButton BTN_roadMap;
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
