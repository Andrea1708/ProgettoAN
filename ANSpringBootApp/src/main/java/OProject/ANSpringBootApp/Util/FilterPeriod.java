package OProject.ANSpringBootApp.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import OProject.ANSpringBootApp.Model.Nation;

public class FilterPeriod {

	
	
public static Date datemenagement (String datastring) throws ParseException 
	{
		Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(datastring);
		return date1;
	}

}


