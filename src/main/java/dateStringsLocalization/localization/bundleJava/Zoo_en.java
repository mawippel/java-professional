package dateStringsLocalization.localization.bundleJava;

import java.util.ListResourceBundle;

/**
 * This kind of property file is good when you want do change/build a resource in runtime.
 * 
 * You can have types in the content
 */
public class Zoo_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "hello", "Hello" }, { "open", "The zoo is open" } };
	}

}
