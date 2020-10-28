package OProject.ANSpringBootApp.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;

import OProject.ANSpringBootApp.JSON.JsonParser;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;



public class FilterPeriod {

	
	
public static Date datemenagement (String data) throws ParseException 
	{
		Date mydate = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").parse(data);
		return mydate;
	}
}


