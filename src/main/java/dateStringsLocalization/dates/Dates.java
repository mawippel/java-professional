package dateStringsLocalization.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Dates {

	private void creation() {
		// ------- LOCALDATE ---------
		LocalDate.now();
		LocalDate.of(2019, 03, 31);
		LocalDate.of(2019, Month.APRIL, 31);
		
		// ------- LOCALTIME ---------
		LocalTime.now();
		LocalTime.of(12, 55); // hh:mm
		LocalTime.of(12, 55, 23); // hh:mm:ss
		LocalTime.of(12, 55, 23, 56565); // hh:mm:ss:nn
		
		// ------- LOCALDATETIME ---------
		// The same constructors of LocalDate + LocalTime
		LocalDateTime.of(2019, 03, 31, 12, 55, 23, 56565);
		
		// ------- ZONEDDATETIME ---------
		ZonedDateTime.of(2019, 03, 31, 12, 55, 23, 56565, ZoneId.of("US/Eastern"));
		ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault());
		ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("US/Eastern"));
	}
	
	
	
}
