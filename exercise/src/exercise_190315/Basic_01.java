package exercise_190315;

import java.util.Scanner;

//1. ���� 10���� �Է¹޾� �迭�� �����ϰ�, �� �����߿��� 3�� ����� ����ϼ���
public class Basic_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ARRLENTH = 10;
		int[] arr = new int[ARRLENTH];
		for (int i = 0; i < ARRLENTH; i++) {
			System.out.print(String.format("���ڸ� �Է��ϼ��� (%d/%d) :", i + 1, ARRLENTH));
			arr[i] = scan.nextInt();
		}
		for (int item : arr) {
			if (item % 3 == 0 && item!=0)
				System.out.print(item + " ");
		}

		scan.close();
	}
}
