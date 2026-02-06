
public class SMain02 {
	public static void main(String[] args) {
		// apple 쇼핑몰
		
		// appleGoods
		
		// 품명 : 아이폰6s, 가격 120, 제조사 : 애플
		AppleGoods iphone = new AppleGoods();
		iphone.name = "아이폰6s";
		iphone.setPrice(150);
		iphone.info();
		System.out.println(iphone.getPrice());
		
		// 품명 : 아이패드, 가격 : 150, 제조사 : 애플
		AppleGoods ipad = new AppleGoods("ipad", 150 );
		ipad.info();
//		ipad.price = 200;
		ipad.info();
		
		// 품명 : 에어팟, 가격 : 30, 제조사 : 애플
		AppleGoods airPod = new AppleGoods("에어팟", 30);
		airPod.info();
		
		// 에플굿즈로 만든 것중에 뭐가 있는지, 뭘 만들지 모르지만
		// COMPANY는 상품이 없어도 대답할 수 있음
		System.out.println(AppleGoods.COMPANY);
		System.out.println(AppleGoods.cnt);
		
		
	}
}
