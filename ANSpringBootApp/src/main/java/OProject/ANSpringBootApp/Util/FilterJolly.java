package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import OProject.ANSpringBootApp.Exception.IncorrectLetter;
import OProject.ANSpringBootApp.Exception.Notenought;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.JSON.SlugManagement;



public class FilterJolly {
	

	public static ArrayList<String> jollyletter (String LetterChosen) {
		String Name= "";
		char c1;
		ArrayList<String> Results = new ArrayList<String>();
		ArrayList<String> RS = new ArrayList<String>();
		RS = SlugManagement.SlugTake(JsonProcessing.readURL());
		for(String indicator: RS) {
			Name = indicator;  								
			c1 = Name.charAt(0);
			if(LetterChosen.charAt(0)== c1)
				Results.add(Name);
			}
			if (Results.size() > 10)
				throw new Notenought();
			
		   return Results;
	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
