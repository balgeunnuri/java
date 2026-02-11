
public class Cat {

	private String name; 
	private int age;
	private String type;
//	private Person master;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
	}
	
}
