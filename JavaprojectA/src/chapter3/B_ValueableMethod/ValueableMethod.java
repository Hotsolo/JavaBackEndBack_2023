package chapter3.B_ValueableMethod;
//클래스 내에서의 변수
//인스턴스 변수 : 각각의 인수턴스마다 고유하게 가지고 있어야 하는 속성을 지정할때 사용
//클래스 변수 : 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야 하는 속성을 지정
//지역변수 : 메서드 내에서 선언된 변수를 지역변수라고 함 (인스턴스, 클래스 변수는 전역변수)


class GalaxyPhone {
	//인스턴스 변수 : 인스턴스마다 고유하게 가지고 있는 속성
	// 인스턴스를 생성하고 난뒤 사용가능
	String model;
	String owner;
	String telNumber;
	
	// 클래스 변수 : 앞에 static을 붙임,해당 클래스로 선언된 모든 인스턴스가 동일하게 가지고 있는 특성
	// 
	// static 데이터타입 변수명;
	// 클래스변수는 인스턴트 생성없이 클래스로 사용가능
	
	static String maker = "SAMSUNG";
	
	
	
}


class MonitorSize {
	static final int HEIGHT = 1080;
	static final int WIDTH = 1920;
	
	
	
}





public class ValueableMethod {
	
	
	
	// 이 클래스의 전역변수
	int number = 10;
	int size = MonitorSize.HEIGHT * MonitorSize.WIDTH;
	

	public static void main(String[] args) {
		
		//메인 메서드의 지역 변수        
		double decimal = 10.0; 
		
		
		
		GalaxyPhone myS23 = new GalaxyPhone();
		
		myS23.model = "S23";
		myS23.owner = "최호영";
		myS23.telNumber = "010-1111-1111";
		
		GalaxyPhone myS22 = new GalaxyPhone();
		
		myS22.model = "S22";
		myS22.owner = "최호영";
		myS22.telNumber = "010-6666-9999";
		
		System.out.println(myS23.telNumber);
		System.out.println(myS22.telNumber);
		System.out.println(GalaxyPhone.maker);
		myS22.maker = "SAMSUNG";
		System.out.println(myS23.maker);
		System.out.println(myS22.maker);
		
		
		

	}

}
