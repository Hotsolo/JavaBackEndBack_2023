package chapter6.B_Generic;

// 제너릭 : 
// 다양한 타입을 다루는 메서드나 클래스에 컴파일시 타입을 체크해주는 기능
// 컴파일시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음

class GenericClass<D> {
	
	boolean status;
	String message;
	//외부에서 받은 D로 타입을 지정한다.
	D data;
	
	//타입변수 지칭
	static <D> GenericClass<D> getInstance(boolean status,String message,D data) {
		GenericClass<D> instance = new GenericClass();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance;
	}
	
	
}















public class Generic {

	public static void main(String[] args) {
		
		// 참조변수를 만들때 타입 지정
		GenericClass<Integer> generic1 = new GenericClass<Integer>();
		GenericClass<String> generic2 = new GenericClass<String>();
		GenericClass<?> generic3 = new GenericClass<>();
		
		generic1.data = 124;
		
		GenericClass<?> generic4 = GenericClass.getInstance(true, "message", "string");
		
		
		

	}

}
