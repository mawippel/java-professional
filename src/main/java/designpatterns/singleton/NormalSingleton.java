package designpatterns.singleton;

public class NormalSingleton {

	private static final NormalSingleton instance = new NormalSingleton();
	
	private NormalSingleton() {}
	
	public static NormalSingleton getInstance() {
		return instance;
	}
	
}
