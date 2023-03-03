package chapter1.B_Constant;

public class Constant {
	//2.상수
	//변수와 마찬가지로 데이터를 저장하는 공간
	//단 상수는 한번 초기화하면 변경이 불가능
	
	
	
	// 일반적으로 값을 변경하면 안되는 데이터를 지정할 때
	//데이터에 이름을 부여하고 싶을때
	
	
	//상수또한 선언 후 초기화가 이루어져야 함
	public static void main(String[] args) {
		
		// 상수 선언 방법
		/*
		 * final 데이터타입 변수명;
		 */
		
		
		final int NUMBER;
		
		//상수 초기화 방법
		//상수명 = 데이터;
		
		NUMBER = 10;
		
		// 선언과 동시에 초기화
		// final 데이터타입 상수명 = 데이터;
		
		
		final double PIE = 3.14;
		
		//상수는 한번 초기화되면 변경이 불가능
		
		//상수 명명 규칙
		//1 ~ 3. 변수와 동일
		//4. java 상수는 UPPER_SNAKE_CASE를 따른다
		
		//모든 문자를 대문자로 작성하고 띄어쓰기를 _로 표기
		
		final int WINDOW_WIDTH = 1920;
		final int WINDOW_HEIGHT = 1080;
		
		int size = WINDOW_HEIGHT * WINDOW_WIDTH;
		
		
		int x = 0;
		int y = x + 10;
		
		// 리터럴 상수
		// 프로그램밍 언어에는 데이터를 담아두즌 상수와 리터럴 상수가 존재
		// 리터럴 상수는 데이터 그 자체를 의미
		
		
		
		
		
		
		
	}

}
