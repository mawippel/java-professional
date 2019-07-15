package concurrency.collections;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeques {

	public static void main(String[] args) {
		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.push(1);
		deque.push(2);
		deque.push(3);
		System.out.println(deque.peek());
		System.out.println(deque.pop());
	}
	
}
