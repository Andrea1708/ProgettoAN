package OProject.ANSpringBootApp.Service;


public class URLservice {

	public final static String URL = "https://api.covid19api.com/live/country/";

	/**
	 * Method that modifies the URL by adding the name of the chosen country
	 * @param Word String that will be add in the URL
	 * @return String
	 */
	public static String getURL(String Word ) {
		
		String IndexData ="https://api.covid19api.com/live/country/"+ Word;
		
		return IndexData;
		}
	
}