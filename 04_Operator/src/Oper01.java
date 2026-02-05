import java.util.Scanner;

public class Oper01 {
	public static void main(String[] args) {
		
		
		int a = 0;
		// 대입연산자 : = <+ 같다는 뜻이 아님. 오른쪽걸 왼쪽에 담았다.
		// 같다 : ==
		
		int x = 10;
		
		// 키보드 입력받는 준비
//		Scanner keyboard = new Scanner(System.in);
//		
//		// 산술연산자 : + - * / %
//		
//		System.out.println("y 값 : ");
//		int y = keyboard.nextInt();
//		
//		int hap,cha,gob,mok;
//		hap = x + y;
//		cha = x - y;
//		gob = x * y;
//		mok = x / y;
//		
//		int p = x % y;
//		System.out.println(p);
		
		System.out.println("----------");
		
		// 대입연산자 : +=, -=, *=, /=
		System.out.println(x);
		
		x = x + 1;  // x에 x+1을 담았다.
		
		System.out.println(x);
		x += 1;
		System.out.println(x);
		
		x -= 2; // x = x - 2;
		x *= 2; // x = x * 2;
		x /= 3; // x = x / 3;
		
		// 증감연산자
		x++;    // 1증가
		System.out.println(x);
		x--;    // 1감소
		
		
		
		
		
	}

}
