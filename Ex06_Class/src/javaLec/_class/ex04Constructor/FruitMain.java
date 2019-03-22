package javaLec._class.ex04Constructor;

/* initMember �޼���� ���� ������ �� �־�
 * ��ü���� �ٸ� ������ ����������
 * �׷���, APPLE_PRICE�� ��� -> ������ �����߸��ϰ�
 * initMember�� ���� �ʰ� ȣ���ؾ߸��Ѵ�.
 * �̷� �� ������ �ʱ�ȭ �Լ��� ���� �ʰ�
 * ������ �Լ��� �̿��ϸ� ���ϴ�
 * */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller();
		FruitSeller seller2 = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		seller1.initMembers(10000, 20, 1000);
		seller2.initMembers(10000, 15, 1500);
		
		if(seller1.getApplePrice() > seller2.getApplePrice())
			buyer.buyApple(seller2, 1500);
		else
			buyer.buyApple(seller1, 2000);
		
		seller1.showSaleResult();
		buyer.showBuyResult();
	}

}
