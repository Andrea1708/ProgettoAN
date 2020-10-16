package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;


import org.json.JSONObject;

import OProject.ANSpringBootApp.JSON.JsonProcessing;


public class FilterLetter {
	public static ArrayList<String> getListaNazioni(String Letter){
	JSONObject json = new JSONObject(); 
	ArrayList<String> ListaNazioni = new ArrayList<String>();
	ArrayList<String> NazioniTrovate = new ArrayList<String>();
	JsonProcessing Prova = new JsonProcessing();
	ListaNazioni = Prova.SlugTake(json);
	for (int i=0; i < ListaNazioni.size() ; i++) {
		if(Letter == ListaNazioni.get(i))
			NazioniTrovate.add(ListaNazioni.get(i));
		}
	return NazioniTrovate;
	}
}