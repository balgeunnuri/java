

public class UMain {
	public static void main(String[] args) {
		
		String s = "안녕";
		String s2 = "안녕";
		
		System.out.println(s == s2);
		
		System.out.println("-----------");
		String ss = new String("이제 한시간 반만..");		
		System.out.println(ss);
		
		String ss2 = "이제 한시간 반만..";
		System.out.println(ss == ss2);
		System.out.println(ss.equals(ss2));
		
		
		// ss의 두번째 글자를 출력하세요
		System.out.println(ss.charAt(1)); // index 번호로 1 == 두번째 글자
		
		// '시' 가 나오게 하려면
		System.out.println(ss.charAt(4)); // 띄어쓰기도 데이터.
		
		// ss의 총 글자수
		System.out.println(ss.length());
		
		// ss에서 '시' 글자가 몇번째에 있나? ==> 4
		System.out.println(ss.indexOf("시"));
	
		
		// ss에서 "."으로 끝나는가? ==> true
		System.out.println(ss.endsWith("."));
		System.out.println(ss.endsWith("요")); // false
		
		// ss에서 ㅋ로 시작하는가? ==> false
		System.out.println(ss.startsWith("ㅋ"));
		System.out.println(ss.startsWith("이")); // true
		
		
		// 1. ss '한시간 반만' => '곧'으로 바꾸기
		System.out.println(ss.replace("한시간 반만", "곧")); // 이제 곧..으로 바꿔서 출력해줘라는 뜻
//		ss = ss.replace("한시간 반만", "곧"); // 이렇게 해야 바뀐 것.
		System.out.println(ss); // 이제 곧..으로 바뀐 것 아님.
		
		// 2. 2~5번째 글자까지 출력 (1. 제 한시 2. 제 곧.)
		System.out.println(ss.substring(1, 5));
		
		// 3. 문자열 분리 (엄청엄청 중요.)
		String fruits = "망고,바나나,딸기";
		
		String[] sss2 = fruits.split(","); // ,를 기준으로 쪼개서 넣어줄 것
		for (String str : sss2) { // 반복열로 뽑아내기.
			System.out.println(str);
		}
		// 배열 for문 친구 무조건 같이 사용.
		
		// 문자열 붙히기
		
		// 안 좋은 방식. (1.5 이하일 때만)
		String s1 = "마";
		s1 += "지";
		s1 += "막";
		s1 += "시";
		s1 += "간";
		
		System.out.println(s1);
		
		// 좋은 방법.
		StringBuffer sb = new StringBuffer();
		String s22 = "마";
		sb.append(s22);
		sb.append("지");
		sb.append("막");
		sb.append("시");
		sb.append("간");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		String s33 = "마";
		sb.append(s33);
		sb.append("지");
		sb.append("막");
		System.out.println(sb2);
		System.out.println(sb2.toString());
		
		
		
	

	
	}
}
