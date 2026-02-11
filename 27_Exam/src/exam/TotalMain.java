package exam;

interface Action {
	void work();
}



abstract class Hero{
	private String name;
	private int age;
	
	 
	
	abstract void reward();
	
	
	
	void habit() {
		System.out.println("취미");
	}
	
	public Hero() {
		System.out.println("인간은 태어나면, 죽을 때까지는 심장이 계속 뜀 (당연히 숨도 쉼)");
	}

	public Hero(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class Faker extends Hero implements Action{
	
	
	
	public Faker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Faker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void reward() { //  강제성 부여
		System.out.println("2024 11월 롤드컵 우승");
	}	
	@Override
		void habit() { // 강제성 (x)
			System.out.println("책 읽기");
		}
	
	@Override
	public void work() {
		System.out.println("play lol");
	}
}


class YeonA extends Hero implements Action{
	 
	@Override
	void reward() {
		System.out.println("동계 올림픽 금메달리스트");
	}
	
	@Override
	public void work() {
		System.out.println("피겨 스케이팅");
	}
	
	
}







public class TotalMain {
public static void main(String[] args) {
	
	// 페이커, 김연아
	// 이름, 나이
	
	Faker faker = new Faker();
	faker.setName("이상혁");
	System.out.println(faker);
	
	
	YeonA yeonA = new YeonA();
	yeonA.work();
	
	
	
	
	
}
}
