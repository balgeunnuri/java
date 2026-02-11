import java.util.Scanner;

public class IMain03 {
	public static void main(String[] args) {

		
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
			
			// 다형성 - 하위타입을 상위타입에 담음으로써 구현 가능.
			Coffee coffee = null;
			if (pick == 1) {
				coffee = new Espresso();

			} else if (pick == 2) {
				coffee = new CafeLatte();

			} else if (pick == 3) {
				coffee = new VanillaLatte();

			} else if (pick == 4) {
				coffee = new Frappuccino();
				
			} else {
				System.out.println("그럼 naga");
				break;
			}
			coffee.name();
			coffee.price();
			coffee.hotOrIced();

		}

		
		
		
		
	}
}
