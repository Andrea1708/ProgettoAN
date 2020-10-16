package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import org.json.JSONObject;

import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.nation;

public class FilterData {
	public static ArrayList<String> getListaDateNazioni(String data, String paese) {
		JSONObject jsonin = new JSONObject();
		JSONObject jsonin2= new JSONObject();
		ArrayList<String> ListaNazioni = new ArrayList<String>();
		ArrayList<String> DateNazioni = new ArrayList<String>();
		ArrayList<String> PaesiDateSelezionati = new ArrayList<String>();
		JsonProcessing Cane = new JsonProcessing();
		DateNazioni = Cane.DataTake(jsonin);
		ListaNazioni = Cane.SlugTake(jsonin2);
		for (int i = 0; i < ListaNazioni.size(); i++)
			for (int j = 0; j < DateNazioni.size(); j++) {
				if (paese == ListaNazioni.get(i) && data == DateNazioni.get(j)) {
					PaesiDateSelezionati.add(ListaNazioni.get(i));
					PaesiDateSelezionati.add(DateNazioni.get(j));
				} /** else lanciare exception no date */
			} /** else lanciare exception NoCountry */

		return PaesiDateSelezionati;
	}
	
public static ArrayList<nation> getInformation (String data, String paese){
	 nation PaeseCercato = new nation();
	 PaeseCercato.setCountry(paese);
	 PaeseCercato.setDate(data);
	 


	
	} 
}
