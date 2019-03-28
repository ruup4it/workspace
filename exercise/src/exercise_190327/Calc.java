package exercise_190327;

public abstract class Calc {
	int a;
	int b;
	int result;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();

	public String toString() {
		return "결과는 " + result + "입니다.";
	}
	
}