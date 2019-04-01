package exercise_190401_Advance_03;

//Book 클래스는 ISBN 번호, 저자, 책 제목 정보를 포함한다.
public class Book extends Product {
	int numISBN;
	String author;
	String title;

	public Book(String description, String productor, String price, int numISBN, String author, String title) {
		super(description, productor, price);
		this.id = "Book" + count;
		this.numISBN = numISBN;
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + "\n책 제목  : " + title + "\n저자 : " + author + "\nISBN 번호 : " + numISBN;
	}

}
