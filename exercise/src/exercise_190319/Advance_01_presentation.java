package exercise_190319;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. ���� �˻��� ���ȣ��� �ۼ��ϼ���
public class Advance_01_presentation {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(1001);
		}
		Arrays.sort(arr);
		System.out.println("�迭 ���尪 ����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		System.out.println("ã���� �ϴ� ���� �Է��ϼ���");
		int goal;
		goal = sc.nextInt();
		int bottom = 0;
		int top = arr.length - 1;

		if (re_BiSearch(arr, goal, bottom, top) == -1) {
			System.out.println("�迭�� �����ϴ�.");
		} else
			System.out.println(re_BiSearch(arr, goal, bottom, top) + 1 + "��°�� �ֽ��ϴ�.");
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
