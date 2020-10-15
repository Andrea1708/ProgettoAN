package OProject.ANSpringBootApp.JSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


import OProject.ANSpringBootApp.Model.nation;
import OProject.ANSpringBootApp.Service.URLservice;

public class Json <JSONObject> {
	public   JSONObject readURL() {
		try {
			String myURL = "https://api.covid19api.com/countries";
			StringBuilder string = new StringBuilder();
			URL url = new URL(myURL);
			BufferedReader reader= new BufferedReader(new InputStreamReader(url.openStream()));
			String phrase = "";
			while ((phrase = reader.readLine()) != null) {
				string.append(phrase);
			}
			reader.close();
			JSONObject json= new JSONObject (string.toString());
			return json;
		   }catch (Exception e) {
			   return null;
		   }
	/*
	 * public static ArrayList<States> JSONParser(JStatesect json) {
	 * ArrayList<States> list= new ArrayList<States>(); if(json != null) { JSONArray
	 * alldata = json.optJSONArray("alldata"); if( alldata != null) { for(int i=0;
	 * i< alldata.length; i++) { States PIPPO = new States(); } try {
	 * PIPPO.setCountry(alldata.getJSONObject(i).getString("Country")); }catch
	 * (JSONException e) { PIPPO.setCountry("No Country Found"); } try {
	 * PIPPO.setSlug(alldata.getJSONObject(i).get("Slug")); ArrayList<String> nomi =
	 * new ArrayList<String>; list.add(alldata.getJSONObject(i).get("Slug") }catch
	 * (JSONException e) { PIPPO.setSlug("No Slug"); } try {
	 * PIPPO.setISO2(alldata.getJSONObject(i).get("ISO2")); }catch (JSONException e)
	 * { PIPPO.setISO2("No ISO2"); }
	 * 
	 * }
	 */

	public static ArrayList<String> SlugTake (JSONObject json) {
		ArrayList<String> list = new ArrayList<String>();
		if (json != null) {
			JSONArray alldata = json.optJSONArray("alldata");
			if (alldata != null) {
				for (int i = 0; i < alldata.length; i++) {
					try {
						String name = alldata.getJSONObject(i).get("Slug");
						list.add(name);
					} catch (JSONException e) {

					}
				}
			}
		}
		
		return list;
	}

	
	public static ArrayList<String> DataTake(JSONObject json) {
		ArrayList<String> roster = new ArrayList<String>();
		if (json != null) {
			JSONArray alldata = json.optJSONArray("alldata");
			if (alldata != null) {
				for (int i = 0; i < alldata.length; i++) {
					try {
						String Pippo  = alldata.getJSONObject(i).get("Data");
						roster.add(Pippo);
					} catch (JSONException e) {

					}
				}
			}
		}
		return roster;
	}
	
	
	public static  JSONObject readURL2() {
		try {

			String myURL = URLservice.getURL(Slug);
			StringBuldier string = new StringBuilder();
			URL url = new URL(myURL);
			BufferedRader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String phrase = "";
			while ((phrase = reader.readLine()) != null) {
				string.append(phrase);
			}
			reader.close();
			JSONObject json = new JSONObject(string.toString());
			return json;
		} catch (Exception e) {
			return null;
		}
	}

}

public static <JSONObject> ArrayList<nation> JSONParser(JSONObject json) {
	ArrayList<nation> list = new ArrayList<nation>();
	
	if(json != null) {
		int i=0;
		nation COCA = new nation();
		JSONArray alldata = json.optJSONArray("alldata");
		if( alldata != null) {
			
			for(i = 0; i < alldata.length; i++) {
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
	}

}
