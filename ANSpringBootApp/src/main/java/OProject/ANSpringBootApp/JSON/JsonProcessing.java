package OProject.ANSpringBootApp.JSON;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

import OProject.ANSpringBootApp.Model.Nation;
import OProject.ANSpringBootApp.Model.States;
import OProject.ANSpringBootApp.Service.URLservice;

public class JsonProcessing {

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


public static JSONArray readURL2(String Name)  {
	String inline = "";
	try {
		String myURL = URLservice.getURL(Name);
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





