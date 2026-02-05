import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		String[] faceTbl = { "", "왼쪽", "오른쪽", "위", "아래", "가만히" };
		
		int myFace = 0;
		int comFace = 0;
		int cnt = 0;
		
		// int 위로 빼서 정리하기.

		while (true) {
			comFace = r.nextInt(5) + 1; // 1,2,3,4,5
			System.out.println(comFace);
			System.out.println("---------");
			System.out.println("1. 왼쪽");
			System.out.println("2. 오른쪽");
			System.out.println("3. 위");
			System.out.println("4. 아래");
			System.out.println("5. 가만히");
			System.out.println("---------");
			System.out.println("어디 ?? (숫자로 입력)");
			myFace = sc.nextInt();
			
			if (myFace < 1 || myFace > 5) {
				System.err.println("Error!");
				continue;
			}
			
			System.out.println("나 : " + faceTbl[myFace]);
			System.out.println("컴 : " + faceTbl[comFace]);
			
			
			if (myFace == comFace) {
				System.out.println("걸림");
				System.out.println(cnt + "번 버팀");
				break;
			} else {
				System.out.println("피함");
				cnt++;
			}
		}

		// 결과출력
		// 나 : 왼쪽
		// 컴 : 위
		// 걸림~

		// 게임 반복
		// 예외처리 (입력오류)
		// 피하면 여러번 피할 수 있게
		// 걸리면 끝
		// @ 몇번 버텼는지 (걸리면 몇번 버텼는지 안내)

		
		
		// 설명해보기.
		
		
	}
}
