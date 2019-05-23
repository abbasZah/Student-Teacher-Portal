/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javafx.scene.control.TableColumn;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Abbas Zaheer
 */
public class CoursesWindow extends javax.swing.JFrame {

    /**
     * Creates new form CoursesWindow2
     */
   
    
    JTable j;
    
    public CoursesWindow() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_Student_Male_50px.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(150, 10);
        setTitle("Student Teacher Portal");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        
        
        
        
        
        showTable();
        
       ///PNL_BodyBelow.add(j.getTableHeader(), BorderLayout.PAGE_START);
       ///PNL_BodyBelow.add(j, BorderLayout.CENTER);
       
       
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
        PNL_LeftPane = new javax.swing.JPanel();
        PNL_RightPane = new javax.swing.JPanel();
        PNL_MainBodyPane = new javax.swing.JPanel();
        PNL_BodyTop = new javax.swing.JPanel();
        BTN_Edit = new javax.swing.JButton();
        BTN_Search = new javax.swing.JButton();
        BTN_Remove = new javax.swing.JButton();
        BTN_Create = new javax.swing.JButton();
        PNL_BodyBelow = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_Wrapper.setBackground(new java.awt.Color(255, 255, 255));
        PNL_Wrapper.setLayout(new java.awt.BorderLayout());

        PNL_Header.setBackground(new java.awt.Color(13, 56, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/Admin Settings Male_75px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Courses");

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
                .addContainerGap(740, Short.MAX_VALUE))
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

        javax.swing.GroupLayout PNL_FooterLayout = new javax.swing.GroupLayout(PNL_Footer);
        PNL_Footer.setLayout(PNL_FooterLayout);
        PNL_FooterLayout.setHorizontalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_FooterLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(819, Short.MAX_VALUE))
        );
        PNL_FooterLayout.setVerticalGroup(
            PNL_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_FooterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 393, Short.MAX_VALUE)
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
            .addGap(0, 393, Short.MAX_VALUE)
        );

        PNL_Wrapper.add(PNL_RightPane, java.awt.BorderLayout.LINE_END);

        PNL_MainBodyPane.setBackground(new java.awt.Color(255, 255, 255));
        PNL_MainBodyPane.setLayout(new java.awt.BorderLayout());

        PNL_BodyTop.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Edit.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Edit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Edit.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Edit_20px_3.png"))); // NOI18N
        BTN_Edit.setText("  Edit");
        BTN_Edit.setBorder(null);
        BTN_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EditActionPerformed(evt);
            }
        });

        BTN_Search.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Search.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Search_20px.png"))); // NOI18N
        BTN_Search.setText("  Search");
        BTN_Search.setBorder(null);
        BTN_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchActionPerformed(evt);
            }
        });

        BTN_Remove.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Remove.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Remove.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Trash_Can_20px.png"))); // NOI18N
        BTN_Remove.setText("  Remove");
        BTN_Remove.setBorder(null);
        BTN_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemoveActionPerformed(evt);
            }
        });

        BTN_Create.setBackground(new java.awt.Color(13, 56, 247));
        BTN_Create.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTN_Create.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/teacher/portal/images/icons8_Plus_20px.png"))); // NOI18N
        BTN_Create.setText("  Create");
        BTN_Create.setBorder(null);
        BTN_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNL_BodyTopLayout = new javax.swing.GroupLayout(PNL_BodyTop);
        PNL_BodyTop.setLayout(PNL_BodyTopLayout);
        PNL_BodyTopLayout.setHorizontalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addComponent(BTN_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(BTN_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PNL_BodyTopLayout.setVerticalGroup(
            PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_BodyTopLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PNL_BodyTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        PNL_MainBodyPane.add(PNL_BodyTop, java.awt.BorderLayout.PAGE_START);

        PNL_BodyBelow.setBackground(new java.awt.Color(255, 255, 255));
        PNL_BodyBelow.setLayout(new java.awt.BorderLayout());
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

        new AdminWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void BTN_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EditActionPerformed
        
        try {
            String id = (String) j.getValueAt(j.getSelectedRow(), 0);
            new EditCourseWindow(id).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a course first !");
        }
        
        //String id = "AND833";
        
    }//GEN-LAST:event_BTN_EditActionPerformed

    private void BTN_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_SearchActionPerformed

    private void BTN_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemoveActionPerformed
        try {
            
        
        String id = (String) j.getValueAt(j.getSelectedRow(), 0);
        
        for (Course course : Admin.getCourses()) {
            if (course.getId() == id) {
                Admin.getCourses().remove(course);
                
                PNL_BodyBelow.removeAll(); 
                PNL_BodyBelow.updateUI();
                showTable();
                
                JOptionPane.showMessageDialog(null, "Course Removed !");
                
                break;
            }
        }
        //showTable();
        
        //remove from database as well
        JDBC.removeCourse(id);
        } 
        catch (Exception e) 
        {
           JOptionPane.showMessageDialog(null, "Please select a course first !"); 
        }
        
    }//GEN-LAST:event_BTN_RemoveActionPerformed

    private void BTN_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CreateActionPerformed
        new CreateCourseWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_CreateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoursesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoursesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoursesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoursesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoursesWindow().setVisible(true);
            }
        });
    }
    
    private void showTable(){
        
        Object[][] data = new Object[Admin.getCourses().size()][4];
        
        int i =0;
        for (Course c : Admin.getCourses())
        {    
                    data[i][0]=c.getId();
                    data[i][1]=c.getTitle();
                    data[i][2]=c.getCreditHours();
                    data[i][3]=c.getCategory();
              
            i++;
        }
        
        
        // Column Names 
        String[] columnNames = { "ID", "Title", "Credit Hours", "Category" }; 
  
        // Initializing the JTable 
        j = new JTable(data, columnNames); 
        j.setRowHeight(28);
        
        
        JScrollPane sp = new JScrollPane(j);
        PNL_BodyBelow.add(sp);
        
        
      Font f = new Font("Trebuchet MS", Font.PLAIN, 14);
      JTableHeader header = j.getTableHeader();
      header.setFont(f);
              
      Color c= new Color(13,56,247);
      Color c2= new Color(255,255,255);
      header.setBackground(c);
      header.setForeground(c2);
      
      
      JTableHeader th = j.getTableHeader();
      th.setPreferredSize(new Dimension(100, 30));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Create;
    private javax.swing.JButton BTN_Edit;
    private javax.swing.JButton BTN_Remove;
    private javax.swing.JButton BTN_Search;
    private javax.swing.JPanel PNL_BodyBelow;
    private javax.swing.JPanel PNL_BodyTop;
    private javax.swing.JPanel PNL_Footer;
    private javax.swing.JPanel PNL_Header;
    private javax.swing.JPanel PNL_LeftPane;
    private javax.swing.JPanel PNL_MainBodyPane;
    private javax.swing.JPanel PNL_RightPane;
    private javax.swing.JPanel PNL_Wrapper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
