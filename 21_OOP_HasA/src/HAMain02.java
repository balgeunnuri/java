
public class HAMain02 {
public static void main(String[] args) {
	
	// 회사
		// 회사명, 설립연도, 사옥위치
		//정보출력
	
	Company company = new Company("mz", 1900, "종로");
	System.out.println(company); // company 찍으면 주소값 나옴
	
	// 제품
		// 품명, 가격
		// 정보출력
	
	Product product = new Product("황금구렁이", 30000, company);
	System.out.println(product);
}
}
