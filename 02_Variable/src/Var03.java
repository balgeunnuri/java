
public class Var03 {
	public static void main(String[] args) {
		// 2. 문자열 / 문자 (문자는 무조건 스트링!!)
		// String 대문자 시작
		
		// 이름 저장
		String myName = "임밝은누리"; // 출력물 옆에는 ""
		System.out.println(myName);
		
		/*
		   정수 : int
		   실수 : double
		   글자 : String
		   논리 : boolean
		   
		 */
		
		// 개인정보
		    // 이름, 나이, 키
		
		String name = "임밝은누리";
		int age = 28;
		double height = 158;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		// 변수는 변하는 것
		
		/* Test
		   
		   변수 5개를 사용해서 출력하시오.
		   
		   핸드폰정보 ***********
		   모델명	- iphone6
		   제조사	- Apple
		   디스플레이	- 5.6inch
		   가격	- 1000$
		   재고유무	- true
		   ******************
		 
		 */
		

		String model = "iphone6";
		String manufacture = "Apple"; // 제조사 comp라고 간단하게 표현
		double display = 5.6;
		int cost = 1000;
		boolean stock =  true;
		
		System.out.println("핸드폰정보 ***********");
		System.out.println("모델명\t- "+model);
		System.out.println("제조사\t- "+manufacture);
		System.out.println("디스플레이\t- "+display +"inch");
		System.out.println("가격\t- "+cost +"$");
		System.out.println("재고유무\t- "+stock);
		System.out.println("******************");
		
		
				
		
		
	}

}
