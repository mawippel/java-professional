package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Pools {

	public static void main(String[] args) {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(); // Run as many as it can tasks...
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(12); // Run in a pool determined by the param
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(12); // Same as FixedThreadPool, but scheduled
	}
	
}
