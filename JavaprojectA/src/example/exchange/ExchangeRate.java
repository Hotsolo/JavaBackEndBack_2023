package example.exchange;


// 화폐 : 화폐 = 환율


public class ExchangeRate {

	//넣을 화폐 (ex : 원화, 달러, 엔화, 위완화)
	private String exchangingCurrency;
	//바꿀 화폐 (ex : 원화, 달러, 엔화, 위완화)
	private String exchangedCurrency;
	//환율 ( 환율 1000 / 3.32425,325)
	private double exchangeRate;
	
	
	// 우클릭 소스 후 필드 클릭
	public ExchangeRate(String exchangingCurrency, String exchangedCurrency, double exchangeRate) {
		super();
		this.exchangingCurrency = exchangingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}

	
	//getter메서드 : 외부에 값을 반환
	// 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드

	public String getExchangingCurrency() {
		return exchangingCurrency;
	}


	public String getExchangedCurrency() {
		return exchangedCurrency;
	}


	public double getExchangeRate() {
		return exchangeRate;
	}

	

	
	//set메서드
	// 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 변경해주기 위한 메서드


	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}


	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}

	
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	// 출력값 확인
	@Override
	public String toString() {
		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + ", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}


	
	
	
	
	

	
	
	
	
	

}
