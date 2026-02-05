import java.util.Scanner;

public class Test_Login {
	public static void main(String[] args) {
		// login_system
			// id, pw
		
		// db에 실제 존재하는 id,pw => 임의 생성 테스트
		
		String db_id ="mz";
		String db_pw ="mz1004";
		
		// 입력받기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pw : ");
		String pw = sc.next();
		
		// 판정
			// 둘 다 맞으면 "로그인 성공"
			// id 가 틀렸으면 "존재하지 않는 회원입니다." 
			// pw 가 틀렸으면 "비밀번호가 일치하지 않습니다."
		
//		if (id.equals(db_id) && pw.equals(db_pw)) {
//			System.out.println("로그인 성공");
//		} else if (!id.equals(db_id)) {
//			System.out.println("존재하지 않는 회원입니다.");
//		} else if (!pw.equals(db_pw)){
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		} else {
//			System.out.println("존재하지 않는 회원입니다.");
//		}
		
		
//		위 보다 밑에 것을 사용
		
			
		// 문자는 ==사용 불가. 문자는 .equals(비교할 것)로 같은 값인지 확인
		// System.out.println(id.equals(db_id));
		
		if (id.equals(db_id)) {
			if (pw.equals(db_pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
		
		
		
		
		
		
	}
}
