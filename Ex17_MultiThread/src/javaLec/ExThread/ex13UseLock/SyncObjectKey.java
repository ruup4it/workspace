package javaLec.ExThread.ex13UseLock;

import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum {
	int num1 = 0;
	int num2 = 0;
	final ReentrantLock key1 = new ReentrantLock();
	final ReentrantLock key2 = new ReentrantLock();

	public void addOneNum1() {
		key1.lock();
		num1 += 1;
		key1.unlock();
	}

	public void addTwoNum1() {
		key1.lock();
		num1 += 2;
		key1.unlock();
	}

	public void addOneNum2() {
		key2.lock();
		num2 += 1;
		key2.unlock();
	}

	public void addTwoNum2() {
		key2.lock();
		num2 += 2;
		key2.unlock();
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
