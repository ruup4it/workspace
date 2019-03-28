package javaLec.ExUsingClass.ex01_InnerClass;
/* 사용법
 * 1) 내부의 특정 영역을 클래스로 논리적으로 묶고 싶을 때
 * 2) 캡슐화가 증가
 * 3) 코드의 가독성이 증가 
 */


// Outer Class라 일컬음
class OuterClass {
	private String myName;
	private int num;

	OuterClass(String name) {
		myName = name;
		num =    0;
	}

	public void whoAreYou() {
		num++;
		System.out.println(myName + " OuterClass " + num);
	}

	// Inner Class라 일컬음
	// Inner Class에서는 Outer Class의 멤버에 직접 접근이 가능하다.
	class InnerClass {
		InnerClass() {
			whoAreYou();
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("First");
		OuterClass out2 = new OuterClass("Second");
		out1.whoAreYou();
		out2.whoAreYou();
		
		OuterClass.InnerClass inn1 = out1.new InnerClass();
		//OuterClass.InnerClass inn8 = new OuterClass("4232").new InnerClass();
		
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
	}
}
