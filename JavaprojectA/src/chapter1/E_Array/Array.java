package chapter1.E_Array;

// 배열
// '같은 타입'의 변수가 나열된 형태
// 베열은 '생성'해서 사용 함 => 생성해서 사용하는 변수 : 참조변수

// new 연산자로 생성할 수 있다
// 배열은 실제 데이터가 저장되는게 아니라 데이터 배열이 저장된 첫 번째 메모리 주소가 저장됨



public class Array {

	public static void main(String[] args) {
		//동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		int score1, score2, score3;
		score1 = 90;
		score2 = 80;
		score3 = 70;
		
		//위 방식의 문제점
		//관리가 어려움, 특정 조건에 따른 데이터를 가져오기가 힘들다.
		
		
		//배열
		//동일 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태
		//선언 방법 : 데이터타입[] 배열명;
		int[] scores; // -s, +list. + array
		
		//생성 방법 : 배열명 = new 데이터타입[열의 길이]
		scores = new int[5];
		System.out.println(scores);
		
		
		//초기화 방법 : 배열명[인덱스 번호] = 데이터;
		//인덱스는 0부터 시작
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 95;
		scores[3] = 75;
		scores[4] = 80;
		
		
		
		//선언과 동시에 생성 및 초기화
		// 1.데이터타입[] 배열명 = new 데이터타입[]{요소1.요소2,.....} 
		int[] scoreList = new int[] {78,234,2,3};
		
		System.out.println(scoreList.length);
		
		// 2.데이터타입[] 배열명 = {요소1, 요소2, 요소3.....}
		char[] string = {'h','e','l','l','o'};
		
		System.out.println(string);
		string[0] = 'k';
		
		System.out.println(string);
	
		
		//다처원 배열
		//선언 방법: 데이터타입[][] 배열명;
		//초기화 방법: 배열명 = new 데이터타입[첫번째 배열 길이][두번째 배열 길이];
		
		//선언과 동시에 초기화
		//1.데이터타입[][] 배열명 = new 데이터타입[][] { {요소1,...},{  },.... }
		//2.데이터타입[][] 배열명 = { {요소1,요소2,...},{요소1,요소2,...}.......}
		
		
		// 배열1 = 배열2 : 값을 대입하는 것 뿐만 아니라 참조 주소까지 대입한다.
		
		
		
		

	}

}
