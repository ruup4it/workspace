package exercise_190404;



//2. 4개의 쓰레드를 생성하세요
//  1개의 결과값을 담는 객체를 4개 쓰레드에 공유합니다.
//  각각 1~ 100
//       101 ~ 200
//       201 ~ 300
//       301 ~ 400
//  을 합을 계산하고
//  main에서 결과값 담는 객체의 결과를 출력하도록 구현하세요

class Sum {
	int num;

	Sum() {
		num = 0;
	}

	synchronized void addNum(int n) {
		num += n;
	}

	int getNum() {
		return num;
	}
}

class AdderThread extends Thread {
	Sum sumInst;
	int start, end;
	
	AdderThread(Sum sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Middle_02 {
	public static void main(String[] args) {
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 100);
		AdderThread at2 = new AdderThread(s, 101, 200);
		AdderThread at3 = new AdderThread(s, 201, 300);
		AdderThread at4 = new AdderThread(s, 301, 400);
		
		at1.start(); 
		at2.start(); 
		at3.start();
		at4.start();

		try {
			at1.join();
			at2.join();
			at3.join();
			at4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1부터 400까지의 합 : " + s.getNum());
		
		// 확인용
//		int sum = 0;
//		for(int i = 1 ; i<=400;i++) {
//			sum+=i;
//		}
//		System.out.println("1부터 400까지의 합 : " + sum);
	}
}
