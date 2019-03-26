package javaLec.ExOverriding.ex01IsKindOf;

public class Computer {
	String owner;

	Computer(String name) {
		owner = name;
	}

	void calculate() {
		System.out.println("요청 내용을 계산합니다.");
	}
}
