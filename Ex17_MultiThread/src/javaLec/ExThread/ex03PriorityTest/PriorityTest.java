package javaLec.ExThread.ex03PriorityTest;

class MessageSendingThread extends Thread {
	String message;

	MessageSendingThread(String str) {
		message = str;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message + "(" + getPriority() + ")");
		}
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		MessageSendingThread t1 = new MessageSendingThread("First");
		MessageSendingThread t2 = new MessageSendingThread("Second");
		MessageSendingThread t3 = new MessageSendingThread("Third");
		
		
//		MessageSendingThread t1 = new MessageSendingThread("First", Thread.MAX_PRIORITY);
//		MessageSendingThread t2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY);
//		MessageSendingThread t3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
