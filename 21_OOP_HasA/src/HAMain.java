
public class HAMain {
	public static void main(String[] args) {
		
		// 사람
			// 이름, 나이, 성별, 자기소개 기능
		Person person = new Person("임밝은누리", 28, "여자", null);
		person.info();
		
		
		
		// 고양이
			// 이름, 나이, 종, 정보출력 기능
		Cat cat = new Cat("임망고", 7, "스코티시 폴드");
		cat.info();
		
		
		person.setPet(cat);
		person.info();
		
		Person person2 = new Person("김ㅇㅇ", 28, "남자", new Cat("김망고", 7, "스코티시 폴드"));
		// 임밝은누리랑 김ㅇㅇ 다른 고양이. 뉴로 만들어서?
		person2.info();
		
	}
}
