
public class OCMain02 {
	public static void main(String[] args) {
		// Test
		
		//  프로그래머 
			// 이름, 나이, 야근여부
			// 일하는 기능
			// 정보출력 기능
		
		// - 오버로딩 생성자로 객체를 생성할 것
			// 객체 생성 후 정보출력.
		
		
		
		// 일하는 기능 내용 ex)
		// syso(p1.work("일")) ===> "개발하기" 출력
		// syso(p1.work("퇴근")) ===> "ㄳㄳ" 출력
		
		// @ p1.work(); => 콘솔에 "ㅋㅋ.." 출력
		
//		Programmer p = new Programmer();
//		System.out.println(p.nightDuty);
		Programmer p2 = new Programmer("밝은누리", 3, false);
		p2.info();
		System.out.println(p2.work("퇴근"));
		
		
		
		
	}
}
