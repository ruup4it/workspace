package javaLec._class.ex05Constructor;

public class FruitBuyer {
	int myMoney = 5000; // ���� �ݾ�
	int numOfApple = 0; // ��� ����
	

	// public void buyApple(int money) {
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***���� �������� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: " + myMoney);
		System.out.println("��� ����: " + numOfApple);
	}
}
