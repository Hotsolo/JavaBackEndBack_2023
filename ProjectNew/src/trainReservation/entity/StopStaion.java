package trainReservation.entity;

//정차역 Entity class
public class StopStaion {
	private String stationName;
	private String departureTime;
	private String arrivalTime;
	
	
	
	public StopStaion() {
		// TODO Auto-generated constructor stub
	}



	public StopStaion(String stationName, String departureTime, String arrivalTime) {
		this.stationName = stationName; //인스턴스와 클래스 변수 구별하기 위해 this
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}


	
	public String getStationName() {
		return stationName; //this 안찍어도 인식됨
	}



	public String getDepartureTime() {
		return departureTime;
	}



	public String getArrivalTime() {
		return arrivalTime;
	}
	
	
	
	
	
	
	
	
	

}
