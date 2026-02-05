import java.util.InputMismatchException;
import java.util.Scanner;

public class EHMain2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		
		try {
			
			System.out.println("y : ");
			int y = sc.nextInt();
//			if (y != 0) {
				System.out.println(x / y);
//			}
			
			
			int[] ar = {10,20};
			System.out.println("배열 몇번? (0,1)");
			int i = sc.nextInt();
			System.out.println(ar[i]);
			
			
			
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			System.out.println("error..");
			e.printStackTrace();
		}
			
			// Exception : 다른 오류들을 다 포함하고 있음. 얘만 사용해도 됨.
			
			
/*		} catch (ArithmeticException e) {
			System.out.println(" / 0 ㄴㄴ");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능해여");
			e.printStackTrace();
			// 위에서 터지면 캐치 실행. 연산 작동 안됨.
			// 터져서 뜨는 거랑 e.printStackTrace();입력해서 보는 거랑 다름.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0이나 1만 입력 가능함다");
		}
*/		
		
		
		
		
		
		
		
		
	}
}
