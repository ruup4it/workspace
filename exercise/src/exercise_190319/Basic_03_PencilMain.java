package exercise_190319;

//3. PencilSeller�� �����ڸ� �߰��ϰ� ����غ�����
//(�����ð� ������ ����)
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
