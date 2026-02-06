
public class SamProduct {
// 품명, 가격, 제조사
	private String name;
	private int price;
	final static String MAKER = "Samsung";
	private static int cnt;
	
	

//오버로딩 생성자에서 카운트 되어야 뉴 했을 때 값이 올라감
	public SamProduct(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		cnt++;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		SamProduct.cnt = cnt;
	}

	public static String getMaker() {
		return MAKER;
	}
	
	
	
	
	void info() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(MAKER);
		System.out.println("-----------");
		
		
		
	}





	@Override
	public String toString() {
		return "SamProduct [name=" + name + ", price=" + price + "]";
	}
	
}
