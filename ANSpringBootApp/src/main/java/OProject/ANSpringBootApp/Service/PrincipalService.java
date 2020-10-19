package OProject.ANSpringBootApp.Service;

import java.io.IOException;
import java.util.Collection;

import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;

public interface PrincipalService {
	public abstract JSONObject totalCountries() throws IOException;
	//public abstract String TakeDataCountries () throws IOException;

}
