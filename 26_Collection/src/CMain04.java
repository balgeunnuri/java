import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CMain04 {
	public static void main(String[] args) {

		// List 계열 - ArrayList : 가변사이즈 배열.
		// set 계열 - HashSet : 가변사이즈 배열, 중복 자동제거, 순서 랜덤

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);

		System.out.println(hs.size());

		for (Integer i : hs) {
			System.out.println(i);
		}
/*
3 20 10 // 하나 지정하려면 해쉬셋 어레이로 바꿔서 해야됨 30 // hashset -> arraylist
*/      // List라는 인터페이스에도 담을 수 있음. arraylist 보다 상위라서.
		List<Integer> list = new ArrayList<Integer>(hs);
		System.out.println(list.get(0));

		System.out.println("------------");
		Collections.shuffle(list);
		for (Integer ii : list) {
			System.out.println(ii);
		}

		System.out.println("------------");
		Set<Student> students = new HashSet<Student>();
		Student s1 = new Student("be1", 10, 10, 20, 30);
		System.out.println(s1);
		students.add(s1);
		students.add(new Student("가희", 10, 11, 25, 35));
		students.add(new Student("채진", 12, 17, 27, 36));
		students.add(new Student("지영", 13, 18, 29, 37));
		students.add(new Student("경민", 14, 19, 23, 38));

		System.out.println(students.size());

		Student ss = new Student("be1", 10, 10, 20, 30);
		students.add(ss);
		students.add(ss);
		students.add(ss);
		students.add(ss);

		System.out.println(students.size());

		// 중복제거 대상이라 5명에서 6명으로 1 늘은 것.

		System.out.println("------------");

		Random r = new Random();

		Set<Integer> lotto = new HashSet<Integer>();

		while (true) {
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() == 6) {
				break;
			}
		}
		for (Integer i : lotto) {
			System.out.print(i + " ");
		}
	}

}
