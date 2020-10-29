package OProject.ANSpringBootApp.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Util.Stats;

public class StatsService {
	
	
	/**
	 * Metodo che calcola le statistiche
	 */
	

	public static HashMap<String, Number> calculate (List<Nation> lf ,List<String> stats) throws NoSuchMethodException, InvocationTargetException {

		//HashMap in cui inserire i valori delle statistiche richieste
		HashMap<String, Number> statistiche = new HashMap<String, Number>(); 

		statistiche.put("Casi confermati: ", lf.size());
		
		//la classe in cui sono contenuti i metodi per il calcolo delle statistiche
		Stats f = new Stats(); 
		
		//itero su tutte le statistiche richieste
		for(String string1 : stats ) 
		{
			Method method = null;
			
			try {
				//definisco il metodo
				method = f.getClass().getMethod(string1 , List.class);
				
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

