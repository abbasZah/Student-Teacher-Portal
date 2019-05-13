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
          private final String ser_URL = "jdbc:mysql://localhost/";


          private String dbNAme;
          private String table;
          private String db_URL;
          
          ///////////////////////////////////////////////////////////////////////////////////////////////
          public JDBC(String dbName, String table) {
                this.dbNAme =dbName;
                this.table = table;
                db_URL = ser_URL+dbName;
              
              try {
                  createDataBaseIfNotExists(dbName);
                  createTableIfNotExists(table);
              } catch (Exception ex) {
                  ex.printStackTrace();
              }
          }
          
          //////////////////////////////////////////////////////////////////////////////////////////////////
          
          public boolean isUser(String username, String password){
		try{
			Connection conn = get_Connection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+table);
			while(rs.next()){
				if(rs.getString("userID").equals(username) && rs.getString("password").equals(password)){
					//user = new User(rs.getString("first"), rs.getString("last"), rs.getString("username"),
					//		rs.getString("password"), rs.getString("email"), rs.getString("phno"), rs.getString("gender"));
					
					
					return true;
				}
			}
			
		}catch(Exception e){
                        System.out.println(e);
		}
		return false;
	}
          
          public void insertData(
                            String userID, String first, 
                            String last, String pass, String email, 
                            String phNo, String gender
                    )
                            throws Exception{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = get_Connection();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO "+table+"" 
                              + "(userID, first, last ,password, email, phno, gender)"
			+"VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, userID);
			stmt.setString(2, first);
			stmt.setString(3, last);
			stmt.setString(4, pass);
			stmt.setString(5, email);
			stmt.setString(6, phNo);
			stmt.setString(7, gender);
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Information Udated!");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
          
          
          
          public void createTableIfNotExists(String tableName)throws Exception{
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = get_Connection();
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS "+tableName+""
                                        + "(userID varchar(32) NOT NULL,"
				+ "first varchar(32) NOT NULL,"
                                        + "last varchar(32) NOT NULL,"
                                        + "password varchar(32) NOT NULL,"
                                        + "email varchar(32) NOT NULL,"
                                        + " phno varchar(32) NOT NULL,"
                                        + "gender varchar(6) NOT NULL )";
			stmt.executeUpdate(sql);
			System.out.println("Table Created!");
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
          
          public void createDataBaseIfNotExists(String dbName)throws Exception{
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
          
            
          
          public Connection get_Connection()throws Exception{////////////////////
		try{
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(db_URL, USER, PASS);
			System.out.println("Connection Established!");
			return conn;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
          }///////////////////////////////////////////////////////////////////////////////////////////

          
          
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDbNAme() {
        return dbNAme;
    }

    public void setDbNAme(String dbNAme) {
        this.dbNAme = dbNAme;
    }
    public String getSer_URL() {
        return ser_URL;
    }
}