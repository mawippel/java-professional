package concurrency;

public class Runnables {

	public static void main(String[] args) {
		/*
		 * A runnable can only execute a task, without return or receiving any method.
		 * If you want to use a variable inside the run method, you can implement the
		 * Runnable interface
		 */
		Runnable r1 = () -> System.out.println("runnable printer");
	}

}
