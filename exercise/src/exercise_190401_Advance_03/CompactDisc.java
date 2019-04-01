package exercise_190401_Advance_03;

//CompactDisc 클래스는 앨범 제목, 가수 이름 정보를 포함한다.
public class CompactDisc extends Product {
	String albumTitle;
	String singer;

	public CompactDisc(String description, String productor, String price, String albumTitle, String singer) {
		super(description, productor, price);
		this.id = "CompactDisc" + count;
		this.albumTitle = albumTitle;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return super.toString() + "\n앨범 제목 : " + albumTitle + "\n가수 이름 : " + singer;
	}
}
