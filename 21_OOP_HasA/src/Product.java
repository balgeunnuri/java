
public class Product {

	String name;
	int price;
	Company company;
	// 필드에 클래스 타입도 들어갈 수 있다.
	
	
	public Product(String name, int price, Company company) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
	
	
}
