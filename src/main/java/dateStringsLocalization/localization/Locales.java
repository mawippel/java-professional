package dateStringsLocalization.localization;

import java.util.Locale;

public class Locales {

	public static void main(String[] args) {
		// -------------------------------------
		Locale locale = Locale.getDefault();
		System.out.println(locale); // pt_BR
		
		// -------------------------------------
		Locale english = Locale.ENGLISH;
		Locale us = Locale.US;
		// The pattern is, the language always go first, followed by the country
		// You can have only the language, but not only the country
		System.out.println(english); // en
		System.out.println(us); // en_US
		
		// -------------------------------------		
		Locale l2 = new Locale("en");
		Locale l3 = new Locale("en", "US");
		
		// -------------------------------------
		// Both of them result the same
		Locale l4 = new Locale.Builder()
			.setLanguage("en")
			.setRegion("US")
			.build();
		Locale l5 = new Locale.Builder()
				.setRegion("US")
				.setLanguage("en")
				.build();
	}
	
}
