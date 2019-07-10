package dateStringsLocalization.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Periods {

	public static void main(String[] args) {
		Period.of(1, 0, 7); // every year and 7 days
		
		// Most common signature
		Period ofDays = Period.ofDays(7);
		Period ofWeeks = Period.ofWeeks(2);
		Period ofMonths = Period.ofMonths(0);
		Period ofYears = Period.ofYears(1); 
		
		LocalTime of = LocalTime.of(12, 45);
		of.plus(ofDays); // THROWS AN EXCEPTION
	}
	
	private void example() {
		LocalDate start = LocalDate.of(1998, 12, 01);
		LocalDate end = LocalDate.of(1999, 12, 01);
		
		Period ofDays = Period.ofDays(12);
		while (start.isBefore(end)) {
			start = start.plus(ofDays);
		}
	}
	
}
