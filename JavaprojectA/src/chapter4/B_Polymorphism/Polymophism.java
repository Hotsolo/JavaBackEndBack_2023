package chapter4.B_Polymorphism;

// 다형성
/*
 * 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하는 것
 * 참조변수의 형변환
 */


class SuperClass {
	int number1;
	int number2;
	
	
	SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	
	void method1() {
		
	}
	
	
	
	void method2() {
		
	}
	
	
}


class SubClass1 extends SuperClass {
	int number3;
	
	public SubClass1(int number1, int number2, int number3) {
		super(number1, number2);
		this.number3 = number3;
	}
	
	
	
	
	
	
}


class SubClass2 extends SuperClass {

	
	public SubClass2(int number1, int number2) {
		
		super(number1, number2);
		
	
	
	}
	
	void method1 () {
		System.out.println("Override!");
	}
	
	void method4() {
		
	}
}





public class Polymophism {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(1,2);
		//참조변수
		
		SubClass1 subClass1 = new SubClass1(11,22,33);
		
		SubClass2 subClass2 = new SubClass2(111,222);
		
		
		
		
		// 자손 타입 -> 조상 타입 : 압캐스팅 (자동 형변환)
		SuperClass super1 = subClass1; // 데이터가 사라지지는 않는다.
		SuperClass super2 = subClass2;
		
		System.out.println(super1.number2);
		
		
		// 참조변수의 형변환을 한다고 해도 인스턴스가 가지고 있는 데이터에는 영향 X
		// 단지 인스턴스의 사용범위를 조절하는 것
		SubClass1 sub1 = (SubClass1) super1;
		
		System.out.println(sub1.number3); // 
		
		// 조상 타입 -> 자손 타입 : 자동 형변환이 불가능함
//		SubClass1 sub1 = (SubClass1) superClass;
//		SubClass2 sub2 = (SubClass2) superClass;
		
		super2.method1();
		

	}

}
