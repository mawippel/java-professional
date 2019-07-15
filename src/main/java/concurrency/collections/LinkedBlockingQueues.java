package concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueues {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		queue.offer(1, 10, TimeUnit.SECONDS);
		queue.offer(2, 10, TimeUnit.SECONDS);
		queue.offer(3, 10, TimeUnit.SECONDS);
		System.out.println(queue.peek());
		System.out.println(queue.poll(10, TimeUnit.SECONDS));
		System.out.println(queue.poll(10, TimeUnit.SECONDS));
	}
	
}
