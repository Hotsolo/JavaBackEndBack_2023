package chapter2.C_For;

// For 반복문
// 규칙이 있는 작업을 반복하는 제어문
// 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문

public class For {

	public static void main(String[] args) {
		// 반복문을 사용하는 이유
		// 길이가 5인 int 타입에 배열(intArray5)을 선언 및 생성
		
		int[] intArray5 = new int[5];
		//intArray5의 각 인덱스에 1~5까지 값으로 초기화
		
		intArray5[0] = 1;
		intArray5[1] = 2;
		intArray5[2] = 3;
		intArray5[3] = 4;
		intArray5[4] = 5;

		
		// for 반복문
		// 특정한 변수가 증감하면서 조건에 부합할때까지 반복하는 반복문
		 
		// for (변수 선언 혹은 초기화; 조건; 증감식) {
		// 조건이 true일 때 실행되는 코드
		// }
		
		
		for (int index = 0; index < 5; index++) {
			intArray5[index] = index + 1;
		}
		
		
		//a-(b-d-c)-(b-d-c)---b
		
		//for 문의 경우 코드 블럭에 오는 실행할 코드가 한 구문이면
		//{ }를 제겨할 수 있음
		
		
		//for each 반복문
		
	
		
		for (int number : intArray5) {
			System.out.println(number);
			number = 10;
		}
		
		
		
		for (int number : intArray5) System.out.println(number);
		
		//변수에 배열을 복사하기 때문에 원래 배열은 바뀌지 않는다.
		
		
//		 for each 문 형식
//		배열의 요소 값을 직접 사용하고자 할때 배열을 반복하면서
//		요소를 하나씩 복사해서 사용할 수 있다.
//		for(배열요소의 데이터 타입 변 수명 : 배열) {
//		    배열에 남은 요소가 존재할 때 실행되는 코드
//		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
