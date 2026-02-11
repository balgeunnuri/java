
public class Bus extends Car{
	
	private int lineNum;

	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String name, String carNum, int lineNum) {
		super(name, carNum);
		this.lineNum = lineNum;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(lineNum);
	}

	
	
}
