package javaLec._class.ex02classToClass;

public class FruitBuyer {
	int myMoney = 5000;		// ���� �ݾ�
	int numOfApple = 0;		// ��� ����
	final int APPLE_PRICE = 1000;// ��� ����(���)
	
	public int buyApple(int money) {
	//public void buyApple(FruitSeller seller, int money) {
		int num = money/APPLE_PRICE;
		numOfApple += num;
		myMoney -= money;
		return num;
	}
	public void showBuyResult() {
		System.out.println("***���� �������� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: " + myMoney);
		System.out.println("��� ����: " + numOfApple);
	}
}



