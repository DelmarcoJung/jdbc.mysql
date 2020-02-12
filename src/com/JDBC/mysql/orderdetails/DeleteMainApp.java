package com.JDBC.mysql.orderdetails;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteMainApp {

	public static void main(String[] args) throws Exception {
		Connection cc = DBUtility.getConnection();
		Statement S = cc.createStatement();
		String sql ="delete from orderdetails where orderid = '10016'";
		S.executeUpdate(sql);
		
	}

}
