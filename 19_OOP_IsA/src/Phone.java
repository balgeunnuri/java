
public class Phone extends Product{
	private Double display;
	private Double weight;
	
	// 기본 생성자
	public Phone() {
	}
	
	// 오버로딩 생성자
	public Phone(String name, int price, Double display, Double weight) {
		super(name, price);
		this.display = display;
		this.weight = weight;
	}
	
	// 게터 세터
	public Double getDisplay() {
		return display;
	}
	public void setDisplay(Double display) {
		this.display = display;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	// 출력 오버라이드?
	
	
	
}
