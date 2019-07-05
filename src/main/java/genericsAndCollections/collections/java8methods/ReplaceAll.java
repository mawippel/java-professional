package genericsAndCollections.collections.java8methods;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(123123);
		a.add(124213513);

		/**
		 * It receives a UnaryOperator, which takes one parameter and returns a value of
		 * the same type.
		 */
		a.replaceAll(ReplaceAll::multiply);
		a.replaceAll(u -> u*2);
	}
	
	private static Integer multiply(Integer y) {
		return y * 2;
	}

}
