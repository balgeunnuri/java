import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		// 가위바위보

		// UI

		// 컴터가 숫자, 유저 입력

		// 판정

		// 나 : ㅇㅇ
		// 컴 : ㅇㅇ
		// 승, 패, 무승부

		// 게임 반복
		// 예외처리
		// 몇 번 이겼나? - 종료시 총 이긴 횟수 안내

		// @ 연승
		// @ 최다 연승 횟수 안내
		// (연승과 최다연승은 다름. 2번 이겼다가 지면 연승은 깨지는거고
		// 4번 연승한적이 있다가 지고 2번 연승하고 게임을 종료하면 최다 연승은 4)

		// @ 현재 나의 승률 = 이긴거 / 전체 게임수 * 100

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String[] hand = { "", "가위", "바위", "보", "종료" };

		int totalG = 0; // 총게임수
		int comNum = 0; // 컴숫자
		int userNum = 0; // 유저숫자
		int cntTW = 1; // 총이긴횟수
		int cntNW = 0; // 현재연승
		int cntBW = 1; // 최고연승
		double winRate = 0; // 승률

		while (true) {

			comNum = r.nextInt(3) + 1;
			System.out.println("-----");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("4. 종료");
			System.out.println("-----");
			System.out.println("뭐 ? ");
			userNum = sc.nextInt();

			if (userNum > 4 || userNum < 1) {
				System.err.println("Error");
				continue;
			} else if (userNum == 4) {
				System.out.println("게임을 종료합니다.");
				System.out.printf("당신은 총 %d번 이겼습니다.\n", cntTW - 1);

				winRate = (double) cntTW / totalG * 100;
				System.out.printf("현재 나의 승률: %.2f%%\n", winRate); // 퍼센트 %%로 써줘야함.
				break;
			}

			totalG++;

			System.out.println("나 : " + hand[userNum]);
			System.out.println("컴 : " + hand[comNum]);

			if (userNum == comNum) {
				System.out.println("무승부");
				cntNW = 0;
			} else if ((comNum == 1 && userNum == 2) || (comNum == 2 && userNum == 3)
					|| (comNum == 3 && userNum == 1)) {
				cntNW++; // 위치 중요.
				cntTW++;
				System.out.println("승");
				System.out.printf("%d연승중~\n", cntNW);
				if (cntNW > cntBW) {
					cntBW = cntNW;
				}
			} else {
				System.out.println("패");
				cntNW = 0;

			}

		}

	}
}
