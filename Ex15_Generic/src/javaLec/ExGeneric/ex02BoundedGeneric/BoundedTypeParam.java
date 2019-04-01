package javaLec.ExGeneric.ex02BoundedGeneric;

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

class AAA extends UpperClass implements SimpleInterface {
	public void showYourName() {
		System.out.println("Class AAA");
	}
}

class BBB extends UpperClass implements SimpleInterface {
	public void showYourName() {
		System.out.println("Class BBB");
	}
}
class BoundedType{
	public static <T> void showInstanceAncestor(T param) {
		((SimpleInterface)param).showYourName();
	}
	public static <T> void showInstanceName(T param) {
		((UpperClass)param).showYourAncestor();
	}
}
public class BoundedTypeParam {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		BoundedType.showInstanceAncestor(aaa);
		BoundedType.showInstanceName(aaa);
		BoundedType.showInstanceAncestor(bbb);
		BoundedType.showInstanceName(bbb);
	}
}
