package chapter3.E_Inheritence;

// 상속
// 기존(부모) 클래스를 재사용해서 새로운 클래스(자식)를 작성하는 것
// 코드의 재사용성을 높이고 코드의 중복을 제거 -> 생상성이 향상, 유지보수성에 항샹

// 사용 방법:
// class 클래스명 extends 조상클래스 { .... }

class Human {
	String name;
	int age;
	String telNumber;
	String country;
	
	
	Human () {}
	
	Human (String name, int age) {
		this.name = name;
		this.age = age;
		this.telNumber = "100-1111-1111";
		this.country = "korea";
		
		
	}
	
	
	void Eat(String food) {
		System.out.println(this.name +"이(가) "+ food + " 을(를) 먹습니다");
	}
	
	
	
	
}

//Developer 클래스는 human의 속성과 기능을 전부 사용 가능
class Developer extends Human {
	
	String position;
	String language;
	
	Developer() {
		
	}
	
	Developer(String name,int age,String position, String language) {
		// 부모클래스의 생성자를 지칭
		
		super(name, age);
		
		this.position = position;
		this.language = language;
		
		
		
	}

	
	void develope() {
		System.out.println( super.name + " 가" + this.language + "로 " + this.position + " 개발을 합니다." );
		
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		Developer developer1 = new Developer();
		
		developer1.name = "John doe";
		developer1.position = "back end";
		developer1.language = "java";
		
		developer1.Eat("사과");
		developer1.develope();
		
		
		Developer developer2 = new Developer("Micke",29,"front end","javascript");
		developer2.Eat("바나나");
		developer2.develope();

	}

}
