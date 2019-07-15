package concurrency.concurrentProccess;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarriers {

	private void removeAnimals() {
		System.out.println("Removing the animals");
	}

	private void clean() {
		System.out.println("Cleaning the cage");
	}

	private void putAnimals() {
		System.out.println("Putting animals");
	}

	private void performTask() {
		removeAnimals();
		clean();
		putAnimals();
	}

	private void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			removeAnimals();
			c1.await();
			clean();
			c2.await();
			putAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/*
		 * In this case, we'll see that it will be unordered
		 */
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
		CyclicBarriers b = new CyclicBarriers();
		for (int i = 0; i < 4; i++) {
			newFixedThreadPool.submit(() -> {
				b.performTask();
			});
		}
		newFixedThreadPool.shutdown();

		System.out.println("----------With Cyclic Barrier------------");

		/*
		 * With a CyclicBarrier, we can "synchronize" the threads to run in the same
		 * pace
		 */
		ExecutorService service = Executors.newFixedThreadPool(4);
		try {
			CyclicBarriers cyclicBarrier = new CyclicBarriers();

			// If the number of threads in the CyclicBarrier is higher than the pool size,
			// the code hangs infinitely, as the CyclicBarrier waits to all the threads get
			// to the await() part. If there's less threads in the pool than in the
			// CyclicBarrier, it will wait for more threads to get in the await(), but there
			// is not any other threads.
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("Run after the await()"));

			for (int i = 0; i < 4; i++) {
				service.submit(() -> {
					cyclicBarrier.performTask(c1, c2);
				});
			}
		} finally {
			service.shutdown();
		}
	}

}
