package com.JDBC.mysql;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateMainApp {

	public static void main(String[] args) throws Exception {
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
		 * (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dmv_db",
		 * "root","delepjung");
		 */
		Connection con = DbUtility.getConnection();
		Statement stmt = con.createStatement();
		String sql ="update drivers set Licensed_no = 'VA101' where id = 2";
		stmt.executeUpdate(sql);

	}

}
