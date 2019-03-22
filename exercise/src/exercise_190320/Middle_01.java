package exercise_190320;

import java.util.Arrays;

/*1. ���� �� ���� static�޼ҵ带 ���� ArrayUtilityŬ������ ������ ����غ�����
static double[] intToDouble(int[] source);	// int�迭�� double�迭�� ��ȯ
static int[] doubleToInt(double[] source);	// double�迭�� int�迭�� ��ȯ
*/

class ArrayUtility{
	// int�迭�� double�迭�� ��ȯ
	static double[] intToDouble(int[] source) {
		double[] changeArr = new double [source.length];
		for(int i = 0; i < source.length; i++) {
			changeArr[i] = (double)source[i];
		}
		return changeArr;
	}
	// double�迭�� int�迭�� ��ȯ
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
