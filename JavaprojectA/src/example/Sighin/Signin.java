package example.Sighin;

import java.util.Scanner;

//로그인 프로세스 구현


public class Signin {

	
	// 입력
	// 아이디와 비밀번호
	
	
	public static void main(String[] args) {
		 
		final String ID = "qwer1234";
		final String PASSWORD = "1234";
		
		
		//사용자로부터 아이디와 패스워드 입력받음
		
		
		//사용자가 아이디와 패스워드를 제대로 입력했는지 확인
		while (true) {
			
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String userId = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String userPassword = scanner.nextLine();
			//String.isEmpty() : 비었으면 true , 아니면 false
			
			
			if (userId.isEmpty() || userPassword.isEmpty()) {
				System.out.println("아이디 또는 비밀번호를 모두 입력해주십시오.");
				System.out.println();
				continue;
			}
			
			
			
			
			//3.사용용자 입력값과 저장된 값이 같은지 검증
			
		
			
			if (!userId.equals(ID) || !userPassword.equals(PASSWORD)) {	
				System.out.println("아이디나 패스워드가 일치하지 않습니다");
				continue;
			}
			
			
			
			
			System.out.println("로그인 성공");
			break;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	//결과
	//성공과 실패 (모두 입렧하지 않았을때. 정보가 일치하지 않을 때)
	
	
	
}
