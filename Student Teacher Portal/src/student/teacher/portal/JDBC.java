Admin/*
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
          private static final String db_URL = ser_URL+dbNAme;
          
          ///////////////////////////////////////////////////////////////////////////////////////////////
          
          //////////////////////////////////////////////////////////////////////////////////////////////////
          
          public static Admin isUser(String username, String password){
		try{
			Connection conn = get_Connection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableAdmin);
			while(rs.next()){
				if(rs.getString("userID").equals(username) && rs.getString("password").equals(password)){
                                            Admin admin = new Admin(rs.getString("userID"), rs.getString("password"), rs.getString("first")
                                                    ,  rs.getString("last"), rs.getString("gender"), rs.getString("phno"), 
                                                     rs.getString("email"),  rs.getString("address"),  rs.getString("cnic"),  rs.getString("role"),
                                                     rs.getString("country"),  rs.getString("city"),  rs.getString("zipcode"),
                                                    rs.getString("accountstatus"));
                                            
                                            
					return admin;
				}
			}
			
		}catch(Exception e){
                        e.printStackTrace();
		}
		return null;
	}
          
          public static void insertData(
                             String userID, String password, String firstName, String lastName, String gender, String phoneNo, String email,
                             String address, String cnic, String role, String country, String city, String zipcode, String accountStatus
                    )
                            throws Exception{
		try{
			
			Connection conn = get_Connection();
                              createTableIfNotExists(tableAdmin);
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+tableAdmin+"" 
                              + "(userID, password, first, last, gender, phno, email,"
                              + " address, cnic, role, country, city, zipcode, accountstatus"
                              + ")"
			+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                              
                                stmt.setString(1, userID);
                                stmt.setString(2, password);
                                stmt.setString(3, firstName);
                                stmt.setString(4, lastName);
                                stmt.setString(5, gender);
                                stmt.setString(6, phoneNo);
                                stmt.setString(7, email);
                                stmt.setString(8, address);
                                stmt.setString(9, cnic);
                                stmt.setString(10, role);
                                stmt.setString(11, country);
                                stmt.setString(12, city);
                                stmt.setString(13, zipcode);
                                stmt.setString(14, accountStatus);
                              
                              
                              
                              
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
                   public static void updateData(Admin p)
                            throws Exception{
                       
		try{
			
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE "+tableAdmin+" SET first = ?, last = ?,"
                                      + "gender = ?, phno = ?, email = ?, address = ?, cnic = ?, country = ?,"
                                      + "city = ?, zipcode = ?, accountstatus = ? WHERE userID = ?");
                                stmt.setString(1, p.getFirstName());
                                stmt.setString(2, p.getLastName());
                                stmt.setString(3, p.getGender());
                                stmt.setString(4, p.getPhoneNo());
                                stmt.setString(5, p.getEmail());
                                stmt.setString(6, p.getAddress());
                                stmt.setString(7, p.getCnic());
                                stmt.setString(8, p.getCountry());
                                stmt.setString(9, p.getCity());
                                stmt.setString(10, p.getZipcode());
                                stmt.setString(11, p.getAccountStatus());
                                stmt.setString(12, p.getUserId());
                              
                              
                              
                              
			stmt.executeUpdate();
			
			
                              
			/*Statement stmte = conn.createStatement();
			ResultSet rs = stmte.executeQuery("SELECT * FROM "+table);
			while(rs.next()){
				if(rs.getString("userID").equals(p.getUserId()) && rs.getString("password").equals(p.getPassword())){
                                            admin = new Admin(rs.getString("userID"), rs.getString("password"), rs.getString("first")
                                                    ,  rs.getString("last"), rs.getString("gender"), rs.getString("phno"), 
                                                     rs.getString("email"),  rs.getString("address"),  rs.getString("cnic"),  rs.getString("role"),
                                                     rs.getString("country"),  rs.getString("city"),  rs.getString("zipcode"),
                                                    rs.getString("accountstatus"));
                                            
                                            
					
				}
			}*/
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          
          
          public static void createTableIfNotExists(String tableName)throws Exception{
		
		try{
			
			Connection conn = get_Connection();
                              createDataBaseIfNotExists(dbNAme);
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableName+""
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