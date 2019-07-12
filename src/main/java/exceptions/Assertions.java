package exceptions;

public class Assertions {

	/**
	 * By default, assertions are not runned by the JVM, if you want to run them,
	 * you gotta specify as bellow:
	 * 
	 * java -enableassertions Assertions
	 * java -ea Assertions.java
	 * java -ea:com.exceptions...
	 * java -ea:com.exceptions.Assertions
	 * 
	 * To disable assertions is the same as above, but using:
	 * java -disableassertions
	 * java -da
	 */
	public static void main(String[] args) {
		int numGuests = -5;
		// Both are OK
		assert numGuests > 0;
		assert numGuests > 0 : "This should be higher than zero!";
	}

}
