package javaLec._class.ex06Constructor;

public class PencilMain {
	public static void main(String[] args) {
		PencilSeller seller1 = new PencilSeller();
		PencilSeller seller2 = new PencilSeller(10000, 20, 2000);
		PencilBuyer buyer = new PencilBuyer();

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
