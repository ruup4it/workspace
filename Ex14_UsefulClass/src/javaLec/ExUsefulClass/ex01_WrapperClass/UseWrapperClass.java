package javaLec.ExUsefulClass.ex01_WrapperClass;

/* Wrapper Class
 * Primitive Type을 클래스로 만든 것
 * Boolean
 * Character
 * Byte
 * Short
 * Integer
 * Long
 * Float
 * Double
 * 
 * Primitive Type을 클래스로 만들게 됨으로써 Object로부터 파생된 
 * 클래스를 지원하는 여러 기능을 사용할 수 있게 된다.
 * 대표적으로, Collection을 들 수 있다.
 * */
public class UseWrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Integer intInst = new Integer(3);
		System.out.println();
		showData(intInst);
		showData(new Integer(7));
	}
}
