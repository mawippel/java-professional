package exceptions.closeable;

public class SupressedExceptions implements AutoCloseable {

	@Override
	public void close() throws IllegalArgumentException {
		throw new IllegalArgumentException("Error while closing");
	}

	/**
	 * As we can see, a RuntimeException is thrown inside the try, so, it calls the
	 * close() method. Then, close throws another Exception (supressed), but, when
	 * catching it, it'll look for the RuntimeException, as it's not a checked
	 * exception, it's no catched and it's printed out.
	 */
	public static void main(String[] args) {
		try (SupressedExceptions s = new SupressedExceptions()) {
			throw new RuntimeException("Error thrown inside try");
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			Throwable[] suppressed = e.getSuppressed();
			System.out.println(suppressed[0].getMessage());
		}
	}

	/**
	 * Here, it runs the try without any issues, then, it tries to close both
	 * variables. s2 is closed first, since java start closing in the reverse order,
	 * then, an Exception is throws, but java, tries to close the another one, wich
	 * gets considered as the Supressed Exception...
	 */
	private void anotherExample() {
		try (SupressedExceptions s = new SupressedExceptions();
				SupressedExceptions s2 = new SupressedExceptions();) {
			System.out.println("No error inside the try");
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			Throwable[] suppressed = e.getSuppressed();
			System.out.println(suppressed[0].getMessage());
		}
		/*
		 * Output is: No error inside the try java.lang.IllegalArgumentException: Error
		 * while closing Error while closing
		 */
	}

}
