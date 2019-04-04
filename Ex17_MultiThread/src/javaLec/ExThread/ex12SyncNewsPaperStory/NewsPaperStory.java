package javaLec.ExThread.ex12SyncNewsPaperStory;

class NewsPaper {
	String todayNews;
	boolean isTodayNews = false;

	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		synchronized (this) {
			notifyAll();
		}
	}

	public String getTodayNews() {
		if (isTodayNews == false) {
			try {
				synchronized (this) {
					System.out.println("대기대기");
					wait();
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
		for (int i = 0; i < 2; i++) {
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
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
