import java.util.Scanner;

public class Var04 {
	public static void main(String[] args) {
		// import 단축기 : ctrl + shft + o (컨트롤쉬프트오)
		
		// 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in); 
		
		// 이름 입력 받기
		System.out.println("이름을 입력하세요.");
		String name = keyboard.next();
		
		// 나이를 입력 받기
		System.out.println("나이를 입력하세요.");
		int age = keyboard.nextInt();
		
		System.out.println(name + "님 당신은 " + age + "살 이군요.");
	}

}
