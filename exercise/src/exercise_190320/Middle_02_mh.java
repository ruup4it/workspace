package exercise_190320;

import java.util.Arrays;

/*2. ���� �� ���� static ���� ArrayUtility2Ŭ������ ������ ����ϼ���

  static int[] concat(int[] s1, int[] s2);	// s1�� s2�� ������ ���ο� �迭 ����

  static int[] remove(int[] s1, int[] s2);	// s1���� s2�迭�� ���ڸ� ��� ������ ���ο� �迭 ����*/

class ArrayUtility2_mh {

	static int[] concat(int[] s1, int[] s2) {

		int tmp = s1.length + s2.length;

		int[] tArr = new int[tmp];

		for (int i = 0; i < s1.length; i++) {

			tArr[i] = s1[i];

		}

		for (int i = 0; i < s2.length; i++) {

			tArr[s1.length + i] = s2[i];

		}

		return tArr;

	}

	static int[] remove(int[] s1, int[] s2) {
		int cnt = 0;
		int arrCnt = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					s1[i] = 0;
					cnt++;
				}
			}
		}
		int[] arr = new int[s1.length - cnt];
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != 0) {
				arr[arrCnt] = s1[i];
				arrCnt++;
			}
		}
		return arr;
	}
}

public class Middle_02_mh {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };

		int[] arr2 = { 1, 3, 5, 7, 8, 9 };

		System.out.println(Arrays.toString(ArrayUtility2_mh.concat(arr1, arr2)));

		System.out.println(Arrays.toString(ArrayUtility2_mh.remove(arr1, arr2)));

	}

}