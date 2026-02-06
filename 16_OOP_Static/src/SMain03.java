
public class SMain03 {
	public static void main(String[] args) {
		// 삼성
		
		// SamProduct
		
		// 플립4, 110, 삼성
		
		SamProduct flip4 = new SamProduct("플립4", 110);
		
		// 플립5, 150, 삼성
		
		SamProduct flip5 = new SamProduct("플립5", 150);
		
		// 버즈, 80, 삼성
		
		SamProduct buzz = new SamProduct("버즈", 80);
		
		flip4.info();
		flip5.info();
		buzz.info();
		
		System.out.println(SamProduct.getCnt());
		System.out.println(flip4);
		System.out.println(flip5);
		System.out.println(buzz); // flip4, flip5, buzz == 주소값이 나옴.
		
//		1. 필드 '직접' 접근 안되게 =>
//		2. 제조사는 무조건 삼성 (상수)
//		3. 모든 제품은 오버로딩 생성자로 인스턴스화
//		4. 상품의 이름/가격은 수정 가능.
//		   별도로 값 얻기도 가능하게. => getXXX setXXX
//		5. 상품정보 출력 기능
		
		
		
		
	}
}
