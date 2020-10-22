package OProject.ANSpringBootApp.Controller;


import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import OProject.ANSpringBootApp.JSON.InformationCheck;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

import OProject.ANSpringBootApp.Service.URLservice;


@RestController
public class Controller {
	
	/**
	 * management of the route "/countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogni paese
	 */
	@RequestMapping(value="/countries", method = RequestMethod.GET)
public ArrayList<States> getAllCountries() throws IOException 
{
		ArrayList<States> Nomi = new ArrayList<States>();
		JsonProcessing.Parsing(JsonProcessing.readURL(),Nomi);
		return Nomi;
		
		
}

	
	@RequestMapping(value = "/pippo",  method = RequestMethod.POST)
public ArrayList<Nation> DatesCountry(@RequestParam(name="Slug") String Slug) throws Exception  
	{	
		if(InformationCheck.SlugCheck(Slug, JsonProcessing.SlugTake(JsonProcessing.readURL())) == true);
		ArrayList<Nation> PaeseSelezionato = new ArrayList<Nation>();
		JsonProcessing.Parsing2(JsonProcessing.readURL2(Slug), PaeseSelezionato);
		return PaeseSelezionato;
	}
}



