package functionalProgramming.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Used to receive a parameter and return a boolean, that's why the method name is test()
 * 
 * BiPredicate is the same, but with 2 parameters
 */
public class Predicates {

	public static void main(String[] args) {
		Predicate<String> p1 = s -> s.isEmpty();
		Predicate<String> p2 = String::isEmpty;
		p1.test("aaa");
		p2.test("");
		
		
		
		BiPredicate<String, String> p3 = (s, e) -> s.startsWith(e);
		BiPredicate<String, String> p4 = String::startsWith;
		p3.test("aaa", "a");
		p4.test("awefwe", "gggg");
	}
	
}
