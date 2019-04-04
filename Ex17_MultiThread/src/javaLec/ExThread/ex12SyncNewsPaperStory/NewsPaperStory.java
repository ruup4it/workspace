package javaLec.ExThread.ex12SyncNewsPaperStory;

class NewsPaper {
	String todayNews;
	boolean isTodayNews = false;

	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		synchronized (this) {
			//notifyAll();	// wait 상태의 모든 쓰레드가 깨어난다.
			notify();		// wait 상태의 1개 쓰레드만 깨어난다. (먼저 wait된 것부터 해제)
			notify();
		}
	}

	public String getTodayNews() {
		if (isTodayNews == false) {
			try {
				synchronized (this) { // 잠금
					System.out.println("대기대기");
					/*
					 * notify(신호)가 올때까지 대기상태 쓰레드가 잠이 드는 상태 synchronized(this) 해제
					 */
					wait(); // 2개의 reader 객체 쓰레드 모드 대기
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return todayNews;
	}
}

class NewsWriter extends Thread {
	NewsPaper paper;

	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}

	public void run() {
		paper.setTodayNews("류현진이 2승을 거두었습니다~");
	}
}

class NewsReader extends Thread {
	NewsPaper paper;

	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}

	public void run() {
		System.out.println("오늘의 뉴스: " + paper.getTodayNews());
	}
}

public class NewsPaperStory {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();

		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		try {
			reader1.start();
			reader2.start();
			Thread.sleep(1000);
			writer.start();

			writer.join();
			reader1.join();
			reader2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
