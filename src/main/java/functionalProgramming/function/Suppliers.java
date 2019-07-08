package functionalProgramming.function;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 *  Used when you want to supply a value, without taking any param
 */
public class Suppliers {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = () -> LocalDate.now();
		Supplier<LocalDate> s2 = LocalDate::now;
		
		System.out.println(s1.get());
		System.out.println(s2.get());
	}
	
}
