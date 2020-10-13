package OProject.ANSpringBootApp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	/**
	 * @Autowired annotation allow to start the costructer automatically at Spring's launch
	 */
	@Autowired

	/**
	 * management of the route "/Countries" that return the dataset
	 * @Param Country nome del paese
	 * @Param Slug    nome da inserire nel rest 
	 * @Param ISO2    codice di ogbi paese
	 */
	@RequestMapping (value="/Countries", method = RequestMethod.GET)
public ResponseEntity<Object> getReadURL() throws JSONException {
		return new ResponeEntity<>(JasonAD2.getReadURL(),HttpStatus.OK);
	}
	
	/**
	 * management of the route "/live/country" that return the dataset 
	 */
	@RequestMapping(value = "/live/country", method= RequestMethod.GET)
public ResponseEntity<Object> getURL() throws JSONException {
		return new ResponseEntity<>(URLservice.getURL(),HttpStatus.OK);
	}
				

}
