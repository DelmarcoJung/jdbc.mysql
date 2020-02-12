package com.JDBC.mysql.orderdetails;

import java.sql.Connection;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args) throws Exception {
		Connection con = DBUtility.getConnection();

		Statement stmt = con.createStatement();

		String Sql = "insert into orderdetails(orderdetailid,orderid, productid, Quantity, ProductName, dateOrder, orderTime, Price, status, unitprice) VALUES ('11','10030', '1040', '2', 'V-neck', '2020-01-30', '08:20:30', '$79.99', '1','$39.99')";
		stmt.executeUpdate(Sql);
	}

}
