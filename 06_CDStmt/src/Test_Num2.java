import java.util.Random;
import java.util.Scanner;

public class Test_Num2 {
	//up & down
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		
		// 업다운이니까 반복 -> 정상
		// 맞추면 -> 끝
		// @ 몇번만에 맞췃는지 안내하기 (맞추면 안내하기)
		// @ 횟수 제한 10번 (남은기회 10..9..8..)
		// @ 예외처리 - ex) 1 ~ 100 입력 오류
		// 잘못쳤을 때 남은 기회 까지 않기
		
		int com = r.nextInt(100)+1; // 100 == (100) + 1
		System.out.println(com); // 개발자 확인용.
		
		
//		aaa : for (int i = 10; i > 0; i--) {
		
			int chance = 10;
			
		aaa : while (chance > 0) {
			
			System.out.println("기회가 " + chance + "번 남았습니다.");
		
		System.out.println("0 ~ 100 숫자를 고르세요 : ");
		int ans = sc.nextInt();
		System.out.println(ans);
		
		if (ans < 0 || ans > 100) {
			System.out.println("입력오류.");
			continue;
		} 
		
		chance--;
		
		 if (com == ans) {
			System.out.println(10-chance +"번만에 정답~");
			break aaa;
		} else if (com > ans) {
			System.out.println("업");
		} else if (com < ans) {
			System.out.println("다운");
		} else {
			
		}

		
		
		
//		}
		 
		
		}
		
		
		
		
		
		
		
		
		
	}

}
