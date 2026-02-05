
public class EHMain3 {
	public static void main(String[] args) {
		try {
			test();
			int ar[] = {10};
			System.out.println(ar[1]);
			
		} catch (Exception e) {
			System.out.println("문제발생");
			e.printStackTrace();
		}
	}
	
	public static void test() throws InterruptedException {
		System.out.println("asd");
		System.out.println(10 / 0);
		Thread.sleep(1000);
		
		
		
		
		
		
		
	}
	
	
	// 던지라고 하면 throws
	// 직접처리하라고 하면 catch ?
	
	
	
	
	
}
