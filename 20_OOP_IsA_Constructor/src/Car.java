
public class Car {

	private String name;
	private String carNum;
	
	
	public Car() {
	}


	public Car(String name, String carNum) {
		super();
		this.name = name;
		this.carNum = carNum;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(carNum);
	}
	
	
	
}


