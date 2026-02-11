package book;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int grade, int money) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 파라미터로 버스클래스 것을 받을 수 있는 모양
		bus.take(1000);
		this.money -= 1000;
	} 

	public void info() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
}
