package dateStringsLocalization.localization.bundleJava;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// Here, we gotta put the package name before the name of it
		ResourceBundle bundle = ResourceBundle.getBundle("dateStringsLocalization.localization.bundleJava.Zoo", Locale.US);
		System.out.println(bundle.getString("hello"));
	}
	
}
