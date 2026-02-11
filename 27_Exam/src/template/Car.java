package template;

public abstract class Car {

		abstract void drive();
		abstract void stop();
		
		public void startCar() {
			System.out.println("시동을 켭니다.");
		}
		public void turnOff() {
			System.out.println("시동을 끕니다.");
		}
		
		
		// 템플릿 메서드 : 양식 고정
		final public void run() { // final이 오버라이드 막아줌.
			startCar();
			drive();
			stop();
			turnOff();
		}
		
	
	
}
