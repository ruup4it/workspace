package javaLec.ExGeneric.ex01OrangeApple;

class AAA {
	public String toString() {
		return "Class AAA";
	}
}

class BBB {
	public String toString() {
		return "Class BBB";
	}
}

class InstanceTypeShower {
	int showCnt = 0;

	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}

	void showPrintCnt() {
		System.out.println("Show count: " + showCnt);
	}
}

public class IntroGenericMethod {
	public static void main(String[] args) {
		InstanceTypeShower its = new InstanceTypeShower();
		its.showPrintCnt();
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		its.<AAA>showInstType(aaa);
		its.showPrintCnt();
		its.<BBB>showInstType(bbb);
		its.showPrintCnt();
	}
}
