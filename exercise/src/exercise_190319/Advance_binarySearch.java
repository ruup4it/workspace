package exercise_190319;

import java.util.Arrays;
import java.util.Scanner;

//1. ���� �˻��� ���ȣ��� �ۼ��ϼ���
public class Advance_binarySearch {

	public static void main(String[] args) {
		int target = 0; // ã���� �ϴ� ���� ����� ���� �ʱ�ȭ
		int[] arr = new int[100]; // �迭 �ʱ�ȭ
		int min = 0; // �˻��� ���� �� ���� ���� ��
		int max = arr.length - 1; // �˻��� ���� �� ���� ū ��
		int mid = (min + max) / 2; // �˻��� ���� �� �߰� ��

		Scanner sc = new Scanner(System.in);

		// �迭�� �������� ������ ���� ä���ֱ�
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 1000 + 1);
		}

		// �迭 �������� �����ϱ�
		Arrays.sort(arr);

		// ������ �迭 ������ֱ�
		System.out.println("������ �迭");
		System.out.println(Arrays.toString(arr));
		System.out.println();

		// ã�����ϴ� �� �Է� �ޱ�
		System.out.println("ã���� �ϴ� ���� �Է��ϼ���");
		target = sc.nextInt();

		// ����� ��¹�
		System.out.println(String.format("max %d, mid %d, min %d ", max, mid, min));

		while (true) {
			if (arr[mid] == target || min >= max) // 1. Ÿ���� ã�ų�
				break; // 2. min(���� �� ���� ���� ��)�� max(���� �� ���� ū ��)���� ũ�ų� ���ٸ�
						// break ���ֱ�

			else if (arr[mid] < target) { // 3. �߰� ���� Ÿ�ٺ��� �۴ٸ�
				min = mid + 1; // min�� ���� mid ������ �� ĭ ������ �ٲٰ� (���� mid ���� target�� ��ġ���� ������ üũ�� ���´ϱ�)
				mid = (max + min) / 2; // �߰� �� �ٽ� ���ϱ�
				// ����� ��¹�
				System.out.println(String.format("max %d, mid %d, min %d ", max, mid, min));
			}

			else if (arr[mid] > target) { // 4.�߰� ���� Ÿ�ٺ��� ũ�ٸ�
				max = mid - 1; // max�� ���� mid ������ �� ĭ �ڷ� �ٲٰ� (���� mid ���� target�� ��ġ���� ������ üũ�� ���´ϱ�)
				mid = (max + min) / 2; // �߰� �� �ٽ� ���ϱ�

				// ����� ��¹�
				System.out.println(String.format("max %d, mid %d, min %d ", max, mid, min));
			}
		}

		// ���� �ִ� �� ���� �� üũ�ϱ�
		if (arr[mid] != target) {
			System.out.println("���� �����ϴ�.");
		} else
			System.out.println((mid + 1) + "��° �ֽ��ϴ�.");

		sc.close();
	}

}
