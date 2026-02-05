import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		// 숫자 4개를 하나씩 입력 받기
        // ex)

        //        입력 1 : 사용자가 숫자 하나를 입력
        //        입력 2 : 사용자가 숫자 하나를 입력
        //        입력 3 : 사용자가 숫자 하나를 입력
        //        입력 4 : 사용자가 숫자 하나를 입력

        // 결과 출력
            // 5 + 2 + 6 + 14 = 27
            // 총합 : 27
		
		System.out.print("입력 1 : ");
		int n1 = k.nextInt();
		System.out.print("입력 2 : ");
		int n2 = k.nextInt();
		System.out.print("입력 3 : ");
		int n3 = k.nextInt();
		System.out.print("입력 4 : ");
		int n4 = k.nextInt();
		
		// 위에 int = n1, n2, n3, n4;하면
		// 밑에 int 빼고 그냥 n1 = k.nextInt();로 적어도 됨
		
		
		int total = n1 + n2 + n3 + n4;
		
		System.out.printf("\n%d + %d + %d + %d = %d\n", n1,n2,n3,n4,total);
		System.out.println("총합	: " + total);
		
		
		// 숫자 4개를 하나씩 입력 받기
        // ex)
		
		// a = k.nextint();

        //        입력 1 : 사용자가 숫자 하나를 입력
        //        입력 2 : 사용자가 숫자 하나를 입력
        //        입력 3 : 사용자가 숫자 하나를 입력
        //        입력 4 : 사용자가 숫자 하나를 입력

        // 결과 출력
            // 5 + 2 + 6 + 14 = 27
            // 총합 : 27
		
	}

}
