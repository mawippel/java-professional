package functionalProgramming.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Used to usually turn one parameter into another value, it returns the same
 * type that is passed to it.
 * 
 * The same to BiFunctions.
 */
public class Functions {

	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> s.length();
		Function<String, Integer> f2 = String::length;
		f1.apply("ghgege");
		f2.apply("aaaaaaaaaaaaaaa");
		
		
		
		BiFunction<String, String, String> f3 = (s1, s2) -> s1.concat(s2);
		BiFunction<String, String, String> f4 = String::concat;
		f3.apply("ghgege", "awefawefawe");
		f4.apply("aaaaaaaaaaaaaaa", "bb");
	}
	
}
