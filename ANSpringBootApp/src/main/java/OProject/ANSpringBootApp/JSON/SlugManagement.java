package OProject.ANSpringBootApp.JSON;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;


public class SlugManagement {
	
	/**
	 * Method that takes the State's attribute "Slug" and add it into an ArrayList<String>
	 * @param jsonArr
	 * @return ArrayList<String>
	 */
public static ArrayList<String> slugtake(JSONArray jsonArr){
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
			
			return roster;
		}
	
	/**
	 * Method that checks if the inserted Slug exists
	 * @param Line
	 * @param roster
	 */
	public static boolean slugcheck(String Line, ArrayList<String> roster) {
		roster = SlugManagement.slugtake(JsonProcessing.readURL());
		for (int i = 0; i < roster.size(); i++) {
			if (Line.equals(roster.get(i))) {
				System.out.println("Il Paese selezionato esiste");
				return true;
			}
		}
		return false;
		
	}
}














