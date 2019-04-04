package javaLec.ExThread.ex14ConditionSyncOrder;

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
		/*
		 * 1) lock은 자물쇠로 잠근다. 
		 * 2) signal이나 await에 의해 해제된다 
		 * 3) lock에 의해 파생된 condition들은 반드시 lock~unlock안에서 제어되어야 한다
		 * 이 곳에서는 condition을 사용하기 위한 영역을 설정하는 의미
		 */
		entLock.lock();
		try {
			if (isNewString == true)
				writeCond.await(); // 쓰레드 대기 상태
			newString = news;
			isNewString = true;
			writeCond.await();
			readCond.signal(); // = notify() : 깨운다
			Thread.sleep(1000);
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
			Thread.sleep(1000);
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
		String[] strs = { "사과", "귤", "바나나", "포도", "수박" };
		for (int i = 0; i < 5; i++) {
			// 1초~3초 미만의 시간 간격으로 문자열 전달
			int num = (int) (Math.random() * 200) + 100;

			try {
				Thread.sleep(num);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			comm.setNewString(strs[i]);
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
