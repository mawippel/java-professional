package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Knows what was returned from the query.
 * 
 * By default, it's forward-only.
 */
public class ResultSets {

	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM xd");
			
			while (resultSet.next()) {
				String string2 = resultSet.getString(1); // IT STARTS COUNTING FROM 1!!!
				int int1 = resultSet.getInt("aaa");
				String string = resultSet.getString("bbbb");
				Date date = resultSet.getDate("aaa"); // java.sql.Date is only DATE
				Time time = resultSet.getTime("gfaega"); // only the time
				Timestamp timestamp = resultSet.getTimestamp("drethdrth"); // time + date
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// -------------------- METHODS THAT REQUIRE SCROLLABE --------------------------
	
	private void scrollableResultSet() {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM xd");
			
			rs.beforeFirst(); // void method, points the cursor to the before first position
			boolean first = rs.first();
			boolean previous = rs.previous();
			boolean next = rs.next();
			boolean last = rs.last();
			rs.afterLast(); // void method, points the cursor to the after last position
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void absolute() {
		/*
		 * Takes a number as parameter with a row number to which you wanna point.
		 * 
		 * Negative number -> Starts couting from the end of the ResultSet than the beginning;
		 * Zero -> Starts from the beforeFirst() position;
		 * Positive number -> Moves to that numbered row;
		 */
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM xd");
			while (rs.next()) {
				boolean absolute = rs.absolute(0); // false
				
				boolean absolute2 = rs.absolute(1); // true -> first row starting from the beginning
				
				rs.absolute(-1); // true -> first starting from the end
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void relative() {
		/*
		 * Moves forward or backwards a specified number of rows
		 */
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:123/my_db");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM xd");
			while (rs.next()) {
				boolean relative = rs.relative(1); // true -> goes 1 pos forward
				boolean relative2 = rs.relative(-2); // true -> goes 2 pos backwards
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
