package exercise_190319;

//3. PencilSeller에 생성자를 추가하고 사용해보세요
//(수업시간 마지막 문제)
public class Basic_03_PencilMain {

	public static void main(String[] args) {
		Basic_03_PencilSeller seller1 = new Basic_03_PencilSeller();
		Basic_03_PencilSeller seller2 = new Basic_03_PencilSeller(10000, 20, 2000);
		Basic_03_PencilBuyer buyer = new Basic_03_PencilBuyer();

		if (seller1.getPencilPrice() < seller2.getPencilPrice()) {
			buyer.buyPencil(seller1, 1000);
			seller1.showSaleResult();
		} else {
			buyer.buyPencil(seller2, 3000);
			seller2.showSaleResult();
		}

		buyer.showBuyResult();

	}

}
