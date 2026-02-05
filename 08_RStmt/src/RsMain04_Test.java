import java.util.Random;
import java.util.Scanner;

public class RsMain04_Test {
	public static void main(String[] args) {
		// 내가 입력한게 컴터 숫자랑 일치할 때까지 반복(맞추면 끝)
		
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		while (true) {  //컨셉에 따라 위치 바뀜
		
		int comNum = r.nextInt(4)+1; // 1,2,3,4
		System.out.println("컴 숫자 : " + comNum);
		
			
		System.out.println("숫자를 입력하세요. (1~4)");
		int userNum = sc.nextInt();
		
			
		if (comNum == userNum) {
			System.out.println("정답~");
			break;
		}
		
	}
		
		// number up&down   ---> while 위치 :
		// oddeven 홀짝		---> while 위치 :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
