package trainReservation.entity;

import java.util.List;

// 기차 정보에 대한 Entity Class
public class Train {
	
	private String trainNumber;
	private String departureStation;
	private String departureTime;
	private String arrivalTime;
	private String arrivalStation;
	private int takeMinute;
	private String type;
	private List<StopStaion> stopStaions;
	private List<Seat> seats;
	
	// 비용 ( 클래스 - 출발역, 도착역, 금액 )
	// 정차역 (class - 역명, 도착시간, 출발시간)
	// 남아있는 좌석 (class - 호차,좌석번호, 좌석 상태)
	// 1 : N 관계
	
	
	public Train() {
		// TODO Auto-generated constructor stub
	}

	public Train(String trainNumber, String departureStation, String departureTime, String arrivalTime,
			String arrivalStation, int takeMinute, String type, List<StopStaion> stopStaions, List<Seat> seats) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.arrivalStation = arrivalStation;
		this.takeMinute = takeMinute;
		this.type = type;
		this.stopStaions = stopStaions;
		this.seats = seats;
	}
	

	//Getter
	public String getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public int getTakeMinute() {
		return takeMinute;
	}

	public String getType() {
		return type;
	}

	public List<StopStaion> getStopStaions() {
		return stopStaions;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", departureStation=" + departureStation + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", arrivalStation=" + arrivalStation
				+ ", takeMinute=" + takeMinute + ", type=" + type + ", stopStaions=" + stopStaions + ", seats=" + seats
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
