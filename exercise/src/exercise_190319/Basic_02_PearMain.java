package exercise_190319;

//2. ���� ��Ʈ�� ���� 5000���� �ְ� �� ���� 2500�� ��ٸ� 
//Ŭ������ �����ؼ� ���α׷��� �ϼ���
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
