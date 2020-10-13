package OProject.ANSpringBootApp.Model;
/**
 * It represents the Covid-19's data through the call "/live/country/"
 */
public class nation {
	/**
	 * recognizer of world's nation
	 */
	public String country;
	/**
	 * total cases
	 */
	private int confirmed;
	/**
	 *  dead citizens
	 */
	private int deaths;
	/**
	 * recovered citizens
	 */
	private int recovered;
	/**
	 * currently positive citizens
	 */
	private int active;
	/**
	 * data about a chosen period
	 */
	private Date date;
	
	
	/**
	 * initial constructor
	 */
	public nation() {
		country = "no country";
		confirmed = 0;
		deaths = 0;
		recovered = 0;
		active = 0;
	}
	public nation (String country, int confirmed, int deaths, int recovered, int active) {
	this.country = country;
	this.confirmed = confirmed;
	this.deaths = deaths;
	this.recovered = recovered;
	this.active = active;

	}
	
	public String getCountry() {
		return country;
	}
	


	public void setCountry(String country) {
		this.country = country;
	}


	public int getConfirmed() {
		return confirmed;
	}


	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}


	public int getDeaths() {
		return deaths;
	}


	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}


	public int getRecovered() {
		return recovered;
	}


	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
		
