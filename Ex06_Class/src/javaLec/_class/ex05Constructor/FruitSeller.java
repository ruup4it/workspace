package javaLec._class.ex05Constructor;

/* <클래스와 클래스간의 상호관계>
 * 나는 과일장수에게 사과 2개를 구매했다.
 * 1) 명사 : 나, 과일장수, 사과
 * 2) 동사 : 구매했다
 * 3) 나와 과일장수는 Class의 대상
 * 4) 사과는 필드
 * 5) 구매했다는 메서드
 * */

public class FruitSeller {
	int numOfApple; // 사과 개수
	int myMoney; // 판매 금액
	final int APPLE_PRICE;// 사과 가격(상수)
	
	// 생성자에서는 final 상수도 1번 초기화 할 수 있다.
	// 안 만들어주면 컴파일러에 의해 이런 명칭으로 생겨남
	FruitSeller(){
		numOfApple = 20; // 사과 개수
		myMoney = 0; // 판매 금액
		APPLE_PRICE = 1000;// 사과 가격(상수)
		System.out.println("Default 생성자");
	}
	
	FruitSeller(int money, int appleNum, int price){
		numOfApple = appleNum; // 사과 개수
		myMoney = money; // 판매 금액
		APPLE_PRICE = price;// 사과 가격(상수)
		System.out.println("매개변수 있는 생성자");
	}
	
	// 판매하다
	// public int saleApple(FruitBuyer buyer, int money)
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	// 판매결과
	public void showSaleResult() {
		System.out.println("***과일 장수의 현재 상황***");
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
	
	// 가격 확인 메서드
	public int getApplePrice() {
		return APPLE_PRICE;
	}
}
