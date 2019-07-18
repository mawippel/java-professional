package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Know how to get a connection to the DB
 */
public class Drivers {

	public static void main(String[] args) {
		try {
			/*
			 * Driver syntax:
			 * jdbc:<vendor>://<ip>:<?port>/<db name>
			 */
			DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
