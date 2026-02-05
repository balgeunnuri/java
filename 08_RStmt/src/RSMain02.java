
public class RSMain02 {
	public static void main(String[] args) {
		// 무한루프
		
//		for (int i = 0; true; i++) {
//			System.out.println(i);
//		}
//		
//		for (;;) {
//			System.out.println("test");
//		}
		
//		위 두개 같은 거. 근데 안씀. 안 외워도 됨.
		
		int z = 0;
		for (;;) {
			System.out.println("for문 무한루프 : " + z);
			z++;
			if (z == 3) {
				break;
			}
		}
		
/*		for문 무한루프 : 0
		for문 무한루프 : 1
		for문 무한루프 : 2
*/
		
		int x =0;
		while (true) {
			System.out.println("while문 무한루프 : " + x);
			x++;
			if (x == 3) {
				break;
			}
		}
		
/*		for문 무한루프 : 0
		for문 무한루프 : 1
		for문 무한루프 : 2
		while문 무한루프 : 0
		while문 무한루프 : 1
		while문 무한루프 : 2
*/		
		
		
		
		
		
		
	}
}
