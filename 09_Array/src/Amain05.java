
public class Amain05 {
	public static void main(String[] args) {

		// 2차원 배열

		// 학생들의 키, 체중 (여러명 만들 거임.)
		// int[행][열]

		int stud[][] = { { 180, 80 }, { 170, 70 }, { 160, 60 }, };

		// 첫번째 학생의 키
		System.out.println(stud[0][0]);

		// 세번째 학생의 체중
		System.out.println(stud[2][1]);

		// 두번째 학생의 키
		System.out.println(stud[1][0]);

		// 이름, 사는곳
		String ss[][] = { { "가희", "서울" }, { "채진", "부산" }, { "지영", "대구" } };

		System.out.println(ss[1][1]);

		int[][] ar = new int[3][4]; // z 찍기에서 필요했던 거 이중for문 행열
		int num = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ar[i][j] = num++;
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}

		// [면][행][열]
		int[][][] aa = { 
				{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } }, 
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } 
				};

		// 10
		System.out.println(aa[1][0][0]);
		// 24
		System.out.println(aa[2][1][2]);
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.print(aa[i][j][j2] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
//		int[][][][] test = new int[2][2][2][2]; 고차원 되긴 됨
		
		
		
		
	}
}
