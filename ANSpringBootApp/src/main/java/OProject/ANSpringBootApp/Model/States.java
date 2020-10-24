package OProject.ANSpringBootApp.Model;

public class States {
		/**
		 * recognizer of world's nation
		 */
		private String Country;
		/**
		 * nation's name to search
		 */
		private String Slug;
		/**
		 *  country's slug
		 */
		private String ISO2;


public States() {
	Country = "No country";
	Slug = "No Slug";
	ISO2 = "No ISO2";
}

public States (String Country, String Slug, String ISO2) {
this.Country = Country;
this.Slug = Slug;
this.ISO2 = ISO2;
}


public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}
public String getSlug() {
	return Slug;
}


public void setSlug(String slug) {
	Slug = slug;
}

public String getISO2() {
	return ISO2;
}

public void setISO2(String iSO2) {
	ISO2 = iSO2;
}
}