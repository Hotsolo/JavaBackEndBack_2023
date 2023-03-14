package chapter5.B_ApiClass;

import java.util.Random;
import java.util.Scanner;

//API class
// JAVa 자체에서 제공해주는 ㅐㄱ개발에 도움을 주는 라ㅣㅇ브러ㅣ

public class ApiClass {

	public static void main(String[] args) {
		// OBject class
		// 모든 클래스의 조상
		Object object = new Scanner(System.in);
		object = new int[10];
		
		// String class
		// 문자열 처리에 대한 메서드가 정의되어 있는 클래스
		
		String string = " This is String contents ";
		
		
		//.substring(시작인덱스, 종료인덱스)
		
		String subString = string.substring(6,8);
		
		System.out.println(subString);
	
		//.length();
		// 문자열 길이 가져오는 메서드
		
		//.toUpperCase; -> 모든 문자를 대문자로 교체
		//.toLowerCase; -> 모든 문자를 소문자로 교체
		
		String upperCase = string.toUpperCase();
		String lowerCase = string.toLowerCase();
		
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		
		//.indexOf(문자열) -> 해당하는 문자열이 존재한다면 그 위치의 첫번째 인덱스 번호를 반환
		
		int stringIndex = string.indexOf("is");
		System.out.println(stringIndex);
		//결과값이 -1이면 포함되어 있지 않음
		
		
		
		
		// .trim();
		// 문자열의 앞 뒤 공백 제거
		
		String trimString = string.trim();
		System.out.println(trimString);
		
		// .replaceAll(변환할 문자열, 변환될 문자열)
		// 특정 문자열을 지정한 문자열로 면경
		
		String replaceString = string.replaceAll("is", "are");
		System.out.println(replaceString);
		
		
		
		
		//Wrapper Class
		//기본형 데이터 타입을 참조형 데이터 타입으로 다루디 위한 클래스
		// int -> integer
		// double -> Double
		// ....
		
		
		
		Integer integer = 10;
		int number = integer;
		
		
		
		String numberString = "110";
		//문자열 -> 숫자
		
		number = Integer.parseInt(numberString);
		System.out.println(number);
		
		// 숫자 -> 문자열
		
		numberString = Integer.toString(550);
		System.out.println(numberString);
		
		
		
		// Random class
		// 무작위의 값을 얻고자 할때 유용한 클래스
		
		Random random = new Random();
		
		int randomInt = random.nextInt();
		
		int randomIntMax = random.nextInt(100);
		
		
		int[] lotto = new int[6];
		
		for (int index = 0; index < lotto.length; index++) {
			
			boolean equal = false;
			
			for(int subindex =0; subindex < index; subindex++ ) {
				if(lotto[subindex] == lotto[index] ) equal = true;
			
			}
			
			if (equal) continue;
			
			
			
			lotto[index] = random.nextInt(45) + 1;
			
		}
		
		
		for (int lottoNumber : lotto ) {
			System.out.print(lottoNumber + " ");
		}
		
		
		
		
	}

}
