class Book {
	String title;
	int price;
	String publisher;
	boolean stock;
	
	
	// 바로 컨트롤 스페이스로 생성
	public Book() {
	}

	// info 위에 위치.
	public Book(String title, int price, String publisher, boolean stock) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.stock = stock;
	}

	void info() {
		System.out.println(title);
		System.out.println(price);
		System.out.println(publisher);
		System.out.println(stock);

	}

}

public class OCMain03 {
	public static void main(String[] args) {

		// 책
		// 제목, 가격, 퍼블리셔, 품절여부
		// 정보출력 기능

		// 오버로딩 생성자로 객체 생성하고
		// 정보 출력하기.

		Book book = new Book("개미1", 12800, "이지", true);
		book.info();

	}
}
