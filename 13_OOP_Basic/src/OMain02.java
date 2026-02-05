
public class OMain02 {
public static void main(String[] args) {
	
	Coffee coffee1 = new Coffee();
	coffee1.name = "카페모카";
	coffee1.price = 4500;
	coffee1.info();
	
	Coffee coffee2 = coffee1;
	
	System.out.println(coffee1);
	System.out.println(coffee2);
	
	coffee2.name = "바닐라라떼";
	System.out.println(coffee1.name);
	
	coffee2 = null;
//	coffee2.info();
	coffee1.info();
	
	coffee1 = null; // GC발동. (heap 자동정리. 더이상 그 주소값을 가리키는 변수가 없을 때)
					// 쉽게 말하면 아무도 안 쓸때 정리.
	

}
}
