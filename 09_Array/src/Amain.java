import java.util.Scanner;

public class Amain {
	public static void main(String[] args) {
		// 배열
		
		Scanner sc = new Scanner(System.in);
		int score[] = new int [4]; // 4칸
				int a = 10;
		
		System.out.println("입력 받을 값 1 : ");
		score[0] = sc.nextInt();
		System.out.println("입력 받을 값 2 : ");
		score[1] = sc.nextInt();
		System.out.println("입력 받을 값 3 : ");
		score[2] = sc.nextInt();
		System.out.println("입력 받을 값 4 : ");
		score[3] = sc.nextInt();
		
		int result = score[0] + score[1] + score[2] + score[3];
		System.out.println(result);
		
		
		
	}
}
