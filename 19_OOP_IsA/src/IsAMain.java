
public class IsAMain {
	public static void main(String[] args) {
		// 사람 = 이름, 나이    자기소개(toString)
			Human human = new Human();
			human.name = "somebody";
			human.age = 10;
			human.info();
			System.out.println("---------");
		// 학생 = 이름, 나이, 영어점수 자기소개기능
			Student student = new Student();
			student.name = "밝은누리";
			student.age = 3;
			student.engScore = 100;
			student.info();
			System.out.println("---------");
		// 선생 = 이름, 나이,  과목 자기소개기능
			Teacher teacher = new Teacher();
			teacher.name = "지영";
			teacher.age = 4;
			teacher.subject = "java";
			teacher.info();
		
		
	}
	
	
	
}
