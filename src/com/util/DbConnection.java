package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		openConnection();
	}

	public static Connection openConnection() {

		// java ---> database
		// driver ? - mysql
		// url ? - dbServer
		// userName
		// password

		Connection connection = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/decclubadv";
		String userName = "root";
		String password = "root";

		// load driver
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (connection == null) {
			System.out.println("db not connected....");
		} else {
			System.out.println("db Connected....");
		}
		return connection;
	}
}
