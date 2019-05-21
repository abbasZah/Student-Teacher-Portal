/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Shahrukh
 */
public class JDBC {
          private static final String USER = "root";
	private static final String PASS = "";
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
          private static final String ser_URL = "jdbc:mysql://localhost/";
          
        

          private static final String dbNAme = "studentteacherportal";
          private static final String tableAdmin = "Admin";
          private static final String tableCourses = "Courses";
          private static final String db_URL = ser_URL+dbNAme;
          
          ///////////////////////////////////////////////////////////////////////////////////////////////
          
          //////////////////////////////////////////////////////////////////////////////////////////////////
          
          public static Admin isUser(String username, String password){
		try{
			Connection conn = get_Connection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableAdmin);
			while(rs.next()){
				if(rs.getString("userID").equals(username) 
                                                && rs.getString("password").equals(password)){
                                            Admin admin = new Admin(rs.getString("userID"), rs.getString("password"), 
                                                    rs.getString("first"), rs.getString("last"), rs.getString("gender"), 
                                                    rs.getString("phno"), rs.getString("email"), rs.getString("address"), 
                                                    rs.getString("cnic"), rs.getString("role"), rs.getString("country"), 
                                                    rs.getString("city"), rs.getString("zipcode"), 
                                                    rs.getString("accountstatus"));
                                            
                                            
					return admin;
				}
			}
			
		}catch(Exception e){
                        e.printStackTrace();
		}
                    
		return null;
	}
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
          public static void insertData(Admin admin)
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createAdminTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableAdmin+"" 
                              + "(userID, password, first, last, gender, phno, email,"
                              + " address, cnic, role, country, city, zipcode, accountstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, admin.getUserId());
                                stmt.setString(2, admin.getPassword());
                                stmt.setString(3, admin.getFirstName());
                                stmt.setString(4, admin.getLastName());
                                stmt.setString(5, admin.getGender());
                                stmt.setString(6, admin.getPhoneNo());
                                stmt.setString(7, admin.getEmail());
                                stmt.setString(8, admin.getAddress());
                                stmt.setString(9, admin.getCnic());
                                stmt.setString(10, admin.getRole());
                                stmt.setString(11, admin.getCountry());
                                stmt.setString(12, admin.getCity());
                                stmt.setString(13, admin.getZipcode());
                                stmt.setString(14, admin.getAccountStatus());
                              
                              
                              
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          
          
          public static void insertData(Course course)
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createCoursesTableIfNotExists();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableCourses+"" 
                              + "(courseID, title, credithours, type, category, assignstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, course.getId());
                                stmt.setString(2, course.getTitle());
                                stmt.setInt(3, course.getCreditHours());
                                stmt.setString(4, course.getType());
                                stmt.setString(5, course.getCategory());
                                stmt.setBoolean(6, course.getAssignStatus());
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
                   public static void updateData(Admin admin)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableAdmin+" SET first = ?, last = ?,"
                                      + "gender = ?, phno = ?, email = ?, address = ?, cnic = ?, country = ?,"
                                      + "city = ?, zipcode = ?, accountstatus = ? WHERE userID = ?");
                                stmt.setString(1, admin.getFirstName());
                                stmt.setString(2, admin.getLastName());
                                stmt.setString(3, admin.getGender());
                                stmt.setString(4, admin.getPhoneNo());
                                stmt.setString(5, admin.getEmail());
                                stmt.setString(6, admin.getAddress());
                                stmt.setString(7, admin.getCnic());
                                stmt.setString(8, admin.getCountry());
                                stmt.setString(9, admin.getCity());
                                stmt.setString(10, admin.getZipcode());
                                stmt.setString(11, admin.getAccountStatus());
                                stmt.setString(12, admin.getUserId());
                              
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
                   
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
          public static void changeAdminPass(Admin admin)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableAdmin+" SET password = ?"
                                      + " WHERE userID = ?");
                                stmt.setString(1, admin.getPassword());
                                stmt.setString(2, admin.getUserId());
                              
                              
			stmt.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////
          
          
          public static void createAdminTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbNAme);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableAdmin+""
                                      + "(userID varchar(32) NOT NULL,"
                                      + "password varchar(32) NOT NULL,"
                                      + "first varchar(32) NOT NULL,"
                                      + "last varchar(32) NOT NULL,"
                                      + "gender varchar(6) NOT NULL,"
                                      + "phno varchar(32) NOT NULL,"
                                      + "email varchar(32) NOT NULL,"
                                      + "address varchar(64),"
                                      + "cnic varchar(32) NOT NULL,"
                                      + "role varchar(32),"
                                      + "country varchar(16),"
                                      + "city varchar(32),"
                                      + "zipcode varchar(16),"
                                      + "accountstatus varchar(16),"
                                      + "PRIMARY KEY ( userID ))"; 
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          
          public static void createCoursesTableIfNotExists()throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbNAme);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableCourses+""
                                      + "(courseID varchar(7) NOT NULL,"
                                      + "title varchar(64) NOT NULL,"
                                      + "credithours INTEGER NOT NULL,"
                                      + "type varchar(32),"
                                      + "category varchar(32) NOT NULL,"
                                      + "assignstatus BIT,"
                                      + "PRIMARY KEY ( courseID ))"; 
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          
          
          /////////////////////////////////////////////////////////////////////////////////////////////////////////
          /////////////////////////////////////////////////////////////////////////////////////////////////////////
          
          public  static void createDataBaseIfNotExists(String dbName)throws Exception{
		try{
			Class.forName(JDBC_DRIVER);	
			Connection conn = DriverManager.getConnection(ser_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			String sql = "CREATE DATABASE IF NOT EXISTS "+dbName;
			stmt.executeUpdate(sql);
			System.out.println("Database "+dbName+" Created!");
		}catch(Exception e){ 
			System.out.println(e);
		}
		
		
	}
          
            
          
          public static Connection get_Connection()throws Exception{////////////////////
		try{
			Class.forName(JDBC_DRIVER);
                              createDataBaseIfNotExists(dbNAme);
			Connection conn = DriverManager.getConnection(db_URL, USER, PASS);
			System.out.println("Connection Established!");
			return conn;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
          }///////////////////////////////////////////////////////////////////////////////////////////

   
}