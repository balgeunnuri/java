
public class Calc {
	// 필드 (속성)
	// 표현할 속성이 없음.
	// 필드를 정의할 필요 없음.
	
	// 객체를 만들 필요도 없음
	
	
	// 클래스 메서드 ( static 메서드 )
//	Product.printInfo();
//	객체가 여러개여도 메서드는 하나만 있어도 됨.
	
	
	public static void add(int i, int j) {
		System.out.println(i + j);
		
	}
	
	
	// 인스턴스 메서드 ( 일반메서드 )
//  Product p1 = new Product("A", 1000);
//	Product p2 = new Product("B", 2000);
	
	
	public void add(int i, int j, int x) {
		System.out.println(i + j + x);
	}
	
/*	
	세상에는 두 가지가 있다
	1. 클래스에 속한 것 (static)
	2. 객체에 속한 것 (instance)
	
	클래스(static)는 이렇다
	클래스가 메모리에 올라갈 때 딱 한 번만 생성
	객체가 없어도 존재
	모든 객체가 공유
	클래스 이름으로 바로 사용
	
	Counter.sNum;
	Counter.printSNum();
	👉 그래서 이름이 클래스 변수 / 클래스 메서드
	
	객체(instance)는 이렇다
	new 할 때마다 새로 생성
	객체마다 각자 따로 존재
	객체를 통해서만 접근 가능

	c1.num;
	c2.num;
	
	그래서 static에서 객체 멤버 못 쓰는 이유
	static은 이렇게 말하는 거야:
	“난 객체가 없어도 존재하는데
	어떤 객체의 변수인지 어떻게 알아?”

	그래서

	static → static만 바로 사용 가능
	객체 것 → 반드시 객체 필요
	
	한 줄 최종 요약 (시험용)
	static은 클래스 소속이라 객체 없이 존재하고,
	main은 프로그램 시작 시 객체가 없어서 static이다.
*/	
	
	
}
