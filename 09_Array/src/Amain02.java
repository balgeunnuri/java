import java.util.Iterator;

public class Amain02 {
		public static void main(String[] args) {
			
			// 학생들의 일본어 점수
			
			// 들어올 요소를 모를 때(요소, element => 칸 안에 들어가는 value)
			int[] jpScore = new int[5]; // 5칸짜리 배열.
								// index, 색인, 위치 다 같은 말
								
			
			jpScore[0] = 100;  // 0번 인덱스 == 첫번째칸
			jpScore[1] = 90;
			jpScore[2] = 80;
			jpScore[3] = 70;
			jpScore[4] = 60;
			
			
			// 네번째 학생 점수 출력
			System.out.println(jpScore[3]);
			// 마지막 학생 점수 출력
			System.out.println(jpScore[4]);
			
			// 값을 알고 있을 때
//			int engTest[] = new int[] {50,60,70,80,90};
			int engTest[] = {50,60,70,80,90};
			
			System.out.println(engTest[1]);
			// 몇칸짜리 배열인지
			System.out.println(engTest.length); // 칸수를 알아낼 수 있는 방법.
			
//			// 마지막
//			System.out.println(engTest[engTest.length - 1]);
			
			System.out.println("-----------------");
			
			
			// 전체 일어 점수 평균
			
			int avg = ( jpScore[0] + jpScore[1] + jpScore[2] + jpScore[3] + jpScore[4] ) / jpScore.length;
			System.out.println(avg);
			
			
			// 반복(for)문과 배열 친함. 친구
			
			for (int i = 0; i < jpScore.length; i++) {
				System.out.println(jpScore[i]);
			}
			
			System.out.println("-----------------");
			// 네번째거 foreach. 베프 (그런데 순차적으로, 증강개념 없음.)
			
			for (int val : engTest) {
				System.out.println(val);
			}
			
			System.out.println("-----------------");
			
			// jpScore 2번째 학생 점수 출력
			
			System.out.println(jpScore[1]);
			
			// jpScore 는 몇칸짜리 배열...?
			
			System.out.println(jpScore.length);
			
			// for로 하나씩 다 출력
			
			for (int i = 0; i < jpScore.length; i++) {
				System.out.println(jpScore[i]);
			}
			
			// foreach로 하나씩 다 출력
			
			for (int j : jpScore) {
				System.out.println(j);
			}
			
			
			// 도혁, 경용, 찬우
			
			String names[] = {"도혁", "경용", "찬우"}; // == String[] names 위치 달라도 됨.
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
		
			for (String name : names) {
				System.out.println(name);
			}
			
			// 5칸 짜리 배열 - 정수
			int[] push = new int[5];
			
			// 배열 만들고 초기화 안하면 0이 자동으로 들어가있음.(int의 경우만)
			
			for (int i = 0; i < push.length; i++) {
				System.out.println(push[i]);
			}
			
			
			// double 기본값 - 0.0
			// string -null
			
			push[0] = 1;
			push[1] = 2;
			push[2] = 3;
			push[3] = 4;
			push[4] = 5;
			
			
			for (int i = 0; i < push.length; i++) {
				push[i] = i+1; // ++ 사용하면 push[5]가 돼버려서 오류뜸
				System.out.println(push[i]);
			}
			
			// 저장된 거 다 더하기
			int total = 0;
			for (int i = 0; i < push.length; i++) {
				total += push[i];
			}
			
			System.out.println(total);
			
			// 위에거 foreach
			
			int total2 = 0;
			for (int aaa : push) {
				total2 += aaa;
			}
			System.out.println(total2);
			
			System.out.println("------------------------------");
			
			// jpTest 평균값 출력. for/foreach
			
			int total3 = 0;
			for (int i = 0; i < jpScore.length; i++) {
				total3 += jpScore[i];
			}
			System.out.println(total3 / jpScore.length);
			
			
			int total4 = 0;
			for (int score : jpScore) {
				total4 += score;
			}
			System.out.println(total4 / jpScore.length);
			
			
			
			
			
			
			
			
			
			
			
		}
}
