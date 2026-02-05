import java.util.Scanner;

public class CDMain05 {
		public static void main(String[] args) {
			// if, else <==> 삼항연산자
			// if <==> switch case 둘 다 상호 대체됨. 그런데 상황적으로 편한 게 있음.
			
			String line = "jr";
			
			switch (line) {
			case "야마노테센" :
				System.out.println("1번 플랫폼");
				break;
			case "jr" :
				System.out.println("2번 플랫폼");
				break;
			case "다른거" :
				System.out.println("3번 플랫폼");
				break;

			default:
				break;
			}
			
			// 입력받을 준비
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("-----------------");
			System.out.println("몇 번 메뉴? (1 ~ 4)");
			System.out.println("1. Americano");
			System.out.println("2. CafeLatte");
			System.out.println("3. VanillaLatte");
			System.out.println("4. MokaLatte");
			
			int num = sc.nextInt();  // 정수 입력 받을 거니까 int 사용.
			
			// if, elseif
			// switch
			
			switch (num) {
			case 1:
				System.out.println("아메리카노 주문 받았습니다~");
				break;
			case 2:
				System.out.println("카페라떼 주문 받았습니다~");
				break;
			case 3:
				System.out.println("바닐라라떼 주문 받았습니다~");
				break;
			case 4:
				System.out.println("모카라떼 주문 받았습니다~");
				break;

			default: // == else
				System.out.println("다시 주문해주세요~");
				break;
			}
			
			
			if (num == 1) {
				System.out.println("아메리카노 주문 받았습니다~");
			} else if (num == 2) {
				System.out.println("카페라떼 주문 받았습니다~");
			} else if (num == 3) {
				System.out.println("바닐라라떼 주문 받았습니다~");
			} else if (num == 4) {
				System.out.println("모카라떼 주문 받았습니다~");
			} else {
				System.out.println("다시 주문해주세요~");
			}
			
			
			// 이병(1), 일병(2), 상병(3), 병장(4)
			
			// 이병 : 눈치, 부르면 튀어가기, 훈련, 잠
			// 일병 : 부르면 튀어가기, 훈련, 잠
			// 상병 : 훈련, 잠
			// 병장 : 잠   
			
			// 중복되어 있는 파트가 있음
			
			String grade = "이병";
			
			switch (grade) {
			case "이병":
				System.out.print("눈치");
			case "일병":
				System.out.print(", 부르면 튀어가기");
			case "상병":
				System.out.print(", 훈련");
			case "병장":
				System.out.println(", 잠");
				break;
			default:
				break;
			}
			
			
			// 글자 사이에 ==사용 불가. ex) grade=="이병"
			
			// if 더 유리한 케이스
			
			// 상품 1000~2000원까지는
			// 키 160~160 150.1
			
			// 1 ~ 9살 업어주기
			// 20대 펍가기
			// 30대 일 열심히
			// ->범위가 잡힌 경우
			
			int age = 20;
			switch (age) {
			case 1,2,3,4,5,6,7,8,9:
				System.out.println("업어주기");
				break;
			case 20,21,22,23,24,25,26,27,28,29:
				System.out.println("펍가기");

			default:
				break;
			}
			
			
			
			
			
			
			
			
		}
}
