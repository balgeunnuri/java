
public class BMIMain {
	public static void main(String[] args) {
		

	// BMI 객체지향 설계
		// 현실을 반영하자.
	
	// 의사, 기계, 네이버 계산기
	Doctor doctor = new Doctor();
	// 사람, 고객, 손님, 유저
	Guest guest = new Guest();
	
	try {
		doctor.act1(guest);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
