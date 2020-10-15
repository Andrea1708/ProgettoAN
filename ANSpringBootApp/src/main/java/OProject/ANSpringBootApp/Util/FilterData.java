package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

public class FilterData {
	public static ArrayList<String> getListaDateNazioni(String data, String paese) {
		ArrayList<String> ListaNazioni = new ArrayList<String>();
		ArrayList<String> DateNazioni = new ArrayList<String>();
		ArrayList<String> PaesiDateSelezionati = new ArrayList<String>();
		//ArrayList<nation> DatiTrovati = new ArrayList<nation>();
		Json Cane = new Json();
		DateNazioni = Cane.DataTake();
		ListaNazioni = Cane.SlugTake();
		for (int i = 0; i < ListaNazioni.lenght; i++)
			for (int j = 0; j < DateNazioni.length; j++) {
				if (paese == ListaNazioni.get(i) && data == DateNazioni.get(j)) {
					PaesiDateSelezionati.add(ListaNazioni.get(i));
					PaesiDateSelezionati.add(DateNazioni.get(j));
					} /** else lanciare exception no date */
				} /** else lanciare exception NoCountry */
			}

	} return PaesiDateTrovati;
}
