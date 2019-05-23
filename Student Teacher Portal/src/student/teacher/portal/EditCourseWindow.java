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
import javax.swing.JOptionPane;

/**
 *
 * @author Shahrukh
 */

public class EditCourseWindow extends javax.swing.JFrame {

    /**
     * Creates new form EditCourseWindow
     */
    
    
    private String id;
    
    
    
    public EditCourseWindow(String id) {
        initComponents();
        this.id = id;
        for (Course course : Admin.getCourses()) {
            if(course.getId() == id){
                
                TF_Title.setText(course.getTitle());
                JC_CreditHours.setSelectedItem(Integer.toString(course.getCreditHours()));
                JC_Category.setSelectedItem(course.getCategory());
                break;
            }
        }
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_Title = new javax.swing.JTextField();
        BTN_Update = new javax.swing.JButton();
        BTN_Back = new javax.swing.JButton();
        JC_CreditHours = new javax.swing.JComboBox();
        JC_Category = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title");

        jLabel2.setText("Credit Hours");

        jLabel3.setText("Category");

        TF_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TitleActionPerformed(evt);
            }
        });

        BTN_Update.setText("Update");
        BTN_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UpdateActionPerformed(evt);
            }
        });

        BTN_Back.setText("Back");
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });

        JC_CreditHours.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_CreditHours.setForeground(new java.awt.Color(51, 51, 51));
        JC_CreditHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "2", "3", "4" }));

        JC_Category.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        JC_Category.setForeground(new java.awt.Color(51, 51, 51));
        JC_Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Theory", "Theory + Lab" }));
        JC_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_CategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_Back)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(BTN_Update)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TF_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JC_Category, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JC_CreditHours, 0, 297, Short.MAX_VALUE))
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_CreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Update)
                    .addComponent(BTN_Back))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TitleActionPerformed

    private void BTN_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UpdateActionPerformed
        
        
        for (Course course : Admin.getCourses()) {
            if(course.getId() == id){
                
                if(!course.getTitle().equals(TF_Title.getText()) || course.getCreditHours()!=Integer.parseInt(JC_CreditHours.getSelectedItem().toString()) || 
                        !course.getCategory().equals(JC_Category.getSelectedItem().toString()))
                {
                                course.setTitle(TF_Title.getText());
                                course.setCreditHours(Integer.parseInt(JC_CreditHours.getSelectedItem().toString()));
                                course.setCategory(JC_Category.getSelectedItem().toString());



                                try {
                                    //Update in database
                                    JDBC.updateData(course);
                                } catch (Exception ex) {
                                    Logger.getLogger(EditCourseWindow.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                JOptionPane.showMessageDialog(null, "Course Updated Successfully !");
                                break;

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Change Something!");
                }
                
                    
                
           }
        }
        
        
    }//GEN-LAST:event_BTN_UpdateActionPerformed

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed
        // TODO add your handling code here:
        new CoursesWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void JC_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_CategoryActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Update;
    private javax.swing.JComboBox JC_Category;
    private javax.swing.JComboBox JC_CreditHours;
    private javax.swing.JTextField TF_Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
