package exercise_190319;
//1. 노래를 나타내는 Song이라는 클래스를 설계하세요.

//<필드>
// 노래제목 title
// 가수    artist
// 앨범제목 album
// 작곡가  composer
// 노래가 발표된 연도 year
// 노래가 속한 앨범에서의 트랙 번호를 나타내는 track
//
//<메서드>
// 노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
// 노래의 정보를 나타내는 show()
//
//<main 실행>
// ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
// Show()로 출력하세요

class Song {
	String title; // 노래제목 title
	String artist; // 가수 artist
	String album; // 앨범제목 album
	String composer; // 작곡가 composer
	int year; // 노래가 발표된 연도 year
	int track; // 노래가 속한 앨범에서의 트랙 번호를 나타내는 track

	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println(String.format("노래 제목 : %s \n가수 : %s \n앨범 제목 : %s \n작곡가 : %s\n노래가 발표된 연도 : %d \n트랙 번호 : %d",
				title, artist, album, composer, year, track));
	}

}

public class Middle_01 {

	public static void main(String[] args) {
		// ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
		// Show()로 출력하세요
		Song dancingQueen = new Song();
		dancingQueen.setSongInfo("Dancing Queen", "ABBA", "Arrival", "Benny Andersson, Björn Ulvaeus, Stig Anderson",
				1976, 2);
		dancingQueen.show();

	}

}
