
public class RS_Practice {
	public static void main(String[] args) {
		
		
		// 구구단 (2단 ~ 9단)
		
				for (int dan = 2; dan < 10; dan++) {
					System.out.println(dan + "단 ---------");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\n", dan, j, dan*j);
					}
					System.out.println();
				}
				
		// 구구단 가로
				
				for (int dan = 1; dan < 10; dan++) {
					for (int j = 2; j < 10; j++) {
						System.out.printf("%d * %d = %d\t", j, dan, dan*j);
					}
					System.out.println();
				}
				
				
				
				// 2중 for 달력 다 출력
				// 1 ~ 12월까지 1월 1일..31일 2월 28일
				int dayMax = 0;
				for (int month = 1; month < 13; month++) {
					switch (month) {
					case 1, 3, 5, 7, 8, 10, 12:
						dayMax = 31;
						break;
					case 4, 6, 9, 11:
						dayMax = 30;
						break;
					default:
						dayMax = 28;
						break;
					}
					for (int day = 1; day <= dayMax; day++) {
						System.out.printf("%d월 %d일 \n", month, day);
					}
					System.out.println();
				}

				System.out.println("=====================");
				for (int month = 1; month < 13; month++) {
					for (int day = 1; day <= 31; day++) {
						if (month == 2 && day == 29)
							break;
						else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31)
							break;
						System.out.printf("%d월 %d일 \n", month, day);
					}
					System.out.println();
				}
				
				System.out.println("=====================");

				for (int day = 1; day <= 31; day++) {
					for (int month = 1; month <= 12; month++) {
						switch (month) {
						case 2:
							if (day > 28) {
								System.out.printf("\t\t|");
								continue;
							}
							break;
						case 4, 6, 9, 11:
							if (day > 30) {
								System.out.printf("\t\t|");
								continue;
							}
							break;
						default:
							break;
						}
						System.out.printf("\t%02d월%02d일 |", month, day);
					}
					System.out.println("");
				}

				
				for (int i = 1; i <= 31; i++) {
					for (int j = 1; j <= 12; j++) {
						if (j == 2 && i >= 29 || ((j == 4 || j == 6 || j == 9 || j == 11) && i >= 31)) {
							System.out.printf("\t\t");
							continue;
						}
						System.out.printf("%d월%02d일 ||\t", j, i);
					}
					System.out.println();
				}

				for (int i = 1; i < 32; i++) {
					for (int month = 1; month <= 12; month++) {
						if (month == 2 && i >= 29 || 
							(month == 4 || month == 6 || month == 9 || month == 11) && i >= 31) {
							System.out.print("\t\t");
						} else {
							System.out.printf("%02d 월 %02d일\t", month, i);
						}
					}
					System.out.println();
				}
		
		
		
	}
}
