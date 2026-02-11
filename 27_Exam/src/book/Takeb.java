package book;

public class Takeb {
	public static void main(String[] args) {
		
		Student student = new Student("밝은눌", 3, 10000);
		
		Bus bus100 = new Bus(100);
		student.takeBus(bus100);
		student.info();
		bus100.info();
		
		
	}
}
