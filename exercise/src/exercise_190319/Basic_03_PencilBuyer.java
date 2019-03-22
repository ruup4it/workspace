package exercise_190319;

//3. PencilSeller에 생성자를 추가하고 사용해보세요
//(수업시간 마지막 문제)
public class Basic_03_PencilBuyer {

	int myMoney = 5000; // 보유 금액
	int numOfPencil = 0; // 연필 개수

	public void buyPencil(Basic_03_PencilSeller seller, int money) {
		numOfPencil += seller.salePencil(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("***나의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney + "원");
		System.out.println("연필 개수: " + numOfPencil + "개");
	}

}
