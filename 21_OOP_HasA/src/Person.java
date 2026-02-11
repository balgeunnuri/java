
public class Person {

	private String name; 
	private int age;
	private String gender;
	private Cat pet;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String gender, Cat pet) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pet = pet;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Cat getPet() {
		return pet;
	}

	public void setPet(Cat pet) {
		this.pet = pet;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		if (pet != null) {
			pet.info();
		}
	}
	
}
