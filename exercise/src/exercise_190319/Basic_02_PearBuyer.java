package exercise_190319;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class Basic_02_PearBuyer {
	int myMoney = 10000; // 보유 금액
	int numOfPear = 0; // 배 개수

	public void buyPear(Basic_02_PearSeller seller, int money) {
		numOfPear += seller.salePear(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***나의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney + "원");
		System.out.println("배 개수: " + numOfPear + "개");
	}

}
