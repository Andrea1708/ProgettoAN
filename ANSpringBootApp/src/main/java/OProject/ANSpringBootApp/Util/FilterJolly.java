package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.JSON.SlugManagement;


public class FilterJolly {
	
public static ArrayList<String> jollyletter (char a) {
	String Name= "";
	char c1;
	ArrayList<String> Results = new ArrayList<String>();
	ArrayList<String> RS = new ArrayList<String>();
	RS = SlugManagement.SlugTake(JsonProcessing.readURL());
	for (int i=0; i < RS.size(); i++) {                  // dobbiamo trasformarlo in un for each
		Name = RS.get(i);  								
		c1 = Name.charAt(0);
		if(a == c1)
			Results.add(Name);
		}
	
	   return Results;
}

}
