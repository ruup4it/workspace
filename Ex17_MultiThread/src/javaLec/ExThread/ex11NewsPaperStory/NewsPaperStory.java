package javaLec.ExThread.ex11NewsPaperStory;

class NewsPaper {
	String todayNews;

	public void setTodayNews(String news) {
		todayNews = news;
	}

	public String getTodayNews() {
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
		for (int i = 0; i < 1000; i++) {
			NewsReader reader = new NewsReader(paper);
			NewsWriter writer = new NewsWriter(paper);

			try {
				reader.start();
				Thread.sleep(1);
				writer.start();

				writer.join();
				reader.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
