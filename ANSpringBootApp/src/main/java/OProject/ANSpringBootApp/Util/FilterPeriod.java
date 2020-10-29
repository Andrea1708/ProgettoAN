package OProject.ANSpringBootApp.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FilterPeriod {

	
	
public static Date datemenagement (String data) throws ParseException 
	{
		Date mydate = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(data);
		return mydate;
	}

}



