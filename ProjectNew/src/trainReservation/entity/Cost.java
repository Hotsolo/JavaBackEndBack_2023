package trainReservation.entity;

//비용과 관련된 엔터니
public class Cost {
	private String departureStation;
	private String arrivalStation;
	private int amount;
	
	
	public Cost() {}
	
	
	//생성자의 값을 대입
	public Cost(String departureStation,String arrivalStation,int amount) {
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.amount = amount;
	}
	
	
	
	public String getDepartureStation() {
		return this.departureStation;
	}
	
	
	public String getArrivalStation() {
		return this.arrivalStation;
	}
	
	
	public int getAmount() {
		return this.amount;
	}


	@Override
	public String toString() {
		return "Cost [departureStation=" + departureStation + ", arrivalStation=" + arrivalStation + ", amount="
				+ amount + "]";
	}


	
	
	
	
	
	
	
	
	
}
