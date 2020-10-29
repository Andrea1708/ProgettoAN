package OProject.ANSpringBootApp.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;


import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Util.Stats;

public class StatsService {
	
	
	/**
	 * Metodo che calcola le statistiche
	 */
	

	public static HashMap<String, Number> calculate (ArrayList<Nation> lf ,ArrayList<String> stats) 
			throws NoSuchMethodException, InvocationTargetException {

		//HashMap in cui inserire i valori delle statistiche richieste
		HashMap<String, Number> statistiche = new HashMap<String, Number>(); 

		statistiche.put("Totale Casi", lf.size());
		
		//la classe in cui sono contenuti i metodi per il calcolo delle statistiche
		Stats f = new Stats(); 
		
		//itero su tutte le statistiche richieste
		for(String string1 : stats ) 
		{
			Method method = null;
			
			try {
				//definisco il metodo
				method = f.getClass().getMethod(string1 , ArrayList.class);
				
				//inserisco la statistica e il valore calcolato tramite l'invocazione del metodo richiesto
				statistiche.put(string1 , (Number) method.invoke(f,lf) ); 
			} catch (SecurityException e) {

				e.printStackTrace();
				
			} catch (IllegalAccessException e) {

				e.printStackTrace();
				
			} catch (IllegalArgumentException e) {

				e.printStackTrace();
			}
		}

		return statistiche;
	}


}

