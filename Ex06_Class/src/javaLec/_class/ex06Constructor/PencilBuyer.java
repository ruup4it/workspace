package javaLec._class.ex06Constructor;

public class PencilBuyer {
	int myMoney = 5000; // ���� �ݾ�
	int numOfPencil = 0; // ���� ����

	public void buyPencil(PencilSeller seller, int money) {
		numOfPencil += seller.salePencil(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***���� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: " + myMoney + "��");
		System.out.println("���� ����: " + numOfPencil + "��");
	}
}
