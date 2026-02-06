// Teacher is a human(o) : 상속관계 만들어줄 수 있음.
// 티처를 휴먼에서 상속받겠다.
// 부모/ 슈퍼/ 상위 클래스 == 휴먼
// 자식/ 서브/ 하위 클래스 == 스튜던트, 티쳐
public class Teacher extends Human{
	
	String subject;
	
//	오버라이딩 : 상속받은 메서드의 재정의 (건드린 것)
	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(subject);
	}
	
	
}
