package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Knows how to run SQL in the DB
 */
public class Statements {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			
			Statement statement2 = connection.createStatement();
			Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			/**
			 * ResultSet types:
			 * ResultSet.TYPE_FORWARD_ONLY -> Goes foward only the in the result set;
			 * ResultSet.TYPE_SCROLL_INSENSITIVE -> goes forward and backwards, not seeing the latest data from db;
			 * ResultSet.TYPE_SCROLL_SENSITIVE -> goes forward and backwards, seeing the latest data from db; (mostly not supported)
			 */
				
			/**
			 * ResultSet concurrency modes:
			 * ResultSet.CONCUR_READ_ONLY -> default mode, only reads the data;
			 * ResultSet.CONCUR_UPDATABLE -> mostly not supported, can update the result set data;
			 */
			// For both types, the downgrade is automatic if the Driver doesn't support it.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void queries() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement();
			
			ResultSet executeQuery = stmt.executeQuery("SELECT * FROM xd"); // returns the ResultSet containing the data
			int executeUpdate = stmt.executeUpdate("UPDATE xd SET a = 2 WHERE x = 3"); // returns the number of tuples that were updated/deleted
			
			
			boolean isResultSet = stmt.execute(""); // can execute updates/deletes or selects
			if (isResultSet) {
				ResultSet resultSet = stmt.getResultSet(); // returns the ResultSet containing the data
			} else {
				int updateCount = stmt.getUpdateCount(); // returns the number of tuples that were updated/deleted
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
