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
		Confirmed = 0;
		Deaths = 0;
		Recovered = 0;
		Active = 0;
		Date = "no date";
	}
	public Nation (String Country, int Confirmed, int Deaths, int  Recovered, int Active, String Date) {
	this.Country = Country;
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
	