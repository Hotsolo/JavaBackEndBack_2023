package chapter3.C_OverLoading;

//오버로딩 : 한 클래스 내에서 같은 이름으로 메서드를 여러개를 정의하는 것
//이미 같은 이름의 메서드가 존재한다하더라도 매개변수의 타입과 갯수가 다르면 같은 이름으로 정의할 수 있음

//오버로딩 조건 : 메서드명이 같아야 하며 매개변수 개수 혹은 타입이 달라야 함
//반한 타입은 오버로딩에 영향을 미치지 않음



public class Overloading {
	
	int add(int x, int y) {
		return x + y;
	}
	
	
	double add(double x, double y) {
		return x + y;
	}
	
	// 파라미터 데이터 타입이 같고 매개변수의 이름이 다르다고 해도
	// 오버로딩은 성립하지 않습니다.
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//grant, revoke
		//DCL data control lanquage
		//data defintion 
		//Drop 삭ㅈ[
		//foreigh key 외래키 : 테이블당 여러개 지정 가능
		
		
	}

}
