import java.util.Random;
import java.util.Scanner;


public class Test_OE {
	public static void main(String[] args) {
		// 홀짝 게임
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 랜덤숫자 뽑을 준비
		
		Random r = new Random();
	
		int com = r.nextInt(10); // 괄호 안에 3 => 0,1,2 0부터 시작된 숫자 3개
		System.out.println(com);
		
		// 사용자 숫자 입력창
		
		System.out.println("1. 홀\n2. 짝");
		int ans = sc.nextInt();
		
		// 판정
			// 맞히면 "정답"
			// 틀리면 "땡"
		
		// 내가 홀인데 컴도 홀이면 => 정답
		// 내가 홀인데 컴이 짝이면 => 땡
		// 내가 짝인데 컴도 짝이면 => 정답
		// 내가 짝인데 컴이 홀이면 => 땡
		
//		switch (ans) {
//		case true:
//			System.out.println("정답");
//			break;
//		case ans % 2 == 1 && com % 2 == 0 :
//			System.out.println("땡");
//			break;
//		case ans % 2 == 0 && com % 2 == 0 :
//			System.out.println("정답");
//			break;
//		case ans % 2 == 0 && com % 2 == 1 :
//			System.out.println("땡");
//			break;
//
//		default:
//			break;
//		}
		String an = ans % 2 == com % 2 ? "good" : "bad"; 
		switch (an) {
		case "good":
			System.out.println("정답");
			break;
		case "bad":
			System.out.println("땡");
			break;

		default:
			break;
		}
		
		if(com % 2 == ans % 2) {
			System.out.println("정답");
		} else {
		    System.out.println("땡");
		}
		
		
		
		
		
		
		// 결과출력
		
		/* 
		 * 꼼수방법
		  if(com % 2 == ans % 2)
		  == int com = r.nextInt(2)+1; // 1,2
		     if(com == ans)
		  그냥 알고만 넘어가기
		  헷갈리면 기억하지 않기
		 */
		
		
		
		
		
	}

}
