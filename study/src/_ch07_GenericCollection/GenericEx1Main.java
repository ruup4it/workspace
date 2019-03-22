package _ch07_GenericCollection;

public class GenericEx1Main {
	public static void main(String[] args) {
		// 자료형을 String으로 대체하여 GenericEx1 객체 생성
		GenericEx1<String> generic = new GenericEx1<String>();
		// String 배열 생성
		String[] stringArr = {"안","녕","하","세","요"};
		// 생성된 String 배열을 인자로 set메서드 호출
		// 멤버변수인 v에 전달된 인자 String배열 대입
		generic.set(stringArr);
		// 출력 메서드 호출
		generic.print();
		
		/*
		 * String 배열이 아닌 다른 객체를 전달하면 오류 발생 
		Integer[] intArr = {1, 2, 3};
		generic.set(intArr);
		*/
		
		
		/* 좋은 방법 아님
		GenericEx1 t1 = new GenericEx1();
		Integer[] intArr = {1, 2, 3};
		t1.set(intArr);
		t1.print();
		 */
	}
}
