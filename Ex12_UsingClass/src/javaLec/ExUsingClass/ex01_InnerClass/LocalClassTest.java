package javaLec.ExUsingClass.ex01_InnerClass;

interface Readable1{
	public void read();
}
class OuterClass1{
	private String myName;
	OuterClass1(String name){
		myName = name;
	}
	public Readable1 createLocalClassInst() {
		// Local Class(method내에 존재)
		class LocalClass implements Readable1{
			public void read() {
				System.out.println("Outer inst name : " + myName);
			}
		}
		return new LocalClass();
	}
}

public class LocalClassTest {
	public static void main(String[] args) {
		OuterClass1 out1 = new OuterClass1("First");
		Readable1 localInst1 = out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass1 out2 = new OuterClass1("Second");
		Readable1 localInst2 = out2.createLocalClassInst();
		localInst2.read();
	}
}











