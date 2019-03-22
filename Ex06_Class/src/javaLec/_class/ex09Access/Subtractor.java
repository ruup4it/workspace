package javaLec._class.ex09Access;

//패키지내에서만 접근 가능 > default
class Subtractor {
	private int cntSub;

	Subtractor() {
		cntSub = 0;
	}

	int getCntSub() {
		return cntSub;
	}

	int subTwoNumber(int num1, int num2) {
		cntSub++;
		return num1 - num2;
	}
}
