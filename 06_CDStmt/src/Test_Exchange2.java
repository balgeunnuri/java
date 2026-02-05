import java.util.Scanner;

public class Test_Exchange2 {
	public static void main(String[] args) {
		// 거스름돈 계산기
		
		// 137894
		// 이렇게 입력하면
		
		// 5만원 : 2장
		// 1만원 : 3장
		// 5천원 : 1장
		// 1천원 : 2장
		// 500원 : 1개
		// 100원 : 3개
		// 50원 : 1개
		// 10원 : 4개
		// 잔돈 계산 불가 금액 : 4원.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산 금액? "); //137894
		int money = sc.nextInt();
		
		int cnt = 0;

		if (money >= 50000) {
			cnt = money / 50000;
			System.out.printf("5만원 : %d장\n", cnt);
			money %= 50000;  
		}
		
		if (money >= 10000) {
			cnt = money / 10000;
			System.out.printf("1만원 : %d장\n", cnt);
			money %= 10000;
		}
		
		if (money >= 5000) {
			cnt = money / 5000;
			System.out.printf("5천원 : %d장\n", cnt);
			money %= 5000;
		}
		
		if (money >= 1000) {
			cnt = money / 1000;
			System.out.printf("1천원 : %d장\n", cnt);
			money %= 1000;
		}
		
		if (money >= 500) {
			cnt = money / 500;
			System.out.printf("5백원 : %d개\n", cnt);
			money %= 500;
		}
		
		if (money >= 100) {
			cnt = money / 100;
			System.out.printf("1백원 : %d개\n", cnt);
			money %= 100;
		}
		
		if (money >= 50) {
			cnt = money / 50;
			System.out.printf("5십원 : %d개\n", cnt);
			money %= 50;
		}
		
		if (money >= 10) {
			cnt = money / 10;
			System.out.printf("1십원 : %d개\n", cnt);
			money %= 10;  // money = money % 10
		}
		
			System.out.printf("잔돈 계산 불가 금액 : " + money + "원");


		// 지역변수 전역변수, 
			// 변수명 같게 만드는 게 중요하지 않음
		
		
		// 1. cnt 정수 담는 그릇 생성 후 변수에 다 넣기. 
//			? int cnt = 0; 0이 정수를 뜻? 
//			걍 그릇 만드는 거라 상관이 없음. int cnt; 이렇게만 끝내도 됨. 그런데 바로 출력하면 문제가 됨.
//			int cnt = 0; 여기서는 0이든 100이든 밑의 값은 상관 없이 같게 나옴.
			
		
		
}
}
