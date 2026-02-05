import java.util.Scanner;

public class FMain2 {
	// 월급을 넣으면 연봉을 구해서 "출력" 해주는 함수
	public static void getSalary(int month) {
		System.out.println(month * 12);
	}

	// 월급을 넣으면 연봉을 '구해주는' 함수

	public static int getSalary2(int month) {
		return month * 12;
	}


		
		
	// 상품 가격을 넣으면 부가세를 구해주는 메서드
		public static int getVAT(int cost) {
			return cost / 10;
		}
	
	//상품 가격을 넣으면 부가세를 구해서 '출력' 해주는 메서드
		
		public static void getVAT2(int cost) {
			System.out.println(cost * 0.1);
		}
		
		
		
		// TEST
		// 메서드 만들고 main 호출에서 사용까지.
		
		// 1. 나이를 넣으면 인사말을 "출력" 해주는 함수 (scan로 입력받아서 출력)
		// 10대 : 안녕
		// 20대 : 안녕하세요
		// 30대 이상 : 안녕하십니까
		
		public static void Hi(int age) {
			
			if (20>age && age>=10) {
				System.out.println("안냥~");
			} else if (30>age && age>=20) {
				System.out.println("안냐세여~");
			} else if (30 <= age){
				System.out.println("안녕하십니까.");
			}
		}
		// if(age>=20) else if(age>=10)
		
		
		// 2. 숫자 2개를 넣으면 더 큰 수를 구해주는 함수
		// (비교할 숫자 1,2를 각각 입력받아서 처리)
		
		public static int BNum(int num1, int num2) {
//			if (num1>num2) {
//				return num1;
//			}
//			return num2;
			return num1>num2? num1:num2;
		}
		
		
		public static void main(String[] args) {
			getSalary(200);
			getSalary2(getSalary2(200));
			
			
			System.out.println(getVAT(1000));
			getVAT2(10000);
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 : ");
			int age = sc.nextInt();
			Hi(age);
			
			System.out.println("비교할 숫자 1 : ");
			int a = sc.nextInt();
			System.out.println("비교할 숫자 2 : ");
			int b = sc.nextInt();
			BNum(a, b); // 변수명 달라도 동작함.
			
			
			
			
			
		}
		
		

}
