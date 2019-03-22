package exercise_190319;
//3. PencilSeller�� �����ڸ� �߰��ϰ� ����غ�����
//(�����ð� ������ ����)
public class Basic_03_PencilSeller {
	int numOfPencil; // ���� ����
	int myMoney; // �Ǹ� �ݾ�
	final int PENCIL_PRICE; // ���� ����(���)

	Basic_03_PencilSeller() {
		myMoney = 5000; // ���� �ݾ�
		numOfPencil = 2; // ���� ����
		PENCIL_PRICE = 1000; // ���� ����(���)
	}

	Basic_03_PencilSeller(int money, int pencilNum, int price) {
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
