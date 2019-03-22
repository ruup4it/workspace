package javaLec._class.ex06Constructor;

/* <클래스와 클래스간의 상호관계>
 * 나는 친구에게 2000원을 주고 연필 1자루는 구매했다.
 * 
 * 1) 명사 : 나, 친구, 연필
 * 2) 동사 : 구매했다
 * 3) 나와 친구는 Class의 대상
 * 4) 연필은 필드
 * 5) 구매했다는 메서드
 * */

public class PencilSeller {
	int numOfPencil; // 연필 개수
	int myMoney; // 판매 금액
	final int PENCIL_PRICE; // 연필 가격(상수)

	PencilSeller() {
		myMoney = 5000; // 보유 금액
		numOfPencil = 2; // 연필 개수
		PENCIL_PRICE = 1000; // 연필 가격(상수)
	}

	PencilSeller(int money, int pencilNum, int price) {
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
