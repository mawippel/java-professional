package dateStringsLocalization.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Same as Period,  but to used with smaller amount of times 
 */
public class Durations {

	public static void main(String[] args) {
		Duration.of(123, ChronoUnit.MINUTES);
		Duration ofDays = Duration.ofDays(1);
		Duration.ofHours(1);
		Duration.ofMinutes(1);
		Duration.ofSeconds(1);
		Duration.ofMillis(1);
		Duration.ofNanos(1);
	
		LocalDate of = LocalDate.of(1998, 12, 18);
		of.plus(ofDays); // THROWS AN EXCEPTION
	}
	
}
