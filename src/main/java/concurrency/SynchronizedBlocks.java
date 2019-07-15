package concurrency;

/**
 * Here, we gotta understand the cost of synchronization, as, in most part of
 * the times, we can deal with any concurrency problems using an Atomic
 * variable, or a concurrent Collection.
 */
public class SynchronizedBlocks {

	private Object locked = new Object();

	private synchronized void synchMethod() {
		/*
		 * This method is full synchronized, in instance methods, thats the same of:
		 * 
		 * synchronized(this) {}
		 * 
		 * In static methods, thats the same of:
		 * 
		 * synchronized(SynchronizedBlocks.class) {}
		 */
	}

	private void synchBlock() {
		synchronized (locked) {
			/*
			 * In this case, only 1 thread can be inside of this block, and, when it access,
			 * a 'lock' is created to specified instance of this object.
			 */
		}
	}

}
