
public class PMain {
	public static void main(String[] args) {
		//  printf : 출력 형식 잡을 때
		
		// %d : 정수형 변수 값 들어올 자리 - %03d : 3자리수 출력 ex) 001
        // %f : 실수형 변수 값 들어올 자리 - %.2f : 소수점 2자리 출력 ex) 1.23
        // %s : String 변수 값 들어올 자리
		
		
		int a = 1;
		double b = 1.23456;
		String c = "abc";
		
		System.out.printf("%02d\n", a); // 빈자리를 0으로 채워달라, 2자리 숫자를 할 건데
		System.out.printf("%.1f\n", b); // .1(한)자리 까지만 출력
		System.out.printf("%s\n", c);		
		
		// a는 oo이고, b는 oo이고, c는 oo이다.
		
	System.out.println("a는 " + a +"이고, b는 " + b +"이고, c는 " + c + "이다.");
//	System.out.printf("ㅇ는 %d이고, ㅇ는 %d이고, ㅇ는 %d이다.", a,b,c);
	System.out.printf("a는 %d이고, b는 %f이고, c는 %s이다.", a,b,c);
		
		
		
		
		
	}

}
