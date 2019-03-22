package exercise_190319;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. 이진 검색을 재귀호출로 작성하세요
public class Advance_01_presentation {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(1001);
		}
		Arrays.sort(arr);
		System.out.println("배열 저장값 참고");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		System.out.println("찾고자 하는 수를 입력하세요");
		int goal;
		goal = sc.nextInt();
		int bottom = 0;
		int top = arr.length - 1;

		if (re_BiSearch(arr, goal, bottom, top) == -1) {
			System.out.println("배열에 없습니다.");
		} else
			System.out.println(re_BiSearch(arr, goal, bottom, top) + 1 + "번째에 있습니다.");
		sc.close();
	}

	public static int re_BiSearch(int[] arr, int goal, int bottom, int top) {
		int mid = (top + bottom) / 2;

		if (bottom > top) {
			return -1;
		} else if (arr[mid] == goal) {
			return mid;
		} else if (arr[mid] > goal) {
			return re_BiSearch(arr, goal, bottom, mid - 1);
		} else {
			return re_BiSearch(arr, goal, mid + 1, top);
		}
	}

}
