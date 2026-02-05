
public class Calc {
	// 같은이름의 매서드를 파라미터의 타입 또는 개수가 다르면 사용 가능
	
	
	// 변수 이름 i,j 전혀 상관없음.
	// 숫자 넣으면 합을 출력 해주는
	public static void add(int i, int j) {
		System.out.println(i + j);
		
	}
//	// 합을 구해주는
//	public static int add1(int i, int j) {
//		return i+j;
//	}
	
	public static void add(int i, int j, int x) {
		System.out.println(i + j + x);
	}
	
	
	public static void add(int i, int j, int x, int y) {
		System.out.println(i + j + x + y);
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	} 
	
	public static void add(double a, double b, double c) {
		System.out.println(a+b+c);
	} 
	
	
	// 몇개를 넣든 다 더해주는
	public static void add_free(double...a) {
		System.out.println(a);
		int total = 0;
		for (double d : a) {
			total += d;
		}
		System.out.println(total);
	}
	
	// 몇개를 넣든 다 곱해주는
		public static void gob_free(double...a) {
			int total = 1;
			for (double d : a) {
				total *= d;
			}
			System.out.println(total);
		}
	
}
