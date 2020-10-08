package OProject.ANSpringBootApp.JSON;

import OProject.ANSpringBootApp.Service.URLservice;

public class JasonAD {
	/**
	 * it provides to open a connection by a specific URL and get JSONbject object
	 * 
	 * @retrun JSONbject object that contains query's results 
	 */
	public static JSONObject readURL2() {
	try {
		
		String myURL = URLservice.getURL(Slug);
		StringBuldier string = new StringBuilder();
		URL url = new URL(myURL);
		BufferedRader reader= new BufferedReader(new InputStreamReader(url.openStream()));
		String phrase = "";
		while ((phrase = reader.readLine()) != null) {
			string.append(phrase);
		}
		reader.close();
		JSONObject json= new JSONObject(string.toString());
		return json;
	   }catch (Exception e) {
		   return null;
	   }
	}
	
}

public static ArrayList<nation> JSONParser(JSONObject json) {
	ArrayList<nation> list= new ArrayList<nation>();
	if(json != null) {
		JSONArray alldata = json.optJSONArray("alldata");
		if( alldata != null) {
			for(int i=0; i< alldata.length; i++) {
				nation COCA = new nation();
				}
				try {
					COCA.setCountry(alldata.getJSONObject(i).getString("Country"));
				}catch (JSONException e) {
					COCA.setCountry("No Country Found");
				}
				/**
				 * Controllare se servono errri per questi qui sotto
				 */
				try {
					COCA.setConfirmed(alldata.getJSONObject(i).get("Confirmed"));
				}catch (JSONException e) {
					COCA.setConfirmed(0);
				}
				try {
					JSONObject 
					COCA.setDeaths(alldata.getJSONObject(i).get("Deaths"));
				}catch (JSONException e) {
					COCA.setDeaths(0);
				}
				try {
					COCA.setRecovered(alldata.getJSONObject(i).get("Recovered"))
				}catch (JSONException e) {
					COCA.setRecovered(0);
				}
				try {
					COCA.setActive(alldata.getJSONObject(i).get("Active"));
				}catch (JSONException e) {
					COCA.setActive(0);
				}
				try {
					COCA.setDate(alldata.getJSONObject(i).getDate("Date"));
				}catch (JSONException e) {
					COCA.setDate("No Date");
				}
			}
		}
	}
}
















