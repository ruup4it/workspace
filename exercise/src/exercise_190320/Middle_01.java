package exercise_190320;

import java.util.Arrays;

/*1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
*/

class ArrayUtility{
	// int배열을 double배열로 변환
	static double[] intToDouble(int[] source) {
		double[] changeArr = new double [source.length];
		for(int i = 0; i < source.length; i++) {
			changeArr[i] = (double)source[i];
		}
		return changeArr;
	}
	// double배열을 int배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] changeArr = new int [source.length];
		for(int i = 0; i < source.length; i++) {
			changeArr[i] = (int)source[i];
		}
		return changeArr;
	}
}

public class Middle_01 {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5};
		
		System.out.print("int" + Arrays.toString(intArr));
		System.out.println(" -> double" + Arrays.toString(ArrayUtility.intToDouble(intArr)));
		
		System.out.print("double" + Arrays.toString(doubleArr));
		System.out.println(" -> int" +Arrays.toString(ArrayUtility.doubleToInt(doubleArr)));
	}
	
	
}
