package javaLec._class.ex04Constructor;

/* initMember 메서드로 값을 변경할 수 있어
 * 객체마다 다른 구성이 가능해졌다
 * 그러나, APPLE_PRICE를 상수 -> 변수로 만들어야만하고
 * initMember를 잊지 않고 호출해야만한다.
 * 이럴 때 별도로 초기화 함수를 두지 않고
 * 생성자 함수를 이용하면 편리하다
 * */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller();
		FruitSeller seller2 = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		seller1.initMembers(10000, 20, 1000);
		seller2.initMembers(10000, 15, 1500);
		
		if(seller1.getApplePrice() > seller2.getApplePrice())
			buyer.buyApple(seller2, 1500);
		else
			buyer.buyApple(seller1, 2000);
		
		seller1.showSaleResult();
		buyer.showBuyResult();
	}

}
