package exercise_190319;

//2. ���� ��Ʈ�� ���� 5000���� �ְ� �� ���� 2500�� ��ٸ� 
//Ŭ������ �����ؼ� ���α׷��� �ϼ���
public class Basic_02_PearBuyer {
	int myMoney = 10000; // ���� �ݾ�
	int numOfPear = 0; // �� ����

	public void buyPear(Basic_02_PearSeller seller, int money) {
		numOfPear += seller.salePear(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***���� ���� ��Ȳ***");
		System.out.println("���� �ܾ�: " + myMoney + "��");
		System.out.println("�� ����: " + numOfPear + "��");
	}

}
