import java.util.ArrayList;
import java.util.Comparator;

public class CMain03 {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("be1", 10, 10, 20, 30);
		System.out.println(s1);
		students.add(s1);
		students.add(new Student("가희", 10, 11, 25, 35));
		students.add(new Student("채진", 12, 17, 27, 36));
		students.add(new Student("지영", 13, 18, 29, 37));
		students.add(new Student("경민", 14, 19, 23, 38));
		
		// 학생수
		System.out.println(students.size());
		
		// 첫번째 학생의 국어점수
		System.out.println(students.get(0).getKor());
		
		// 두번째 학생의 이름 
		System.out.println(students.get(1).getName());
		
		// 세번째 학생의 일본어 점수
		System.out.println(students.get(2).getJp());
		
		// 네번째 학생의 이름과 나이
		Student s4 = students.get(3);
		System.out.println(s4.getName() + "/" + s4.getAge());
		
		// 다섯번째 학생의 국영일 평점
		Student s5 = students.get(4);
		int avg = (s5.getKor() + s5.getEng() + s5.getJp()) / 3;
		System.out.println(avg);
		
		for (Student ss : students) {
			System.out.println(ss);
		}
		
//		나이순 정렬
		Comparator<Student> d = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				return o1Age.compareTo(o2Age);
			}
		};
		System.out.println("---------------");
		students.sort(d.reversed());
		for (Student ss : students) {
			System.out.println(ss);
		}
		
		
		
	}
}
