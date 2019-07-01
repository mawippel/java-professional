package genericsAndCollections.generics.methods;

import java.util.List;

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
	
	public static <T> void testStatic_2(List<T> obj) {
	}
	
	public static <T extends Object> T testStatic_3(List<? extends String> obj) {
		return null;
	}

	public static <T> T testStatic_4(T obj) {
		return null;
	}

	public static <T> BasicClassExample<T> testStatic_5(T obj) {
		return null;
	}

}
