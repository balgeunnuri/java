
public class Me {
	//인스턴스 변수..!
	private String name;
	private int age;
	
	private static final Me ME = new Me("밝은누리", 28);
	
	
	
	public static Me getMe() {
		return ME;
	}


	
	
//	생성자에 private static 넣어주기 유일객체에
//	객체를 만들지 않고도 쓸 수 있어야 하니까.
	private Me() {
		// TODO Auto-generated constructor stub
	}

	private Me(String name, int age) {
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

	@Override
	public String toString() {
		return "Me [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
