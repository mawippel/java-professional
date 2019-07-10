package dateStringsLocalization.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDates {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2015, Month.JANUARY, 14);
		// The same methods exists for 'minus...'
		localDate.plusDays(12);
		localDate.plusWeeks(2);
		localDate.plusMonths(4);
		localDate.plusYears(1);
		
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 12);
		LocalTime time = LocalTime.of(12, 45);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		// The same methods exists for 'minus...', and also, the LocalDate methods
		dateTime.plusHours(10);
		dateTime.plusMinutes(10);
		dateTime.plusSeconds(10);
		dateTime.plusNanos(10);
	}
	
}
