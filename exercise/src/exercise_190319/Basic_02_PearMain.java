package exercise_190319;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class Basic_02_PearMain {
	public static void main(String[] args) {
		Basic_02_PearSeller seller1 = new Basic_02_PearSeller();
		Basic_02_PearSeller seller2 = new Basic_02_PearSeller(10000, 20, 3000);
		Basic_02_PearBuyer buyer = new Basic_02_PearBuyer();

		if (seller1.getPearPrice() < seller2.getPearPrice()) {
			buyer.buyPear(seller1, 5000);
			seller1.showSaleResult();
		} else {
			buyer.buyPear(seller2, 5000);
			seller2.showSaleResult();
		}

		buyer.showBuyResult();

	}

}
