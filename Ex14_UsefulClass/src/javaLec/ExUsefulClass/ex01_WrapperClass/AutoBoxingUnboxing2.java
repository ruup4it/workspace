package javaLec.ExUsefulClass.ex01_WrapperClass;

public class AutoBoxingUnboxing2 {
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 20;

		// auto-unboxing > auto-boxing
		num1++; // num1 = new Integer(num1.intValue()+1);
		System.out.println(num1);

		num2 += 3; // num2 = new Integer(num1.intValue()+3);
		System.out.println(num2);

		int addResult = num1 + num2;		// addResult = num1.intValue() + num2.intValue();
		System.out.println(addResult);		

		int minResult = num1 - num2;		// minResult = num1.intValue() - num2.intValue();
		System.out.println(minResult);
	}
}
