package OProject.ANSpringBootApp.Service;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
	
@Override 
public String totalCountries() throws IOException {
	if(JsonProcessing.readURL().isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"There are not country... ");
		return JsonProcessing.readURL();
}
}	

