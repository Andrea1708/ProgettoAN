package OProject.ANSpringBootApp.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;


import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Util.Stats;

public class StatsService {
	
	
	/**
	 * Creating an Hashmap, inserting in it the stats and their values
	 * @param listnation    ArrayList of Nation
	 * @param mystats		ArrayList of String
	 * @return Hashmap of String and Number
	 * @throws NoSuchMethodException exception generate
	 * @throws InvocationTargetException exception generate
	 */
	

public static HashMap<String, Number> statsmanager (ArrayList<Nation> listnation ,ArrayList<String> mystats) 
			throws NoSuchMethodException, InvocationTargetException {

	HashMap<String, Number> infostats = new HashMap<String, Number>(); 
	infostats.put("All Cases", listnation.size());
	Stats f = new Stats(); 
		for(String string1 : mystats ) 
		{
			Method method = null;
			try {
				method = f.getClass().getMethod(string1 , ArrayList.class);
				infostats.put(string1 , (Number) method.invoke(f,listnation) ); 
				} catch (SecurityException e) {
					
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					
					e.printStackTrace();
				} catch (IllegalArgumentException e) {

				e.printStackTrace();
			}
		}

		return infostats;
	}


}

