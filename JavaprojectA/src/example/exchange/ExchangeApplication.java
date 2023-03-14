package example.exchange;

import java.util.Scanner;

// 환전기 어플리케이션
// Input : 금액, 넣을 화폐 ,바꿀 화폐

// Process : 환율

// Output : 금액, 바뀐 화폐 (어떠한 입력값이 있어야 하는가)


// 





public class ExchangeApplication {
	
	
	private static String[] managedCurrencies = {
			"KRW", "USD", "JPY"
	};
	
	private static ExchangeRate[] exchageRates = {
					
			//원화 -> 달러
			new ExchangeRate("KRW","USD",1000/1318.80),	
			//원화 -> 엔
			new ExchangeRate("KRW", "JPY", 1000/960.35),
			//달러 -> 원화
			new ExchangeRate("USD","KRW", 1318.80/1000),
			//달러 -> 엔	
			new ExchangeRate("USD", "JPY", 1318.80/960.35),	
			//엔 -> 원화	
			new ExchangeRate("JPY", "KRW",960.35/1000),	
			// 엔 -> 달러	
			new ExchangeRate("JPY", "USD", 960.35/1318.80)
	};
	
	

	public static void main(String[] args) {
		
		//입력 구간
		Scanner scanner = new Scanner(System.in);
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount = 0;
		
		
		try {

			System.out.println("넣을 화폐 : ");
			exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 : ");
			exchangedCurrency = scanner.nextLine();
			System.out.println("금액 : ");
			amount = scanner.nextInt();
			
		} catch(Exception exception) {
//			exception.printStackTrace();
			System.out.println("입력값의 데이터 타입에 맞지 않습니다!");
			return;
		}
		
		
		
		
		
		
		//입력 검증 처리
		//모두 입력하였는지
		//유효한 금액이 아닌때 (금액이 양수가 아닐때)
		//관리하고 있지 않은 화폐단위가 입력 되었을때
				
		
		if(exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력하세요");
			return;
		}
		
		//입력한 상태가 동일 할때
		if (exchangingCurrency.equals(exchangedCurrency)) {
			System.out.println("동일한 화폐로 환전 불가능");
			return;
		}
		
		if(amount < 0) {
			System.out.println("유효한 금액이 아닙니다");
			return;
		}
		
		//관리하고 있는 화폐가 아닐때
	
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		// For each 데이터값을 조회할때 유용
		for ( String managedCurrency : managedCurrencies ) {
			
			
			if (exchangingCurrency.equals(managedCurrency)) {
				hasExchanging = true;
			}
			
			
			if (exchangedCurrency.equals(managedCurrency)) {
				hasExchanged = true;
			}
			
			
		
		}
		
		
		if (!(hasExchanged && hasExchanging)) {
			System.out.println("유효하지 않은 화폐");
			return;
		}
		
		
		
		//정상프로세스
		double resultAmount = amount;
		
		
		//입력한 값들과 일치하는 인스턴스를 찾는 코드
		for ( ExchangeRate exchangeRate: exchageRates) {
			
			
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency()) &&
					exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			
			if ( isSame) {
				
				resultAmount *= exchangeRate.getExchangeRate();
				break;                               
			}
			
		}
		
		
		//정상 출력 구간
		
		System.out.println(exchangedCurrency + ": " + resultAmount);
		
		
		

	}

}
