package designpatterns.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {}

	// IT'S NOT THREAD SAFE
	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			return instance = new LazyInitializationSingleton();
		}
		return instance;
	}

}
