import com.benr.product.Computer;
import com.benr.product.Printer;
import com.benr.product.Scanner;

public class PMain {
	public static void main(String[] args) {
		
		// 프린터
			// 이름, 가격
		Printer p = new Printer("짱짱프린터", 10);
		System.out.println(p);
		// 스캐너
			// 이름, 가격
		Scanner sc = new Scanner("짱짱스캐너", 111);
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		System.out.println(sc);
		
		// 컴퓨터
			// 이름, 가격, cpu, ram, hdd
		Computer com = new Computer("aa", 1, 1, 1, 1);
		com.cpu = 11;
		com.ram = 3;
		com.hdd = 1;
		
	}
}
