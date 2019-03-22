package javaLec._class.ex01classToClass;

public class FruitBuyer {
	int myMoney = 5000;		// 보유 금액
	int numOfApple = 0;		// 사과 개수
	
	//public void buyApple(int money) {
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("***과일 구매자의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);
	}
}



