package javaLec._class.ex09Access;

// 패키지내에서만 접근 가능 > default
class Adder {
	private int cntAdd;

	Adder() {
		cntAdd = 0;
	}

	int getCntAdd() {
		return cntAdd;
	}

	int addTwoNumber(int num1, int num2) {
		cntAdd++;
		return num1 + num2;
	}
}
