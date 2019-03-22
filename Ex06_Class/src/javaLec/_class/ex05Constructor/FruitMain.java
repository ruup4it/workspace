package javaLec._class.ex05Constructor;

/* initMember �޼���� ���� ������ �� �־�
 * ��ü���� �ٸ� ������ ����������
 * �׷���, APPLE_PRICE�� ��� -> ������ �����߸��ϰ�
 * initMember�� ���� �ʰ� ȣ���ؾ߸��Ѵ�.
 * �̷� �� ������ �ʱ�ȭ �Լ��� ���� �ʰ�
 * ������ �Լ��� �̿��ϸ� ���ϴ�
 * */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(); // Default ������ ȣ��
		FruitSeller seller2 = new FruitSeller(10000, 20, 1500); // �Ű����� �ִ� ������ ȣ��
		FruitBuyer buyer = new FruitBuyer();

		if (seller1.getApplePrice() < seller2.getApplePrice()) {

			buyer.buyApple(seller1, 2000);
			seller1.showSaleResult();
		} else {
			buyer.buyApple(seller2, 1500);
			seller2.showSaleResult();
		}

		buyer.showBuyResult();
	}

}
