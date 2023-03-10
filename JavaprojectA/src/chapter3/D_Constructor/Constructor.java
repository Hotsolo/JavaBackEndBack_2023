package chapter3.D_Constructor;

// 생성자
// 인스턴스가 생성될 때 호출되는 인스턴스 '초기화 매서드'
// 인스턴스 변수의 초기화 작업에 사용
// 인스턴스 생성시에 실행되어야 할 작업을 작성하는 위치

// 생성자의 조건
// 생성자의 이름은 해당 클래스 명과 같아야 함
// 생성자는 반환값이 없음

class Circle {
	
	
	double radius;
	double diameter;
	double circumference;
	double area;
	
	//생성자 사용 방법
	// 클래스명 (데이터타입 변수명.....) {인스턴스 생성시 실행할 코드};
	
	Circle (double radius) {
		System.out.println("Circle 생성됩니다.");
		//this는 인스턴스 자신을 지침
		//생성자를 만들때는 this 이용
		this.radius = radius;
		this.diameter = 2 *radius;
		this.circumference = 3.14*2*radius;
		this.area = 3.14*radius*radius;
	}
	
	
	//생성자를 이용해서 인스턴스 복사
	
	Circle(Circle circle) {
		this.radius = circle.radius;
		this.diameter = circle.diameter;
		this.circumference = circle.circumference;
		this.area = circle.area;
		
		
	}
	
	
	// 생성자도 메서드이기 때문에 오버로딩을 이용하여 
	// 매개변수에 따라 다른 작업 수행가능
	Circle () {
		System.out.println("빈 생성자 입니다.");
		radius = 10;
		diameter = 2*radius;
		circumference = 3.14*diameter;
		area = 3.14*radius*radius;
	}
	
	
	
	
	
	
}



public class Constructor {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===생성자===");
		Circle circle1 = new Circle(10); //생성시 0으로 초기화하는 매서드
		System.out.println("=========");
		//원래라면 이렇게 초기화 해야함
		System.out.println(circle1.area);
		//생성하고 초기화
		Circle circle2 = new Circle();
		System.out.println(circle2.area);
		
		Circle circle3 = new Circle(circle2);
		//인스턴스 복사
		System.out.println(circle3.area);
	}
	
	
	
	
	
	
	

}
