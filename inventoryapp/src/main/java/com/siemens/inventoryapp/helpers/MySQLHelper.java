package com.siemens.inventoryapp.helpers;
import java.sql.*;
import java.util.ResourceBundle;

public class MySQLHelper {
	
	private static ResourceBundle resourceBundle;
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		resourceBundle=ResourceBundle.getBundle("db");
		String userName=resourceBundle.getString("userName");
		String password=resourceBundle.getString("password");
		String driver=resourceBundle.getString("driverClassName");
		String url=resourceBundle.getString("url");
		//register the driver
		Class.forName(driver);
		//create connection
		return DriverManager.getConnection(url, userName, password);
		
	}
	
	

}
