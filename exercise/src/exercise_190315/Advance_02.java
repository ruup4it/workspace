package exercise_190315;

import java.util.Arrays;

//2. 선택정렬을 이용해서 배열의 오름차순으로 정렬하는 메서드와
//내림차순으로 정렬하는 메서드를 만들고 사용해보세요
public class Advance_02 {
	public static void main(String[] args) {
		int arr[] = { 6, 7, 5, 2, 0, 1 };
		System.out.println(Arrays.toString(arr));

		// 오름차순
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(String.format("오름차순 결과 : %s",Arrays.toString(arr)));

		// 내림차순
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(String.format("내림차순 결과 : %s",Arrays.toString(arr)));
	}

}
