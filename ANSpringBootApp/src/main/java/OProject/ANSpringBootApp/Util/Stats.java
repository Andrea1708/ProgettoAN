package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;


import OProject.ANSpringBootApp.Model.Nation;

public class Stats {
	
	private static ArrayList<String> TotalStats = new ArrayList<String>();


	public Stats()
	{
		
		TotalStats.add("mediaConfirmed"); TotalStats.add("mediaActive"); TotalStats.add("mediaRecovered"); TotalStats.add("mediaDeaths");
		TotalStats.add("minConfirmed"); TotalStats.add("minActive"); TotalStats.add("minRecovered");  TotalStats.add("minDeaths");
		TotalStats.add("maxConfirmed"); TotalStats.add("maxActive"); TotalStats.add("maxRecovered");  TotalStats.add("maxDeaths");
		TotalStats.add("devStdConfirmed"); TotalStats.add("devStdActive"); TotalStats.add("devStdRecovered"); TotalStats.add("devStdDeaths");
		TotalStats.add("varConfirmed"); TotalStats.add("varActive"); TotalStats.add("varRecovered"); TotalStats.add("varDeaths");
	}

	/**
	 * Method to calculate the media of the confirmed's cases
	 */

	public static float mediaConfirmed(ArrayList<Nation> lf)
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
	 * Method to calculate the media of the active's cases
	 */
	
	public static float mediaActive(ArrayList<Nation> lf)
	{
		float media=0;
		int somma=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getActive();
			somma+= numero1;
		}
		media = (float)somma/lf.size(); 
		return media;
	}
	/**
	 *  Method to calculate the media of the deaths's cases 
	 */
	public static float mediaDeaths(ArrayList<Nation> lf)
	{
		float media=0;
		int somma=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getDeaths();
			somma+= numero1;
		}
		media = (float)somma/lf.size(); 
		return media;
	}
	/**
	 *  Method to calculate the media of the recovered's cases
	 */
	public static float mediaRecovered(ArrayList<Nation> lf)
	{
		float media=0;
		int somma=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getRecovered();
			somma+= numero1;
		}
		media = (float)somma/lf.size(); 
		return media;
	}
	/**
	 * Method to calculate the max of the confirmed's cases
	 */

	public static int maxConfirmed(ArrayList<Nation> lf)
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
	 * Method to calculate the max of the active's cases
	 */

	public static int maxActive(ArrayList<Nation> lf)
	{
		int max=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getActive();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}
	
	/**
	 * Method to calculate the max of the recovered's cases
	 */

	public static int maxRecovered(ArrayList<Nation> lf)
	{
		int max=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getRecovered();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}
	
	/**
	 * Method to calculate the max of the death's cases
	 */

	public static int maxDeaths(ArrayList<Nation> lf)
	{
		int max=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getDeaths();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}

	/**
	 * Method to calculate the minimum of the confirmed's cases
	 */

	public static int minConfirmed(ArrayList<Nation> lf)
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
	 * Method to calculate the minimum of the active's cases
	 */

	public static int minActive(ArrayList<Nation> lf)
	{
		int min=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getActive();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	
	/**
	 * Method to calculate the minimum of the death's cases
	 */

	public static int minDeaths(ArrayList<Nation> lf)
	{
		int min=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getDeaths();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	
	/**
	 * Method to calculate the minimum of the recovered's cases
	 */

	public static int minRecovered(ArrayList<Nation> lf)
	{
		int min=0;
		for(Nation f : lf)
		{
			Integer numero1 = f.getRecovered();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	/**
     * Method to calculate the variance of the confirmed's cases
     */

    public static double varConfirmed(ArrayList<Nation> lista) {
        double media = mediaConfirmed(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
    /**
     * Method to calculate the variance of the active's cases
     */

    public static double varActive(ArrayList<Nation> lista) {
        double media = mediaActive(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
    /**
     * Method to calculate the variance of the deaths's cases
     */

    public static double varDeaths(ArrayList<Nation> lista) {
        double media = mediaDeaths(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
    /**
     * Method to calculate the variance of the recovered's cases
     */

    public static double varRecovered(ArrayList<Nation> lista) {
        double media = mediaRecovered(lista);
        double varianza = 0;
        for (Nation f : lista) {
            varianza += Math.pow(f.getConfirmed() - media, 2);
        }
        return varianza;
    }

	 /**
     * Method to calculate the dev standard of the confirmed's cases
     */

    public static double devStdConfirmed(ArrayList<Nation> lista) {
        return Math.sqrt(varConfirmed(lista));
    }
    
    /**
     * Method to calculate the dev standard of the active's cases
     */

    public static double devStdActive(ArrayList<Nation> lista) {
        return Math.sqrt(varActive(lista));
    }
    
    /**
     * Method to calculate the dev standard of the deaths's cases
     */

    public static double devStdDeaths(ArrayList<Nation> lista) {
        return Math.sqrt(varDeaths(lista));
    }
    
    /**
     * Method to calculate the dev standard of the recovered's cases
     */

    public static double devStdRecovered(ArrayList<Nation> lista) {
        return Math.sqrt(varRecovered(lista));
    }
}
