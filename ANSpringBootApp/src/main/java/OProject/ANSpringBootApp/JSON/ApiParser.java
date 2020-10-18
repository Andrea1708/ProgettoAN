package OProject.ANSpringBootApp.JSON;

public class ApiParser {
	/** private static void ConvertionJSON1(JSONArray cane, ArrayList<States> list) {
	States objectval = new States();
	JSONObject json;
	for(int i=0; i< cane.length();i++) {
		json = (JSONObject) cane.get(i);
		objectval.setCountry((String) json.get("Country"));
		objectval.setCountry((String) json.get("Slug"));
		objectval.setCountry((String) json.get("ISO2"));
		list.add(objectval);
	}
}**/


/**

private static void ConvertionJSON2(JSONArray gatto, ArrayList<Nation> roster) {
	Nation objdat = new Nation();
	JSONObject json2;
	for(int j=0; j < gatto.length(); j++) {
		json2 = (JSONObject) gatto.get(j);
		objdat.setCountry((String) json2.getString("Country"));
		objdat.setConfirmed((long) json2.get("Confirmed"));
		objdat.setActive((long) json2.get("Active"));
		objdat.setRecovered((long) json2.get("Recovered"));
		objdat.setDeaths((long) json2.get("Deaths"));
		objdat.setDate((String) json2.get("Date"));
		roster.add(objdat);
	}
}

public static ArrayList<nation> JSONParser(JSONObject json2) {
ArrayList<nation> list = new ArrayList<nation>();

if(json2 != null) {
	JSONArray alldata = json2.optJSONArray("data");
	if( alldata != null) {
		for(int i = 0; i < alldata.length(); i++) {
			nation COCA = new nation();
			try {
				COCA.setCountry(alldata.getJSONObject(i).getString("Country"));
			}catch (JSONException e) {
				COCA.setCountry("No Country Found");
			}
			try {
				COCA.setConfirmed(alldata.getJSONObject(i).get("Confirmed"));
			}catch (JSONException e) {
				COCA.setConfirmed(0);
			}
			try {
				COCA.setDeaths(alldata.getJSONObject(i).get("Deaths"));
			}catch (JSONException e) {
				COCA.setDeaths(0);
			}
			try {
				COCA.setRecovered(alldata.getJSONObject(i).get("Recovered"));
			}catch (JSONException e) {
				COCA.setRecovered(0);
			}
			try {
				COCA.setActive(alldata.getJSONObject(i).get("Active"));
			}catch (JSONException e) {
				COCA.setActive(0);
			}
			try {
				COCA.setDate(alldata.getJSONObject(i).getString("Date"));
			}catch (JSONException e) {
				COCA.setDate("No Date");
			}
			list.add(COCA);
			}
		}
	}
}**/




}
