package concurrency.collections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDeques {

	// It's like a normal Deque, as a ArrayDeque, or a ConcurrentLinkedDeque, but
	// with methods that block for a specified time.
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
		deque.offerFirst(1, 10, TimeUnit.SECONDS);
		deque.offerLast(2, 10, TimeUnit.SECONDS);
		deque.offerFirst(3);
		System.out.println(deque.poll(10, TimeUnit.SECONDS));
		System.out.println(deque.pollFirst(10, TimeUnit.SECONDS));
		System.out.println(deque.pollLast(10, TimeUnit.SECONDS));
	}

}
