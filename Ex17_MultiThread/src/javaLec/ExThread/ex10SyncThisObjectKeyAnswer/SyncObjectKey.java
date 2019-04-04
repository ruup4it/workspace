package javaLec.ExThread.ex10SyncThisObjectKeyAnswer;

/*
 * at1.run() 호출하는 쓰레드가 num1 의 연산을 하고 있다.
 * 그 때, at2.run()을 호출하는 쓰레드가 num2의 연산을 하고 있다면
 * 이 때는 동시에 연산이 이루어져도 문제가 없다.
 * 그러므로 아래처럼 무조건 synchronized를 다 붙여주면
 * 속도가 느려지는 과한 동기화가 된다.
 */
class IHaveTwoNum {
	int num1 = 0;
	int num2 = 0;
	Object key = new Object();

	public void addOneNum1() {
		synchronized (this) {
			num1 += 1;
		}
	}

	public void addTwoNum1() {
		synchronized (this) {
			num1 += 2;
		}
	}

	public void addOneNum2() {
		synchronized (key) {
			num2 += 1;
		}
	}

	public void addTwoNum2() {
		synchronized (key) {
			num2 += 2;
		}
	}

	public void showAllnums() {
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}

class AccessThread extends Thread {
	IHaveTwoNum twoNumInst;

	public AccessThread(IHaveTwoNum inst) {
		twoNumInst = inst;
	}

	public void run() {
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}

public class SyncObjectKey {
	public static void main(String[] args) {
		IHaveTwoNum numInst = new IHaveTwoNum();
		AccessThread at1 = new AccessThread(numInst);
		AccessThread at2 = new AccessThread(numInst);

		at1.start();
		at2.start();

		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		numInst.showAllnums();
	}
}
