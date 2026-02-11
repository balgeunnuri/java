package exam;

interface Soundable{
	abstract void sounds(); // 추상 메서드. abstract 생략 가능.
}

class Cat implements Soundable{
	
	@Override
	public void sounds() {
		System.out.println("냥♡");
		
	}
	
}
class Dog implements Soundable{
	
	@Override
	public void sounds() {
		System.out.println("멍");
		
	}
	
}
class Bird implements Soundable{
	
	@Override
	public void sounds() {
		System.out.println("짹");
		
	}
	
}


public class SoundableExample {

	public static void printSound(Soundable sss) {
		sss.sounds();
	}

	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
}
