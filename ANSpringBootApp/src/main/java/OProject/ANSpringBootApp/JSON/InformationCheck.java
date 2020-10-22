package OProject.ANSpringBootApp.JSON;

import java.util.ArrayList;

import OProject.ANSpringBootApp.Model.Nation;

public class InformationCheck {

	public static boolean SlugCheck(String Line, ArrayList<String> roster) {

		for (int i = 0; i < roster.size(); i++) {
			if (Line == roster.get(i)) {
				return true;
			}
		}
		return false;

	}
	
	public static ArrayList<Nation> DataCheck(String SLUG) {
		ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		ArrayList<String> list = new ArrayList<String>();
		list = JsonProcessing.SlugTake(JsonProcessing.readURL());
		if(InformationCheck.SlugCheck(SLUG , list) == true)
		{
			JsonProcessing.Parsing2(JsonProcessing.readURL2(), PaeseSelezionato);
		}return PaeseSelezionato;
	} 
}
