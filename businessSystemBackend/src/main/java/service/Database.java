package service;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Database {
	public Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/LäggInDBNamn";
			String connectionUsername = "root";
			String connectionPassword = "root";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = (Connection) DriverManager.getConnection(connectionURL, connectionUsername, connectionPassword);
			if (connection != null) {
				System.out.println("Connection Successfull to DB: " + connectionURL);
			} else {
				System.out.println("Connection Failed to DB: " + connectionURL);
			}
			return connection;
		} 
		catch (Exception ex) {
			throw ex;
		}
	}
}
