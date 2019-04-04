package exercise_190404;

import java.util.Calendar;

//1. 현재 시간을 계속 해서 출력하는 프로그램을 만드세요

//
//현재의 시간 값을 알아오는 코드는 다음과 같습니다
//Calendar c = Calendar.getInstance();
//int hour = c.get(Calendar.HOUR_OF_DAY);
//int min = c.get(Calendar.MINUTE);
//int second = c.get(Calendar.SECOND);
//
//String clockText = Integer.toString(hour);
//clockText = clockText.concat(":");
//clockText = clockText.concat(Integer.toString(min));
//clockText = clockText.concat(":");
//clockText = clockText.concat(Integer.toString(second));

class TimeThread extends Thread{
	
	public void run() {
		while (true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));

			System.out.println(clockText);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class Middle_01 {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.start();
	}
}
