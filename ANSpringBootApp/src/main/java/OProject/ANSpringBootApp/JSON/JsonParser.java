package OProject.ANSpringBootApp.JSON;

import java.text.ParseException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Util.FilterPeriod;

public class JsonParser {
	/**
	 * Method that convert an input file json in a ArrayList<States>
	 * @param jsonArr
	 * @param list
	 */
	
public static void parsing (JSONArray jsonArr, ArrayList<States> list){				
	
	for(Object a : jsonArr)
	
	{
		States objval = new States();
		JSONObject json;
		json= (JSONObject) a; 
		objval.setCountry((String)json.get("Country"));
		objval.setSlug((String)json.get("Slug"));
		objval.setISO2((String)json.get("ISO2"));
		list.add(objval);
	}

}
	/**
	 * Method that convert an input file json in a ArrayList<States>
	 * @param jsonArr2
	 * @param list
	 */


public static void parsing2 (JSONArray jsonArr2, ArrayList<Nation> list){				

	for(Object b :jsonArr2)
	
	{
		
		Nation objnum = new Nation();
		JSONObject json;
		json= (JSONObject) b; 
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
	/**
	 * Method that check the correct data's input and convert an input file json in a ArrayList<Nation> 
	 * @param jsonData
	 * @param list
	 * @param datainizio
	 * @param datafine
	 * @throws ParseException
	 */

public static void parsingdata(JSONArray jsonData, ArrayList<Nation> list, String datainizio, String datafine) throws ParseException {
	for(Object c: jsonData)
	{
		Nation obj = new Nation();
		JSONObject objson;
		objson= (JSONObject) c; 
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
