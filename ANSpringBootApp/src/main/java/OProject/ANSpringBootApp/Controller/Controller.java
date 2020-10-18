package OProject.ANSpringBootApp.Controller;


import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

@RestController
public class Controller {

	/**
	 * management of the route "/Countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogni paese
	 */
	@RequestMapping(value="/Countries", method = RequestMethod.GET)
public ResponseEntity<Object> getAllCountries() throws JSONException 
{
		ArrayList<States> Prova = new ArrayList<States>();
		JSONObject json = JsonProcessing.readURL();
		Prova = JsonProcessing.InformationTake(json);
		return new ResponseEntity<>(Prova,HttpStatus.OK);
}
	@RequestMapping(value="/live/", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllCountries() throws JSONException 
	{
			ArrayList<States> Prova = new ArrayList<States>();
			JSONObject json = JsonProcessing.readURL();
			Prova = JsonProcessing.InformationTake(json);
			return new ResponseEntity<>(Prova,HttpStatus.OK);	

}
