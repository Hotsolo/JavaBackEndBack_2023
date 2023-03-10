package chapter3.B_ValueableMethod;

// 메서드
// 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
// 작업을 미리 정해놓은 것
// 메서드에 넣을 걊과 반환값만 알면됨 (Black box 구조)

//메서드의 장점
//1. 높은 재사용성 : 한번 만들어 놓은 매서드를 반복해서 사용 가능 
//2. 중복된 코드를 제거할 수 있다. 반복되는 코드를 메서드로 사용하여 중복을 제거 수정이 발생하면 하나의 코드만 수정하면 됨
//3. 프로그램 구조화 : 작업 단위로 여러개의 메서드에 담아서 프로그램을 구조화 할 수 있음 


//수학 공식
// 파라미터가 있는 메서드는 반드시 파라미터 범위 등과 같은 검증을 먼저해야함
class HigherMathematics {
	
	
	static final double PIE = 3.14;
	//클래스 변수와 마찬가지로 매서드에 static을 포함하게 되면 클래스 메서드로 사용할 수 있음
		//
	static double getTriangleSize(double underSide, double height) {
		if (underSide <= 0 || height <= 0) {
			System.out.println("밑변과 높이는 양수여야 합니다.");
			return 0;
			//상식상 안 되는 것을 검증 ex)0으로 나눈것
		}
		
		double size = 0.5*underSide * height;
		return size;
		//인스턴스를 호출하지 않고 사용가능

	}
	
	static double getLoot(double rank2, double rank1, double constant) {
		double root = rank1*rank1 - 4*rank2*constant;
		return root;
	}
	
	
	
	static double getCircleference(double radius) {
		if ( radius <= 0) {
			System.out.println("반지름은 양수여야 합니다.");
			return 0;
		}
		double circumference = PIE * 2 * radius;
		return circumference;
		
	}
	
}







public class Method1 {
	
	// 메서드의 선언부 
	// [접근제어자 기타제어자] 반환타입 메서드명(매개변수[, ....])
	
	
	public static void main(String[] args) 
	// 메서드의 구현부
	// 실제 프로그램의 절차를 작성하는 부분
	// return 데이터; 키워드로 결과를 반환
	//(반환 타입이 void이면 return으로 메서드를 종료)
	
	
	
	{
		
	 
		
	
		
		System.out.println( HigherMathematics.getTriangleSize(1, 4));
		

	}

}
