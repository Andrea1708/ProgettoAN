package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import OProject.ANSpringBootApp.JSON.JsonProcessing;


public class FilterSlug {

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
	
	
	public static boolean SlugCheck(String Line, ArrayList<String> roster) {
		roster = FilterSlug.SlugTake(JsonProcessing.readURL());
		for (int i = 0; i < roster.size(); i++) {
			if (Line.equals(roster.get(i))) {
				System.out.println("Il Paese selezionato esiste");
				return true;
			}
		}
		return false;
		
	}
	
}