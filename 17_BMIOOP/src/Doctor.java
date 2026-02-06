
public class Doctor {

	public void act1(Guest guest) throws InterruptedException {
		// 손님한테 정보 물어보기
		// 검사하려면 정보가 필요 하니까.
		System.out.println("정보 좀 주세요~");
		
		// 손님의 본인 정보를 대답
		guest.act2();
		
		double bmi = act3(guest); // bmi 수치 계산
		act4(act3(guest), guest.name);
	}

	private void act4(double bmi, String name) throws InterruptedException {
		String result = "3단계 비만";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi <= 22.9) {
            result = "정상";
        } else if (bmi <= 24.9) {
            result = "비만전단계";
        } else if (bmi <= 29.9) {
            result = "1단계 비만";
        } else if (bmi <= 34.9) {
            result = "2단계 비만";
        }
        
        System.out.print("음.");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".\n");



        System.out.printf("BMI지수 : %.2f\n", bmi);
        System.out.println(name + "님, 당신은 " + result + " 입니다.");
		
	}

	private double act3(Guest guest) {
		if (guest.height>3) {
			guest.height /=100;
		}
		double bmi = guest.weight / (guest.height*guest.height);
		return bmi;
	}
	

}

