package chapter4.D_Interface;

/*
 * 인터페이스
 *  추상 클래스보다 추상화 정도가 높음
 *  추상 클래스와 다르게 일반 메서드와 일반 맴버들을 가질 수 없음
 *  
 *  
 *  사용 방법
 *  interface 인터페이스명 { }
 *  
 *  
 *  
 *  
 */

interface ExampleInterface {
	// 변수를 사용할 때는 public static final 형태로만 사용할 수 있움
	public static final int NUMBER = 10; //초기화해야함
	
	// 메서드를 사용할 때몬 public abstract로 선언 또는 생략
	
	public abstract void method1();
	
	public void method2();
	
	void method3();
	
	
	
}





// 인터페이스 간의 상속
// ,를 써서 다중 상속이 가능하다
interface SubInterface extends ExampleInterface {
	
}

// 인터페이스 구현
// 인터페이스도 추상 메서드를 포함하고 있기 때문애 해당 메서드를 구현하는 클래스를 통해서
// 인스턴스를 생성해야함

//인터페이스를 클래스로 구현 할때는 implements키워드 사용

class Implement implements ExampleInterface {

	@Override
	public void method1() {
		System.out.println("메소드 1");
		
	}

	@Override
	public void method2() {
		System.out.println("메서드 2");
		
	}

	@Override
	public void method3() {
		System.out.println("메셔드 3");
		
	}
	
}





public class Interface {
	
	public static void main(String[] args) {
		
		ExampleInterface exampleInterface = new Implement();
		exampleInterface.method1();
		// 인스턴스 자체로 인스턴스를 생성할 수 없다

	}

}
