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


/**public static ArrayList<Nation> datafil (String scelta , String data1, String data2) throws  ParseException {
	ArrayList<Nation> dv = new ArrayList<Nation>();
	if(((FilterPeriod.datemenagement(data1).after(FilterPeriod.datemenagement("2020-04-12T00:00:00Z"))))
		&&((FilterPeriod.datemenagement(data2).before(FilterPeriod.datemenagement("2020-05-07T00:00:00Z")))))
		
		{
			if(FilterPeriod.datemenagement(data1).after(FilterPeriod.datemenagement(data2)))
				{
						JsonParser.ParsingData(JsonProcessing.readURL2(scelta),dv, data1, data2);
					
				} 
		} 
		
		return dv;
	}**/
}



