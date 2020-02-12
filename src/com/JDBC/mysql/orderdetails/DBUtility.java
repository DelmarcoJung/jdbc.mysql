package com.JDBC.mysql.orderdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/university_lsu", "root","delepjung");
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return con;

	}
	
	

}
