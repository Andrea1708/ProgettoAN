package OProject.ANSpringBootApp.Controller;



import java.util.ArrayList;


import org.json.JSONObject;
import org.json.JSONArray;
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

	
@RequestMapping(value = "/info",  method = RequestMethod.POST)
public ArrayList<Nation> datescountry(@RequestParam(name="Slug") String Slug) 
	{	
	if(SlugManagement.SlugCheck(Slug, SlugManagement.SlugTake(JsonProcessing.readURL())) == true);
		ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		JsonParser.Parsing2(JsonProcessing.readURL2(Slug), PaeseSelezionato);
		return PaeseSelezionato;
	}
	
}


