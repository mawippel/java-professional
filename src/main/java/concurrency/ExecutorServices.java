package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServices {

	/**
	 * In this example, we have a thread for main() and another one for
	 * ExecutorService
	 */
	public static void main(String[] args) {
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		newSingleThreadExecutor.execute(() -> { // Execute doesnt return anything, if you want to return something, use
												// submit()
			for (int i = 0; i < 3; i++) {
				System.out.println("start");
				System.out.println("index: " + i);
				System.out.println("finish");
			}
		});
		newSingleThreadExecutor.execute(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("start2");
				System.out.println("index2: " + i);
				System.out.println("finish2");
			}
		});
		System.out.println("Finished?");

		// Also, you always have to shutdown your ExecutorService
		newSingleThreadExecutor.shutdown(); // Will not receive new tasks in this executor, but, finishes the Execution
											// of the previous defined tasks that are running
		newSingleThreadExecutor.shutdownNow(); // Will ATTEMPT to stop all the running tasks
	}

	private void submit() {
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<String> callable = newSingleThreadExecutor.submit(() -> { // Execute doesnt return anything, if you want
																			// to return something, use submit(). But,
																			// as there is a overloaded submit that
																			// receives a Runnable, you can use it
			for (int i = 0; i < 3; i++) {
				System.out.println("start");
				System.out.println("index: " + i);
				System.out.println("finish");
			}
			return "WOOOW";
		});
		try {
			callable.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	private void invokeAll() {
		/*
		 * invokeAny receive a Collection of objects that implements Callable, and then,
		 * runs the callables, when they're all done, it returns a Collection of
		 * Futures, that may or may not runned with success, but for sure, they're done.
		 */
	}

	private void invokeAny() {
		/*
		 * invokeAny receive a Collection of objects that implements Callable, and then,
		 * runs the callables, when the first one is done, it returns it and stop
		 * executing any other taks in the Collection.
		 */
	}

}
