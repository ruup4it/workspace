package javaLec.ExThread.ex04PriorityTest;

/* 쓰레드의 lifecycle
 * 1) New		: 쓰레드 객체가 생성
 * 2) Runnable	: start() 호출되었을 때
 * 3) Blocked	: sleep(), join(), CPU할당이 안 되는 상태
 * 4) Dead		: run() 실행이 완료, 쓰레드 관련 메모리 해제.
 * 
 * 쓰레드의 메모리
 * 1) 메서드 영역 (static영역) - 공유
 * 2) 스택 영역 - 쓰레드 별로 따로 생성
 * 3) 힙 영역 - 공유
 * */
class MessageSendingThread extends Thread {
	String message;

	MessageSendingThread(String str, int prio) {
		message = str;
		setPriority(prio);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1); // 현재 쓰레드를 1ms동안 제어권을 중지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println((i + 1) + "번 / " + message + "(" + getPriority() + ")");
		}
	}
}

public class PriorityTest {
	public static void main(String[] args) {
//		MessageSendingThread t1 = new MessageSendingThread("First");
//		MessageSendingThread t2 = new MessageSendingThread("Second");
//		MessageSendingThread t3 = new MessageSendingThread("Third");
//		

		MessageSendingThread t1 = new MessageSendingThread("First", Thread.MAX_PRIORITY);
		MessageSendingThread t2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY);
		MessageSendingThread t3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
