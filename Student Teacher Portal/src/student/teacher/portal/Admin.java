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
public class Admin extends Person{
    
    
    public Admin(String userId, String password, String firstName, String lastName, String gender, String phoneNo, String address, 
            String cnic, String role, String email, String country, String city, String zipcode, String meritalStatus, 
            String accountStatus) 
    {
        super(userId, password, firstName, lastName, gender, phoneNo, address, cnic, role, email, country, city, zipcode,
                meritalStatus, accountStatus);
    }
    
    
    
   
}