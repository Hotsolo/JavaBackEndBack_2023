package chapter1.C_DataType;



// 데이터 타입
// 각각의 데이터들은 자바에서 지정한 여러 종류의 타입이 존재
// 기본적으로 정수형, 실수형, 문자형, 논리형이 존재
// 추가적으로 참조형 데이터 타입

//일반적으로 특정한 데이터 타입으로 정의된 변수 혹은 상수는
//같은 데이터 타입의 데이터로만 연산 가능
public class DataType {

	public static void main(String[] args) {
		//정수타입
		//byte type
		//1byte (-128 ~ 127 )
		
		byte byte1 = 127;
		
		//short type => 2byte ( -32,768 ~ 32,767 )
		
		short short1 = 32767;
		
		int int1 =  2_147_483_647; // 4byte (-2,147,483,648 ~ 2,147,483,647)
		
		// 정수 타입의 리터럴 상수의 데이터타입은 int이기 때문에 
		//long 타입의 리터럴 상수를 지정할 때는 리터럴 상수 뒤에 L을 붙인다.

		long long1 = 2_147_483_648L; // 8byte (-2^63 ~ 2^63 - 1)
		
		
		//실수 타입
		//float 타입의 리터럴 상수를 지정할땐 뒤에 F를 붙여줌
		//소수 6번째부터 오타 발생
		float float1 =  3.14F;
		
		//double 타입
		
		double double1 = 3.45356;
		
		//double 소수점 15자리에서 오차발생
		
		
		
		
		
		//문자 타입 0 ~ 65,535 2type 문자하나를 저장할 수 있는 공간

		//한 문자로 표기할때는 ''로 묶음
		char char1 = 'a';
		char char2 = 98;
		
		//논리 타입 : 1byte 논리형 데이터 타입
		
		boolean boolean1 = true;
		
		boolean1 = false;
		
		
		//변수명은 is**, has**
		
		
		
		
		
		
		//형변환 (Type casting)
		
		//자동 형변환 (묵시적 행변환)
		//차지하는 범위가 작은 데이터 탑은 범위가 큰 데이터 타입으로 형변환이됨
		
		short short2 = 1;
		int int2 = short2;
		
		char char3 = 1;
		
		
		
		// float float2 = 3.14F;
		
		
		
		//강제 행변환 (명시적 행변환)
		//차지하는 범위가 큰 데이터 타입을 범위가 작은 데이터 타입으로 대입할때
		//형 변환을 명시
		//강제 형변환인 경우 overflow 범위 초과가 생겨날 수 있다
		short2 = (short) int2;
		
		
		//참조형 데이터 타입
		//기본 데이터 타입이 아닌 메모리 주소를 참조하는 데이터 타입
		//(클래스) 첫 문자가 대문자로 시작함
		//String은 문자열을 담을 수 있는 참조형 데이터 타입
		
		String String1 = "dfaf";
		

		
		
	}

}
