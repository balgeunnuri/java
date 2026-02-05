import java.util.Scanner;

public class Test_Avg2 {
	public static void main(String[] args) {
		// 성적 평균점수와 등급을 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		// 1. 입력 받기 (중간, 기말) - int로
		
		System.out.println("중간 : ");
		int mid = sc.nextInt();
		System.out.println("기말 : ");
		int fin = sc.nextInt();
		
		
		// 2. 평균점수 구하기
		   // (중간 + 기말 / 2)
		
		
		// 3. 판정
			// 90점 이상 A
			// 90점 이상 A
			// 80점 이상 B
			// 70점 이상 C
			// 60점 이상 D
			// 나머지 F
		
		
		// 1.중복이 되는 거 찾기
		int avg = (mid+fin) / 2;
//		System.out.println("평점 : " + avg);
		
		String grade = "F";
		
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 80) {
			grade = "C";
		} else if (avg >= 80) {
			grade = "D";
		}
		
			System.out.println("평점 : " + avg);
			System.out.println("등급 : " + grade);
		
		
		// 4. 결과출력
			// 평점 : ㅇㅇ
			// 등급 : ㅇ
		
		
			
		
		
		
		
		
	}
}
