/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

/**
 *
 * @author F2017266455
 */
public class Student extends Person{
    
    public Student(){}
    
    public Student(String userId, String password, String firstName, String lastName, String gender,
            String phoneNo, String address, String cnic, String role, String email, String country,
            String city, String zipcode, String accountStatus) 
    {
        super(userId, password, firstName, lastName, gender, phoneNo,
              address, cnic, role, email, country, city, zipcode, accountStatus);
    }
    
}
