package functionalProgramming.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Transforms one value of a type into another value of the same type.
 * They require passing all type parameters of the same type.
 */
public class Operators {

	public static void main(String[] args) {
		UnaryOperator<Integer> u1 = n -> n + 1;
		UnaryOperator<Integer> u2 = Integer::intValue;
		u1.apply(123);
		u2.apply(123544);
		
		
		BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
		BinaryOperator<String> b2 = String::concat;
		b1.apply("afasf", "wegrthrd");
		b2.apply("waea", "thhtht");
	}
	
}
