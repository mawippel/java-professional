package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Main methods to deal with {@link SQLException}
 */
public class Exceptions {

	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM xd");
			while (rs.next()) {
				boolean relative = rs.relative(1);
			}
		} catch (SQLException e) {
			e.getMessage(); // human readable message
			e.getSQLState(); // the SQL State code to what went wrong (db vendor specific)
			e.getErrorCode(); // SQL error code (db vendor specific)
		}
	}
	
}
