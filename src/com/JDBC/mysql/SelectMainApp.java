package com.JDBC.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMainApp {

	public static void main(String[] args) throws Exception {
		Connection con = DbUtility.getConnection();
		
		Statement stmt = con.createStatement();
		
		String sql ="Select * from drivers";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String license = rs.getString("Licensed_no");
			String name = rs.getNString("name");
			int age = rs.getInt("age");
			Date dob = rs.getDate("dob");
			System.out.println("ID: "+id+" "+"LicenseNumber: "+license+" "+"Name: "+name+" "+"Age: "+age+" "+"DateofBirth: "+dob);
		}
		

	}

}
