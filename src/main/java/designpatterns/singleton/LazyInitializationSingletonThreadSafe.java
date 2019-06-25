package designpatterns.singleton;

public class LazyInitializationSingletonThreadSafe {

	private static LazyInitializationSingletonThreadSafe instance;

	private LazyInitializationSingletonThreadSafe() {
	}

	/*
	 * It's thread safe, but it's not optimized, as the thread gets locked at the
	 * start of the method
	 */
	public static synchronized LazyInitializationSingletonThreadSafe getInstance() {
		if (instance == null) {
			return instance = new LazyInitializationSingletonThreadSafe();
		}
		return instance;
	}

}
