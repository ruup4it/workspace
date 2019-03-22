package javaLec._class.ex03classToClass;

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
	int numOfPencil = 2; // ���� ����
	int myMoney = 0; // �Ǹ� �ݾ�

	// �Ǹ��ϴ�
	public void salePencil(PencilBuyer buyer, int money) {
		numOfPencil -= buyer.buyPencil(money);
		myMoney += money;
	}

	// �ǸŰ��
	public void showSaleResult() {
		System.out.println("***ģ���� ���� ��Ȳ***");
		System.out.println("���� ����: 2�� -> " + numOfPencil + "��");
		System.out.println("�Ǹ� ����: 0�� -> " + myMoney + "��");
	}
}
