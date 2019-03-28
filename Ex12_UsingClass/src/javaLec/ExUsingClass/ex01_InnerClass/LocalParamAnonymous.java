package javaLec.ExUsingClass.ex01_InnerClass;

interface Readable2 {
	public void read();
}

class OuterClass3 {
	private String myName;

	OuterClass3(String name) {
		myName = name;
	}

	public Readable2 createLocalClassInst(final int instID) {
		return new Readable2() {
			public void read() {
				System.out.println("Outer inst name : " + myName);
				System.out.println("Local inst ID : " + instID);
			}
		};
	}
}

public class LocalParamAnonymous {
	public static void main(String[] args) {
		OuterClass3 out = new OuterClass3("My Outer Class");
		Readable2 localInst1 = out.createLocalClassInst(111);
		localInst1.read();

		Readable2 localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}
}
