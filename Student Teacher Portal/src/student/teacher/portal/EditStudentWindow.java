/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abbas Zaheer
 */
public class EditStudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form EditStudentWindow
     */
    String stuID;
    public EditStudentWindow(String id) {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        stuID = id;
        
        for (Student stu : Admin.getStudents()) {
            if(stu.getUserId() == stuID){
                
                TF_FirstName.setText(stu.getFirstName());
                TF_LastName.setText(stu.getLastName());
                JC_Gender.setSelectedItem(stu.getGender());
                JC_acStatus.setSelectedItem(stu.getAccountStatus());
                break;
            }
        }
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
        PNL_Footer = new javax.swing.JPanel();
        BTN_Back = new javax.swing.JButton();
        BTN_Update = new javax.swing.JButton();
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyTop = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PNL_BodyBelow = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        TF_FirstName = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TF_LastName = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        JC_Gender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        JC_acStatus = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Teacher Portal");

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
                .addContainerGap(794, Short.MAX_VALUE))
        );
        PNL_HeaderLayout.setVerticalGroup(
            PNL_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(37, Short.MAX_VALUE))
        );

        PNL_Wrapper.add(PNL_Header, java.awt.BorderLayout.PAGE_START);

        PNL_Footer.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Back.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Back.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Back.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Go_Back_20px.png"))); // NOI18N
        BTN_Back.setText("  Back");
        BTN_Back.setBorder(null);
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });

        BTN_Update.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Update.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Update.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Plus_20px.png"))); // NOI18N
        BTN_Update.setText("Update");
        BTN_Update.setBorder(null);
        BTN_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 669, Short.MAX_VALUE)
                .addComponent(BTN_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addGap(0, 378, Short.MAX_VALUE)
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
            .addGap(0, 378, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 56, 247));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edit Student");

        javax.swing.GroupLayout PNL_BodyTopLayout = new javax.swing.GroupLayout(PNL_BodyTop);
        PNL_BodyTop.setLayout(PNL_BodyTopLayout);
        PNL_BodyTopLayout.setHorizontalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addContainerGap())
        );
        PNL_BodyTopLayout.setVerticalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PNL_MainBodyPane.add(PNL_BodyTop, java.awt.BorderLayout.PAGE_START);

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.GridLayout(1, 3, 9, 9));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(13, 56, 247));
        jLabel19.setText("First Name");

        jSeparator16.setBackground(new java.awt.Color(13, 56, 247));

        TF_FirstName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TF_FirstName.setForeground(new java.awt.Color(51, 51, 51));
        TF_FirstName.setBorder(null);
        TF_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_FirstNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jSeparator16))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(TF_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 56, 247));
        jLabel6.setText("Last Name");

        TF_LastName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TF_LastName.setForeground(new java.awt.Color(51, 51, 51));
        TF_LastName.setBorder(null);
        TF_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_LastNameActionPerformed(evt);
            }
        });

        jSeparator18.setBackground(new java.awt.Color(13, 56, 247));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_LastName)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(TF_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(13, 56, 247));

        JC_Gender.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_Gender.setForeground(new java.awt.Color(51, 51, 51));
        JC_Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Male", "Female" }));
        JC_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_GenderActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 56, 247));
        jLabel10.setText("Gender");

        JC_acStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_acStatus.setForeground(new java.awt.Color(51, 51, 51));
        JC_acStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Active", "Blocked" }));
        JC_acStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_acStatusActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(13, 56, 247));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 56, 247));
        jLabel11.setText("Account Status");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_acStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JC_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JC_acStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 193, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 193, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel2);

        jPanel4.add(jPanel5);

        PNL_BodyBelow.add(jPanel4);

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

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed

        new StudentWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void BTN_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UpdateActionPerformed
            
        String first = TF_FirstName.getText();
        String last = TF_LastName.getText();
        String gender = JC_Gender.getSelectedItem().toString();
        String acStatus = JC_acStatus.getSelectedItem().toString();
                            
        
                            
        if(first.isEmpty() || last.isEmpty() || gender.equals("None") || acStatus.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Fill all the Fields !");

            }
            else
            {
                            
        for (Student stu : Admin.getStudents()) {
            if(stu.getUserId() == stuID){
                
                
                
                if(!stu.getFirstName().equals(TF_FirstName.getText()) 
                        || !stu.getLastName().equals(TF_LastName.getText()) 
                        || !stu.getGender().equals(JC_Gender.getSelectedItem().toString()) 
                        || !stu.getAccountStatus().equals(JC_acStatus.getSelectedItem().toString()))
                {
                    
                    stu.setFirstName(TF_FirstName.getText());
                    stu.setLastName(TF_LastName.getText());
                    stu.setGender(JC_Gender.getSelectedItem().toString());
                    stu.setAccountStatus(JC_acStatus.getSelectedItem().toString());


                    try {
                            //Update in database
                            JDBC.updateData(stu);
                        } catch (Exception ex) {
                            Logger.getLogger(EditCourseWindow.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    JOptionPane.showMessageDialog(null, "Student Updated Successfully !");
                    
                    break;

                            
                                
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Change Something!");
                }
                
                    
                
           }
        }
                            }
        
       
    }//GEN-LAST:event_BTN_UpdateActionPerformed

    private void TF_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_FirstNameActionPerformed

    private void TF_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_LastNameActionPerformed

    private void JC_acStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_acStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_acStatusActionPerformed

    private void JC_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_GenderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Update;
    private javax.swing.JComboBox JC_Gender;
    private javax.swing.JComboBox JC_acStatus;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_BodyTop;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JTextField TF_FirstName;
    private javax.swing.JTextField TF_LastName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
