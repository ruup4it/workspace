package exercise_190315;

import java.util.Arrays;

//2. ���������� �̿��ؼ� �迭�� ������������ �����ϴ� �޼����
//������������ �����ϴ� �޼��带 ����� ����غ�����
public class Advance_02 {
	public static void main(String[] args) {
		int arr[] = { 6, 7, 5, 2, 0, 1 };
		System.out.println(Arrays.toString(arr));

		// ��������
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(String.format("�������� ��� : %s",Arrays.toString(arr)));

		// ��������
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(String.format("�������� ��� : %s",Arrays.toString(arr)));
	}

}
