package exercise_190319;

//3. PencilSeller�� �����ڸ� �߰��ϰ� ����غ�����
//(�����ð� ������ ����)
public class Basic_03_PencilBuyer {

	int myMoney = 5000; // ���� �ݾ�
	int numOfPencil = 0; // ���� ����

	public void buyPencil(Basic_03_PencilSeller seller, int money) {
		numOfPencil += seller.salePencil(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***���� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: " + myMoney + "��");
		System.out.println("���� ����: " + numOfPencil + "��");
	}

}
