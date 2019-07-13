package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Futures {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<String> future = newSingleThreadExecutor.submit(() -> { // Execute doesnt return anything, if you want
			// to return something, use submit()
			for (int i = 0; i < 3; i++) {
				System.out.println("start");
				System.out.println("index: " + i);
				System.out.println("finish");
			}
			return "WOOOW";
		});

		future.isDone(); // Return if it's completed, threw an exception or was cancelled
		future.isCancelled(); // Return true if it was cancelled before it was completed

		future.cancel(true); // tries to cancel, receive a boolean representing if the thread executing this
							 // task should be interrupted; otherwise, in-progress tasks are allowed to complete
		
		future.get(); // retrieve the result of a task, waiting endlessly if it is not avaiable yet
		future.get(1, TimeUnit.MINUTES); // retrieve the result of a task, waits until the time passed by param
	}

}
