package javaLec._class.ex06Constructor;

public class PencilBuyer {
	int myMoney = 5000; // 보유 금액
	int numOfPencil = 0; // 연필 개수

	public void buyPencil(PencilSeller seller, int money) {
		numOfPencil += seller.salePencil(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***나의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney + "원");
		System.out.println("연필 개수: " + numOfPencil + "개");
	}
}
