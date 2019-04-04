package exercise_190404;

//2. 1부터 100까지 출력한 뒤 종료하는 쓰레드는 Runnable를 상속하는 방식으로 만들어보세요

class PrintNumRunnable implements Runnable {
	int start, end;

	PrintNumRunnable(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

}

public class Basic_02 {
	public static void main(String[] args) {
		System.out.println("Runnable 상속");
		PrintNumRunnable pt = new PrintNumRunnable(1,100);
		Thread t1 = new Thread(pt);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
