package javaLec._class.ex05Constructor;

/* <Ŭ������ Ŭ�������� ��ȣ����>
 * ���� ����������� ��� 2���� �����ߴ�.
 * 1) ��� : ��, �������, ���
 * 2) ���� : �����ߴ�
 * 3) ���� ��������� Class�� ���
 * 4) ����� �ʵ�
 * 5) �����ߴٴ� �޼���
 * */

public class FruitSeller {
	int numOfApple; // ��� ����
	int myMoney; // �Ǹ� �ݾ�
	final int APPLE_PRICE;// ��� ����(���)
	
	// �����ڿ����� final ����� 1�� �ʱ�ȭ �� �� �ִ�.
	// �� ������ָ� �����Ϸ��� ���� �̷� ��Ī���� ���ܳ�
	FruitSeller(){
		numOfApple = 20; // ��� ����
		myMoney = 0; // �Ǹ� �ݾ�
		APPLE_PRICE = 1000;// ��� ����(���)
		System.out.println("Default ������");
	}
	
	FruitSeller(int money, int appleNum, int price){
		numOfApple = appleNum; // ��� ����
		myMoney = money; // �Ǹ� �ݾ�
		APPLE_PRICE = price;// ��� ����(���)
		System.out.println("�Ű����� �ִ� ������");
	}
	
	// �Ǹ��ϴ�
	// public int saleApple(FruitBuyer buyer, int money)
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	// �ǸŰ��
	public void showSaleResult() {
		System.out.println("***���� ����� ���� ��Ȳ***");
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
	
	// ���� Ȯ�� �޼���
	public int getApplePrice() {
		return APPLE_PRICE;
	}
}
