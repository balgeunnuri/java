import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class UMain02 {
	public static void main(String[] args) {
		// 시간 / 날짜
		Date d = new Date();   // Util에 있는 거 담기. 위에 import생김.
		System.out.println(d); // 현재정보
		
		// Date => String으로 바꾸는 중
		// y M d h m s (소문자 대문자)
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 / dd일 / hh:mm:ss"); // Simple 자동완성
		System.out.println(sdf.format(d));
		
		// String => Date
		String s2 = "01/11-22"; // 밑에 패턴일치 해주기. "dd/MM-yy"
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM-yy");
		try {
			Date dd = sdf2.parse(s2);
			System.out.println(dd);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Date , SimpleDateFormat 세트로 사용.
		// sdf.format() Date => String
		// sdf2.parse() String => Date
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		
		
		// 2026/02/05 // 월일 앞에 0 : if문 사용하기 (10 이상미만 구분)
		
		String test = now.getYear() + "/" + now.getMonthValue();
		System.out.println(test);
		
		System.out.println();
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		
		
		
		
		
		
		
		
		
		
	}
}
