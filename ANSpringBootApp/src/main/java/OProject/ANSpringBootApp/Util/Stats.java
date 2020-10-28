package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;
import java.util.List;

import OProject.ANSpringBootApp.Model.Nation;

public class Stats {
	
	private static List<String> allStats = new ArrayList<String>();

	// costruttore di Stats


	public Stats()
	{
		 allStats.add("media"); allStats.add("min"); allStats.add("max"); allStats.add("devStd"); allStats.add("var");
	}

	// metodo per ottenere tutte le statistiche

	public static List<String> getAllStats()
	{
		return allStats;
	}

	/**
	 * Metodo per calcolare la media dei casi confermati
	 */

	public static float media(List<Nation> lf)
	{
		float media=0;
		int sum=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getConfirmed();
			sum+= numero1;
		}
		media = (float)sum/lf.size(); 
		return media;
	}

	/**
	 * Metodo per calcolare il numero massimo di casi confermati
	 */

	public static int max(List<Nation> lf)
	{
		int max=0;
		for(Nation f : lf)
		{
			Integer  = f.getConfirmed();
			if(stringa2.length()>max) max = stringa2.length();
		}

		return max;
	}

	/**
	 * Metodo per calcolare il numero minimo di casi confermati
	 */

	public static int min(List<Nation> lf)
	{
		int min=lf.get(0).getLocation().length();
		for(Nation f : lf)
		{
			Integer stringa2 = f.getConfirmed();
			if(stringa2.length()<min) min = stringa2.length();
		}
		return min;
	}

	/**
     * Metodo per calcolare la varianza sul numero dei casi confermati
     */

    public static double var(List<Nation> lista) {
        double media = media(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }

	 /**
     * Metodo per calcolare la deviazione standard sul numero dei casi confermati
     */

    public static double devStd(List<Nation> lista) {
        return Math.sqrt(var(lista));
    }
}

}
