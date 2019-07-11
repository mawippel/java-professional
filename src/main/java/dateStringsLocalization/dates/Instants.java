package dateStringsLocalization.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Represents a specific moment in time. (ALWAYS IN GMT)
 */
public class Instants {

	public static void main(String[] args) {
		Instant now = Instant.now();
		
		// some operations
		
		Instant later = Instant.now();
		
		Duration between = Duration.between(now, later);
		System.out.println(between.toNanos());
		
		// Ways to create
		Instant instant = ZonedDateTime.now().toInstant();
		Instant ofEpochSecond = Instant.ofEpochSecond(1231245112312L);
		
		// This works
		ofEpochSecond.plus(123, ChronoUnit.DAYS);
		ofEpochSecond.plusSeconds(123);
		
		/*
		 * IT WILL THROW AN EXCEPTION
		 * Here you can work just as a Duration, adding days or a smaller unit...
		 */
		ofEpochSecond.plus(123, ChronoUnit.YEARS);
	}
	
}
