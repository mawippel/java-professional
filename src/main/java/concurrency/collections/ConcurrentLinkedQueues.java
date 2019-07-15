package concurrency.collections;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueues {

	public static void main(String[] args) {
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	
}
