package exercise_190320;

import java.util.Arrays;


/*2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
*/
class ArrayUtility2 {
	// s1과 s2를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		int[] concatArr = new int[s1.length + s2.length];

		for (int i = 0; i < s1.length; i++) {
			concatArr[i] = s1[i];
		}
		for (int i = 0; i < s2.length; i++) {
			concatArr[s1.length + i] = s2[i];
		}
		return concatArr;
	};

	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	static int[] remove(int[] s1, int[] s2) {
		int[] removeArr;
		int count = 0;
		int arrCount = 0;

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					s1[i] = 0;
					count++;
				} else if (s1[i] < s2[j]) {
					continue;
				}
			}
		}

		removeArr = new int[s1.length - count];

		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != 0) {
				removeArr[arrCount] = s1[i];
				arrCount++;
			}
		}

		return removeArr;
	};

}

public class Middle_02 {
	public static void main(String[] args) {
		int[] arr1 = { 7, 8, 4, 5, 9, 10 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(ArrayUtility2.concat(arr1, arr2)));
		System.out.println(Arrays.toString(ArrayUtility2.remove(arr1, arr2)));
		
		int[] s1 = { 1, 2, 3, 4, 5 };
		int[] s2 = { 6, 7, 8, 9, 10, 11, 12 };
		int[] s3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] s4 = { 2, 4, 6 };
		
		System.out.println(Arrays.toString(ArrayUtility2.concat(s1, s2)));
		System.out.println(Arrays.toString(ArrayUtility2.remove(s1, s2)));
		System.out.println(Arrays.toString(ArrayUtility2.concat(s3, s4)));
		System.out.println(Arrays.toString(ArrayUtility2.remove(s3, s4)));
		
		
	}
}
