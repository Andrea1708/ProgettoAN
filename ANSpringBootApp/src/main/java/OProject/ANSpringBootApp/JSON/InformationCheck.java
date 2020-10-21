package OProject.ANSpringBootApp.JSON;

import java.util.ArrayList;

import OProject.ANSpringBootApp.Model.Nation;

public class InformationCheck {

	public static boolean SlugCheck(String Slug, ArrayList<String> roster) {

		for (int i = 0; i < roster.size(); i++) {
			if (Slug == roster.get(i)) {
				return true;
			}
		}
		return false;

	}
	
	public static ArrayList<Nation> DataCheck(String Slug) {
		ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		ArrayList<String> list = new ArrayList<String>();
		list = JsonProcessing.SlugTake(JsonProcessing.readURL());
		if(InformationCheck.SlugCheck(Slug, list) == true)
		{
			JsonProcessing.Parsing2(JsonProcessing.readURL2(), PaeseSelezionato);
		}return PaeseSelezionato;
	} 
}
