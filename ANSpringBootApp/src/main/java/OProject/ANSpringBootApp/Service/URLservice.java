package OProject.ANSpringBootApp.Service;

public class URLservice {

	public final static String URL = "https://api.covid19api.com/live/country/";
	public final static String URL2 = "https://api.covid19api.com/live/country/status/confirmed/date/";
	/**
	 * Method that modifies the URL by adding the name of the chosen country
	 */
	public static String getURL(String Word ) {
		
		String IndexData ="https://api.covid19api.com/live/country/"+ Word;
		
		return IndexData;
		}
	
	public static String getURL2(String Letter, String Data) {
		String Codice = "https://api.covid19api.com/live/country/"+ Letter+"/status/confirmed/date/"+Data;
		return Codice;
		}
}
