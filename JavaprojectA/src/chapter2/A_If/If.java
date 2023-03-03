package chapter2.A_If;

public class If {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건이 true일떼 실행할 코드를 지정하는 구문
		// if (조건) {조건이 true일떼 실행할 코드}
		
		
		

		int age = 12;
		if (age > 19) System.out.println("성인입니다.");
		
		//if 문의 경우 코드블럭에 오는 실행할 코드가 하나의 구문이면
		// {}를 제거하고 사용가능
		
		System.out.println("조건 검사 완료");
		
		
		
		
		//if - else 문
		//조건이 true일 경우와 false일 경우일때 실행되는 코드를 각각 지정
		//
		
		
		
		
		if (age > 19 ) System.out.println("성인입니다.");
		else System.out.println("성인이 아닙니다.");
			
		
		
		// 중첩 if문 (좋지 않은 방법)
		
		//if 문 혹은 else문의 코드블럭 안에  또 다른 if문을 작성
		
		if (age <= 19) {
			if (age < 8) System.out.println("미취학 아동입니다");
			else System.out.println("청소년 입니다");
		} else System.out.println("성인입니다");
		

		
		
		if (age > 19) System.out.println("성인입니다.");
		else {
			if( age < 8) System.out.println("미취학 아동입니다");
			else System.out.println("청소년입니다.");
		}
		
		
		
		
		int number = -5;
		
		if (number > 0) 
			System.out.println("양수입니다.");
		else if (number == 0) 
			System.out.println("0입니다");
		else System.out.println("음수입니다.");
		
		
		
		// if - else if - else
		
		//중첩 if문의 응용
		//else 문의 코드 불럭에 오는코드가 한 줄일때 {}를 제거할 수 있음을 이용
		
		
		if (age > 19) {
			System.out.println("성인입니다");
		} else if (age < 8) {
			System.out.println("미취학 아동입니다");
		} else {	
			System.out.println("청소년입니다.");
		}
		
		

	}
}
