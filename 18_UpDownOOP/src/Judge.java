import java.util.Iterator;

public class Judge {
	public void play(Player player, Enemy enemy) {
		int comNum = enemy.chooseN();
		System.out.println(comNum); // 개발자 확인용

		for (int turn = 1; turn <= 10; turn++) {
			System.out.printf("현재 %d번째 도전중\n", turn);
			System.out.println("뭐? (1~100)");
			int playNum = player.say();

			if (playNum < 1 || playNum > 100) {
				System.err.println("Error. out of range");
				turn--;
				continue;
			
			} 

			boolean isOver = result(comNum, playNum, turn);
			if (isOver) {
				break;
			}
		}
	}

	private boolean result(int comNum, int playNum, int turn) {
		if (comNum == playNum) {
			System.out.println("correct");
			return true;
		} else if (comNum < playNum) {
			System.out.println("down");
		} else if (turn == 10) {
			System.out.println("game over.");
		} else {
			System.out.println("up");
		}
		return false;

	}

}
