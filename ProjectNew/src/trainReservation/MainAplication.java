package trainReservation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStaion;
import trainReservation.entity.Train;


public class MainAplication {

	
	private static List<Train> trains = new ArrayList<>(); 
	private static List<Cost> costs = new ArrayList<>();
	
	private static DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("dd:mm");
	
	
	public static void main(String[] args) {
		
		initData();
		
		
		LocalTime time = LocalTime.parse("653-456",timeformatter);
		
		while (true) {
			
			//인스턴스를 생성하고 초기화
			
			
			GetTrainListDto dto = new GetTrainListDto();
			
			LocalTime departureTime = null;
			
			
			if(dto.isEmpty() ) {
				System.out.println("모두 입력하세요");
				continue;
			}
			
			
			
			try {
				LocalTime.parse(null,timeformatter);
				
			} catch(Exception exception) {
				System.out.println("잘못된 시간입니다");
				continue;
				
			}
			
			
			if (dto.getNumberOfPeople() <= 0) {
				System.out.println("잘못된 인원 입니다.");
				continue;
			}
			
			if (dto.isEqualStation()) {
				System.out.println("출발역과 도착역이 같습니다.");
				continue;
				
			}
			
			
			
			List<Train> possibleTrains = new ArrayList<>();
			
			
			for (Train train : trains) {
				
				List<StopStaion> stopStaions = train.getStopStaions();
				int sameStationIndex = -1;
				
				for (int stopStationIndex = 0; stopStationIndex < stopStaions.size(); stopStationIndex++) {
					
					String stopStationName = stopStaions.get(stopStationIndex).getStationName();
				
					
					if (dto.isEqualDepartureStation(stopStationName)) {
						continue;
						
					}
					
					
					LocalTime stationDepartureTime = LocalTime.parse(dto.getDepartureTime(),timeformatter) ;
					
					if (stationDepartureTime.isBefore(departureTime)) {
						break;
					}
					
					
					
					sameStationIndex = stopStationIndex;
					break;
					
				}
				
				
				if (sameStationIndex == -1) {
					continue;
				}
				
				
				
				for (int stopStationIndex = 0; stopStationIndex < stopStaions.size(); stopStationIndex++) {
					
					String stationName = stopStaions.get(stopStationIndex).getStationName();
					
					if(!dto.isEqualArrivalStation(stationName)) {
						continue;
					}
					
					if(stopStationIndex <= sameStationIndex) {
						continue;
					}
					
					
					possibleTrains.add(train);
					break;
						
					System.out.println(possibleTrains.toString());
					
				}
				
				
				
				
				
				
				
				
			}
			
			
			
			
			 
		}
		
		
		

		
		
	}
	
	
	private static void initData() {
		
		costs.add(new Cost("부산역", "서울역",30000));
		costs.add(new Cost("부산역", "대전역",20000));
		costs.add(new Cost("부산역", "대구역",10000));
		costs.add(new Cost("대구역", "사을역",20000));
		costs.add(new Cost("대구역", "대전역",10000));
		costs.add(new Cost("대전역", "서울역",10000));
			
		costs.add(new Cost("서울역", "부산역",30000));
		costs.add(new Cost("서울역", "대구역",20000));
		costs.add(new Cost("서울역", "대전역",10000));
		costs.add(new Cost("대전역", "부산역",20000));
		costs.add(new Cost("대구역", "부산역",10000));
		costs.add(new Cost("대전역", "대구역",10000));
		
		
		
		Train train;
		List<Seat> seats = new ArrayList<>();
		List<StopStaion> stopStations = new ArrayList<>();
		
		stopStations.add(new StopStaion("서울역", "05:45", "06:00"));
		stopStations.add(new StopStaion("대전역", "06:45", "06:00"));
		stopStations.add(new StopStaion("대구역", "07:45", "06:00"));
		stopStations.add(new StopStaion("부산역", "09:45", ""));
		
		seats.add(new Seat(1,"A1",false));
		seats.add(new Seat(1,"B1",false));
		seats.add(new Seat(1,"A2",false));
		seats.add(new Seat(1,"B2",false));
		seats.add(new Seat(2,"A1",false));
		seats.add(new Seat(2,"B1",false));
		seats.add(new Seat(2,"A2",false));
		seats.add(new Seat(2,"B2",false));
		seats.add(new Seat(3,"A1",false));
		seats.add(new Seat(3,"B1",false));
		seats.add(new Seat(3,"A2",false));
		seats.add(new Seat(3,"B2",false));
		
		
		
		
		train = new Train("KTX001","서울역","06:00","부산역","9:00",100,"KTX",stopStations, seats);
		
		
		trains.add(train);
		
		
		train = new Train("KTX001","부산역","09:00","서울역","12:00",100,"KTX",stopStations, seats);
		
		trains.add(train);
		
		
		
		seats = new ArrayList<>();
		stopStations = new ArrayList<>();
		

		seats.add(new Seat(1,"A1",false));
		seats.add(new Seat(1,"B1",false));
		seats.add(new Seat(1,"A2",false));
		seats.add(new Seat(1,"B2",false));
		seats.add(new Seat(2,"A1",false));
		seats.add(new Seat(2,"B1",false));
		seats.add(new Seat(2,"A2",false));
		seats.add(new Seat(2,"B2",false));
		seats.add(new Seat(3,"A1",false));
		seats.add(new Seat(3,"B1",false));
		seats.add(new Seat(3,"A2",false));
		seats.add(new Seat(3,"B2",false));
		
		stopStations.add(new StopStaion("부산역", "05:45", "06:00"));
		stopStations.add(new StopStaion("데구역", "06:45", "06:00"));
		stopStations.add(new StopStaion("대전역", "07:45", "06:00"));
		stopStations.add(new StopStaion("서울역", "09:45", ""));
		
		
		
		train = new Train("KTX001","서울역","06:00","부산역","9:00",100,"KTX",stopStations, seats);
		
		
		trains.add(train);
		
		
		train = new Train("KTX001","부산역","09:00","서울역","12:00",100,"KTX",stopStations, seats);
		
		trains.add(train);
		
		
	}
	
	
	
	
	
	
	
	

}
