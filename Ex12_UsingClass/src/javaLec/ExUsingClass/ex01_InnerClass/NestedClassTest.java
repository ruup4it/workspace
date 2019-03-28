package javaLec.ExUsingClass.ex01_InnerClass;

// OuterClass라 일컫는다.
class OuterClassOne {
	OuterClassOne() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
		//NestedClass.simpleMethod();
	}

	// static Inner Class / Nested Class 라 일컫는다.
	static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo {
	OuterClassTwo() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}

	// static Inner Class / Nested Class 라 일컫는다.
	private static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method One");
		}
	}
}

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
//		OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
//		nst2.simpleMethod();
	}
}
