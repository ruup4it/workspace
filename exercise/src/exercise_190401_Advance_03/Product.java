package exercise_190401_Advance_03;

//Product클래스는 각 상품의 고유한 식별자, 상품 설명, 생산자, 가격정보를 포함하고 있다.
public class Product {
	protected static int count;
	protected String id; 
	protected String description;
	protected String productor;
	protected String price;

	public Product(String description, String productor, String price) {
		this.count++;
		this.id = "Product" + count;
		this.description = description;
		this.productor = productor;
		this.price = price;
	}

	@Override
	public String toString() {
		return "===============================" + "\n식별자 : " + id + "\n상품 설명 : " + description + "\n생산자  : " + productor
				+ "\n가격정보 : " + price;
	}

}
