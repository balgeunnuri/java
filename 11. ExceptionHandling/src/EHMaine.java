import java.util.Scanner;

public class EHMaine {
	public static void main(String[] args) {
		
		/*

        에러(ERROR) : 자바 문법 안맞는거. 컴파일 못함. 프로그램 완성 안됨.

        경고(Warning) : 뒷정리 덜했거나, 사용하지 않는 자원.. 프로그램 동작 정상

        예외(Exception) : 프로그램 정상 동작. 예기치 않은 상황이 발생해서 실행 안되는거 예외처리.
                               우리의 잘못 x, 대비는 해야됨.
        */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("x : ");
			int x = sc.nextInt();
			System.out.println("y : ");
			int y = sc.nextInt();
			System.out.println(x / y);
			
		} catch (Exception e) {
			System.out.println("0으로 나누기 ㄴㄴ");
			e.printStackTrace(); // 개발자 문제 확인용 코드.
		}
		
		// 정리 : 싹다 try에 집어넣자~
		
		
//		if (y != 0) {
//			System.out.println(x / y);
//		} else {
//			System.out.println("0으로 나누기 안돼욥ㅎㅎ");
//		}
		
		
		
		
	}
}
