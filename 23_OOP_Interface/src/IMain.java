interface Coffee { // 인터페이스 강제성.
	public abstract void name(); // {}바디 없는 메서드 : 껍데기만 있는 추상메서드.

	void price(); // abstract 생략가능.

	default void hotOrIced() { // 디폴트 메서드

	}

}

class Espresso implements Coffee {

	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println(3000);
	}

}

class CafeLatte implements Coffee {

	@Override
	public void name() {
		System.out.println("카페라떼");
	}

	@Override
	public void price() {
		System.out.println(4000);
	}

	@Override
	public void hotOrIced() {
		Coffee.super.hotOrIced();
		System.out.println("hot or iced?");
	}
}

class VanillaLatte implements Coffee {

	@Override
	public void name() {
		System.out.println("바닐라라떼");
	}

	@Override
	public void price() {
		System.out.println(5500);
	}

	@Override
	public void hotOrIced() {
		Coffee.super.hotOrIced();
		System.out.println("hot or iced?");
	}
}

class Frappuccino implements Coffee {

	@Override
	public void name() {
		System.out.println("프라푸치노");
	}

	@Override
	public void price() {
		System.out.println(6000);
	}

}

// 인터페이스 -> 매개체. 한마디로 얘기해라~. 중간매개, 연결해주는
//           오버워치 다른 캐릭터 - 궁 Q - 각 다른 기술. (Q가 매개체)
public class IMain {
	public static void main(String[] args) {
		
		// 다형성 (polymorphism)
		// 하나의 인터페이스를 통해서 다양한 형태의 결과로 나가는 것.
		
		
		Coffee coffee = new VanillaLatte();
		coffee.name();
		coffee = new CafeLatte();
		coffee.name();
		
		
		
		
		
		// 커피(추상화)

		CafeLatte cafeLatte = new CafeLatte();
		cafeLatte.name();
		cafeLatte.price();
		cafeLatte.hotOrIced();

		Frappuccino fuFrappuccino = new Frappuccino();
		fuFrappuccino.name();
		fuFrappuccino.price();
		fuFrappuccino.hotOrIced();

	}

}
