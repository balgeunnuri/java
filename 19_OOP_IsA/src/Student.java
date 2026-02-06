// student is a human(o) : 상속관계 만들어줄 수 있음.
public class Student extends Human{ //extends(<). 물려받음
	int engScore;
	
	
//	오버로딩 : 메서드 이름이 같은데 "파라미터"의 개수 또는 타입이 다른 거
//	오버라이딩 : 상위클래스에서 "상속받은 메서드"의 재정의
	
	@Override
	void info() {
		super.info();
		System.out.println(engScore);
	}

	
}
