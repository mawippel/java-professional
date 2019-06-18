package designpatterns.interfaces;

/**
 * A functional interface is an interface that only has one abstract method.
 * They're used as basis for lambda expressions 
 * 
 * It's a good practice anotating with @FunctionalInterface
 * If the interface is annotated and has more than one method, it won't compile
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {

	static int xd = 2;
	
	// THE ONLY ABSTRACT METHOD OF THE INTERFACE
	void teste();
	
	static void staticMethod() {
		
	};
	
	default void defaultMethod() {
		
	}
	
}
