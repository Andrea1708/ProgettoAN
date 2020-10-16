package OProject.ANSpringBootApp.Service;

public class URLservice {

	public final static String URL = "https://api.covid19api.com/live/country/";
	/**
	 * Method that modifies the URL by adding the name of the chosen country
	 */
	public static String getURL(String Slug ) {
		
		return  "https://api.covid19api.com/live/country/"+ Slug;
		}
}
