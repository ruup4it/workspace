package javaLec._class.ex02classToClass;

/* <클래스와 클래스간의 상호관계>
 * 나는 과일장수에게 사과 2개를 구매했다.
 * 1) 명사 : 나, 과일장수, 사과
 * 2) 동사 : 구매했다
 * 3) 나와 과일장수는 Class의 대상
 * 4) 사과는 필드
 * 5) 구매했다는 메서드
 * */

public class FruitSeller {
	int numOfApple = 20;	// 사과 개수
	int myMoney = 0;		// 판매 금액
	

	// 판매하다
	public void saleApple(FruitBuyer buyer, int money) {
	//public int saleApple(int money) {
		numOfApple -= buyer.buyApple(money);
		myMoney += money;
	}
	// 판매결과
	public void showSaleResult() {
		System.out.println("***과일 장수의 현재 상황***");
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
}







