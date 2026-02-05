import java.util.Scanner;

public class RSMain04 {
	public static void main(String[] args) {
		
		// // 1+2+3+.....10 = 55
		
		int a = 0;
		for (int i = 1; i < 11; i++) {
			a += i;
		}
		System.out.println("총합 : " + a);
		
		// for (반복횟수)
		// while (반복 조건이 중요.) 조건에 사용할 변수 필요. int 사용
		
		// 1+2+3+... 몇까지 더하면 5000이 넘나요?
		
		// 10이 넘는지? 1+2+3+4+5
		
		int i = 1;
		int b = 0;
		while (b <= 10) {   // 10만 5000으로 바꾸면 위에 식
			b += i++; // b = b + i;
//			i++;
			System.out.println(b);
		}
		System.out.println(i-1 + "까지 더하면 10이 넘는다."); // i-1해줘야됨
		
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 받을 건데
		
		// 0을 넣으면 stop
		
		int d = 10; // int d = 0;이면 실행 안됨. 밑의 조건때문에 이미 해당돼서
		while (d != 0) {
			System.out.println("d : ");
			d = sc.nextInt();
		}
		
		int e = 0;
		while (true) { 
			System.out.println("e : ");
			e = sc.nextInt();
			if (e == 0) {
				break;
			}
		}
		
		// while문
		// 조건에 무조건 true 넣고 시작
		// 밑에 if로 잡고
		
		
		System.out.println("------------------");
		
		// 변수 aaa에 10이 들어가면 stop ( 10이 종료 기능임을 가정 )

		int aaa = 0;
		while (true) {
			System.out.println("aaa : ");
			aaa = sc.nextInt();
			if (aaa == 10) {
				System.out.println("정답입니당");
				break;
			}
		}
		
		
		System.out.println("------------------");
		
		
		// 몇까지 더하면 500 넘나요?
			// 1+2+3+4+5
		
		int w = 1;
		int total = 0;
		int n = 500;
		
				
				while (true) {
					total += w++;
					if (total > n) {
						break;
					}
				}
				System.out.println(w-1 + "까지 더하면 " + n +"이 넘습니다.");
				
				
				System.out.println("------------------");
		
				
				int xx = 0;
				int yy = 1;
				while (true) {
					
					xx = xx + yy;
					yy++;
					if (xx > 500) {
						break;
						
					}
					
				}
				System.out.println(yy - 1);
				
				// do-while
				// 조건 여부와 상관없이 한번은 실행 보장. (잘 안 씀)
				
				int kk = 0;
				int ll = 0;
				
				do {
					kk++;
					ll+=2;
				} while (kk < -100);
				
				System.out.println(kk);
				System.out.println(ll);
				
				
				
				
				
				
	}
}
