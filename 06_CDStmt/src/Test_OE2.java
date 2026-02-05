import java.util.Random;
import java.util.Scanner;

public class Test_OE2 {
	public static void main(String[] args) {
		// 홀짝 게임

		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		while (true) {
			
			int com = r.nextInt(10); // 괄호 안에 3 => 0,1,2 0부터 시작된 숫자 3개
			System.out.println(com);

			System.out.println("1. 홀\n2. 짝\n3. 종료");
			int ans = sc.nextInt();
			
			
			// 종료 & 예외처리
			if (ans == 3) {
				System.out.println("종료합니다.");
				break;
//			} else if(ans != 1 && ans != 2) {
			} else if(ans < 1 || ans > 3) {
				System.err.println("입력오류");
				continue;
			}
			if (com % 2 == ans % 2) {	// 판정 (이 게임로직)
				System.out.println("정답");
			} else {
				System.out.println("땡");
			}

		}

		
		
		
		
		
		
		
		
		
	}

}
