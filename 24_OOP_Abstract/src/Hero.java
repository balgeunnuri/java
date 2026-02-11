// 추상클래스 vs 인터페이스
// 공통점 : 인스턴스화 x

public abstract class Hero { // class 앞에 abstract 추가하면 추상클래스
	String name;
	// 강제성, 규격화 ex) 우리나라에서 전자제품 200v로 맞춰
	abstract void attack(); // ? 바디없는{} 껍데기만 쓰고 생략가능 일반메서드 안 되니까. 여기선 안 됨.
	
	void fly() { // 일반 메서드 추가 void
		System.out.println("날아가기");
	}
	
}


class SuperMan extends Hero{
	@Override
	void attack() {
		System.out.println("눈알 레이저");
		
	}
}
class IronMan extends Hero{
	@Override
	void attack() {
		System.out.println("나노 펄스 어택");
		
	}
}
class Hurk extends Hero{
	@Override
	void attack() {
		System.out.println("다 때려 뿌수기");
		
	}
}