
public class RSMain {
	public static void main(String[] args) {
	
		// 반복문 repeat stmt
		
		// for(선언 및 초기화; 조건; 증감식) { 반복될 코드 }
		// 조건 : true, false
		// 반복횟수가 명확하면 for
		
		for (int i = 0; i < 3; i++) {  //++ == +1, -- == -1
			System.out.println("ㅎㅅㅎ");
		}
	
		// 생김새 비교
		
		// 반복횟수가 명확하지 않으면 while
		int z = 0;  // 안에 들어갈 변수 필요
		while (z < 3) {
			System.out.println("ㅋㅋㅋ"); // 무한 루프
			z++;
		}
		
		
		// 상호 대체 가능 switch, if와 같음. 각자 유리할 때가 있음.
		
		
		// zzz 를 3번 출력하시오
		for (int i = 0; i < 3; i++) {  // <=3 == < 4로 바꾸기
			System.out.println("zzz");
		}
		
		for (int i = 0; i < 6; i += 2) { 
			System.out.println("111");
		}
		
		for (int i = 0; i < -1; i++) { 
			System.out.println("ttt");
		}
		
		System.out.println("-----------------------");
		
		// 0 2 4 6
		
		for (int i = 0; i <= 6; i+=2) { // <=6 == <7
			System.out.print(i + " "); // 지역변수 i 바로 사용 가능
		}
		
		System.out.println();
		
		for (int i = 0; i < 7; i++) { 
			if (i % 2 == 0) {
				System.out.print(i + " "); 
			}
		}
		
		System.out.println("-------------------------");
		
		// 1+2+3+.....10 = 55
		
		int total = 0; // 누적값 필요
		for (int i = 1; i < 11; i++) {
			total += i; //total = total + i;
		}	
		
		System.out.println("총합 : " + total);
		
		
		// 1+2+3+.....342 = ?
		
		int total2 = 0; // 누적값 필요
		for (int i = 1; i < 343; i++) {
			total2 += i; //total = total + i;
		}
		
		System.out.println("총합 : " + total2);
		
		System.out.println("-------------------------");
		
		// 1*2*3*...5 => ? 120
		
		int total3 = 1; 
		for (int i = 1; i < 6; i++) {   
			total3 *= i; 
		}
		System.out.println("총곱 : " + total3);
		
		
		
		
		// 1*2*3*...20 => ??
		
		long total4 = 1; 
		for (long i = 1; i <= 20; i++) {   
			total4 *= i; 
		}
		System.out.println("총곱 : " + total4);
		
		
		
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("2 * %d = %d\n", i, i*2);
		}
		
		
		// 1. 3단인데 홀수 곱한 것만
			// 3 * 1 = 3
			// 3 * 3 = 9
			// 3 * 5 = 15
			// 3 * 7 = 21
			// 3 * 9 = 27
		
		for (int i = 1; i < 10; i+=2) {
				System.out.printf("3 * %d = %d\n", i, i*3);
			}
			
		
		// 2. 아래 딱 3개만 나오게
			// 4 * 9 = 36
			// 4 * 6 = 24
			// 4 * 3 = 12
		
		for (int i = 9; i > 0 ; i-=3) {
			System.out.printf("4 * %d = %d\n", i, i*4);
		}
		
}
}
