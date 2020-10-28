package OProject.ANSpringBootApp.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

import OProject.ANSpringBootApp.Util.Stats;

public class StatsService {
	
	/**
	 * Metodo che calcola le statistiche
	 */

	public static HashMap<String, Number> calculate(List<Follower> lf ,List<String> stats) throws NoSuchMethodException, InvocationTargetException {

		HashMap<String, Number> statistiche = new HashMap<String, Number>(); //HashMap in cui inserire i valori delle statistiche richieste

		statistiche.put("Casi confermati: ", lf.size());

		Stats f = new Stats(); //la classe in cui sono contenuti i metodi per il calcolo delle statistiche

		if(stats.size()==0)
		{
			stats.addAll(Stats.getAllStats());  //se la lista è vuota, vengono fornite tutte le statistiche disponibili
		}


		for(String stringa2 : stats ) //itero su tutte le statistiche richieste
		{
			Method method = null;
			try {
				method = f.getClass().getMethod(stringa2,List.class); //definisco il metodo

				statistiche.put(stringa2, (Number) method.invoke(f,lf) ); //inseriscola statistica e il valore calcolato tramite l'invocazione del metodo richiesto

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

}
