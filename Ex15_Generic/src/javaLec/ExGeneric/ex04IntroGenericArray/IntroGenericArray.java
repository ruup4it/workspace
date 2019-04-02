package javaLec.ExGeneric.ex04IntroGenericArray;

public class IntroGenericArray {
	public static <T> void showArrayData(T[] arr) {
		for(int i = 0; i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
//	public static void showIntArrayData(int[] arr) {
//		for(int i = 0; i<arr.length;i++)
//			System.out.println(arr[i]);
//	}

	public static void main(String[] args) {
		String[] strArr = new String[] {
				"Hi", "I'm so happy", "JavaGeneric"
		};
		showArrayData(strArr);
		//showIntArrayData(strArr);
	}
}
