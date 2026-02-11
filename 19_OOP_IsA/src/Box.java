import java.util.Random;

public class Box extends Random {

	// Override : 상위클래스(상속받은,부모,수퍼)에서 받은 메서드의 재정의
//	@Override
//	public int nextInt(int bound) {
//		int temp = super.nextInt(bound);
//		if (temp % 2 == 0) {
//			return temp;
//		}
//		
//		
//		return nextInt(bound); // 재귀호출 : 함수가 나를 다시 부르는
//	}

	@Override
	public int nextInt(int bound) {

			int temp = super.nextInt(bound);
			if (temp % 2 == 0) {
				return temp;
	}
			return nextInt(bound);
	
			
			
		
	}	
}
