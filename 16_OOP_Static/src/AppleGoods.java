
public class AppleGoods {
	String name; // 인스턴스 변수. 인스턴스를 만들지 않고는 쓸 수 없으니까
	private int price; // private : 이 클래스에서만 사용 가능
	static int cnt; // 클래스 변수. 앞에 static 붙여주기.
	
	// 상수
	static final String COMPANY = "Apple"; //변경될 일 없으니까 초기화. 모를땐 선언만 하고 끝냈었는데,..
	// 상수 == 변수 정반대. 변하지 않는 수. ex) 파이 => 3.14 변하지 않음
	// static final => 변환법.
	// 상수는 다 대문자로 적는 게 약속.
	// 상수 -> static 
	// static : 객체가 없어도 쓸 수 있음, 공용메모리 자원이 필요할 때도 사용.(클래스 변수)
	
	// 값 세팅용 : 가격을 넣으면 그걸 price에 넣어주는 메서드
	// 단축기로 사용 가능.
	public void setPrice(int price) { //int price:매개변수
		// 메서드 안에서 조건 부여 가능. (if로)
		this.price = price;
	}
	
	// 값 가져오는용 : 가격만 구해주는 (돌려주는, return해주는)
	// 단축기로 사용 가능.
	public int getPrice() {
		return price;
	}
	
	
	
	// 밑에 생성자 만드는 이유?
	// 아이폰을 기본생성자(인스턴스메서드?)로 만들었으니까
	
//	AppleGoods iphone = new AppleGoods();
//	iphone.name = "아이폰6s";
//	iphone.price = 120;
//	iphone.info();
	
	public AppleGoods() {
		cnt++;
	}

	// 위에 필드를 이용해서 생성자 만든 것
	// String company = "Apple"는 필드에서 초기화했으니
	// 오버로딩 생성자에서 제거해주기.
	public AppleGoods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		cnt++;
	}
	
	void info() {
		// void인 이유?
		// 결과를 받지 않고 그냥 출력이니까.
		System.out.println(name);
		System.out.println(price);
		System.out.println(COMPANY);
	}
	
	
	
}
