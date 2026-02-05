import java.util.Scanner;

public class BMIMain {
	public static void main(String[] args) throws InterruptedException {
		// BMI (체질량지수 구하는 프로그램)
		
		// 1. 필요한 값    키, 체중, 이름
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름\t: ");
		String name = sc.next();
		System.out.println("키\t(cm): ");
		Double height = sc.nextDouble();
		System.out.println("체중\t(kg): ");
		Double weight = sc.nextDouble();
		
		
		// 2. 계산식
			// 체중 / 키 * 키  (m)
		
		double heightM = height / 100;
//		System.out.println(heightM + " m"); 확인용.
		double bmi = weight / (heightM*heightM);
		
		
		// 3. 판정
		
				// 저 체 중 18.5미만
		        // 정 상 18.5이상 ~ 22.9이하
		        // 비만전단계 23이상 ~ 24.9이하
		        // 1단계 비만 25이상 ~ 29.9이하
		        // 2단계 비만 30이상 ~ 34.9이하
		        // 3단계 비만 35이상
		
	String bmi1 = "저체중";
		
	if (bmi>=35) {
		bmi1 = "3단계 비만";
	} else if (bmi>=30) {
		bmi1 = "2단계 비만";
	} else if (bmi>=25) {
		bmi1 = "1단계 비만";
	} else if (bmi>=23) {
		bmi1 = "비만전단계";
	} else if (bmi>=18.5) {
		bmi1 = "정상";
	} else {

	}
	
	 
	System.out.print("계산중...");
	Thread.sleep(300); // 1000이 1초
	System.out.print(".");
	Thread.sleep(300); 
	System.out.print(".");
	Thread.sleep(300); 
	System.out.print(".");
	Thread.sleep(300); 
	System.out.print(".\n");
	
	// 4. 결과출력		(소수점 1~2자리까지만)
	// BMI 지수 : ㅇㅇ
	// ㅇㅇ님, 당신은 ㅇㅇ입니다.
	
	System.out.printf("BMI 지수\t: %.2f\n", bmi);
	System.out.println(name + "님, 당신은 " + bmi1 + "입니다.");
		
		
		
	
	
	
	
	
	
		
		
		
	}
}
