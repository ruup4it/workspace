package javaLec._class.ex11Static;
/*
 * */
/* static �޼��带 ����� ��ü�� ������ �ʾƵ� ó������
 * �޸𸮿� �޼��尡 �ε��Ǳ� ������ ���� ������ �ʿ� ���� ���� �ſ� ���ϴ�.
 * ������ ���α׷� ����ñ��� ��� �޸𸮿� �����ϰ� �ȴ�.
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

/* ��ü ���� �����͸� �ٸ��� �����ϰ� ���� ���� �ν��Ͻ� ����� �����.
 * �ν��Ͻ� �޼���� ������ ��ü�� ����� �� �� method�޸� ������ 
 * �ö󰡰� ������ ��ü���� �����ϰ� �ȴ�.
 * ��, �ν��Ͻ� ������ ��ü���� ���� �����̵�����
 * �ν��Ͻ� �޼���� 1���� ���������
 * ���߿� ��ü�� ��� �Ҹ�Ǹ� �޼��嵵 �Ҹ�ȴ�.
 *  * */

class Calc_Arith {
	double result = 0;
	void showResult() {
		System.out.println("����� " + result);
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
