package Selenium;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader file=new FileReader("./src/test/resources/data/JsonData.json");
//		FileInputStream file=new FileInputStream("./src/test/resources/data/JsonData.json");
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(file);
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("name"));
		System.out.println(map.get("phoneno"));
		System.out.println(map.get("marriage"));
		System.out.println(map.get("kids"));
		System.out.println(map.get("hobbies"));
	}

}
