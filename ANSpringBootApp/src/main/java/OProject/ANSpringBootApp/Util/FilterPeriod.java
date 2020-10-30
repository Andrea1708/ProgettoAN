package OProject.ANSpringBootApp.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FilterPeriod {

/**
 * Method that convert the type of the input in the type Date
 * @param data
 * @return Date
 * @throws ParseException
 */
	
public static Date datemenagement (String data) throws ParseException 
	{
		Date mydate = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(data);
		return mydate;
	}

}



