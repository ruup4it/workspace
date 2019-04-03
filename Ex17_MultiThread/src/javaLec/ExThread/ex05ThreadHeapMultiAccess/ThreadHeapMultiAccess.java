package javaLec.ExThread.ex05ThreadHeapMultiAccess;

class Sum {
	int num;

	Sum() {
		num = 0;
	}

	void addNum(int n) {
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

public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 50);
		AdderThread at2 = new AdderThread(s, 51, 100);
		at1.start();
		at2.start();

		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : " + s.getNum());
	}
}
