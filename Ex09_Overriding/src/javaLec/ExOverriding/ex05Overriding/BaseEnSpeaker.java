package javaLec.ExOverriding.ex05Overriding;

/* 메서드 오버라이딩(Method Overriding)
 * 부모가 이미 구현해 놓은 메서드를 
 * 대신하거나 추가확장하는 것을 일컫는다.
 * 즉, 자식 클래스에 부모메서드와 동일한 메서드를 구현하는 것
 * */
/* Overloading과 Overriding의 차이
 * Overloading(과적합) => 많이 실었다. 
 *       => 매개변수 다른 같은 이름 함수 여러개
 * Overriding => Over + riding(라이딩)
 * */
public class BaseEnSpeaker extends Speaker {
	private int baseRate;
	
	// 부모의 기능에 추가함
	void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스 크기: " + baseRate);
	}
	// 부모기능을 대신한다.
//	void showCurrentState() {
//		System.out.println("베이스 크기: " + baseRate);
//	}
	void setBaseRate(int base) {
		baseRate = base;
	}
}
