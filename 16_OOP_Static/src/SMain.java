
public class SMain {
	// 실행하면 그냥 켜져야 하니까 
	// SMain는 Calc cal = new Calc();이런 형태 안 해도 -> 객체 만드는 거.
	// static 에서 실행
	// public 달린 class의 이름 == 파일명과 같아야함.
	// class는 자바의 최소 단위
	// 처음 파일 만들면 파일명으로 바로 생성됨.
	
	
	public static void main(String[] args) {
		// main의 이유가 void인 이유?
		// 종료되면 종료인 거지 필요한 게 없음.
		// 실행 되는 것이 목적.
		// main도 메서드의 일종이라 실행하려면 class 안에서 사용돼야함.
		
		
		// 품명, 가격, 브랜드 속성 x 요구한 적 없음
		
		// 게산기
			// 기능
			// 2,3, 자유
		Calc.add(1, 2);
		
		
		
		// 클래스명.static메서드()
		
		Calc cal = new Calc();
		// new 쓰기 전에 Calc cal는 붕어빵 틀에 불과함
		// new 쓰고 나서 heap 영역에 들어감
		// static 이랑은 무방함. static 영역은 따로.
		// static 은 숫자 2개짜리. 스테틱 영역에 있어서 돌아가긴 하는데
		// 컴이 2개짜리 사용 권장함.
		
		
		cal.add(1, 1, 1);
		
		cal.add(1, 2);
		
		// cal add() static 왜 붙히까? => 객체를 안 만들고 쓰려구요
		// 왜 안 만들어요? => 만들 필요가 없으니까.
		// 왜 필요가 없어요? => 표현할 속성이 없으니까요. (고유한 그 계산기에 대한 표현의 니즈가 없어서요)
		
		// 그럼 static을 안 붙히면 객체 안 만들고는 못써요? => 네 못써요.
		
		
		
		
		
	}
}
