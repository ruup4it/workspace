package javaLec.ExOverriding.ex05Overriding;

/* 부모의 참조 변수에 자식 객체를 담을 수 있다.
 * 부모는 자식을 포용한다
 * 부모(Generalization) 자식(Realization)
 * Lion is kind of Mammal
 * */
/* 담을 수는 있지만 부모에 구현된 것만 호출할 수 있다
 * */
public class OverridingMain {
	public static void main(String[] args) {
		Speaker base = new BaseEnSpeaker();
		base.setVolume(10);
		// 부모 참조 변수에서는 자식 객체의 메서드 호출 불가
		//base.setBaseRate(20);
		
		// C++에서는 부모참조변수를 따라 부모 객체 메서드가 호출된다.
		// 하지만 Java에서는 편의성을 따라갔다.
		// 하지만 메서드Overriding의 경우는 실제 객체의 메서드를 호출
		base.showCurrentState();
	}
}




