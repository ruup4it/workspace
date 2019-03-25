package javaLec.ExExtends.ex02Extends;
/*
 * 필드와 메서드 모두 상속된다
 * 상속이라는 문법을 통해 현대의 모든 Framework들이 존재할 수 있었다.
 * Framework를 상속 받음으로써 거의 모든 기능을 제공 받고
 * 일부 기능의 Customizing을 통해 쉽게 프로그래밍이 가능해짐 
 */

public class ExtendsMain {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		Father father = new Father();
		Child child = new Child();

		System.out.println("grandFather");
		grandFather.handsome();

		System.out.println("father");
		father.handsome();
		father.wealth();

		System.out.println("child");
		child.handsome();
		child.wealth();
		child.play();

		System.out.println("잘생김 점수 : " + child.handsomeScore);
		System.out.println("돈 : " + child.money + "$");
		System.out.println("노는 날 : " + child.day + "일");

	}

}
