package javaLec._class.ex11Static;
/*
 * */
/* static 메서드를 만들면 객체를 만들지 않아도 처음부터
 * 메모리에 메서드가 로딩되기 때문에 값을 유지할 필요 없을 경우는 매우 편리하다.
 * 하지만 프로그램 종료시까지 계속 메모리에 존재하게 된다.
 * */

class Arith {
	static double add(double num1, double num2) {
		return num1 + num2;
	}

	static double sub(double num1, double num2) {
		return num1 - num2;
	}

	static double mul(double num1, double num2) {
		return num1 * num2;
	}

	static double div(double num1, double num2) {
		return num1 / num2;
	}
}

/* 객체 별로 데이터를 다르게 유지하고 싶을 때는 인스턴스 멤버로 만든다.
 * 인스턴스 메서드는 최초의 객체가 만들어 질 때 method메모리 영역에 
 * 올라가고 이후의 객체들을 재사용하게 된다.
 * 즉, 인스턴스 변수는 객체별로 따로 생성이되지만
 * 인스턴스 메서드는 1개만 만들어진다
 * 나중에 객체가 모두 소멸되면 메서드도 소멸된다.
 *  * */

class Calc_Arith {
	double result = 0;
	void showResult() {
		System.out.println("결과는 " + result);
	}
	void add(double num1, double num2) {
		result = num1 + num2;
	}

	void sub(double num1, double num2) {
		result = num1 - num2;
	}

	void mul(double num1, double num2) {
		result = num1 * num2;
	}

	void div(double num1, double num2) {
		result = num1 / num2;
	}
}

public class CalcArith {
	public static void main(String[] args) {
		System.out.println(Arith.add(3.5, 2.4));
		System.out.println(Arith.sub(3.5, 2.4));
		System.out.println(Arith.mul(3.5, 2.4));
		System.out.println(Arith.div(3.5, 2.4));
		
		Calc_Arith ca1 = new Calc_Arith();
		ca1.add(1.1, 2.2);
		ca1.showResult();
		
		Calc_Arith ca2 = new Calc_Arith();
		ca2.add(2.3, 3.5);
		ca1.showResult();
		
		
	
	}

}
