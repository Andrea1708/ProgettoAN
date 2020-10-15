package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import OProject.ANSpringBootApp.JSON.Json;
import OProject.ANSpringBootApp.Model.nation;

public class FilterData {
	public static ArrayList<String> getListaDateNazioni(String data, String paese) {
		ArrayList<String> ListaNazioni = new ArrayList<String>();
		ArrayList<String> DateNazioni = new ArrayList<String>();
		ArrayList<String> PaesiDateSelezionati = new ArrayList<String>();
		Json Cane = new Json();
		DateNazioni = Cane.DataTake();
		ListaNazioni = Cane.SlugTake();
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
	return PaeseCercato;

}
