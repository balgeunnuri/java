
public class OMain01 {
	public static void main(String[] args) {
		// 객체 지향 - 실생활 반영
		
		// 객체 - 존재하는 모든 것.
		
		// 붕어빵 틀 == 클래스
		// 붕어빵 == 객체
		
		
		// dog
		// 나이가 3살
		// 이름이 초코
		// 체중이 3.5kg
		
		Cat cat1 = new Cat();
		System.out.println(cat1);
		
		
		cat1.name = "임망고";
		cat1.age = 6;
		cat1.weight = 4.8;
		
		cat1.printInfo(); // 위에서 값을 넣고 출력해야 함. 값 세팅을 안 하면 null,0,0.0 나옴.
		
		
		// 나이가 5살, 이름 홍길동, 체중이 4
		Cat cat2 = new Cat(); // 실체화했다 == 인스턴스를 만들었다 == 객체를 생성했다.
		cat2.name = "홍길동";
		cat2.age = 5;
		cat2.weight = 4;
		cat2.printInfo();
		
		cat1.meow();
		cat2.meow();
		
		System.out.println("------------");
		// 컴퓨터를 객체로 표현해주세요.
		// cpu 2.5, ram 8, ssd 256
		// 제품정보 출력해주는 기능
		
		// 컴 -> 객체? : class 정의 먼저.
		
		// 객체화, 인스턴스화, 실체화 => new로 만들어달라는 말.
		
		Computer com1 = new Computer();
		com1.cpu = 2.5;
		com1.ram = 8;
		com1.ssd = 256;
		com1.info();
		
		
		// Test
		// 아메리카노 2000원
		// 카페라떼 2500원
		
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 2000;
		
		Coffee cafelatte = new Coffee();
		cafelatte.name = "카페라떼";
		cafelatte.price = 2500;
		
		
		
		
		
	}
}
