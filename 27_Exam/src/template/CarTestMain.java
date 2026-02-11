package template;

public class CarTestMain {
	public static void main(String[] args) {
		
		System.out.println("자율주행하는 자동차 ----------------");
		AICar aiCar = new AICar();
		aiCar.run();
		
		
		
		
		
		
		System.out.println("사람이 운전하는 자동차 --------------");
		ManualCar manualCar = new ManualCar();
		manualCar.startCar();
		manualCar.drive();
		manualCar.stop();
		manualCar.turnOff();
		
		
		
	}
}
