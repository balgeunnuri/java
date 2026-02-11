
public class ICMain {
	public static void main(String[] args) {

		// - 인스턴스 생성시 값 넣어서 생성(전부) : 오버로딩
		// - 모든 필드는 직접 접근 x : 프라이빁
		// - 값 수정 안 되게, 따로 값 얻을 필요도 없음 : 게터세터 필요없음 
		
		// 스포츠카 "람보르기니", "123가567"
		// 모델명, 차량번호 -> 정보출력
		
//		Sports sports = new Sports("람보르기니", "123가567");
		Sports sports = new Sports("람보르기니", "123가567");
		sports.info();
		
		
		// 택시 " 소나타", "ㅇㅇ나123"
		// 모델명, 차량번호, 기본료 -> 정보출력
		Taxi taxi = new Taxi("소나타", "ㅇㅇ나123", 5000);
		taxi.info();
		
		

		// 버스 " 파란버스", 33다1111
		// 모델명, 차량번호, 노선번호 -> 정보출력
		Bus bus = new Bus("파란버스", "33다1111", 88);
		bus.info();
		
		
//		1. 공통 주소 확인
//		2. 상속관계 확인 수퍼클래스 어떤 걸로 쓸지
		
		
		
		
		
	}
}
