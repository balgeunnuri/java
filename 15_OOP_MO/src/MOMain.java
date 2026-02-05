
public class MOMain {
	public static void main(String[] args) {
	// 메소드 오버로딩 (겹쳐서 로딩을 한다)
	Calc.add(1,2);
		
	// 정수 2개 출력
	Calc.add(1, 2);
	
	// 정수 3개 출력
		Calc.add(10, 20, 30);
		
	// 정수 4개 출력
		Calc.add(10, 20, 30, 40);
		
		
		// 실수 2개 합 출력
		Calc.add(1.1, 1.2);
		
		
		// 몇개를 넣든 다 더해주는
		Calc.add_free(1,1,1,2); 
		// [D@5305068a => 주소값
		// [ : 대괄호 => 배열
		// 배열 -> for문
		
		// 몇개를 넣든 다 곱해주는
		Calc.gob_free(1,2,3);
		
}
}
