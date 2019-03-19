import java.util.Arrays;
import java.util.Random;

/* 식당 클래스 설계
 * 1) 명사형과 동사형을 구분한다.
 * 2) 명사형은 보통 변수가 된다.
 * 3) 동사형은 보통 메서드가 된다.
 * 4) 변수는 함부로 접근하면 문제의 소지가 매우 많음
 * 	   그래서 일반적으로 접근을 금지시킴(private)
 * 5) 메서드는 일반적으로 외부 호출을 전제로 함
 * 	   그래서 일반적으로 접근을 허가함(public, default)
 * */
class Restaurant {
	// 필드 (변수) : 명사
	private int money = 100000;
	private String[] foods = { "떡볶이", "순대", "라면", "쫄면" };
	private int sel; // 필드 변수는 자동으로 초기화됨 (int형 -> 0)

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

	public int getSel() {
		return sel;
	}

	public void setSel(int sel) {
		this.sel = sel;
	}

	// 메서드 (기능) : 동사
	void cleaning() {
		System.out.println("식당을 청소한다.");
	}

	void prepareFoods() {
		System.out.println("음식 재료를 손질하다");
	}

	void welcome() {
		System.out.println("어서오세요");
	}

	void byebye() {
		System.out.println("안녕히가세요");
	}

	void getmoney(int m) {
		money += m;
		System.out.println(m + "을 음식 값으로 받음");
	}

	void calcmoney() {
		System.out.println("오늘 돈은 " + money + "이다.");
	}

	void anyFood() {
		System.out.println("어떤 음식 드실래요?");
		System.out.println(Arrays.toString(foods));
		Random rd = new Random();
		sel = rd.nextInt(foods.length);
		System.out.println(foods[sel]);
	}

	void cookFood() {
		System.out.println(foods[sel] + "(을/를) 요리하다.");
	}

	void sendFood() {
		System.out.println(foods[sel] + " 나왔습니다.");
	}
}

public class _03_Restaurant {
	public static void main(String[] args) {
		// 설계도 리모콘 실체(객체)
		Restaurant rest = new Restaurant();
		rest.cleaning();
		rest.prepareFoods();
		for (int i = 0; i < 5; i++) {
			System.out.println("==================");
			rest.welcome();
			//if (i == 3)
			//	rest.foods = new String[] { "쥐", "바퀴" };

			rest.anyFood();
			rest.cookFood();
			//rest.money = -999999999;
			rest.sendFood();
			rest.getmoney(5000);
			rest.byebye();
		}
		System.out.println("==================");
		rest.calcmoney();
		rest.cleaning();
	}
}
