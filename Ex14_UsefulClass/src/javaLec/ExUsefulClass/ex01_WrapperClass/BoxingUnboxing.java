package javaLec.ExUsefulClass.ex01_WrapperClass;
/*
 * Wrapper 클래스는 String과 마찬가지로 값의 변경이 불가능하다.
 */
public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue = new Integer(10);
		Double dValue = new Double(3.14);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		iValue = new Integer(iValue.intValue()+10);
		dValue = new Double(dValue.doubleValue()+1.2);
		System.out.println(iValue);
		System.out.println(dValue);
	}
}
