package javaLec.ExGeneric.ex03BoundedGeneric;

// 인터페이스
interface SimpleInterface {
	public void showYourName();
}

// UpperClass
class UpperClass {
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA extends UpperClass{
	public void showYourName() {
		System.out.println("Class AAA");
	}
}

class BBB implements SimpleInterface {
	public void showYourName() {
		System.out.println("Class BBB");
	}
}

class BoundedType {
	// T는 SimpleInterface의 상속을 받아야만 한다.
	// Generic을 제한하는 경우에는 인터페이스도 extends로 사용한다.
	public static <T extends SimpleInterface> void showInstanceAncestor(T param) {
		param.showYourName();
	}

	// T는 UpperClass의 상속을 받아야만 한다.
	public static <T extends UpperClass> void showInstanceName(T param) {
		param.showYourAncestor();
	}
}

public class BoundedTypeParam {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();

		//BoundedType.showInstanceAncestor(aaa);
		BoundedType.showInstanceName(aaa);
		BoundedType.showInstanceAncestor(bbb);
		//BoundedType.showInstanceName(bbb);
	}
}
