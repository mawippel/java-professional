package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RethrowingExceptions {

	public void catches() throws FileNotFoundException, SQLException {
		// first way
		try {
			methodThrows();
		} catch (FileNotFoundException | SQLException e) {
			throw e;
		}
		
		// second way
		try {
			methodThrows();
		} catch (FileNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		}
		
		// better way
		try {
			methodThrows();
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void methodThrows() throws SQLException, FileNotFoundException {
		// throws something
	}
	
}
