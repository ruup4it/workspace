package javaLec.ExThread.ex14ConditionSyncOrder_Scanner;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class StringComm {
	String newString;
	boolean isNewString = false;
	final ReentrantLock entLock = new ReentrantLock();
	final Condition readCond = entLock.newCondition();
	final Condition writeCond = entLock.newCondition();

	public void setNewString(String news) {
		entLock.lock();
		try {
			if (isNewString == true)
				writeCond.await();		// 쓰레드 대기 상태
			newString = news;
			isNewString = true;
			readCond.signal();			// = notify() :  깨운다
			writeCond.await();	
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
	}

	public String getNewString() {
		String retStr = null;
		/*
		 * 다른 쓰레드가 이미 lock을 걸었을 경우는 진입대기 내가 먼저 진입하면 다른 쓰레드 못 들어가게 1ock을 건다
		 */
		entLock.lock();

		try {
			if (isNewString == false)
				readCond.await();
			retStr = newString;
			isNewString = false;
			writeCond.signal();
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
		return retStr;
	}
}

class StringReader extends Thread {
	StringComm comm;

	public StringReader(StringComm comm) {
		this.comm = comm;
	}

	public void run() {
		Scanner keyboard = new Scanner(System.in);
		String readStr;
		for (int i = 0; i < 5; i++) {
			System.out.println("입력 >");
			readStr = keyboard.nextLine();
			comm.setNewString(readStr);
		}
	}
}

class StringWriter extends Thread {
	StringComm comm;

	public StringWriter(StringComm comm) {
		this.comm = comm;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("read string : " + comm.getNewString());
		}
	}
}

public class ConditionSyncOrderMain {
	public static void main(String[] args) {
		StringComm strComm = new StringComm();
		StringReader sr = new StringReader(strComm);
		StringWriter sw = new StringWriter(strComm);
		System.out.println("입출력 쓰레드 실행...");
		sr.start();
		sw.start();

	}
}
