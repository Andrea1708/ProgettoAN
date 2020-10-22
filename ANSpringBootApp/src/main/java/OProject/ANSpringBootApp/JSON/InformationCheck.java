package OProject.ANSpringBootApp.JSON;


	import java.util.ArrayList;

	import OProject.ANSpringBootApp.Model.Nation;
	import OProject.ANSpringBootApp.Service.URLservice;

	public class InformationCheck {

public static boolean SlugCheck(String Line, ArrayList<String> roster) {
			roster = JsonProcessing.SlugTake(JsonProcessing.readURL());
			for (int i = 0; i < roster.size(); i++) {
				if (Line.equals(roster.get(i))) {
					System.out.println("Il Paese selezionato esiste");
					return true;
				}
			}
			System.out.println("Il Paese selezionato non esiste");
			return false;

		}
	}


