package javaLec.ExThread.ex07ThreadSyncMethod;

class Calculator {
	int opCnt = 0;

	/*
	 * synchronized 을 메서드에 포함시키면 이 메서드의 연산이 끝나기 전에는 다른 쓰레드로 제어권이 넘어가지 않는다.
	 * 
	 * 동기화의 단점 동시에 여러 개 쓰레드가 접근할 수 없으므로 연산하는 쓰레드 외에는 대기 상태에 놓인다. 즉, 연산 시간이 길어지게 된다.
	 * 
	 * 성능을 올리기 위해서 동기화를 하지 않아도 에러가 없음을 확신하는 경우에는 동기화를 빼기도 함
	 */
	public synchronized int add(int n1, int n2) {
		opCnt++; // 동기화의 대상
		return n1 + n2;
	}

	public synchronized int min(int n1, int n2) {
		opCnt++; // 동기화의 대상
		return n1 - n2;
	}

	public void showOpCnt() {
		System.out.println("총 연산 횟수 : " + opCnt);
	}
}

class AddThread extends Thread {
	Calculator cal;

	public AddThread(Calculator cal) {
		this.cal = cal;
	}

	public void run() {
		System.out.println("1+2=" + cal.add(1, 2));
		System.out.println("2+4=" + cal.add(2, 4));
	}
}

class MinThread extends Thread {
	Calculator cal;

	public MinThread(Calculator cal) {
		this.cal = cal;
	}

	public void run() {
		System.out.println("2-1=" + cal.add(2, 1));
		System.out.println("4-2=" + cal.add(4, 2));
	}
}

public class ThreadSyncMethod {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		for (int i = 0; i < 10000; i++) {
			AddThread addThread = new AddThread(cal);
			MinThread minThread = new MinThread(cal);

			addThread.start();
			minThread.start();
			try {
				addThread.join();
				minThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		cal.showOpCnt();
	}
}
