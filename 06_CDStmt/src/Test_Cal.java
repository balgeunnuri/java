import java.util.Scanner;

public class Test_Cal {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		// 각 월이 몇일까지 있는지 알려주는 프로그램
		
		// ex) 1 입력하면 -> "31일 까지" 출력
		
		// 31) 1,3,5,7,8,10,12
		// 30) 4,6,9,11
		// 28) 2
		
		// 사용자한테 월 입력받기
//		   syso ("몇 월? (1~12)
//		   int month = 여기서 인트 값을 입력하는 게 아니니까 입력받을 준비 sc.nextInt(); 적용
		// 판정 조건문 사용 (여러가지 중 하나의 케이스니까)
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		System.out.println(month + "월은 31일 까지 있습니다.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
		System.out.println(month + "월은 30일 까지 있습니다.");
		} else if (month == 2) {
		System.out.println(month + "월은 28일 까지 있습니다.");
		} else {
		System.out.println("입력오류");
		}
		
		// 결과출력
		// "1월은 31일 까지 있습니다."
		// @ 1~12 벗어난 숫자는 "입력오류"
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("o월은 o일까지 있습니다. (1~12)");
		
		int mon = sc1.nextInt();
		
		switch (mon) {
		case 1,3,5,7,8,10,12:
			System.out.println(mon + "월은 31일 까지 있습니다.");
			break;
		case 4,6,9,11:
			System.out.println(mon + "월은 30일 까지 있습니다.");
			break;
		case 2:
			System.out.println(mon + "월은 28일 까지 있습니다.");
			break;

		default:
			System.out.println("입력오류");
			break;
		}
		
		
		
		
		
		
		
		
	}

}
