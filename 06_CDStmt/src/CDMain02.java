
public class CDMain02 {
		public static void main(String[] args) {
			
			if (true) {
				System.out.println("ok");
				
			}
			
			System.out.println("ok2");
			//위랑 같은 거. 밑에꺼 쓰면 됨. 간단
			
			if (false) {
				System.out.println("ok3");  // 이건 결과값 ""와 같음, 안 적어도 됨
			}
			
			int a = 12;
			
			if (a % 2 == 0) {
				System.out.println(a + "는 짝수");
				System.out.println(a + "는 2의 배수");
			}
			
			if (a % 3 == 0) {
				System.out.println(a + "는 3의 배수");
			}
	
			if (a % 4 == 0) {
				System.out.println(a + "는 4의 배수");
			}
	
	
	
}
}
