package exercise_190319;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class Basic_02_PearSeller {
	int numOfPear; // 배 개수
	int myMoney; // 판매 금액
	final int PEAR_PRICE; // 배 가격(상수)

	Basic_02_PearSeller() {
		myMoney = 5000; // 보유 금액
		numOfPear = 10; // 배 개수
		PEAR_PRICE = 2500; // 배 가격(상수)
	}

	Basic_02_PearSeller(int money, int pearNum, int price) {
		myMoney = money; // 보유 금액
		numOfPear = pearNum; // 배 개수
		PEAR_PRICE = price; // 배 가격(상수)
	}

	// 판매하다
	public int salePear(int money) {
		int num = money / PEAR_PRICE;
		numOfPear -= num;
		myMoney += money;
		return num;
	}

	// 판매결과
	public void showSaleResult() {
		System.out.println("***마트 현재 상황***");
		System.out.println("남은 배: " + numOfPear + "개");
		System.out.println("판매 수익: " + myMoney + "원");
	}

	// 가격 확인 메서드
	public int getPearPrice() {
		return PEAR_PRICE;
	}
}
