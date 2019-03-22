package javaLec._class.ex13MethodOverloading;
/* �޼��� �����ε�
 * �̸��� ���� �޼��尡 ���� �� �����ϴ� ��
 * 1) �޼����� �̸��� ���ƾ��Ѵ�.
 * 2) �Ű������� Ÿ�� �Ǵ� ������ �޶���Ѵ�.
 * 
 * */

class CalcAdder {
	static int add(int num1, int num2) {
		System.out.print("int ���� : " + num1 + " + " + num2 + " = ");
		return num1 + num2;
	}

	static double add(double num1, double num2) {
		System.out.print("double ���� : " + num1 + " + " + num2 + " = ");
		return num1 + num2;
	}

}

class Adder {
	int num1, num2;
	int result;

	Adder() {
		// �ʵ�� �ڵ����� 0���� �ʱ�ȭ�� ������
		// ��������� ���ִ� ����
		// : ����� �ڵ带 ��������� Ȯ���ϰ� �;
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
