package javaLec.ExUsefulClass.ex01_WrapperClass;

class IntWrapper {
	private int num;

	public IntWrapper(int data) {
		this.num = data;
	}

	public String toString() {
		return "" + num;
	}
}

public class WrappingInteger {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));
	}
}
