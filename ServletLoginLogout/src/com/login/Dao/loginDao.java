package com.login.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDao {
	String str = "select * from login where uname=? and pass=?";
	String url= "jdbc:mysql://localhost:3306/akash";
	String username = "root";
	String password="aA@12345";
	
	
	public boolean check(String uname,String pass) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("url","username","password");
	PreparedStatement psmt = con.prepareStatement(str);
	psmt.setString(1, uname);
	psmt.setString(2, pass);
	ResultSet rs = psmt.executeQuery();
	if(rs.next()) {
		return true;
		
	}
	
			
		} catch (ClassNotFoundException e) {
			
			
			
		}
		
	
	
		
		
		return false;
		
	}

}
