package OProject.ANSpringBootApp.JSON;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;


import OProject.ANSpringBootApp.Service.URLservice;

public class JsonProcessing {
	
	/**
	 * Method that download information from a API's URL
	 * @return JSONArray
	 */

public static JSONArray readURL()  {
	String inline = "";
	try {
		String myURL = "https://api.covid19api.com/countries";
		URL url = new URL(myURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.connect();
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			inline+=sc.nextLine();
		}
		sc.close();
		JSONArray jsonArr = new JSONArray(inline);
		conn.disconnect();
		// array's return 
		return jsonArr;
		}catch(Exception e) {
		}
		return null;
		} 

	/**
	 * Method that download information from a specific URL
	 * @param CN string that will complete the URL
	 * @return JSONArray
	 */

public static JSONArray readURL2(String CN)  {
	String inline = "";
	try {
		String myURL = URLservice.getURL(CN);
		// print the URL
		System.out.println(myURL);
		URL url = new URL(myURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.connect();
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			inline+=sc.nextLine();
		}
		sc.close();
		JSONArray jsonArr2  = new JSONArray(inline);
		conn.disconnect();
		// print the array
		System.out.println(jsonArr2);
		// array's return
		return jsonArr2;
		}catch(Exception e) {
		}
		return null;
		} 
		
}	





