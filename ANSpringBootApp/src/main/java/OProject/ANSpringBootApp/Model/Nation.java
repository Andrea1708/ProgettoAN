package OProject.ANSpringBootApp.Model;


/**
 * It represents the Covid-19's data through the call "/live/country/"
 */
public class Nation {
	/**
	 * recognizer of world's nation
	 */
	public String Country;
	/**
	 * total cases
	 */
	private int Confirmed;
	/**
	 *  dead citizens
	 */
	private long Deaths;
	/**
	 * recovered citizens
	 */
	private long Recovered;
	/**
	 * currently positive citizens
	 */
	private long Active;
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
	public Nation (String Country, int Confirmed, long Deaths, long  Recovered, long Active, String Date) {
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
	public long getDeaths() {
		return Deaths;
	}
	public void setDeaths(long deaths) {
		Deaths = deaths;
	}
	public long getRecovered() {
		return Recovered;
	}
	public void setRecovered(long recovered) {
		Recovered = recovered;
	}
	public long getActive() {
		return Active;
	}
	public void setActive(long active) {
		Active = active;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
}