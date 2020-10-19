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
	 * recognizer Country's Province
	 */
	private String Province;
	/**
	 * recognizer Country's City
	 */
	private String City;
	/**
	 * recognizer CityCode
	 */
	private String CityCode;
	/**
	 * recognizer Country's Latitude
	 */
	private int Lat;
	/**
	 * recognizer Country's longitude
	 */
	private int Lon;
	/**
	 * total cases
	 */
	private int Confirmed;
	/**
	 *  dead citizens
	 */
	private int Deaths;
	/**
	 * recovered citizens
	 */
	private int Recovered;
	/**
	 * currently positive citizens
	 */
	private int Active;
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
		Province = "no province";
		City = "no city";
		CityCode = "no citycode";
		Lat = 0;
		Lon = 0;
		Confirmed = 0;
		Deaths = 0;
		Recovered = 0;
		Active = 0;
		Date = "no date";
	}
	public Nation (String Country, String CountryCode, String Province,String City, String CityCode, int Lat, int Lon, int Confirmed, int Deaths, int  Recovered, int Active, String Date) {
	this.Country = Country;
	this.CountryCode = CountryCode;
	this.Province = Province;
	this.City= City;
	this.CityCode= CityCode;
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
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCityCode() {
		return CityCode;
	}
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}
	public int getLat() {
		return Lat;
	}
	public void setLat(int lat) {
		Lat = lat;
	}
	public int getLon() {
		return Lon;
	}
	public void setLon(int lon) {
		Lon = lon;
	}
	public int getConfirmed() {
		return Confirmed;
	}
	public void setConfirmed(int confirmed) {
		Confirmed = confirmed;
	}
	public int getDeaths() {
		return Deaths;
	}
	public void setDeaths(int deaths) {
		Deaths = deaths;
	}
	public int getRecovered() {
		return Recovered;
	}
	public void setRecovered(int recovered) {
		Recovered = recovered;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	
}
	