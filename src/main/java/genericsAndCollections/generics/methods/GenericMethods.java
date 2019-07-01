package genericsAndCollections.generics.methods;

import genericsAndCollections.generics.classes.BasicClassExample;

public class GenericMethods {

	// NON-STATIC METHODS
	public <T> void testNonStatic_1(T obj) {
	}

	public <T> T testNonStatic_2(T obj) {
		return null;
	}
	
	public <T> BasicClassExample<T> testNonStatic_3(T obj) {
		return null;
	}
	
	//STATIC METHODS
	public static <T> void testStatic_1(T obj) {
	}

	public static <T> T testStatic_2(T obj) {
		return null;
	}

	public static <T> BasicClassExample<T> testStatic_3(T obj) {
		return null;
	}

}
