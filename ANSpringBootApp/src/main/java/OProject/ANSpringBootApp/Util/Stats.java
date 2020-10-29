package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;


import OProject.ANSpringBootApp.Model.Nation;

public class Stats {
	
	private static ArrayList<String> allStats = new ArrayList<String>();


	public Stats()
	{
		
		allStats.add("media"); allStats.add("min"); allStats.add("max"); allStats.add("devStd"); allStats.add("var");
	}

	/**
	 * Method to calculate the media of the confirmed's cases
	 */

	public static float media(ArrayList<Nation> lf)
	{
		float media=0;
		int somma=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getConfirmed();
			somma+= numero1;
		}
		media = (float)somma/lf.size(); 
		return media;
	}

	/**
	 * Method to calculate the max of the confirmed's cases
	 */

	public static int max(ArrayList<Nation> lf)
	{
		int max=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getConfirmed();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}

	/**
	 * Method to calculate the minimum of the confirmed's cases
	 */

	public static int min(ArrayList<Nation> lf)
	{
		int min=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getConfirmed();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}

	/**
     * Method to calculate the variance of the confirmed's cases
     */

    public static double var(ArrayList<Nation> lista) {
        double media = media(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }

	 /**
     * Method to calculate the dev standard of the confirmed's cases
     */

    public static double devStd(ArrayList<Nation> lista) {
        return Math.sqrt(var(lista));
    }
}
