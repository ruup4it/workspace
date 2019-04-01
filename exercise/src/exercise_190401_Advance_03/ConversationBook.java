package exercise_190401_Advance_03;
//ConversationBook은 회화책에서 다루는 언어명 정보를 포함한다.
public class ConversationBook extends Book{
	String language;

	public ConversationBook(String description, String productor, String price, int numISBN, String author,
			String title, String language) {
		super(description, productor, price, numISBN, author, title);
		this.id = "ConversationBook" + count;
		this.language = language;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\n언어 : " + language;
	}
}
