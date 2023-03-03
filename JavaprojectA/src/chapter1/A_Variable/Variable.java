package chapter1.A_Variable;

public class Variable {

	//코드를 작성하고 나면 반드시 저장
	
	
	//1.변수
	//모든 프로그램 언어에서 데이터를 보관할 수 있는 변수가 존재
	//데이터를 담을 수 있는 열려있는 상자
	
	
	
	//변수는 반드시 선언 후 초기화해야지 사용이 가능함
	//선언: 사용할 변수를 만드는 행위
	//초기화: 변수에 초기 데이터를 저장하는 행위
	
	
	
	//main 메서드 ; 실행시 실행되는 메서드
	
	// { } 코드블럭 : 여러 줄의 코드르 하나로 묶어주는 역할
	
	public static void main(String[] args) {
		//변수 선언 방법
		//데이터타입 변수형;
		//
		int numberVariable;
		
		//변수 초기화 방법
		// 변수명 = 데이터;
		
		numberVariable = 10;
		
		System.out.println(numberVariable);
		
		//선언과 동시에 초기화
		// 데이터타입 변수명 = 데이터;
		
		char characterVariable = 'a';
		
		System.out.println(characterVariable);
		
		
		
		//변수 명령 규칙
		// 1.첫자리가 숫자가 올 수 없다
		// 2.특수문자를 연산작로 쓰지 않는 특수문자만 사용가능
		// 3.같은 코드 블럭내에 이미 선언한 변수명은 사용이 불가능
		
		
		
		
		// 4.Java의 변수는 lowerCamelCase 명명 규칙을 사용
		
		//lowerCamelCase
		//첫 문자는 소문자로 시작하고 띄어쓰기를 제거하고 다음에 오는 문자를 대문자로 작성
		
		
		
		
		
	}

}
