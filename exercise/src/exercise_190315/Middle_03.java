package exercise_190315;

import java.util.Arrays;

//3. 20개 배열을 선언하세요
//20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//먼저 인덱스의 홀수번째는 앞에서부터 출력하고
//짝수번째는 뒤에서부터 출력하세요
public class Middle_03 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		// int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 == 0)
				System.out.print(" " + arr[i]);
		}
	}

}
