package OProject.ANSpringBootApp.JSON;

public class JasonAD2 {
	public static JSONObject readURL() {
		try {
			String myURL = 'https://api.covid19api.com/countries';
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
public static ArrayList<States> JSONParser(JSONObject json) {
		ArrayList<States> list= new ArrayList<States>();
		if(json != null) {
			JSONArray alldata = json.optJSONArray("alldata");
			if( alldata != null) {
				for(int i=0; i< alldata.length; i++) {
					States PIPPO = new States();
					}
					try {
						PIPPO.setCountry(alldata.getJSONObject(i).getString("Country"));
					}catch (JSONException e) {
						PIPPO.setCountry("No Country Found");
					}
					try {
						PIPPO.setSlug(alldata.getJSONObject(i).get("Slug"));
					}catch (JSONException e) {
						PIPPO.setSlug("No Slug");
					}
					try {
						PIPPO.setISO2(alldata.getJSONObject(i).get("ISO2"));
					}catch (JSONException e) {
						PIPPO.setISO2("No ISO2");
					}

}
