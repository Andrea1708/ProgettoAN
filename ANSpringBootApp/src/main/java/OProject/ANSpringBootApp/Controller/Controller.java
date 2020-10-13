package OProject.ANSpringBootApp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	/**
	 * @Autowired annotation allow to start the costructer automatically at the launch of Spring
	 */
	@Autowired

	/**
	 * gestione della rotta "/Countries" per restituire il dateset
	 */
	@RequestMapping (value="/Countries", method = RequestMethod.GET)
public ResponseEntity<Object> getReadURL() throws JSONException {
		return new ResponeEntity<>(Json.getReadURL(),HttpStatus.OK);
	}
	
	/**
	 * gestione della rotta "/live/country" per restituire il dataset 
	 */
	@RequestMapping(value = "/live/country", method= RequestMethod.GET)
public ResponseEntity<Object> getURL() throws JSONException {
		return new ResponseEntity<>(URLservice.getURL(),HttpStatus.OK);
	}
				

}
