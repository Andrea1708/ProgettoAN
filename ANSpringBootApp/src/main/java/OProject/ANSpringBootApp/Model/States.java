package OProject.ANSpringBootApp.Model;

public class States {
		/**
		 * recognizer of world's nation
		 */
		private String country;
		/**
		 * nome dello stato da mettere sul rest
		 */
		private String Slug;
		/**
		 *  codice di ogni stato
		 */
		private String ISO2;


public States() {
	country = "No country";
	Slug = "No Slug";
	ISO2 = "No ISO2";
}

public States (String country, String Slug, String ISO2) {
this.country = country;
this.Slug = Slug;
this.ISO2 = ISO2;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
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