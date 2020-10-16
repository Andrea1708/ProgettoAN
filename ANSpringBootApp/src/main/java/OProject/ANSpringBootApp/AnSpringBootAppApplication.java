package OProject.ANSpringBootApp;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import OProject.ANSpringBootApp.JSON.JsonProcessing;

@SpringBootApplication
public class AnSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnSpringBootAppApplication.class, args);
		JSONObject json = new JSONObject();
		JsonProcessing.readURL();
		JsonProcessing.SlugTake(json);
		
		
	}
	

}
