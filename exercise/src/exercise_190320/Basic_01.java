package exercise_190320;

/*1. Ŭ���� Add
Ŭ���� Sub
Ŭ���� Mul
Ŭ���� Div�� ���弼��
�̵��� ���� �ʵ�� �޼��带 �����ϴ�
intŸ���� a, b �ʵ� : �����ϰ��� �ϴ� ��
void setValue(int _a, int _b) : ���갪�� ���޹޾� �ʵ忡 ����
int calculate() : �ش� Ŭ������ ������ �´� ������ �����ϰ� ����� �����մϴ�*/

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
