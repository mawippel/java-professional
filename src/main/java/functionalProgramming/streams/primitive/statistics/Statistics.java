package functionalProgramming.streams.primitive.statistics;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Statistics {

	public static void main(String[] args) {
		IntStream of = IntStream.of(1,2,3);
		IntSummaryStatistics summaryStatistics = of.summaryStatistics();
		
		// With summaryStatistics, we can execute as many as we want terminal operations
		summaryStatistics.getAverage();
		summaryStatistics.getCount();
		summaryStatistics.getSum();
	}
	
}
