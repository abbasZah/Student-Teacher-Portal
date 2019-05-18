/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

/**
 *
 * @author f2017266427
 */
public class Runner {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        JDBC myDB = new JDBC("StudentTeacherPortal", "Admin");
        
        myDB.insertAdminData(
                "a", 
                "a",
                "Muhammad",
                "Shahrukh", 
                "Male",
                "03012345678", 
                "myemail@gmail.com",
                "adress",
                "000000000000",
                "some data",
                "some data",
                "some data",
                "some data",
                "some data"
                
        );
        
        
        
        
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        
        
    }
    
}
