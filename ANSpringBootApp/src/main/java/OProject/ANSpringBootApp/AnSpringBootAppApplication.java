package OProject.ANSpringBootApp;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import java.io.IOException;

@SpringBootApplication
public class AnSpringBootAppApplication {

	public static void main(String[] args) throws IOException {
		JsonProcessing.readURL();
		JSONObject json = new JSONObject();
		JsonProcessing.InformationTake(json);
		JsonProcessing.readURL2();
		JSONObject json2 = new JSONObject();
		JsonProcessing.JSONParser(json2);
		SpringApplication.run(AnSpringBootAppApplication.class, args);
		
		
	}
}
