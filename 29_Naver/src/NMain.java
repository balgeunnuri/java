import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NMain {
	public static void main(String[] args) {
		// hSwUvzqAUzkbRtpo7ko6
		// KXyPqeBm34
		
		// https://openapi.naver.com/v1/search/book.json?query=영어
		Scanner sc = new Scanner(System.in);
		try {

		System.out.println("search what? : ");
		String keyword = sc.next();
		keyword = URLEncoder.encode(keyword, "utf-8");
		
		String url = "https://openapi.naver.com/v1/search/shop.json?query=";
		url += keyword;
		url += "&display=30";
		System.out.println(url);
		
			URL u = new URL(url);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			
			huc.addRequestProperty("X-Naver-Client-Id", "hSwUvzqAUzkbRtpo7ko6");
			huc.addRequestProperty("X-Naver-Client-Secret", "KXyPqeBm34");
			
			
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			// json simple.jar
			JSONParser jp = new JSONParser();
			JSONObject naverData = (JSONObject) jp.parse(isr);
			System.out.println(naverData);
			
			JSONArray items =  (JSONArray) naverData.get("items");
			
			for (int i = 0; i < items.size(); i++) {
				JSONObject item = (JSONObject) items.get(i);
//				String title = (String) item.get("title");
//				String title = item.get("title") + "";
				String title = (String) item.get("title").toString();
				
				title = title.replace("<b>",""); 
				title = title.replace("</b>",""); // 볼드체 제거
				
//				System.out.println("책 제목 : " + title);
				System.out.println(i+1 + "] " + title);
				System.out.println("브랜드\t: " + item.get("brand")); 
				System.out.println("최저가\t: " + item.get("lprice")); 
				System.out.println("제 품\t: " +item.get("category3")); 
				System.out.println("--------------------");
				
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
	}
}
