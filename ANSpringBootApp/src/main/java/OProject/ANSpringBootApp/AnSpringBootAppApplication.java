package OProject.ANSpringBootApp;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import java.io.IOException;

@SpringBootApplication
public class AnSpringBootAppApplication {

	public static void main(String[] args) throws IOException {
		JsonProcessing.readrUrl3();
		//JsonProcessing.readURL2();
		SpringApplication.run(AnSpringBootAppApplication.class, args);
		
		
	}
}
