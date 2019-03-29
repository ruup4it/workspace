package exercise_190329;

import java.util.Scanner;

//1. 정수 10개를 입력받아 배열에 저장하고, 이 정수중에서 3의 배수만 출력하는 순서도를 그리세요

public class Basic_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("배열에 들어갈 정수 10개를 입력하세요");
		for (int i = 0; i < 10; i++) {
			System.out.print("입력 (" + (i + 1) + "/10): ");
			arr[i] = scan.nextInt();
		}
		for (int item : arr) {
			if (item % 3 == 0) {
				System.out.print(item + " ");
			}
		}
		scan.close();
	}
}
