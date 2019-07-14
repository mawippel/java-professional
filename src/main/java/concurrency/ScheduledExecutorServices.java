package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServices {

	public static void main(String[] args) {
		Runnable task = () -> System.out.println("hagaha");
		ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
		newSingleThreadScheduledExecutor.schedule(task, 12, TimeUnit.SECONDS); // Receives a Runnable or Callable
		newSingleThreadScheduledExecutor.scheduleAtFixedRate(task, 123, 123, TimeUnit.SECONDS);
		newSingleThreadScheduledExecutor.scheduleWithFixedDelay(task, 123, 123, TimeUnit.SECONDS);
	}
	
}
