package dateStringsLocalization.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatters {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		// ISO
		System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		// ofLocalized
		System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println(localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		
		// The same as done above
		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(LocalDateTime.now()));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDate.now()));
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(LocalTime.now()));
		
		// Creating your own pattern
		System.out.println(DateTimeFormatter.ofPattern("MMMM, dd, yyyy").format(localDateTime));
			// Parsing works like the same, but its the inverse
	}
	
}
