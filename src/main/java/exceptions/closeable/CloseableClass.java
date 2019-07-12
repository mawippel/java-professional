package exceptions.closeable;

public class CloseableClass implements AutoCloseable {

	public void close() throws Exception {
		// close something
	}
	
	public static void main(String[] args) {
		try (CloseableClass c = new CloseableClass()) {

		} catch (Exception e) {
			// without a catch, it wouldnt compile, because close() throws an Exception
			// Java highly recomend to the close() method to not throw any exception...
		}
	}

}
