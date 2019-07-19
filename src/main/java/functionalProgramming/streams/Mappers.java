package functionalProgramming.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Mappers {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("asd", "gggg");
		
		// Stream to Stream
		Stream<String> map = of.map(s -> s+"aaa"); // Function
		
		// Stream to primitive stream
		DoubleStream mapToDouble = of.mapToDouble(s -> s.length()); // ToDoubleFunction
		IntStream mapToInt = of.mapToInt(null); // ToIntFunction
		LongStream mapToLong = of.mapToLong(null); // ToLongFunction
		
		// primitive stream to Stream
		Stream<String> streamFromDouble = mapToDouble.mapToObj(null); // DoubleFunction
		Stream<String> streamFromInt = mapToInt.mapToObj(null); // IntFunction
		Stream<String> streamFromLong = mapToLong.mapToObj(null); // LongFunction
		
		// primitive stream to primitive stream
		mapToDouble.map(d -> d); // DoubleUnaryOperator
		mapToDouble.mapToInt(d -> (int)d); // DoubleToIntFunction
		mapToDouble.mapToLong(d -> (long)d); // DoubleToLongFunction
	}
	
}
