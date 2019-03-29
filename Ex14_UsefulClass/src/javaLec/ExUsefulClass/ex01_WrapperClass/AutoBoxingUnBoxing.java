package javaLec.ExUsefulClass.ex01_WrapperClass;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		Integer iValue = 10; 		// auto boxing
		Double dValue = 3.14; 		// auto boxing
		System.out.println(iValue + ", " + dValue);
		
		iValue = iValue + 10;
		dValue = dValue * 2;
		System.out.println(iValue + ", " + dValue);

		int num1 = iValue; 			// auto unboxing, iValue.intValue()
		double num2 = dValue;		// auto unboxing, dValue.doubleValue()
		System.out.println(num1);
		System.out.println(num2);
	}
}
