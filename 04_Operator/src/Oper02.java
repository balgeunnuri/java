
public class Oper02 {
	public static void main(String[] args) {
		
		// 논리(비교) 연산자 : 결과로 bool 나오는 거 (참/거짓)
		// >(초과),<(미만), >=(이상), <=(이하), ==(같다), !=(다르다)
		
		int x = 10;
		int y = 20;
		
		boolean a = x != y;
		System.out.println(a);
		
		// 결합 연산자 : 논리연산자 여러개 묶는 거 
		
		// && (AND) : 그리고. 둘 다 맞으면 true.
		// || (OR)  : ~나.  a나 b를 만족하면 true. 하나만 만족해도 ㄱㅊ.
		// ^  (XOR) : A ^ B => a나 b 하나만 만족해야 true.
		
		// x가 5보다 크고, y가 10보다 작나?
		boolean c = x > 5 && y < 10;
		System.out.println(c);
		
		// x가 5보다 크거나 y가 10보다 작나?
		boolean d = x > 5 || y < 10;
		System.out.println(d);
		
		// 단항 연산자
		// ! (NOT) : !A => A의 결과를 반대로, 정반대로 꺾거나 뒤집어줌.
		
// 놀이동산	
		
		// 놀이기구 타도 되는지 체크하는 프로그램.
		
		// 키, 나이
		
		int height = 180;
		int age = 30;
		
		// 나이가 10살 이상이고, 키가 200 넘으면 타도됨
				boolean ok = age >= 10 && height > 200;
				System.out.println(ok);
				
		// 확률이 낮은 걸 앞으로 배치하면 연산 횟수가 줄어듬. 이미 키에서 거짓판명 뒤에 뭐가 와도 상관없음.		
				boolean ok1 = height > 200 && age >= 10;
				System.out.println(ok1 + "\n~~~");
		
		// 나이가 10살 이상이거나 키가 200 넘으면 타도됨
		// 확률이 높은 걸 앞으로 배치하면 연산 횟수가 줄어듬.
				boolean ok2 = age >= 10 || height > 200;
				System.out.println(ok2);
				
		
				boolean ok3 = height > 200 || age >= 10;
				System.out.println(ok3);
		
				height = 220;
				// 키가 200이 넘으면 타면 안됨
				boolean ok5 = height > 200; // 하이는 인트 숫자는 반대 안됨 -> !height
				System.out.println(!ok5);   // !(height >200);는 가능
				
				// 삼항 연산자 (참/거짓 개념). 개발자, ai 많이 씀. 익숙해져야 좋음
					// 둘 중 하나(양자택일)
				
				// 조건식 ? true값 : false값
				
				//나이가 8살이 넘으면 welcome, 안 넘으면 go gome
						String msg = age > 8 ? "welcome" : "go home";
						System.out.println(msg);
						
				// 홀,짝 구분법
						System.out.println(age % 2 == 1); // 홀수
						System.out.println(age % 2 == 0); // 짝수
						
// Test
				
			// 입장료
				// 키가 200넘거나 나이가 20 이상이면 10000원, 아니면 5000원
//					String adm = height > 200 || age >= 20 ? "10000원" : "5000원";
//					오답노트 : 입장료, 할인값은 예상 결과랑 똑같이 나옴. 
//					그런데 마지막 총요금에서 값의 차를 구할 수 가 없음. 
//					정수의 빼기가 글자로는 안 돼서로 추정 
						
					int adm = height > 200 || age >= 20 ? 10000 : 5000;
								
			// 할인
				// 나이가 짝수면 1000원, 아니면 500원 할인
					
//					String disc = age % 2 == 0? "1000원" : "500원";
					int disc = age % 2 == 0? 1000 : 500;
						
			// 총요금
				// 입장료 - 할인
					int total = adm - disc;
						
			// 결과
				// 입장료 : oo원
				// 할인	: oo원
				// 총요금 : oo원
					
				System.out.println("입장료\t: " + adm + "원");
				System.out.println("할인\t: " + disc + "원");
				System.out.println("총요금\t: " + total + "원");
						
		
					
	}

}
