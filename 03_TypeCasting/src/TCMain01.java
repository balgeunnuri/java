
public class TCMain01 {
	public static void main(String[] args) {
		
		// TC (형 변환)
		// 그릇의 종류 바꾸는 거
		
		  // 기본 자료형
		  // 정수 : int
		  // 실수 : double
		
		  // int랑 int 연산 : 결과 int
		  // int랑 double 연산 : 결과 double
		
		double a = 10 / 4.0;  // 2.5 , =10.0 4=10.0 4.0, 4.0=(double)4
		                      // 그냥 10/4라고 하면 결과값이 2가 나와버림.
		System.out.println(a);
		
		// int 21억~~~ long 그것보단 큰 거
		
		int aa = 10;
		long bb = aa;   // int -> long '묵시적 형변환'이 일어났다고 함 = 당연한 것 그냥 해줄게~
		System.out.println(bb);
		
		int  cc = (int) bb;  // long -> int '명시적 형변환' = 롱이 더 큰데 인트 담으려고 해서 확인
		System.out.println(cc);  // 타입캐스팅 (int)추가하는 것
		
		// 마우스 에러 확인
		// 형변환 가능하다. (맞는 타입으로 캐스트) (커서 올려서 선택)
		// 캐스트 해달라 -> 형변환
		
		double dd = cc;    // int -> double 묵형. d>i
		int ee = (int) dd; // double -> int 명형. d는 소수점 존재, i는 정수만 가능.
		//  예) 100.5. 인트로 변환 시 0.5사라짐 : 데이터 손실을 의미
		
		int b = 5;
		System.out.println(ee + b);
		System.out.println("------------");
		
		// String + ? = String
		String ff = ee + "";  // "" empty 스트링이라함.
		System.out.println(ff);
		
	}

}
