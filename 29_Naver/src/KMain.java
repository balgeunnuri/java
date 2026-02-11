import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class KMain {
	public static void main(String[] args) {
		// https://dapi.kakao.com/v3/search/book
		
		// Authorization: KakaoAK ${REST_API_KEY}
		// 538f1648d2a6ec9313b52b18501f2b55
		
		// Authorization: KakaoAK 538f1648d2a6ec9313b52b18501f2b55
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("검색할 책? : ");
			String keyword = sc.next();
			keyword = URLEncoder.encode(keyword, "utf-8");
			
			
			String url = "https://dapi.kakao.com/v3/search/book?query="; // ?다음에 적는 게 문법.
			url += keyword;
			
			URL u = new URL(url);

			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK 538f1648d2a6ec9313b52b18501f2b55");
			
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject kakaoData = (JSONObject) jp.parse(isr);
			System.out.println(kakaoData);
			
			// 제목, 출판사, 저자, 가격, 상태
			
			JSONArray docs = (JSONArray) kakaoData.get("documents");
			
			for (int i = 0; i < docs.size(); i++) {
				JSONObject book = (JSONObject) docs.get(i);
				String title = (String) book.get("title");
				
				System.out.println(i+1 + "]\t" + title);
				System.out.println("제 목\t: " + title);
				System.out.println("출판사\t: " + book.get("publisher"));
				System.out.println("저 자\t: " + book.get("authors"));
				System.out.println("가 격\t: " + book.get("price"));
				System.out.println("상 태\t: " + book.get("status"));
				System.out.println();
				
				
			}
			
			
			
			
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
