
public class Com extends Product{
	
	private String cpu;
	private int ram;
	private int hdd;
	
	
	
	public Com(String name, int price, String cpu, int ram, int hdd) {
//		super(name, price);
		setName(name);
		setPrice(price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	
	
	
	
	
}


