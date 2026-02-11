
public class Taxi extends Car{
	private int price;
	
	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	public Taxi(String name, String carNum, int price) {
		super(name, carNum);
		this.price = price;
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(price);
	}
	
}
