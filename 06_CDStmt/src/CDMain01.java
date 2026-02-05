// 조건문 (Conditional stmt)
public class CDMain01 {
	public static void main(String[] args) {
		
		// if, else (둘 중 하나, 맞냐 아니냐)
		
		// 나이가 70 이상이면 "안녕하십니까" 아니면 "안녕하세요"
		int age = 80;
		
		if (age >= 70) {
			System.out.println("안녕하십니까");
			
		} else {
			System.out.println("안녕하세요");

		}
		
		
		// 조건식 ? true값 : false값
		
		String msg = age >= 70 ? "안녕하십니까" : "안녕하세요";
		System.out.println(msg);
		
		// 위 두개 같은 것. 원하는 거 사용하면 됨. 쌤은 밑에꺼 주로 이용하심.
		
		//나이가 홀수이고, 10살 미만이면 "ㅋㅋㅋ" 아니면 "ㅎㅎㅎ"출력
		if (age % 2 == 1 && age < 10) {
			System.out.println("ㅋㅋㅋ");
		} else {
			System.out.println("ㅎㅎㅎ");

		} 
		
			String msg1 = age % 2 == 1 && age < 10 ? "ㅋㅋㅋ" : "ㅎㅎㅎ";
			System.out.println(msg1);
		System.out.println(age % 2 == 1 && age < 10 ? "ㅋㅋㅋ" : "ㅎㅎㅎ"); // 위 스트링에 이미 담아서..!
		
		//나이가 1살 초과, 5살 미만이면 "ㅎㅅㅎ"출력   >>>> 값이 참밖에 없으니 else 사용 안 해도됨
		
		age = 2;
		if (age > 1 && age < 5) { // 1 < age < 5 안 됨.
			System.out.println("ㅎㅅㅎ");
		}
		
		String msg2 = age > 1 && age < 5 ? "ㅎㅅㅎ": "";
		System.out.println(msg2);
		System.out.println(age > 1 && age < 5 ? "ㅎㅅㅎ": "");
		
		// 성인 & 아이 동반탑승이 가능?
		int height = 100;
		int age2 = 3;
		age = 30;
		
		// age가 20살 넘거나, age2가 3살 이상이고, 키가 80넘으면
		// "동반탑승 가능"
		// 아니면 "불가" 출력
		
		//age > 20 || age2 >= 3 && height > 80
				
				if (age > 20 || age2 >= 3 && height > 80) {
					System.out.println("동반탑승 가능");
				} else {
					System.out.println("불가");

				}
		
				
				/*
				  t || t && t = t     >>>> t
				  t || t && f = f     >>>> t
				  t || f && t = t     >>>> t
				  t || f && f = f     >>>> t
				  
				  우선순위 ||(OR)가 &&(AND)보다 위
				  뒤에서 아무리 f가 나와도 어차피 앞에서 ||로 t가 됨
				  
				 */
		
	}

}
