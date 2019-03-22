package javaLec._class.ex12This;

/* this 는 객체 자신을 가리키는 단어로 
 * self를 의미한다.
 * */

/*  컴파일 시 첫 번째 매개 변수로 this가 추가 됨
 *  이 this는 객체를 구별해주는 역할을 한다.
 *  Number(int num) -> Number(Number this, int num)
 *  void showNum() -> void showNum(Number this)
 *  num1.showNum(); -> showNum(num1);
 *  num2.showNum(); -> showNum(num2);
 * */
class Number {
	private int num;

	// 지역 변수가 필드보다 우선 순위가 높으므로 필드에 저장이 안 됨
//	Number(int num) {
//		num = num;
//	}
	// 지역 변수가 동일한 이름일 경우 this를 붙여야 필드로 인식됨
	Number(int num) {
		this.num = num;
		System.out.println("Constructor :\t" + this);
	}

	// 지역변수가 없으므로 this 생략 가능함
	void showNum() {
		System.out.println(num);
	}
}

public class NumberMain {
	public static void main(String[] args) {
		Number number1 = new Number(3);
		System.out.println("main :\t\t" + number1);
		Number number2 = new Number(1);
		System.out.println("main :\t\t" + number2);
		number1.showNum();
		number2.showNum();
	}

}
