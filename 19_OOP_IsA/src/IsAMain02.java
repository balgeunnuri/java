
public class IsAMain02 {
	public static void main(String[] args) {
		// - 필드 '직접'접근 x
		// - 나중에 값 수정 가능하게 : setter
		// - 생성할 때 값 세팅도 가능하게 : 오버로딩
		
		
		
		// 컴퓨터 : 품명, 가격, cpu, ram, hdd
		// 정보출력기능
			Com com = new Com("mac", 150, "인텔", 8, 12);
			com.info();
			System.out.println(com.getCpu());
			System.out.println(com.getRam());
			System.out.println(com.getHdd());
			System.out.println("----------------");
			
		// 핸드폰 : 품명, 가격, 디스플레이 사이즈, 무게
		// 정보출력기능
			Phone phone = new Phone("iphone6", 70, 10.8, 2.1);
			phone.info();
			System.out.println(phone.getDisplay());
			System.out.println(phone.getWeight());
			System.out.println("----------------");
			
		// 펜 : 품명, 가격
		// 정보출력기능
			Pen pen = new Pen("형광펜", 3000);
			pen.info();
			System.out.println("----------------");
			
		
		// 슈퍼클래스 필드가 다 private 걸려있어서 상속이 안될텐데
			// 어떻게 값이 세팅이 되고, 정상 동작까지 하는 걸까?
			
			// 1. 오버로딩 생성자 사용의 경우 : 
//			상속을 못받은 필드와 상관없이 부모의
//			오버로딩 생성자에 접근이 가능 (super(name,age));
//			getter, setter로 접근이 가능해진 것이지
//			상속받은 것은 아님.
//			생성자는 '클래스이름()' 형태인데 클래스 이름이 겹쳐질 수가 없음
//			ex) Com(){}        / Product(){}
//			   (super(name,age)
			
			// 2. setter 사용 값 세팅의 경우 : 
//			필드는 상속받지 못했지만 부모의
//			getter, setter는 다 상속 받았으므로 사용 가능.
//			앞에 get, set 붙은 애들 상속 받은 것. 사용할 수 있음.
			
			
	}
}
