package javaLec.ExOverriding.ex01IsKindOf;

public class NotebookComp extends Computer {
	int battery;

	NotebookComp(String name, int initChag) {
		super(name);
		battery = initChag;
	}

	void charging() {
		battery += 5;
	}

	void movingCal() {
		if (battery < 1) {
			System.out.println("충전이 필요합니다.");
			return;
		}
		System.out.println("이동하면서 ");
		calculate();
		battery -= 1;
	}

}
