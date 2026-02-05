
public class Programmer {
	String name;
	int age;
	boolean nightDuty;
	
	
	
// 바로 컨트롤 스페이스
	public Programmer() {
		System.out.println();
	}




	public Programmer(String name, int age, boolean nightDuty) {
		super();
		this.name = name;
		this.age = age;
		this.nightDuty = nightDuty;
	}

	String work(String www) {
		if (www.equals("일")) {
			return "개발하기";
		} else if (www.equals("퇴근")) {
			return "ㄳㄳ";
		}
		
		return null;
		
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nightDuty);
	}
	
	
	
}
