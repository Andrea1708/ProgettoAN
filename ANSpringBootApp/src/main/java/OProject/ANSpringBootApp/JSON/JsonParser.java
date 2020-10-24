package OProject.ANSpringBootApp.JSON;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

public class JsonParser {
	
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


public static void Parsing2 (JSONArray jsonArr2, ArrayList<Nation> list){				
	
	for(int i=0; i < jsonArr2.length(); i++) 
	{
		
		Nation objnum = new Nation();
		JSONObject json;
		json= (JSONObject) jsonArr2.get(i);
		objnum.setCountry((String)json.get("Country"));
		objnum.setCountryCode((String)json.get("CountryCode"));
		objnum.setLat((String)json.get("Lat"));
		objnum.setLon((String)json.get("Lon"));
		objnum.setActive((Integer)json.get("Active"));
		objnum.setDeaths((Integer)json.get("Deaths"));
		objnum.setConfirmed((Integer)json.get("Confirmed"));
		objnum.setRecovered((Integer)json.get("Recovered"));
		objnum.setDate((String)json.get("Date"));
		list.add(objnum);
	}
}

public static void Parsing3 (JSONArray jsonArr3, ArrayList<Nation> list){				
	
	for(int i=0; i < jsonArr3.length(); i++) 
	{
		Nation objnum = new Nation();
		JSONObject json;
		json= (JSONObject) jsonArr3.get(i);
		objnum.setCountry((String)json.get("Country"));
		objnum.setCountryCode((String)json.get("CountryCode"));
		objnum.setLat((String)json.get("Lat"));
		objnum.setLon((String)json.get("Lon"));
		objnum.setActive((Integer)json.get("Active"));
		objnum.setDeaths((Integer)json.get("Deaths"));
		objnum.setConfirmed((Integer)json.get("Confirmed"));
		objnum.setRecovered((Integer)json.get("Recovered"));
		objnum.setDate((String)json.get("Date"));
		list.add(objnum);
	}
}








}
