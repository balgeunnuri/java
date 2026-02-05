
public class OCMain {
public static void main(String[] args) {
	
	// 사람
	// 이름, 나이
	
	Person person1 = new Person();
	
	person1.name = "밝은누리";
	person1.age = 3;
	
	System.out.println(person1.name);
	System.out.println(person1.age);
	
	Person person2 = new Person("선형",10);
	System.out.println(person2.name);
	System.out.println(person2.age);
	
	
	
}
}
