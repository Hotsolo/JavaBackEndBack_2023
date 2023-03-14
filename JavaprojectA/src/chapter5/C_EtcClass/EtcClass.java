package chapter5.C_EtcClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

class Delay extends TimerTask {

	@Override
	public void run() {
		// 지연 시킬 메서드를 작성
		System.out.println("지연됨!");
		
		
	}
	
	
	
}

public class EtcClass {
	
	// Timer - TimerTask
	// 특정 작업을 지연 시킬때 사용
	// TimerTask 클래스를 상속 받아서 run 메서드를 구현
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Timer 클래스의 인스턴스로 TimerTask 구현제를 실행
		
		Timer timer = new Timer(true);
		Delay delay = new Delay();
		timer.schedule(delay, 4);
		
		for (int index =0; index < 1000000000; index++) {
			int a = 10;
			int b = 20;
			a += b;
			b -= a;
		}
		
		
		
		System.out.println("완료");
		
		
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// BigDecimal
		// 정확한 소수점 연산을 하기 위한 클래스
		
		double double1 = 9.47202455;
		double double2 = 1.30325325;
		
		System.out.println(double1 + double2);
		
		BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(double1));
		BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(double2));
		System.out.println(bigDecimal1.add(bigDecimal2));
		
		
		//DecimalFormat
		// 일정한 형식으로 데이터를 출력해주는 클래스
		
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.00");
		
		System.out.println(decimalFormat.format(10_000_000));
		
		
	}

}
