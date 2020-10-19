package OProject.ANSpringBootApp.Controller;


import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Service.PrincipalService;
import OProject.ANSpringBootApp.Service.URLservice;

@RestController
public class Controller {
	
	@Autowired
	PrincipalService PrincipalService;
	/**
	 * management of the route "/countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogni paese
	 */
	@RequestMapping(value="/countries", method = RequestMethod.GET)
public ResponseEntity<Object> getAllCountries() throws IOException 
{
		
		return new ResponseEntity<>(PrincipalService.totalCountries(),HttpStatus.OK);
}
	
	
	/**@RequestMapping(value = "/live/country/{Slug}",  method = RequestMethod.GET)
public ResponseEntity<Object> DatesCountries(@RequestParam(name ="Slug",defaultValue = "No Slug") String Slug) throws Exception  
	{
		return new ResponseEntity<>(PrincipalService.TakeDataCountries(),HttpStatus.OK);
	}**/
}
