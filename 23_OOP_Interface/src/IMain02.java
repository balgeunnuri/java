import java.util.Scanner;

public class IMain02 {
	public static void main(String[] args) {

		// 콘솔 안내
		// 주문하시겠어요??

		// 1. 에스프레소 2. 카페라떼 3. 바닐라라떼 4. 프라푸치노
		// 5. 돈이 모자라요.. -> 그럼 나가 (break;)
		// 그 외 번호 입력시 -> 메뉴에 없네요

		// 2,3 선택시 -> hot or iced 까지 물어보기
		// 나머지 메뉴 선택시 메뉴명,가격만 출력해주기.

		// sca, wh, if, 예외처리

		Scanner sc = new Scanner(System.in);

		int pick = 0;
		
		while (true) {
			System.out.println("주문하시겠어요??");
			System.out.println("1. 에스프레소\n2. 카페라떼\n3. 바닐라라떼\n4. 프라푸치노\n5. 돈이 모자라요..");
			pick = sc.nextInt();

			if (pick > 5 || pick < 1) {
				System.err.println("그런 메뉴는 없어요!");
				continue;
			}

			if (pick == 1) {
				Espresso espresso = new Espresso();
				espresso.name();
				espresso.price();

			} else if (pick == 2) {
				CafeLatte cafeLatte = new CafeLatte();
				cafeLatte.name();
				cafeLatte.price();
				cafeLatte.hotOrIced();

			} else if (pick == 3) {
				VanillaLatte vanillaLatte = new VanillaLatte();
				vanillaLatte.name();
				vanillaLatte.price();
				vanillaLatte.hotOrIced();

			} else if (pick == 4) {
				Frappuccino fuFrappuccino = new Frappuccino();
				fuFrappuccino.name();
				fuFrappuccino.price();
				
			} else {
				System.out.println("그럼 naga");
				break;
			}

		}

		
		
		
		
	}
}
