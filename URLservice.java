package OProject.ANSpringBootApp.Service;

public class URLservice {

	public final static String URL = "https://api.covid19api.com/live/country/";
	/**
	 * Metodo che ci permette di completare l' URL con il nome della nazione ricercata
	 */
	public static String getURL(String Slug) {
		return  "https://api.covid19api.com/live/country/"+Slug;
		}
}
