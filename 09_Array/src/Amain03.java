
public class Amain03 {
	public static void main(String[] args) {
		
		
		int aa[] = { 100, 200, 300, 400 };
		int []bb = { 100, 200, 300 };
		
		int [] cc;
		cc = new int[] { 100, 200 };
		int[] dd = new int[1];
		dd[0] = 100;
		
		// 결과출력 이렇게 나오게(반복문 4개를 써서)
			// aa[0] = 100 aa[1] = 200 aa [2] = 300 aa [3] = 400
			// bb[0] = 100 bb[1] = 200 bb [2] = 300 
			// cc[0] = 100 cc[1] = 200
			// dd[0] = 100 
		
		
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("aa[%d] = %d ", i, aa[i]);
		}
			System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.printf("bb[%d] = %d ", i, bb[i]);
		}
		System.out.println();
		for (int i = 0; i < cc.length; i++) {
			System.out.printf("cc[%d] = %d ", i, cc[i]);
		}
		System.out.println();
		for (int i = 0; i < dd.length; i++) {
			System.out.printf("dd[%d] = %d ", i, dd[i]);
		}
		
		
		// 인덱스 써야하면 그냥 for문 사용하기.
		
		
		// 밑에 식 한번 줄여보기.
		
		
		
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("aa[%d] = %d ", i, aa[i]);
		}
			System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.printf("bb[%d] = %d ", i, bb[i]);
		}
		System.out.println();
		for (int i = 0; i < cc.length; i++) {
			System.out.printf("cc[%d] = %d ", i, cc[i]);
		}
		System.out.println();
		for (int i = 0; i < dd.length; i++) {
			System.out.printf("dd[%d] = %d ", i, dd[i]);
		}
		
		
		
		
		
		
		
	}
}
