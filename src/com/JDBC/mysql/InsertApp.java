package com.JDBC.mysql;

import java.sql.Connection;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args) throws Exception {
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
		 * (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dmv_db",
		 * "root","delepjung");
		 */
		Connection con = DbUtility.getConnection();
		
		Statement stmt = con.createStatement();
		String sql ="insert into drivers(licensed_no,name,age,dob) values ('MD109','Van','21','1/02/25')";
		stmt.executeUpdate(sql);

	}

}
