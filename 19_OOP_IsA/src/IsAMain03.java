import java.util.Random;

public class IsAMain03 {
	public static void main(String[] args) {

		// 랜덤 숫자 뽑기 1~10 중 (짝수만)
		Random r = new Random();
		int a = r.nextInt(10) + 1;
		
		if (a % 2 == 0) {
			System.out.println(a);
			
		} else {
			System.out.println(a+1);
		}
		
		
		// 짝수만 뽑아주는 랜덤 박스
		Box b = new Box();
		System.out.println(b.nextInt(10));
		
		
		
		
		
		
		
		
		// 지역변수 : 
		// 전역변수 : 필드에 있는 색 다른 변수들
		
		
	}
}
