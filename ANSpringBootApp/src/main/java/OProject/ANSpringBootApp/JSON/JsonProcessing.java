package OProject.ANSpringBootApp.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import org.json.*;


import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Service.URLservice;

public class JsonProcessing {


public static JSONObject readURL() {
	try{
		String myURL = "https://api.covid19api.com/countries";
		StringBuilder string = new StringBuilder();
		URL url = new URL(myURL);
		BufferedReader reader= new BufferedReader(new InputStreamReader(url.openStream()));
		String phrase="";
		while((phrase = reader.readLine()) != null) {
			string.append(phrase);
		}
			reader.close();
			JSONObject json = new JSONObject(string.toString());
			return json;
		}catch (Exception e) {
			return null;
		}
	}

public static ArrayList<States> JSONParser(JSONObject json) {
	ArrayList<States> roster = new ArrayList<States>();
	if (json != null) {
		JSONArray alldata = json.optJSONArray("/countriesRoute/");
		if (alldata != null) {
			for (int i = 0; i < alldata.length(); i++) {
				States Pippo = new States();
				try {
					Pippo.setCountry(alldata.getJSONObject(i).getString("Country"));
				}catch (JSONException e) {
					Pippo.setCountry("No Country Found");
				}
				try {
					Pippo.setSlug(alldata.getJSONObject(i).getString("Slug"));
				}catch (JSONException e) {
					Pippo.setSlug("No Slug");
				}
				try {
					Pippo.setISO2(alldata.getJSONObject(i).getString("ISO2"));
				}catch (JSONException e) {
					Pippo.setSlug("No Slug");
				}
				roster.add(Pippo);
		}
	}
}
	return roster;
}	


public static JSONObject readURL2() {
		try {
		String myURL = URLservice.getURL("Slug"); //verificare questa chiamata//
		StringBuilder line = new StringBuilder();
		URL url = new URL(myURL);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String phrase = "";
		while ((phrase = reader.readLine()) != null) {
			line.append(phrase);
		}
			reader.close();
			JSONArray alldata;
			JSONObject json2 = new JSONObject(line.toString());
			return json2;
		}catch (Exception e) {
			return null;
		}
	}

public static ArrayList<Nation> JSONParser2(JSONObject json2) {
ArrayList<Nation> list = new ArrayList<Nation>();
if(json2 != null) {
	JSONArray alldata = json2.optJSONArray("");
	if( alldata != null) {
		for(int i = 0; i < alldata.length(); i++) {
			Nation COCA = new Nation();
			json2 = (JSONObject) alldata.get(i);
			COCA.setCountry((String) json2.getString("Country"));
			COCA.setConfirmed((int) json2.get("Confirmed"));
			COCA.setActive((long) json2.get("Active"));
			COCA.setRecovered((long) json2.get("Recovered"));
			COCA.setDeaths((long) json2.get("Deaths"));
			COCA.setDate((String) json2.get("Date"));
			list.add(COCA);
		}
			}
		}
	return list;
	}
}


	
