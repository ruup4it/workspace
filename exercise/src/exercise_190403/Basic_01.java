package exercise_190403;
//1. 다음은 String만 다루는 MyClass 코드이다. MyClass를 제네릭 클래스 MyClass<E>로 

//일반화하고, 이를 이용하는 main() 메서드를 만들어 프로그램을 완성하라.
//

class MyClass<E> {
	private E s;

	MyClass(E s) {
		this.s = s;
	}

	void setS(E s) {
		this.s = s;
	}

	E getS() {
		return s;
	}
}

public class Basic_01 {
	public static void main(String[] args) {
		System.out.println("======String======");
		MyClass<String> stringClass = new MyClass<String>("안녕");
		System.out.println(stringClass.getS());
		stringClass.setS("Hi");
		System.out.println(stringClass.getS());
		
		System.out.println("======Integer======");
		MyClass<Integer> integerClass = new MyClass<Integer>(2);
		System.out.println(integerClass.getS());
		integerClass.setS(8);
		System.out.println(integerClass.getS());
		
		System.out.println("======Boolean======");
		MyClass<Boolean> booleanClass = new MyClass<Boolean>(true);
		System.out.println(booleanClass.getS());
		booleanClass.setS(false);
		System.out.println(booleanClass.getS());
		
		System.out.println("======MyClass======");
		MyClass<MyClass> myClass = new MyClass<MyClass>(stringClass);
		System.out.println(myClass.getS());
		myClass.setS(integerClass);
		System.out.println(myClass.getS());
	}
}
