package javaLec._class.ex02classToClass;

public class FruitBuyer {
	int myMoney = 5000;		// 보유 금액
	int numOfApple = 0;		// 사과 개수
	final int APPLE_PRICE = 1000;// 사과 가격(상수)
	
	public int buyApple(int money) {
	//public void buyApple(FruitSeller seller, int money) {
		int num = money/APPLE_PRICE;
		numOfApple += num;
		myMoney -= money;
		return num;
	}
	public void showBuyResult() {
		System.out.println("***과일 구매자의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);
	}
}



