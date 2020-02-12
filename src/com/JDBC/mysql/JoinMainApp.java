package com.JDBC.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JoinMainApp {

	public static void main(String[] args) throws Exception {
		Connection con = DbUtility.getConnection();
		
		Statement stmt = con.createStatement();
		String sql = "select * from  drivers d left join vehicles v on d.id = v.driver_id";

		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("id") + rs.getInt("driver_id");
			String m = rs.getString("make") + rs.getString("name");
			System.out.println(id+m);
		}
		
		

	}

}
