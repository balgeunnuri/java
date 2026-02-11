import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CMain05 {
	public static void main(String[] args) {
		
		// Map 계열 = HashMap : 가변 사이즈, 순서 시스템 x, 키 - 값 쌍
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("탄수화물", 10);
		m.put("단백질", 20);
		m.put("지방", 30);
		
		System.out.println(m.get("단백질"));
		
		// 찾고 싶은 학생이 있음.
		
		// 찾을 학생의 이름을 입력하면 그 학생의 정보를 출력
		
		// 학생을 번호로 찾겠다    => list
		// 		이름으로 찾겠다   => map
		
		
		Map<String, Student> students = new HashMap<String, Student>();//String이름으로 Student학생을 찾는다면
		students.put("선형", new Student("sh",20,10,10,10));
		students.put("밝은", new Student("be",20,10,10,10));
		students.put("누리", new Student("nr",20,10,10,10));
		students.put("맑은", new Student("me",20,10,10,10));
		
		System.out.println(students.get("선형").getEng());
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------");
		
		Set<String> names = students.keySet();
		System.out.println(names);
		
		
		System.out.println("--------------");
		System.out.println("누구? (이름) : ");
		String name = sc.next();
		
		System.out.println(students.get(name));
		
		
		
		
	}
}
