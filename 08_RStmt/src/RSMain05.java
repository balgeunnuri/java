import java.util.Scanner;

public class RSMain05 {
	public static void main(String[] args) {
		
		// break : 현재 위치에서 가장 가까운 switch 또는 반복문 탈출
		
		// continue : 현재 반복을 건너뛰고 증감식으로 넘어감 (다음 반복 진행)
		
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			}
		
		
			Scanner sc = new Scanner(System.in);
			
			
			// 레이블 (반복문 중첩됐는데 switch랑 같이 쓰는 경우 유용)
			
			aaa : for (int i = 0; i < 3; i++) {
				
			
			bbb : while (true) {
				System.out.println("정답은 ? ");
				int ans = sc.nextInt();
				
			
			switch (ans) {
			case 1:
				System.out.println("정답~");
				break;
			case 2:
				System.out.println("땡.");
				break;
			case 3:
				System.out.println("종료");
//				break bbb;                      // bbb 처리로 while break 됨.  dead code i 없앰
				break aaa;						// aaa 는 for문 탈출 용도가 된 것.
				
			default:
				break bbb;
//				break aaa;
			}
//			
//			if (ans == 3) {
//				break;
//			}
		}
			
		}
			
			
			
			
			
			
			
			
		
	}
}
