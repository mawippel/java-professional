package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Knows how to communicate with the DB 
 */
public class Connections {

	public static void main(String[] args) {
		try {
			// basic constructor
			Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			
			// overloaded constructor with user and pass
			Connection connection2 = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db", "myuser", "mypass");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
