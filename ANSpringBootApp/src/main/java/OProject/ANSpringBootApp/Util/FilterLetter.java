package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;
import java.util.List;
import OProject.ANSpringBootApp.JSON.Json;
import OProject.ANSpringBootApp.Model.nation;

public class FilterLetter {
	public static ArrayList<String> getListaNazioni(String Letter){
	ArrayList<String> ListaNazioni = new ArrayList<String>();
	ArrayList<String> NazioniTrovate = new ArrayList<String>();
	Json Prova = new Json();
	ListaNazioni = Prova.SlugTake();
	for (int i=0; i < ListaNazioni.lenght; i++) {
		if(Letter == ListaNazioni.get(i))
			NazioniTrovate.add(ListaNazioni.get(i));
		}
	System.out.print("Le nazioni trovate sono:"+NazioniTrovate);
	}
}