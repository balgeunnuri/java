import java.util.Scanner;

public class Test_Exchange {
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
		
		
		/* Scanner sc = new Scanner(System.in);
		
		// 입력받을 준비
		System.out.println("계산 금액? "); //137894
		int money = sc.nextInt();
		
		if (money >= 50000) {
			int fwwww = money / 50000;
			System.out.printf("5만원 : %d장\n", fwwww);
//			money -= 50000 * fwwww; // 금액을 바꾸면 문제가 됨, == money = money - fwwww;
			money %= 50000;  // money = money % 50000;
		}
		
		
		
		if (money >= 10000) {
			int owwww = money / 10000;
			System.out.printf("1만원 : %d장\n", owwww);
			money %= 10000;
		}
		
		if (money >= 5000) {
			int fwww = money / 5000;
			System.out.printf("5천원 : %d장\n", fwww);
			money %= 5000;
		}
		
		if (money >= 1000) {
			int owww = money / 1000;
			System.out.printf("1천원 : %d장\n", owww);
			money %= 1000;
		}
		
		if (money >= 500) {
			int fww = money / 500;
			System.out.printf("5백원 : %d개\n", fww);
			money %= 500;
		}
		
		if (money >= 100) {
			int oww = money / 100;
			System.out.printf("1백원 : %d개\n", oww);
			money %= 100;
		}
		
		if (money >= 50) {
			int fw = money / 50;
			System.out.printf("5십원 : %d개\n", fw);
			money %= 50;
		}
		
		if (money >= 10) {
			int ow = money / 10;
			System.out.printf("1십원 : %d개\n", ow);
			money %= 10;
		}
		
//		if (money >= 1) {
//			int o = money / 1;
//			System.out.printf("잔돈 계산 불가 금액 : %d원.\n", o);
//		}
		
		//System.out.printf("잔돈 계산 불가 금액 : " + money + "원");

		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산 금액? "); //137894
		int money = sc.nextInt();
		
		if (money >= 50000) {
			int fwwww = money / 50000;
			System.out.printf("5만원 : %d장\n", fwwww);
			money %= 50000;  
		}
		
		if (money >= 10000) {
			int owwww = money / 10000;
			System.out.printf("1만원 : %d장\n", owwww);
			money %= 10000;
		}
		
		if (money >= 5000) {
			int fwww = money / 5000;
			System.out.printf("5천원 : %d장\n", fwww);
			money %= 5000;
		}
		
		if (money >= 1000) {
			int owww = money / 1000;
			System.out.printf("1천원 : %d장\n", owww);
			money %= 1000;
		}
		
		if (money >= 500) {
			int fww = money / 500;
			System.out.printf("5백원 : %d개\n", fww);
			money %= 500;
		}
		
		if (money >= 100) {
			int oww = money / 100;
			System.out.printf("1백원 : %d개\n", oww);
			money %= 100;
		}
		
		if (money >= 50) {
			int fw = money / 50;
			System.out.printf("5십원 : %d개\n", fw);
			money %= 50;
		}
		
		if (money >= 10) {
			int ow = money / 10;
			System.out.printf("1십원 : %d개\n", ow);
			money %= 10;  // money = money % 10
		}
		
			System.out.printf("잔돈 계산 불가 금액 : " + money + "원");


		
		
		
		
		
}
}
