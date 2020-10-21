package OProject.ANSpringBootApp.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.databind.ObjectMapper;

import OProject.ANSpringBootApp.Exception.NoCountry;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

@Service
public class PrincipalServiceimpl implements PrincipalService {
	
public PrincipalServiceimpl() {
	States stato = new States(null,null,null);
	Nation nazione = new Nation(null,null,null,null,null,0,0,0,0,0,0,null);
}
	


	


/**@Override 
public ArrayList<States> PassingDates() throws IOException {
	JSONObject json = new JSONObject();
	if(JsonProcessing.JSONParser(json).isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"There are not country here... ");
		
		return JsonProcessing.JSONParser(json);
	
}**/
}
