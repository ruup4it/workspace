package exercise_190320;

/*1. 클래스 Add
클래스 Sub
클래스 Mul
클래스 Div를 만드세요
이들은 다음 필드와 메서드를 가집니다
int타입의 a, b 필드 : 연산하고자 하는 값
void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장
int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다*/

class Add {
	int a;
	int b;

	void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}

	int calculate() {
		System.out.print(String.format("%d + %d = ",a,b));
		return a+b;
	}
}

class Sub {
	int a;
	int b;

	void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;	
	}

	int calculate() {
		System.out.print(String.format("%d - %d = ",a,b));
		return a-b;
	}
}

class Mul {
	int a;
	int b;

	void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}

	int calculate() {
		System.out.print(String.format("%d * %d = ",a,b));
		return a*b;
	}
}

class Div {
	int a;
	int b;

	void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}

	int calculate() {
		System.out.print(String.format("%d / %d = ",a,b));
		return a/b;
	}
}

public class Basic_01 {
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		add.setValue(3,2);
		sub.setValue(3,2);
		mul.setValue(3,2);
		div.setValue(3,2);
		
		System.out.println(add.calculate());
		System.out.println(sub.calculate());
		System.out.println(mul.calculate());
		System.out.println(div.calculate());
	}
	
}
