package javaLec.ExExtends.ex01Extends;
/*
 * 상속은 클래스의 필드/기능(메서드)을 잘 설계해서
 * 물려주면 extends 부모클래스 문법만으로도 
 * 자식 클래스는 바로 부모의 모든 기능을 사용할 수 있다. 
 * */

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

	}

}
