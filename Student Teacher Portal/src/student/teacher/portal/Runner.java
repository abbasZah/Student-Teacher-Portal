/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import javax.swing.JFrame;

/**
 *
 * @author f2017266427
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        /*JDBC myDB = new JDBC("StudentTeacherPortal", "Admin");
        
        myDB.insertData(
                "F2017266455", 
                "Muhammad",
                "Shahrukh", 
                "MyPass",
                "myemail@gmail.com",
                "03012345678", 
                "Male"
        );*/
        
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        signIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signIn.setResizable(false);
        signIn.setLocation(200, 100);
        signIn.setTitle("Student Teacher Portal");
        
    }
    
}