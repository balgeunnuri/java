import java.util.Scanner;

public class Amain04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score[] = new int [4];
		/*
		for (int i = 0; i < score.length; i++) {
			System.out.printf("입력 받을 값 %d : ", i+1);
			score[i] = sc.nextInt();
		}
		
		int hap = 0;
		for (int i = 0; i < score.length; i++) {
			hap += score[i];
		}
		System.out.println(hap);
		
		int hap2 = 0;
		for (int asd : score) {
			hap2 += asd;
		}
		System.out.println(hap2);
		
		// 결과 출력
		// 1 + 2 + 3 + 4 = 10
		System.out.printf("%d + %d + %d + %d = %d", score[0], score[1], score[2], score[3], hap2);
		System.out.println();
		 */
		
		int total = 0 ;
		for (int i = 0; i < score.length; i++) {
			System.out.printf("입력 %d : ", i+1);
			score[i] = sc.nextInt();
			total += score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			if (i == score.length-1) {
				System.out.printf("%d = %d\n",score[i], total);
			} else {
				System.out.printf("%d + ",score[i]);
			}
		}
		
		
		// 삼항연산자로도 만들어보기.
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			System.out.print(i == score.length -1 ? " = " : " + ");
		}
		System.out.println(total);
		
	}
}
