import java.util.Random;
import java.util.Scanner;

public class Test_Num3 {
	//up & down
	public static void main(String[] args) {
		
		
	
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 업다운이니까 반복 -> 정상
				// 맞추면 -> 끝 (반복 끝내기 break 붙여주기)
				// @ 몇번만에 맞췃는지 안내하기 (맞추면 안내하기)
				// @ 횟수 제한 10번 (남은기회 10..9..8..)
				// @ 예외처리 - ex) 1 ~ 100 입력 오류
				// 잘못쳤을 때 남은 기회 까지 않기
		
		
		
		
		int com = r.nextInt(100)+1;
		System.out.println(com); // 개발자 확인용.
		int chance = 10;
		int cnt = 0;
		
		while (true) {
		
		
			
		System.out.println("남은 기회 " + chance + "번");
		System.out.println("0 ~ 100 숫자를 고르세요 : ");
		int ans = sc.nextInt();
		System.out.println(ans);
		
		if (1 > ans || ans > 100) {
			System.err.println("입력오류"); // err-> 콘솔에 빨간색 글씨
			continue;
		}

		
		chance --;
//		cnt++;     // continue 뒤로 들어가야 카운트가 제대로 됨.
		
		if (chance == 0) {
			System.out.println("모든 기회 소모.. 실패");
			break;
		}
		
		if (com == ans) {
			System.out.printf("%d번 만에 정답~", 10-chance);
			break;
		} else if (com > ans) {
			System.out.println("업");
		} else {
			System.out.println("다운");
		} {

		}
		
		

		}
		
		
		
		
		
		
		
		
		
		
	}

}
