package functionalProgramming.streams.primitive.function;

import java.util.function.BooleanSupplier;

public class BooleanSuppliers {

	public static void main(String[] args) {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> false;
		
		b1.getAsBoolean();
	}
	
}
