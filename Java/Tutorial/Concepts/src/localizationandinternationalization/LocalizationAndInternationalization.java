package localizationandinternationalization;

import java.util.*;

/*
 * L10N -> Localization // there are 10 characters from L to n.
 * I18N -> Internationalization
 * 
 * Locale
 * ResourceBundle -> java.util.*;
 * 
 */

public class LocalizationAndInternationalization {
	
	public static void main(String[] args) {
		
		String language = "ge";
		String country = "GE";		
		
		Locale l = new Locale(language, country);
		ResourceBundle r = ResourceBundle.getBundle("localizationandinternationalization/bundle", l);
		String str = r.getString("hi");
		System.out.println(str);
		
	}
}
