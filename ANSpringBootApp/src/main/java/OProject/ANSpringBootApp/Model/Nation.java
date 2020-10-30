package OProject.ANSpringBootApp.Model;

/**
 * It represents the Covid-19's data through the call "/live/country/"
 */
public class Nation {
	/**
	 * recognizer of world's nation
	 */
	private String Country;
	/**
	 *  recognizer of Country's Code
	 */
	private String CountryCode;
	/**
	 * recognizer Country's Latitude
	 */
	private String Lat;
	/**
	 * recognizer Country's longitude
	 */
	private String Lon;
	/**
	 * total cases
	 */
	private Integer Confirmed;
	/**
	 *  dead citizens
	 */
	private Integer Deaths;
	/**
	 * recovered citizens
	 */
	private Integer Recovered;
	/**
	 * currently positive citizens
	 */
	private Integer Active;
	/**
	 * data about a chosen period
	 */
	private String Date;
	
	
	/**
	 * initial constructor
	 */
	public Nation() {
		Country = "no country";
		CountryCode= "no countrycode";
		Lat = "No lat";
		Lon = "No lon";
		Confirmed = 0;
		Deaths = 0;
		Recovered = 0;
		Active = 0;
		Date = "no date";
		
	}
	public Nation (String Country, String CountryCode, String Lat, String Lon, Integer Confirmed, Integer Deaths, Integer  Recovered, Integer Active, String Date) {
	this.Country = Country;
	this.CountryCode = CountryCode;
	this.Lat = Lat;
	this.Lon = Lon;
	this.Confirmed = Confirmed;
	this.Deaths = Deaths;
	this.Recovered = Recovered;
	this.Active = Active;
	this.Date = Date;
	
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
	public String getLon() {
		return Lon;
	}
	public void setLon(String lon) {
		Lon = lon;
	}
	public Integer getConfirmed() {
		return Confirmed;
	}
	public void setConfirmed(Integer confirmed) {
		Confirmed = confirmed;
	}
	public Integer getDeaths() {
		return Deaths;
	}
	public void setDeaths(Integer deaths) {
		Deaths = deaths;
	}
	public Integer getRecovered() {
		return Recovered;
	}
	public void setRecovered(Integer recovered) {
		Recovered = recovered;
	}
	public Integer getActive() {
		return Active;
	}
	public void setActive(Integer active) {
		Active = active;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
}
	