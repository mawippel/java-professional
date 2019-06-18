package designpatterns.interfaces;

public interface Fly {

	int getWindSpan();
	
	static final int MAX_SPEED = 12;
	
	default void land() {
		System.out.println("Landing...");
	}
	
	static double calculateSpeed() {
		return 12;
	}
	
}
