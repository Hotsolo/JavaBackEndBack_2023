package chapter1.F_Operator;

public class Operator {

	public static void main(String[] args) {
		//산술연산자
		
		// 덧셈 연산자 : 좌면에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);
		
		// 뺄셈 연산자 : 좌항에 우항을 뺀 값을 반환
		int seduceResult = 8 - 3;
		
		// 곱셈 연산자
		int multipleResult = 8 * 3;
		
		// 나눗셈 연산자 : 좌항에 우항을 나눈 값을 반환
		int divideResult = 8 / 3;
		
		double divideresult2 = 8.0/3.0;
		System.out.println(divideresult2);
		
		// 나머지 연산자 : 좌항에 우항을 나눈 나머지를 반환
		int remainderResult = 8 % 3;
		
		
		//정수와 정수를 연산하면 정수가 변환됨
		//정수와 실수를 연산하면 실수가 변환됨
		
		
		
		// 증가 연산자;
		int onePlusResult = 1;
		++onePlusResult;
		onePlusResult++;
		
		
		
		
		// 감소 연산자;
		int oneMinusResult = 1;
		--oneMinusResult;
		oneMinusResult--;
		
		
		//상수에는 증감 사용 X
		
		
		
		
		// 대입 연산자
		// 대입 연산자의 좌항에는 변수만 지정할 수 있댜.
		// Same x = 5;
		int x = 5;
		// +=
		// Same x = x + 3;
		x += 3;
		// -=
		// Same x = x - 3;
		x -= 3;
		// *=
		// Same x = x * 3;
		x *= 3;
		// /=
		// Same x = x / 3;
		x /= 3;
		// %=
		// Same x = x % 3;
		x %= 3;
		
		
		
		//비교연산자
		
		
		
		
		int comparisonA = 8, comparasionB = 3;

		// Equal : ==
		
		System.out.println(comparisonA == comparasionB);
		
		
		
		//논리연산자
		
		

		// Logical and : &&
		// 좌항과 우항이 모두 true일 경우 true를 반환
		// 그외에는 모두 false 반환
		
		
		System.out.print("참 그리고 거짓인 경우 : ");
		boolean trueAndfalse = true && false;
		System.out.println(trueAndfalse);
		
		
		

		// Logical or : ||
		// 좌항과 우항이 모두 false인 경우 false 반환
		// 그 외에는 모두 true
		
		boolean trueOrfalse = true || false;
		System.out.print("참 또는 거짓일 경우 : ");
		System.out.println(trueOrfalse);

		// Logical not : !
		// 해당 논리를 역전 시킴
		boolean notTrue = !true;
		
		
		
		
		/// && 앞에 이미
		
		
		int int10 = 10;
		int int13 = 13;
		
		
		boolean boolean10 = (int10 < int13) || (int10++ < int10);
		System.out.println(int10);
		
		// 이미 첫번째 조건문이 참이므로  두번쩨 조건문을 읽지 않는다.
		
		
		
		
		
		

		//상황 연산자
		
		
		int number = 10;
		// true. false 대신에 다른 유형의 데이터 값을 반환
		// 조건 ? (true일 때 결과값) : (false일 때 결과값);
		String result = number > 0 ? "양수입니다." : "양수가 아닙니다.";
		System.out.println(result);
		
		
		int isTrue = number > 10 ? 34 : 4;
		System.out.println(isTrue);
		
		
		
		
		
		
		
		
		

	}

}
