package javaLec._class.ex06Constructor;

/* <Ŭ������ Ŭ�������� ��ȣ����>
 * ���� ģ������ 2000���� �ְ� ���� 1�ڷ�� �����ߴ�.
 * 
 * 1) ��� : ��, ģ��, ����
 * 2) ���� : �����ߴ�
 * 3) ���� ģ���� Class�� ���
 * 4) ������ �ʵ�
 * 5) �����ߴٴ� �޼���
 * */

public class PencilSeller {
	int numOfPencil; // ���� ����
	int myMoney; // �Ǹ� �ݾ�
	final int PENCIL_PRICE; // ���� ����(���)

	PencilSeller() {
		myMoney = 5000; // ���� �ݾ�
		numOfPencil = 2; // ���� ����
		PENCIL_PRICE = 1000; // ���� ����(���)
	}

	PencilSeller(int money, int pencilNum, int price) {
		myMoney = money; // ���� �ݾ�
		numOfPencil = pencilNum; // ���� ����
		PENCIL_PRICE = price; // ���� ����(���)
	}

	// �Ǹ��ϴ�
	public int salePencil(int money) {
		int num = money / PENCIL_PRICE;
		numOfPencil -= num;
		myMoney += money;
		return num;
	}

	// �ǸŰ��
	public void showSaleResult() {
		System.out.println("***ģ���� ���� ��Ȳ***");
		System.out.println("���� ����: " + numOfPencil + "��");
		System.out.println("�Ǹ� ����: " + myMoney + "��");
	}

	// ���� Ȯ�� �޼���
	public int getPencilPrice() {
		return PENCIL_PRICE;
	}
}
