
public class Var02 {
	public static void main(String[] args) {
		
		byte a = (byte) 128;
		System.out.println(a);
		
		long b = 21000000000l; //1이 아니라 영문 L임
		
		// 1.2 실수형(소수점 있는 숫자)
		// dobble(default)
		
		float eyesight = (float)0.6;
		float eyeSight = 0.6f; // 바이트 플롯 범위 적어서 안 쓸 것
		
		double weight = 60.55;
		System.out.println(weight);
		
		// 한글자용. 예) '남자' 안됨.
		char gender = '남'; // char 쓸 때는 문자에 ''사용
		
		// 1.4 논리형 (참/거짓) true, false : ""로 안 감싸도 됨
		boolean soldOut = true;
		System.out.println(soldOut);
		
		int c = 10;
		int d = 20;
		
		int e,f,g;
		e = 1;
		f = 2;
		g = 3;
		
		boolean judge = c > f;
		System.out.println(judge);
		
		System.out.println(e < g);

		// 3. 아무것도 없다 void
	}

}
