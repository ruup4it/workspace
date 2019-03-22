package javaLec._class.ex03classToClass;

public class PencilBuyer {
	int myMoney = 5000; // 보유 금액
	int numOfPencil = 0; // 연필 개수
	final int PENCIL_PRICE = 1000; // 연필 가격(상수)

	public int buyPencil(int money) {
		int num = money / PENCIL_PRICE;
		numOfPencil += num;
		myMoney -= money;
		return num;
	}

	public void showBuyResult() {
		System.out.println("***나의 현재 상황***");
		System.out.println("현재 잔액: 5000원 -> " + myMoney + "원");
		System.out.println("연필 개수: 0개 -> " + numOfPencil + "개");
	}
}
