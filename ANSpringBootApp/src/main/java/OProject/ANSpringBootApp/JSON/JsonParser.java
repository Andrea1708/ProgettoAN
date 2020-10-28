package OProject.ANSpringBootApp.JSON;

import java.text.ParseException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Util.FilterPeriod;

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

	for(int j=0; j < jsonArr2.length() ; j++) 
	{
		
		Nation objnum = new Nation();
		JSONObject json;
		json= (JSONObject) jsonArr2.get(j);
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

public static void ParsingData(JSONArray jsonData, ArrayList<Nation> list, String datainizio, String datafine) throws ParseException {
	for(int i=0; i<jsonData.length(); i++) 
	{
		Nation obj = new Nation();
		JSONObject objson;
		objson= (JSONObject) jsonData.get(i);
		if(((FilterPeriod.datemenagement((String)objson.get("Date"))).after(FilterPeriod.datemenagement(datainizio))
		||((FilterPeriod.datemenagement((String)objson.get("Date"))).equals(FilterPeriod.datemenagement(datainizio))))
		&&((FilterPeriod.datemenagement((String)objson.get("Date")).before(FilterPeriod.datemenagement(datafine)))
		||((FilterPeriod.datemenagement((String)objson.get("Date"))).equals(FilterPeriod.datemenagement(datafine)))))
		{
			obj.setCountry((String)objson.get("Country"));
			obj.setCountryCode((String)objson.get("CountryCode"));
			obj.setLat((String)objson.get("Lat"));
			obj.setLon((String)objson.get("Lon"));
			obj.setActive((Integer)objson.get("Active"));
			obj.setDeaths((Integer)objson.get("Deaths"));
			obj.setConfirmed((Integer)objson.get("Confirmed"));
			obj.setRecovered((Integer)objson.get("Recovered"));
			obj.setDate((String)objson.get("Date"));
			list.add(obj);
		}
	}
}







}
