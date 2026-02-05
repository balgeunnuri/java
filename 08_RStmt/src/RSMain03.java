
public class RSMain03 {
	public static void main(String[] args) {
		
		// 2중 for문
		
		// 구구단 (2단 ~ 9단)
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단 ---------");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", dan, j, dan*j);
			}
			System.out.println();
		}

		
		
		
		// 1. 
		// z
		// zz
		// zzz
		// zzzz
		// zzzzz
		
//		5행 5열
		
		for (int i = 1; i < 6; i++) { // == 0; <5 
			
			for (int j = 0; j < i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		
		// 위에 것 행, 안의 것 열
		// 행에 문제가 생기면 위의 식을 봐야함.
		// 행열 개념 익히기.
		
		// 달력도 이중 for문(월,일) 삼중 for문(년도,월,일)
		
		
		System.out.println("-----------------------");
		
		// 2.
			// zzzz
			// zzz
			// zz
			// z
		
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		for (int i = 4; i > 0; i--) {     // 줄 개수 의미
            for (int j = 0; j < i; j++) { // z를 몇개찍는지 의미
                System.out.print("z");
            }
            System.out.println();
        }
		
		System.out.println("-----------------------");
		
//	3.
			
//			z
//			z 
//			z z
//			z z 
//			z z z
			
		
		for (int i = 2; i < 7; i++) {
			
			for (int j = 0; j < i; j++) {
				if (j % 2 == 1) {
					System.out.print("z");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
//	4.
//		z
//		 z
//		  z
//		   z
//	        z
		
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("z");
			System.out.println();
		}
		
	
	
	
// 	5.
//		z
//		
//		 z
//		 
//		  z
//		  
//		   z
//		   
//		    z
		
		
System.out.println("-----------------------");
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("z");
			System.out.println();
		}
		
		
		
/*		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("z\n");

        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 7 - i; j <= 5; j++) {
                System.out.print(" ");
            }
            System.out.println("z\n");
        }
for (int i = 0; i < 5; i++) {
 for (int j = 0; j < i; j++) {
     System.out.print(" ");
 }
 System.out.println("z");
}

for (int i = 1; i <= 5; i++) {
 for (int j = 7 - i; j <= 5; j++) {
     System.out.print(" ");}
 System.out.println("z");}
for (int i = 2; i < 7; i++) {
         for (int j = 0; j < i / 2; j++) {
             System.out.print("z ");}
         System.out.println();}
     System.out.println("===============");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("z");
                }
                if (j % 2 == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("===============");

        System.out.println("-----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("z ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j % 2 == 1) {
                } else {
                    System.out.print("z ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j <= i; j += 2) {
                System.out.print("z ");
            }
            System.out.println("z");
        }
        System.out.println();

        for (double i = 0; i <= 2; i += 0.5) {
            for (int j = 0; j <= i; j++) {
                System.out.print("z ");
            }
            System.out.println();
        }
        System.out.println("------------"); */
		
//	코드만 보고 출력값 이해
	
	}
}
