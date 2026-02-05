
public class Var01 {
	public static void main(String[] args) {

		// 변수 : 임시 데이터 저장

		// 데이터를 담는 그릇(변수)
		// 내용물의 데이터 타입(형)

		// 데이터는 수정 가능

		// 변수 만들기
		// 자료형(그릇 종류) 변수명(그릇 이름)

		int a = 0;
		System.out.println("0");
		System.out.println(0);
		System.out.println(a);

		// 내 나이를 저장
		int myAge; // myAge라는 그릇 생성.
		myAge = 28; // 거기에 20 담음.

		System.out.println(myAge);
		System.out.println("myAge");
		System.out.println(20);
		// 다 다름

		// 내 신발사이즈를 저장 (235)
		int shoseSize; // 변수 선언
		shoseSize = 235; // 초기화 : 변수에 최초로 어떤 값을 넣는 것

		int shoseSize2 = 260; // 선언 및 초기화 한 번에

		System.out.println(shoseSize2);

		shoseSize2 = 100;
		System.out.println(shoseSize2);

		int aaa = 100000; // 변수 이름 이쁘게 적어야함
		int the_number_of_hair = 100000; // 변수 이름 이쁘게 적어야함
		int theNumberOfHair = 100000; // 변수 이름 이쁘게 적어야함

		System.out.println(theNumberOfHair);

		// Test

		// 변수를 사용해서 콘솔에 출력
		// 핸드폰 가격 : 1000$

		int phoneCost = 1000;

		System.out.print("핸드폰 가격 : ");
		System.out.print(phoneCost);
		System.out.println("$");

		phoneCost = 1500;

		System.out.println("핸드폰 가격 : " + phoneCost + "$");
		// 이번엔 밑에 한 줄이 더 잘 줄인 것

		byte b = (byte) 128;
		System.out.println(b);
		
		long c = 2100000000l; //1이 아니라 영문 L임
		
		// 1.2 실수형(소수점 있는 숫자)
		// dobble(default)
		
		float eyesight = (float)0.6;
		float eyeSight = 0.6f; // 바이트 플롯 범위 적어서 안 쓸 것
		
		double weight = 60.55;
		System.out.println(weight);
		
		// 한글자용. 예) '남자' 안됨.
		char gender = '남'; // char 쓸 때는 문자에 ''사용
		
		// 1.4 논리형 (참/거짓) true, false : ""로 안 감싸도 됨
		boolean soldOut = true;
		System.out.println(soldOut);
		
		int d = 10;
		int e = 20;
		
		int f,g,i;
		f = 1;
		g = 2;
		i = 3;
		
		boolean judge = d > g;
		System.out.println(judge);
		
		System.out.println(f < i);

		// 3. 아무것도 없다 void
		
		
		
		
		
		

	}

}
