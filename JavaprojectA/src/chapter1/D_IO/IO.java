package chapter1.D_IO;

import java.util.Scanner;

//입출력
//console을 통해서 개발자로부터 입력을 받을 때 Scanner라는 객체를 사용함
//console은 데이터를 출력할 땐 System  객체를 사용함

public class IO {

	public static void main(String[] args) {
		//출력
		//system.out
		String comment = "이것은 변수에 저장된 문자열";
		System.out.println("이것은 리터럴 문자열");
		System.out.println(comment);
		
		//System.out
		//변수 혹은 상수 자리에 어떤 데이터 타입이 와도 됨

		float float1 = 1.1111111111f;
		System.out.println(float1);
	
		
		
		
		//
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(scanner);
		
//		int inputInteger = scanner.nextInt();
//		
//		System.out.println("입력 받은 값 : " + inputInteger + 10 );
//		
//		
		
		String inputString = scanner.nextLine();
		
		System.out.print("입력한 문자열 : ");
		System.out.println();
		System.out.println(inputString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
