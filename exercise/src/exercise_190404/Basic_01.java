package exercise_190404;
//1. 1부터 100까지 출력한 뒤 종료하는 쓰레드는 Thread를 상속하는 방식으로 만들어보세요

class PrintNumThread extends Thread {
	int start, end;

	PrintNumThread(int s, int e) {
		start = s;
		end = e;
	}

	public void run() {
		for (int i = start; i <= end; i++) 
			System.out.println(i);
	}
}

public class Basic_01 {
	public static void main(String[] args) {
		System.out.println("Thread 상속");
		PrintNumThread at1 = new PrintNumThread(1, 100);
		at1.start();
		try {
			at1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
