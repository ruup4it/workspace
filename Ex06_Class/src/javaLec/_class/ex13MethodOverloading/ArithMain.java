package javaLec._class.ex13MethodOverloading;
/* 메서드 오버로딩
 * 이름이 같은 메서드가 여러 개 존재하는 것
 * 1) 메서드의 이름이 같아야한다.
 * 2) 매개변수의 타입 또는 갯수가 달라야한다.
 * 
 * */

class CalcAdder {
	static int add(int num1, int num2) {
		System.out.print("int 리턴 : " + num1 + " + " + num2 + " = ");
		return num1 + num2;
	}

	static double add(double num1, double num2) {
		System.out.print("double 리턴 : " + num1 + " + " + num2 + " = ");
		return num1 + num2;
	}

}

class Adder {
	int num1, num2;
	int result;

	Adder() {
		// 필드는 자동으로 0으로 초기화가 되지만
		// 명시적으로 해주는 이유
		// : 사람이 코드를 명시적으로 확인하고 싶어서
		num1 = num2 = result = 0;
	}

	Adder(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void calc() {
		this.result = this.num1 + this.num2;
	}

	void showResult() {
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}

public class ArithMain {
	public static void main(String[] args) {
		Adder adder = new Adder(2, 4);
		adder.calc();
		adder.showResult();

		Adder adder2 = new Adder();
		adder2.calc();
		adder2.showResult();

		System.out.println(CalcAdder.add(10, 20));
		System.out.println(CalcAdder.add(10.5, 20.3));

	}
}
