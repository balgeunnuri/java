import java.util.Random;
import java.util.Scanner;

public class Test_Num {
	//up & down
	public static void main(String[] args) {
		
		
		// 1. 입력, 랜덤 준비
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 2. 컴터 숫자 뽑기 (0~99) 100개
		
		int com = r.nextInt(100); // 100 == (100) + 1
		System.out.println(com); // 개발자 확인용.
		
		
		// 3. 유저 입력
		
		System.out.println("0 ~ 99 숫자를 고르세요 : ");
		int ans = sc.nextInt();
		System.out.println(ans);
		
		// 4. 판정
			// 결과에 따라 '업' '다운' '정답'
		
		if (com == ans) {
			System.out.println("정답");
		} else if (com > ans) {
			System.out.println("업");
		} else {
			System.out.println("다운");
		}{

		}
		
//		if (com > ans || com < ans) {
//			int ans1 = sc.nextInt();
//			} else if (com == ans1) {
//				System.out.println("정답");
//			} else if (com > ans1) {
//				System.out.println("업");
//			} else {
//				System.out.println("다운");
//			}{
//
//			}
		
		
		
//		System.out.println(com);
		
		
	}

}
