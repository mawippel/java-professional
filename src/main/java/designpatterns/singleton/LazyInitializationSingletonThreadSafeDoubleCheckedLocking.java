package designpatterns.singleton;

public class LazyInitializationSingletonThreadSafeDoubleCheckedLocking {

	/*
	 * Prevent a subtle case where the compiler tries to optimize the code such
	 * that, that the object is accessed before it is finished being constructed
	 */
	private static volatile LazyInitializationSingletonThreadSafeDoubleCheckedLocking instance;

	private LazyInitializationSingletonThreadSafeDoubleCheckedLocking() {
	}

	public static LazyInitializationSingletonThreadSafeDoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (LazyInitializationSingletonThreadSafeDoubleCheckedLocking.class) {
				if (instance == null) {
					return instance = new LazyInitializationSingletonThreadSafeDoubleCheckedLocking();
				}
			}
		}
		return instance;
	}

}
