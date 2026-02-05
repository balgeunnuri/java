
public class Person {
	String name;
	int age;
	
	// 위에 부분이 필드
	
	// constructor : 클래스 이름이랑 똑같이 생긴 매서드.
	// 초기값을 설정하는 용도
	// 초기화, 부팅같은 느낌으로 뭔가 하고 싶어서
	// 가시화 시킨 것.
	
	
	// 기본생성자 (생성자 전혀 앙ㄴ 건드리면 자동호출)
	// 안 건드렸다는 건 오버로딩 생성자를 만들지 않았다는뜻
	public Person() {
		// 나중에 가면 framework 등의 도움으로
		// 객체 생성을 내가 직접하는 게 아니라 대신 해줌
		// 도움 받고 싶으면 있어야됨. (다른애들이 기본생성자 씀)
		
		// 기본생성자 그냥 만드셈. (습관적으로)
		System.out.println("사람 등쟝~");
		name = "unknown";
		age = 1;
	}
	
	// 우클릭 -> 소스 -> 밑에서 두번째 콘스트럭터 필드
	// 호출 => 스트링, 인트 부여
	// Person person2 = new Person("선형",10);사용가능
	// this : 클래스(필드에 있는)
	
	
	// 오버로딩 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
