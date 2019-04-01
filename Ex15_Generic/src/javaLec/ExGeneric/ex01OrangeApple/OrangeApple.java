package javaLec.ExGeneric.ex01OrangeApple;

/* 1. Orange와 Apple은 공통된 필드와 메서드를 가지고 있으므로
 * 부모 클래스인 Fruit 클래스는 만들어서 상속하는 방법
 * 
 * 2. Generic 문법을 이용하면 동일한 내용의 같은 논리 구조를 가진 
 * 클래스를 여러개 정의할 수 있다.
 * 
 * 
 * */
class Fruit {
	int sugarContent;

	Fruit(int sugar) {
		sugarContent = sugar;
	}

	void showSugarContent() {

		System.out.println("당도 : " + sugarContent);
	}
}

class Orange extends Fruit {

	Orange(int sugar) {
		super(sugar);
	}

}

class Apple extends Fruit {

	Apple(int sugar) {
		super(sugar);
	}
}

class FruitBox {
	Fruit fruit;

	FruitBox(Fruit fruit) {
		this.fruit = fruit;
	}

	void setItem(Fruit fruit) {
		this.fruit = fruit;
	}

	Fruit getItem() {
		return this.fruit;
	}
}

class Dog{
	
}
public class OrangeApple {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox(new Orange(10));
		Orange orange = (Orange) fb.getItem();
		orange.showSugarContent();

		FruitBox fb1 = new FruitBox(new Apple(5));
		Apple apple = (Apple) fb1.getItem();
		apple.showSugarContent();
		
		// Dog는 Fruit의 상속을 받지 않았으므로 에러가 발생
//		FruitBox fb2 = new FruitBox(new Dog());
//		Dog grape = (Dog) fb1.getItem();
//		apple.showSugarContent();
		
		

	}

}
