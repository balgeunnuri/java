import java.util.ArrayList;
import java.util.Comparator;

public class CMain02 {
	public static void main(String[] args) {
		// List 계열 : 가변 사이즈 배열 - 가장 많이 사용
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(1.1);
		al.add("zzz");
		al.add("zzz");
		al.add("zzz");
		System.out.println(al.size());
		
		ArrayList<String> al2 = new ArrayList<String>(); // <String> 하나는 생략 가능
		al2.add("문자열만 가능");
		al2.add("ㅎㅅㅎ");
		al2.add("ㅎㅁㅎ/");
		System.out.println(al2.size());
		System.out.println(al2.get(1)); // index라 0부터 카운트. 두번째 숫자:1
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		for (String s : al2) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		al2.add("ㅎ");
		al2.add(1,"zzzzz"); // 원하는 위치에 추가 가능
		al2.set(1, "qqqqqq"); // 교체, 수정가능
		al2.remove(0); // 첫번째 삭제 가능
		
		for (String ss : al2) {
			System.out.println(ss);
		}
		
		System.out.println("-------------");
		// <클래스명> : generic => 타입을 제한하는 것.
		// 앞에 대문자				// 컴파일 단계에서 이미 오류 확인 가능. <String> -> 정수 적음 오류.
		
		
		// 정수 10, 20 추가하고 다 출력
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(3);
		al3.add(25);
		al3.add(27);
		al3.add(29);
		
		al3.sort(Comparator.naturalOrder()); // 정렬 : 작은수부터
		
		for (Integer i : al3) {
			System.out.println(i);
		}
		
		
		
		
	}
}
