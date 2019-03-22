package javaLec._class.ex03classToClass;

public class PencilBuyer {
	int myMoney = 5000; // ���� �ݾ�
	int numOfPencil = 0; // ���� ����
	final int PENCIL_PRICE = 1000; // ���� ����(���)

	public int buyPencil(int money) {
		int num = money / PENCIL_PRICE;
		numOfPencil += num;
		myMoney -= money;
		return num;
	}

	public void showBuyResult() {
		System.out.println("***���� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: 5000�� -> " + myMoney + "��");
		System.out.println("���� ����: 0�� -> " + numOfPencil + "��");
	}
}
