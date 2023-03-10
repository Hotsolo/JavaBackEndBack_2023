package chapter2.D_While;


// while 반복문
// 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문

public class While {

	public static void main(String[] args) {
		//while 문
		//if문의 반복문 형태
		//조건을 검사하고 조건이 true이면 반복, false면 반복 탈출
		//while (조건) {
			  // 조건이 true 일 때 실행되는 코드
		//	}
		//
		
		
		int number = 0;
		
		while (number < 20 ) {
			
			System.out.println(number++);
			
		}
		
		while (true) {
			
			
			
			//continue : 코드블럭 내 아래에 있는 모든 코드를 무시하고
			//다시 조건을 검사
			// 조건문과 함께 쓰임
			// 조건문의 코드블럭 내에 해당 변수를 변경시켜주는 코드가 존재해야 함
			
			
			if ( (number % 2) == 0) {
				number++;
				continue;
			}
			
			System.out.println(number);
			
			//break 반복문의 코드블럭을 강제로 종료시킬때 사용
			//일반벅으로 break는 조건문과 함께 사용됨
			
			number++;
			
			if (number == 200 ) break;
			
			
		}
		
		//number = 200
		
		
		
		//do - while 
		//반복 실행할 코드를 무조건 한번 실행한 후에 조건을 검사하는 반복문
		
		
		do {
			System.out.println(number);
			number++;
		} while (number < 200);
		
		System.out.println(number);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
