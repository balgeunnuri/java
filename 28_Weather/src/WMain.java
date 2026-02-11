import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WMain {
	public static void main(String[] args) {
		
//		e7b1a57cd2158c8d195bfb24b7597bad
//		https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
//		https://api.openweathermap.org/data/2.5/weather?q=osaka&appid=e7b1a57cd2158c8d195bfb24b7597bad
	
		// 자바로 원하는 결과만 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("city : ");
		String city = sc.next();
		
		String url = "https://api.openweathermap.org/data/2.5/weather?q="+ city +"&appid=e7b1a57cd2158c8d195bfb24b7597bad&units=metric";
		
		try {
			URL u = new URL(url);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is =  huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			// 웹에서 정보를 교환할 때 문법이 저해져 있으면 좋겠다. (xml, json)
			
			// json parse -> 추출해주는 도구 (도구:lib 라이브러리) 
			// mvn repository -> json-simple.jar
			// build path -> libs -> external 추가
			
			JSONParser jp = new JSONParser();
			
			JSONObject weatherData = (JSONObject) jp.parse(isr);
//			System.out.println(weatherData);
			
			// JavaScript
			// {} 객체
			// [] 배열
			
			System.out.println(weatherData.get("name"));
			
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println(sys.get("country"));	
			
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println(main.get("temp")); 
			
			JSONArray weather = (JSONArray) weatherData.get("weather");
			JSONObject w = (JSONObject) weather.get(0);
			System.out.println(w.get("description"));
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
