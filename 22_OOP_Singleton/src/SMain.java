// Singleton pattern(객체를 유일하게 하나만 만들어 쓰고 싶을 때)
public class SMain {
	public static void main(String[] args) {

		// 자기 자신 : 이름, 나이
		Me me = Me.getMe();
		System.out.println(me);
		System.out.println(me.hashCode());
		Me me2 = Me.getMe();
		System.out.println(me);
		System.out.println(me2.hashCode());
		
		me.setName("맑은누리");
		me.setAge(14);
		System.out.println(Me.getMe());
		// 속성은 얼마든지 바뀔 수 있음. 객체는 바뀌지 않은 것.
	
	
	}

}
