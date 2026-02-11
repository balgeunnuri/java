
public class AMain {
	public static void main(String[] args) {
		
		// 히어로. hero.
		
		
		
		// 슈퍼맨
		SuperMan superMan = new SuperMan();
		superMan.attack();
		
		// 아이언맨
		IronMan ironMan = new IronMan();
		ironMan.attack();
		
		// 헐크
		Hurk hurk = new Hurk();
		hurk.attack();
		
		// 다향성 -> 추상클래스?로도 구현 가능
		// hero에 영웅들 담아서 사용가능..?!
		Hero hero = new SuperMan();
		hero = new IronMan();
		hero = new IronMan();
		
		
		
	}
}
