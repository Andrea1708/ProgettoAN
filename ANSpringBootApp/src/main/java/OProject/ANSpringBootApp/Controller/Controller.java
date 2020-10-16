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



@RestController
public class Controller {

	/**
	 * management of the route "/Countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogni paese
	 */
	@RequestMapping(value="/Countries", method = RequestMethod.GET)
public ResponseEntity<Object> getReadURL() throws JSONException 
	{
		
		ArrayList<String> Prova = new ArrayList<String>();
		JSONObject json = JsonProcessing.readURL();
		Prova = JsonProcessing.SlugTake(json);
		return new ResponseEntity<>(Prova,HttpStatus.OK);
		
	}
	
	/**
	 * management of the route "/live/country" that return the dataset 
	 */
	/**@RequestMapping(value = "/live/country", method= RequestMethod.GET)
public ResponseEntity<Object> getreadURL2() throws JSONException 
	{
		return new ResponseEntity<>(Run,HttpStatus.OK);
	}
	
	
	
/**	@RequestMapping(value = "/", method= RequestMethod.GET)
public ResponseEntity<Object> getSlug() throws JSONException
	{
		return new ResponseEntity<>(Json.SlugTake(),HttpStatus.OK);
	}

	
	
	@RequestMapping(value = "", method= RequestMethod.GET)
	public ResponseEntity<Object> getData() throws JSONException 
	{
			return new ResponseEntity<>(Json.DataTake,HttpStatus.OK);
	}

	
	
	
	@RequestMapping(value = "", method= RequestMethod.POST)
	public ResponseEntity<Object> Parser() throws JSONException
	{
			return new ResponseEntity<>(Json.JsonParser,HttpStatus.OK);
	}*/

}
