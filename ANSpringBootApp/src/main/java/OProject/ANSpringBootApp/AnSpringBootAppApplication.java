package OProject.ANSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import OProject.ANSpringBootApp.JSON.Json;

@SpringBootApplication
public class AnSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnSpringBootAppApplication.class, args);
		Json prova = new Json();
		JSONObject listaNazioni = prova.readURL();
		
	}
	

}
