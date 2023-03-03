package example.SighUp;

import java.util.Scanner;


class SighUpto {
	
	
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
	
	
	
}


public class SighUp {
	
	
	
		
	
	//회원가입 프로세스 구현
	// 필수 입력값이 모두 입력되었는가?
	
	// 아이디 중복확인
	
	/*
	 * 정보를 모두 입력?
	 * 아이디와 패스워드, 패스워드 확인, 이름
	 */
	
	public static void main(String[] args) {
		
		
		String[] idList = { "qwer","asdf","zxcv" }; //다차원 배열
		
		
		//1.사용자로부터 아이디, 패스워드. 패스워드 확인, 이름을 입력받음
		
		Scanner scanner = new Scanner(System.in);
		
		SighUpto dto = new SighUpto();
		
		
		//2.모두 입력 받았는지 확인
		//isBlank : 비었거나 띄어쓰기만으로 구성했을때
		//true or false
		
		
		System.out.println("아이디 : ");
		dto.userId = scanner.nextLine();
		System.out.println("비밀번호 : ");
		dto.userPassword = scanner.nextLine();
		System.out.println("패스워드 확인 :");
		dto.userPasswordCheck = scanner.nextLine();
		System.out.println("이름 : ");
		dto.userName = scanner.nextLine();
		
		
		if (dto.userId.isBlank() || dto.userPassword.isBlank() || 
				dto.userId.isBlank() || dto.userName.isBlank()) {
			System.out.println("아이디 또는 비밀번호를 모두 입력해주십시오.");
			System.out.println();
			return;
			
		}
		
		
		
		
		//3.아이디 중복 체크
		
		//3-1 일반  for 문 (배열값 변경 가능)
		
//		for (int index = 0; index < idList.length; index++) {
//			
//			
//			if (userId.equals(idList[index])) {
//				System.out.println("아이디가 중복됩니다.");
//				return;
//			}
//		}
		
		
		
		//3-2 for each문 (배열값 변경 불가능)
		
		for (String id: idList) {
			
			if(id.equals(dto.userId)) {
				System.out.println("아이디가 중복됩니다");
				return;
			}
		}
		                                                                                                                                                                                     
		
		
		
		
		
		//3-3)
		
		
		
		
//      4 비밀번호 일치여부 확인
		
		if (!dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		
		
		
	
		System.out.println("성공");
		
		
		
		
		
		
		
		
		
		
		
		
		//결과
		//성공. 실패  (입력이 모두 되지 않을때,아이디가 중복될때, 비밀번호가 서로 다를때)
		
		
		
		
		
		
		
		
		

	}

}
