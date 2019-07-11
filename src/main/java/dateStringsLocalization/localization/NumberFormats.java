package dateStringsLocalization.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormats {

	public static void main(String[] args) throws ParseException {
		// NUMBER
		int bigNum = 1_012_000;
		NumberFormat defaultFormatter = NumberFormat.getInstance(); // gets the default locale
		NumberFormat customFormatter = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		
		System.out.println(defaultFormatter.format(bigNum));
		System.out.println(customFormatter.format(bigNum));
		
		// CURRENCY
		int price = 48;
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		System.out.println(currencyFormatter.format(price));
		
		// PARSING
		String s = "40,45";
		System.out.println(defaultFormatter.parse(s));
		String s2 = "40x45";
		System.out.println(defaultFormatter.parse(s2)); // 40 (it stops parsing when hits an invalid character)
	}
	
}
