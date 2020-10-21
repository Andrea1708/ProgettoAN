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
		// stampa array con dentro la stringa
		System.out.println(jsonArr);
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

}



/**
 * public static JSONObject readrUrl3() throws IOException { try { String myURL=
 * "https://api.covid19api.com/countries"; StringBuilder string = new
 * StringBuilder(); URL url = new URL (myURL); BufferedReader reader = new
 * BufferedReader(new InputStreamReader(url.openStream())); String phrase= "";
 * while((phrase= reader.readLine()) != null) { string.append(phrase); }
 * reader.close(); JSONObject json = new JSONObject (string.toString()); return
 * json; } catch (Exception e) { return null; } }
 * 
 * /**public static ArrayList<States> JSONParser(JSONObject json) {
 * ArrayList<States> list = new ArrayList<States>();
 * 
 * if(json != null) { JSONArray alldata = json.optJSONArray("countriesRoute");
 * if( alldata != null) { for(int i = 0; i < alldata.length(); i++) { States
 * COCA = new States(); try {
 * COCA.setCountry(alldata.getJSONObject(i).getString("Country")); }catch
 * (JSONException e) { COCA.setCountry("No Country Found"); } try {
 * COCA.setSlug(alldata.getJSONObject(i).getString("Slug")); }catch
 * (JSONException e) { COCA.setSlug(null); } try {
 * COCA.setISO2(alldata.getJSONObject(i).getString("ISO2")); }catch
 * (JSONException e) { COCA.setISO2(null); } list.add(COCA); } } } return list;
 * 
 **/

/**
 * public static String readURL2() throws IOException { //verificare questa
 * chiamata// URL url = new URL(myindex); URLConnection URLcon =
 * url.openConnection(); BufferedReader reader= new BufferedReader(new
 * InputStreamReader(URLcon.getInputStream())); String inline; String
 * exitphrase=""; while((inline = reader.readLine()) != null) exitphrase =
 * exitphrase+inline; reader.close(); return exitphrase;
 * 
 * }
 **/
