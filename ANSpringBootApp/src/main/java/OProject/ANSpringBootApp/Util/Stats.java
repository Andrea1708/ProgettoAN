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
	 * Method that calculate the media of the confirmed's cases
	 * @param ln ArrayList of Nation
	 * @return float
	 */

	public static float mediaConfirmed(ArrayList<Nation> ln)
	{
		float media=0;
		int somma=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getConfirmed();
			somma+= numero1;
		}
		media = (float)somma/ln.size(); 
		return media;
	}
	
	/**
	 * Method that calculate the media of the active's cases
	 * @param ln ArrayList of Nation
	 * @return float
	 */
	
	public static float mediaActive(ArrayList<Nation> ln)
	{
		float media=0;
		int somma=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getActive();
			somma+= numero1;
		}
		media = (float)somma/ln.size(); 
		return media;
	}
	
	/**
	 * Method that calculate the media of the deaths's cases 
	 * @param ln ArrayList of Nation
	 * @return float
	 */
	public static float mediaDeaths(ArrayList<Nation> ln)
	{
		float media=0;
		int somma=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getDeaths();
			somma+= numero1;
		}
		media = (float)somma/ln.size(); 
		return media;
	}
	
	/**
	 * Method that calculate the media of the recovered's cases
	 * @param ln ArrayList of Nation
	 * @return float
	 */
	public static float mediaRecovered(ArrayList<Nation> ln)
	{
		float media=0;
		int somma=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getRecovered();
			somma+= numero1;
		}
		media = (float)somma/ln.size(); 
		return media;
	}
	
	/**
	 * Method that calculate the max of the confirmed's cases
	 * @param ln ArrayList of Nation
	 * @return int
	 */

	public static int maxConfirmed(ArrayList<Nation> ln)
	{
		int max=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getConfirmed();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}
	
	/**
	 * Method that calculate the max of the active's cases
	 * @param ln ArrayList of Nation
	 * @return int 
	 */

	public static int maxActive(ArrayList<Nation> ln)
	{
		int max=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getActive();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}
	
	/**
	 * Method that calculate the max of the recovered's cases
	 * @param ln ArrayList of Nation
	 * @return int
	 */

	public static int maxRecovered(ArrayList<Nation> ln)
	{
		int max=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getRecovered();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}
	
	/**
	 * Method that calculate the max of the death's cases
	 * @param ln ArrayList of Nation
	 * @return int 
	 */

	public static int maxDeaths(ArrayList<Nation> ln)
	{
		int max=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getDeaths();
			if( numero1 > max ) max = numero1;
		}

		return max;
	}

	/**
	 * Method that calculate the minimum of the confirmed's cases
	 * @param ln ArrayList of Nation
	 * @return int 
	 */

	public static int minConfirmed(ArrayList<Nation> ln)
	{
		int min=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getConfirmed();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	
	/**
	 * Method that calculate the minimum of the active's cases
	 * @param ln ArrayList of Nation
	 * @return int
	 */

	public static int minActive(ArrayList<Nation> ln)
	{
		int min=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getActive();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	
	/**
	 * Method that calculate the minimum of the death's cases
	 * @param ln ArrayList of Nation
	 * @return int
	 */

	public static int minDeaths(ArrayList<Nation> ln)
	{
		int min=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getDeaths();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}
	
	/**
	 * Method that calculate the minimum of the recovered's cases
	 * @param ln ArrayList of Nation
	 * @return int
	 */

	public static int minRecovered(ArrayList<Nation> ln)
	{
		int min=0;
		for(Nation nation : ln)
		{
			Integer numero1 = nation.getRecovered();
			if( numero1 < min ) min = numero1;
		}
		return min;
	}

	/**
	 * Method that calculate the variance of the confirmed's cases
	 * @param mylist ArrayList of Nation
	 * @return double
	 */

    public static double varConfirmed(ArrayList<Nation> mylist) {
        double media = mediaConfirmed(mylist);
        double varianza = 0;
        for (Nation nation : mylist) {
            varianza += Math.pow(nation.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
   /**
    * Method that calculate the variance of the active's cases
    * @param mylist ArrayList of Nation
    * @return double 
    */

    public static double varActive(ArrayList<Nation> mylist) {
        double media = mediaActive(mylist);
        double varianza = 0;
        for (Nation nation : mylist) {
            varianza += Math.pow(nation.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
    /**
     * Method that calculate the variance of the deaths's cases
     * @param mylist ArrayList of Nation
     * @return double
     */

    public static double varDeaths(ArrayList<Nation> mylist) {
        double media = mediaDeaths(mylist);
        double varianza = 0;
        for (Nation nation : mylist) {
            varianza += Math.pow(nation.getConfirmed() - media, 2);
        }
        return varianza;
    }
    
    /**
     * Method that calculate the variance of the recovered's cases
     * @param mylist ArrayList of Nation
     * @return double
     */

    public static double varRecovered(ArrayList<Nation> mylist) {
        double media = mediaRecovered(mylist);
        double varianza = 0;
        for (Nation nation : mylist) {
            varianza += Math.pow(nation.getConfirmed() - media, 2);
        }
        return varianza;
    }

	/**
	 * Method that calculate the dev standard of the confirmed's cases
	 * @param mylist ArrayList of Nation
	 * @return double
	 */

    public static double devStdConfirmed(ArrayList<Nation> mylist) {
        return Math.sqrt(varConfirmed(mylist));
    }
    
    /**
     * Method that calculate the dev standard of the active's cases
     * @param mylist ArrayList of Nation
     * @return double
     */

    public static double devStdActive(ArrayList<Nation> mylist) {
        return Math.sqrt(varActive(mylist));
    }
    
    /**
     * Method that calculate the dev standard of the deaths's cases
     * @param mylist ArrayList of Nation
     * @return double
     */

    public static double devStdDeaths(ArrayList<Nation> mylist) {
        return Math.sqrt(varDeaths(mylist));
    }
    
    /**
     * Method that calculate the dev standard of the recovered's cases
     * @param mylist ArrayList of Nation
     * @return double
     */

    public static double devStdRecovered(ArrayList<Nation> mylist) {
        return Math.sqrt(varRecovered(mylist));
    }
}
