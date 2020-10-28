package OProject.ANSpringBootApp.Controller;



import java.text.ParseException;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import OProject.ANSpringBootApp.JSON.JsonParser;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.JSON.SlugManagement;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Util.FilterJolly;
import OProject.ANSpringBootApp.Util.FilterPeriod;



@RestController
public class Controller {
	
	/**
	 * management of the route "/countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogni paese
	 */
@RequestMapping(value="/countries", method = RequestMethod.GET)
public ArrayList<States> getallcountries() 
{
		ArrayList<States> Nomi = new ArrayList<States>();
		JsonParser.Parsing(JsonProcessing.readURL(),Nomi);
		return Nomi;
		
		
}
	/**
	 * management of the route "/info" that return the dataset of a specific state
	 * @param Slug
	 * 
	 */
@RequestMapping(value = "/info",  method = RequestMethod.POST)
public ArrayList<Nation> datescountry(@RequestParam(name="Slug") String Slug) 
	{	
		if(SlugManagement.SlugCheck(Slug, SlugManagement.SlugTake(JsonProcessing.readURL())) == true);
		ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		JsonParser.Parsing2(JsonProcessing.readURL2(Slug), PaeseSelezionato);
		return PaeseSelezionato;
	}
	
	/**
	 * management of the filter that return the nation's list that start with a specific char
	 * @param Letter
	 * 
	 */
@RequestMapping(value = "/char",  method = RequestMethod.POST)
public ArrayList<Nation> listcountry(@RequestParam(name="Letter") char Letter) 
{
	ArrayList<String> fj = new ArrayList<String>();
	ArrayList<Nation> na = new ArrayList<Nation>();
	fj = FilterJolly.jollyletter(Letter);
	for(int i=0; i < fj.size(); i++) {
		
		JsonParser.Parsing2(JsonProcessing.readURL2(fj.get(i)),na);
	}
	return na;
}
	/**
	 * management of the filter that return the nation's values in a specific period
	 * the period that we can select goes from 2020-04-13 to 2020-05-06 but for the period 
	 * that goes from 2020-04-29 to 2020-05-03 we haven't the daily report
	 * @param from
	 * @param to 
	 */
@RequestMapping(value = "/period",  method = RequestMethod.POST)
public ArrayList<Nation> valuescountry(@RequestParam(name="Slug") String Slug, @RequestParam(name="From") String From, @RequestParam(name="To") String To) throws ParseException
{
	ArrayList<Nation> dv = new ArrayList<Nation>();
	if(((FilterPeriod.datemenagement(From).after(FilterPeriod.datemenagement("2020-04-12T00:00:00Z"))))
			&&((FilterPeriod.datemenagement(To).before(FilterPeriod.datemenagement("2020-05-07T00:00:00Z")))))
	{
		if(FilterPeriod.datemenagement(To).after(FilterPeriod.datemenagement(From)))
			{
					JsonParser.ParsingData(JsonProcessing.readURL2(Slug),dv,From,To);
				
			} 
	} 
	
	return dv;
	}
}


