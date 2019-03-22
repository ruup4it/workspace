package javaLec._class.ex03classToClass;

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
	int numOfPencil = 2; // 연필 개수
	int myMoney = 0; // 판매 금액

	// 판매하다
	public void salePencil(PencilBuyer buyer, int money) {
		numOfPencil -= buyer.buyPencil(money);
		myMoney += money;
	}

	// 판매결과
	public void showSaleResult() {
		System.out.println("***친구의 현재 상황***");
		System.out.println("남은 연필: 2개 -> " + numOfPencil + "개");
		System.out.println("판매 수익: 0원 -> " + myMoney + "원");
	}
}
