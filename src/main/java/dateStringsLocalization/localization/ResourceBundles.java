package dateStringsLocalization.localization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * ResourceBundles have hierarchy, and, the order is:
 * 
 *  file_en_us
 *  file_en
 *  file
 *  
 *  To find a file, it follows the following order (fr_FR and us_EN as default):
 *  
 *  Zoo_fr_FR.java
 *  Zoo_fr_FR.properties
 *  Zoo_fr.java
 *  Zoo_fr.properties
 *  Zoo_en_US.java
 *  Zoo_en_US.properties
 *  Zoo_en.java
 *  Zoo_en.properties
 *  Zoo.java
 *  Zoo.properties
 *  throws MissingResourceException
 */
public class ResourceBundles {

	public static void main(String[] args) {
		Locale enUs = new Locale("en", "US");
		Locale frFr = new Locale("fr", "FR");
		getResourceBundle(enUs);
		getResourceBundle(frFr);
	}
	
	private static void getResourceBundle(Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle("Zoo", locale);
		String string = bundle.getString("hello");
		String string2 = bundle.getString("open");
		System.out.println(string);
		System.out.println(string2);
	}
	
	private static void properties() {
		Properties p = new Properties();
		Locale enUs = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("Zoo", enUs);
		
		Set<String> keySet = bundle.keySet();
		keySet.stream()
			.forEach(k -> p.put(k, bundle.getString(k)));
		
		System.out.println(p.getProperty("doesntExists")); // null
		System.out.println(p.get("doesntExists")); // null
		System.out.println(p.getProperty("doesntExists", "defaultValue")); // defaultValue
		System.out.println(p.getProperty("open", "defaultValue")); // The Zoo is open
	}
	
}
