package exercise_190315;

import java.util.Scanner;

//1. 정수 10개를 입력받아 배열에 저장하고, 이 정수중에서 3의 배수만 출력하세요
public class Basic_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ARRLENTH = 10;
		int[] arr = new int[ARRLENTH];
		for (int i = 0; i < ARRLENTH; i++) {
			System.out.print(String.format("숫자를 입력하세요 (%d/%d) :", i + 1, ARRLENTH));
			arr[i] = scan.nextInt();
		}
		for (int item : arr) {
			if (item % 3 == 0 && item!=0)
				System.out.print(item + " ");
		}

		scan.close();
	}
}
