package javaLec._class.ex02classToClass;

/* <Ŭ������ Ŭ�������� ��ȣ����>
 * ���� ����������� ��� 2���� �����ߴ�.
 * 1) ��� : ��, �������, ���
 * 2) ���� : �����ߴ�
 * 3) ���� ��������� Class�� ���
 * 4) ����� �ʵ�
 * 5) �����ߴٴ� �޼���
 * */

public class FruitSeller {
	int numOfApple = 20;	// ��� ����
	int myMoney = 0;		// �Ǹ� �ݾ�
	

	// �Ǹ��ϴ�
	public void saleApple(FruitBuyer buyer, int money) {
	//public int saleApple(int money) {
		numOfApple -= buyer.buyApple(money);
		myMoney += money;
	}
	// �ǸŰ��
	public void showSaleResult() {
		System.out.println("***���� ����� ���� ��Ȳ***");
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
}







