package exercise_190319;

//2. ���� ��Ʈ�� ���� 5000���� �ְ� �� ���� 2500�� ��ٸ� 
//Ŭ������ �����ؼ� ���α׷��� �ϼ���
public class Basic_02_PearSeller {
	int numOfPear; // �� ����
	int myMoney; // �Ǹ� �ݾ�
	final int PEAR_PRICE; // �� ����(���)

	Basic_02_PearSeller() {
		myMoney = 5000; // ���� �ݾ�
		numOfPear = 10; // �� ����
		PEAR_PRICE = 2500; // �� ����(���)
	}

	Basic_02_PearSeller(int money, int pearNum, int price) {
		myMoney = money; // ���� �ݾ�
		numOfPear = pearNum; // �� ����
		PEAR_PRICE = price; // �� ����(���)
	}

	// �Ǹ��ϴ�
	public int salePear(int money) {
		int num = money / PEAR_PRICE;
		numOfPear -= num;
		myMoney += money;
		return num;
	}

	// �ǸŰ��
	public void showSaleResult() {
		System.out.println("***��Ʈ ���� ��Ȳ***");
		System.out.println("���� ��: " + numOfPear + "��");
		System.out.println("�Ǹ� ����: " + myMoney + "��");
	}

	// ���� Ȯ�� �޼���
	public int getPearPrice() {
		return PEAR_PRICE;
	}
}
