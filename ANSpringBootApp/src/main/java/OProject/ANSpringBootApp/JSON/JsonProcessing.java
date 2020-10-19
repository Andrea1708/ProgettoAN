package OProject.ANSpringBootApp.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import OProject.ANSpringBootApp.Service.URLservice;

public class JsonProcessing {


public static String readURL() throws IOException {
		String myURL = "https://api.covid19api.com/countries";
		URL url = new URL(myURL);
		URLConnection URLcon = url.openConnection();
		BufferedReader reader= new BufferedReader(new InputStreamReader(URLcon.getInputStream()));
		String line;
		String phrase="";
		while((line = reader.readLine()) != null) 
			phrase = phrase+line;
		reader.close();
			return phrase;
	}


		


public static String readURL2() throws IOException {
		String myindex = URLservice.getURL("Slug"); //verificare questa chiamata//
		URL url = new URL(myindex);
		URLConnection URLcon = url.openConnection();
		BufferedReader reader= new BufferedReader(new InputStreamReader(URLcon.getInputStream()));
		String inline;
		String exitphrase="";
		while((inline = reader.readLine()) != null) 
			exitphrase = exitphrase+inline;
		reader.close();
			return exitphrase;
		
	}

}