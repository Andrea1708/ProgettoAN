package OProject.ANSpringBootApp.Controller;



import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import OProject.ANSpringBootApp.Exception.ExceptionManager;
import OProject.ANSpringBootApp.Exception.Exception_Err;
import OProject.ANSpringBootApp.Exception.NoCountry;
import OProject.ANSpringBootApp.Exception.NoDate;
import OProject.ANSpringBootApp.JSON.JsonParser;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.JSON.SlugManagement;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Service.StatsService;
import OProject.ANSpringBootApp.Util.FilterJolly;
import OProject.ANSpringBootApp.Util.FilterPeriod;



@RestController
public class Controller {
	
	/**
	 * management of the route "/countries" that return the dataset
	 * @Param Country country's name
	 * @Param Slug    name to write in the rest
	 * @Param ISO2    cod of each country
	 */
@RequestMapping(value="/countries", method = RequestMethod.GET)
public ArrayList<States> getallcountries() 
{
		ArrayList<States> Nomi = new ArrayList<States>();
		JsonParser.parsing(JsonProcessing.readURL(),Nomi);
		return Nomi;
		
		
}
	/**
	 * management of the route "/info" that return the dataset of a specific state
	 * @param Slug
	 * @throws NoCountry is an exception that works when the user write a country that dosen't exist in our list
	 */
@RequestMapping(value = "/info",  method = RequestMethod.POST)
public ArrayList<Nation> datescountry(@RequestParam(name="Slug") String Slug) 
	{	ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		if(SlugManagement.slugcheck(Slug, SlugManagement.slugtake(JsonProcessing.readURL())) == true) 
		{
		JsonParser.parsing2(JsonProcessing.readURL2(Slug), PaeseSelezionato);
		} else throw new NoCountry();
		return PaeseSelezionato;
	}
	
	/**
	 * management of the filter that return the nation's list that start with a specific char
	 * @param Letter 
	 */
@RequestMapping(value = "/char",  method = RequestMethod.POST)
public ArrayList<Nation> listcountry(@RequestParam(name="Letters") String Letters) 
{
	
	ArrayList<String> fj = new ArrayList<String>();
	ArrayList<Nation> na = new ArrayList<Nation>();
	fj = FilterJolly.jollyletter(Letters);
	for(int i=0; i < fj.size(); i++) {
		
		JsonParser.parsing2(JsonProcessing.readURL2(fj.get(i)),na);
		
	} 
		
return na;

}
	/**
	 * management of the filter that return the nation's values in a specific period
	 * the period that we can select goes from 2020-04-13 to 2020-05-06 but for the period 
	 * that goes from 2020-04-29 to 2020-05-03 we haven't the daily report
	 * @param from
	 * @param to 
	 * @throws ParseException that work when the user make mistake in the data writing
	 * @throws NoData is an exception that is triggered when we don't enter a date that belongs to our ranking
	 * @throws NoCountry is an exception that works when the user write a country that dosen't exist in our list
	 */
@RequestMapping(value = "/period",  method = RequestMethod.POST)
public ArrayList<Nation> valuescountry(@RequestParam(name="Slug") String Slug, @RequestParam(name="From") String From,
						@RequestParam(name="To") String To) throws ParseException
{

ArrayList<Nation> dv = new ArrayList<Nation>();
if(((FilterPeriod.datemenagement(From).after(FilterPeriod.datemenagement("2020-04-12T00:00:00Z"))))
	&&((FilterPeriod.datemenagement(To).before(FilterPeriod.datemenagement("2020-05-07T00:00:00Z")))))
{
	if(SlugManagement.slugcheck(Slug, SlugManagement.slugtake(JsonProcessing.readURL())) == true) 
	{
		JsonParser.parsingdata(JsonProcessing.readURL2(Slug),dv,From,To);
	} else throw new NoCountry();
	
}else throw new NoDate();
	
	return dv;
}
	/**
	 * management of the stats that return max, minimum, media, dev standard, variance  of the specific Nation's dates
	 * @param Slug  
	 * @param Statics stats that we wont calculate.
	 * @throws NoCountry is an exception that works when the user write a country that dosen't exist in our list.
	 */

@RequestMapping(value = "/stats",  method = RequestMethod.POST)
public HashMap<String,Number> getstatics(@RequestParam (name ="Slug") String Slug, @RequestParam (name ="Statics") ArrayList<String> stats) 
					throws NoSuchMethodException, InvocationTargetException
{
		ArrayList<Nation> sn = new ArrayList<Nation>();
		if(SlugManagement.slugcheck(Slug, SlugManagement.slugtake(JsonProcessing.readURL())) == true) 
		{
		JsonParser.parsing2(JsonProcessing.readURL2(Slug), sn);
		} else throw new NoCountry();
		
		return StatsService.statsmanager(sn, stats) ;
}

	/**
	 * Method that triggers an exception on Postman
	 * @param e
	 */

@ExceptionHandler(Exception_Err.class)
public ResponseEntity<Object> handler(Exception_Err e) {
	ExceptionManager error = new ExceptionManager(Calendar.getInstance() , HttpStatus.BAD_REQUEST , e.getClass().getCanonicalName() , e.getMessage());
	return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
}

}


