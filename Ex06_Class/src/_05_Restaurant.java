import java.util.Arrays;
import java.util.Random;

/* 식당 클래스 설계
 * 1) 명사형과 동사형을 구분한다.
 * 2) 명사형은 보통 변수가 된다.
 * 3) 동사형은 보통 메서드가 된다.
 * 4) 변수는 함부로 접근하면 문제의 소지가 매우 많음
 *    그래서 일반적으로 외부 접근을 금지시킴(private)
 *    class내에서만 접근 가능
 * 5) 메서드는 일반적으로 외부 호출을 전제로 함
 *    그래서 일반적으로 접근을 허가함(public, default)
 * 6) 클래스의 초기화 작업을 하는 객체 생성시 무조건 호출되는
 *    메서드가 있다. 이 메서드는 클래스의 이름과 동일하다
 *    이미 Java를 만들때부터 정해진 약속
 *    (객체지향 프로그래밍은 이러한 메서드를 갖는다)
 *    이 메서드를 "생성자"라 부른다
 *    만약에 생성자를 만들지 않으면 컴파일러가 컴파일시 자동으로
 *    default생성자를 추가해준다.
 *    Unity로 비유하면 void Start()의 역할과 유사
 * 7) 메서드 중에 내부에서만 사용되는 메서드가 있다.
 * 	  첫째 목적, 사용자가 사용할 필요 없는 메서드는 감추기 위해
 *    둘째 목적, 구현자가 노출시키고 싶지 않은 메서드를 감추기 위해
 * */

class Restaurant2{
	// 필드(변수):명사
		private int money = 100000;
		private String[] foods = {"떡볶이", "순대", "라면", "쫄면"};
		private int sel;		// 필드변수는 자동으로 초기화됨
		
		// 메서드(기능):동사
		Restaurant2(){		// 생성자 (메서드)
			cleaning();
			prepareFoods();
		}
		private void cleaning() {
			System.out.println("식당을 청소한다");
		}
		private void prepareFoods() {
			System.out.println("음식 재료를 손질하다");
		}
		void welcome() {
			System.out.println("어서 오세요");
		}
		void byeBye() {
			System.out.println("안녕히가세요");
		}
		void getMoney(int m) {
			money += m;
			System.out.println(m + "을 음식값으로 받음");
		}
		void calcMoney() {
			System.out.println("오늘 돈은 " + money + "이다");
		}
		void anyFood() {
			System.out.println("어떤 음식 드실래요?");
			System.out.println(Arrays.toString(foods));
			Random rd = new Random();
			sel = rd.nextInt(foods.length);
			System.out.println(foods[sel]+"이요");
		}
		void cookFood() {
			System.out.println(foods[sel]+"을 요리하다");
		}
		void sendFood() {
			System.out.println(foods[sel]+"나왔습니다");
			System.out.println("맛있게 드세요");
		}			
}

public class _05_Restaurant {
	
	public static void main(String[] args) {
		// 설계도         리모컨           실체(객체)
		Restaurant2 rest = new Restaurant2();
//		rest.cleaning();
//		rest.prepareFoods();
		for(int i=0;i<10;i++){
			System.out.println("==================");
			rest.welcome();
//			if(i==5)
//				rest.foods = new String[] {"쥐", "바퀴"};
			rest.anyFood();
			rest.cookFood();
//			rest.money = -999999999;
			rest.sendFood();
			rest.getMoney(1000);
			rest.byeBye();
			
		}
		System.out.println("==================");
		rest.calcMoney();
	}
}







