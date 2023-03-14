package chapter5.C_DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

// 날짜 및 시간

public class DateTime {

	public static void main(String[] args) {
		// System.System.currentTimeMillis();
		// 현재 시간은 long 타입으로 0.001초 단위로 표현
		// 기준 1960년 1월 1일
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		
		for (int count = 0; count < 1000000000; count++) {
			count++;
		}
		
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		
		// Date class
		// 날짜와 관련된 데이터타입을 취급할 때 사용
		
		
		Date date = new Date();
		 System.out.println(date);
		
		
		System.out.println(date.getMonth());
		date.setHours(10);
		System.out.println(date);
		
		Date now = Date.from(Instant.now());
		System.out.println(now);
		
		Date minusTwoHour = Date.from(Instant.now().minus(2,ChronoUnit.HOURS));
		System.out.println(minusTwoHour);
		
		// SimpleDateFormat
		// Date 타입의 참조변수를 저장한 포맷의 문자열로 변환해주는 클래스
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy,MM,dd,HH:mm:ss");
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		// Time Package
		// Date와 Calander 클래스의 단점 보완
		
		// LocalDate class
		// 날짜를 관리해주는 class
		LocalDate localDateOf = LocalDate.of(2022, 12, 25);
		System.out.println(localDateOf);
		
		// LocalTime class
		// 시간을 관리해주는 class
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		
		
		
		
		// 특정 날짜 및 시간 변경 (직접 변경, 더하기, 빼기)
		// 직접 벼녁ㅇ : with.0000000000000000000000000000000000000000
		
		
		
		
	}

}
