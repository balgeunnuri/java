// 함수, 기능, 매서드

// 필요할 때마다 재사용 하려고

import java.security.PublicKey;


public class FMain {
	
/*	
	 1. 함수 정의
	public static void 함수명() {
		 // 호출시 실행코드
	}
	1) 함수의 인자(argument), 매개변수(parameter) : 함수 수행에 필요한 것들
     public static void 함수명22(자료형 변수명, 자료형 변수명, ...(param){
         호출 당하면 여기 실행
     }
 
     2) 위에꺼 호출
     함수명22(5);        여기서 숫자 5가 인자(argument) : 실제 그 값.
*/	
	
	public static void info() {
		System.out.println("--------");
		System.out.println("name : benr");
		System.out.println("age : 28");
		System.out.println("--------");
	}
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int add2(int a, int b) {
		return a+b;
		
	}
	
	public static void pushUp(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println("팔 굽혔다");
			System.out.println("폈다");
		}
	}
	
	public static String sport(String what) 
	 {
		if (what.equals("축구")) {
			return "축구공 필요~";
		} else if (what.equals("농구")){
			return "농구공 필요~";
		}
		return "공이 없어..";
	}
	
	public static void main(String[] args) {
	
		info();
		info();
		info();
		info();
		add(1, 2);
		int aa = add2(10, 20); // 30이라서(정수) int에 담을 수 있음
		System.out.println(aa);
		System.out.println(add2(10, 20));
		
		pushUp(3);
		
		System.out.println(sport("야구"));
		
}
}
