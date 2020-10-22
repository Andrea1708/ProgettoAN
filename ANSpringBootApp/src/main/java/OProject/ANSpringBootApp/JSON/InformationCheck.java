package OProject.ANSpringBootApp.JSON;

import java.util.ArrayList;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Service.URLservice;

public class InformationCheck {

public static boolean SlugCheck(String Line, ArrayList<String> roster) {

		for (int i = 0; i < roster.size(); i++) {
			if (Line == roster.get(i)) {
				System.out.println("Il Paese selezionato esiste");
				return true;
			}
		}
		System.out.println("Il Paese selezionato non esiste");
		return false;

	}
	
	
	
public static ArrayList<Nation> DataCheck(String Slug) {
	ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
	ArrayList<String> list = new ArrayList<String>();
	list = JsonProcessing.SlugTake(JsonProcessing.readURL());
	URLservice.getURL(Slug);
	JsonProcessing.readURL2(Slug);
	if(InformationCheck.SlugCheck(Slug, list))
		JsonProcessing.Parsing2(JsonProcessing.readURL2(Slug), PaeseSelezionato);
		return PaeseSelezionato;
	} 
}
