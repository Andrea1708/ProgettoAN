package OProject.ANSpringBootApp;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Service.URLservice;

import java.io.IOException;

@SpringBootApplication
public class AnSpringBootAppApplication {

	public static void main(String[] args) throws IOException {
		JsonProcessing.readURL();
		JsonProcessing.SlugTake(JsonProcessing.readURL());
		JsonProcessing.readURL2(Slug);
		SpringApplication.run(AnSpringBootAppApplication.class, args);
		
		
	}
}
