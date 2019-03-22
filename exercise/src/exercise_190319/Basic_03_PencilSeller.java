package exercise_190319;
//3. PencilSeller에 생성자를 추가하고 사용해보세요
//(수업시간 마지막 문제)
public class Basic_03_PencilSeller {
	int numOfPencil; // 연필 개수
	int myMoney; // 판매 금액
	final int PENCIL_PRICE; // 연필 가격(상수)

	Basic_03_PencilSeller() {
		myMoney = 5000; // 보유 금액
		numOfPencil = 2; // 연필 개수
		PENCIL_PRICE = 1000; // 연필 가격(상수)
	}

	Basic_03_PencilSeller(int money, int pencilNum, int price) {
		myMoney = money; // 보유 금액
		numOfPencil = pencilNum; // 연필 개수
		PENCIL_PRICE = price; // 연필 가격(상수)
	}

	// 판매하다
	public int salePencil(int money) {
		int num = money / PENCIL_PRICE;
		numOfPencil -= num;
		myMoney += money;
		return num;
	}

	// 판매결과
	public void showSaleResult() {
		System.out.println("***친구의 현재 상황***");
		System.out.println("남은 연필: " + numOfPencil + "개");
		System.out.println("판매 수익: " + myMoney + "원");
	}

	// 가격 확인 메서드
	public int getPencilPrice() {
		return PENCIL_PRICE;
	}

}
