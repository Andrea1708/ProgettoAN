package OProject.ANSpringBootApp.JSON;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Service.URLservice;

public class JsonProcessing {

public static JSONArray readURL() throws JSONException {
	String inline = "";
	try {
		String myURL = "https://api.covid19api.com/countries";
		URL url = new URL(myURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.connect();
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			inline+=sc.nextLine();
		}
		sc.close();
		JSONArray jsonArr = new JSONArray(inline);
		conn.disconnect();
		// return dell'array
		return jsonArr;
		}catch(Exception e) {
		}
		return null;
		} 


		
		
public static void Parsing (JSONArray jsonArr, ArrayList<States> list){				
		
		for(int i=0; i < jsonArr.length();i++) 
		{
			States objval = new States();
			JSONObject json;
			json= (JSONObject) jsonArr.get(i);
			objval.setCountry((String)json.get("Country"));
			objval.setSlug((String)json.get("Slug"));
			objval.setISO2((String)json.get("ISO2"));
			list.add(objval);
		}
	
		}

public static ArrayList<String> SlugTake(JSONArray jsonArr){
	ArrayList<String> roster = new ArrayList<String>();
	if(jsonArr!= null) {
		for(int i=0; i< jsonArr.length(); i++) {
			try {
				String Slugs =(String) jsonArr.getJSONObject(i).get("Slug");
				roster.add(Slugs);
			}catch (JSONException e) {
				
			}
		}
	}
	System.out.println(roster);
	return roster;
}


public static JSONArray readURL2(String Name) throws JSONException {
	String inline = "";
	try {
		String myURL = URLservice.getURL(Name);
		URL url = new URL(myURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.connect();
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			inline+=sc.nextLine();
		}
		sc.close();
		JSONArray jsonArr2  = new JSONArray(inline);
		conn.disconnect();
		// stampa array con dentro la stringa
		System.out.println(jsonArr2);
		// return dell'array
		return jsonArr2;
		}catch(Exception e) {
		}
		return null;
		} 


		
		
public static void Parsing2 (JSONArray jsonArr2, ArrayList<Nation> list){				
		
		for(int i=0; i < jsonArr2.length();i++) 
		{
			Nation objval = new Nation();
			JSONObject json;
			json= (JSONObject) jsonArr2.get(i);
			objval.setCountry((String)json.get("Country"));
			objval.setCountryCode((String)json.get("CountryCode"));
			objval.setCity((String)json.get("City"));
			objval.setProvince((String)json.getString("Province"));
			objval.setCityCode((String)json.get("CityCode"));
			objval.setLat((int)json.get("Lat"));
			objval.setLon((int)json.get("Lon"));
			objval.setActive((int)json.get("Active"));
			objval.setDeaths((int)json.get("Deaths"));
			objval.setConfirmed((int)json.get("Confirmed"));
			objval.setRecovered((int)json.getInt("Recovered"));
			objval.setDate((String)json.get("Date"));
			list.add(objval);
		}
	}
}	





