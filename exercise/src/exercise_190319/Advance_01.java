package exercise_190319;

import java.util.Arrays;
import java.util.Scanner;

//1. ���� �˻��� ���ȣ��� �ۼ��ϼ���
public class Advance_01 {
	public static int binarySearch(int target, int min, int max, int[] arr) {
		int mid = (max + min) / 2; 							// �߰� �� ���ϱ�

		if (arr[mid] == target) 							// 1. �߰� ���� Ÿ�ٰ� ��ġ �Ѵٸ�
			return mid; 									// 	    �߰� �� ��ȯ

		else if (min >= max) 								// 2. min(���� �� ���� ���� ��)�� max(���� �� ���� ū ��)���� ũ�ų� ���ٸ�
			return -1; 										// 	  -1 ��ȯ�ϱ�

		else if (arr[mid] < target)							// 3. �߰� ���� Ÿ�ٺ��� �۴ٸ�
			return binarySearch(target, mid + 1, max, arr); // 	  min�� ���� mid ������ �� ĭ ������ �ٲٰ� ���ȣ��
															//    (���� mid ���� target�� ��ġ���� ������ üũ�� ���´ϱ�)

		else 												// 4. �߰� ���� Ÿ�ٺ��� ũ�ٸ�
			return binarySearch(target, min, max - 1, arr); //    max�� ���� mid ������ �� ĭ �ڷ� �ٲٰ� ��� ȣ�� 
															//    (���� mid ���� target�� ��ġ���� ������ üũ�� ���´ϱ�)
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				// �Է��� �ޱ����� Scanner ��ü ����
		int target = 0; 									// ã���� �ϴ� ���� ����� ���� �ʱ�ȭ
		int[] arr = new int[100]; 							// �迭 �ʱ�ȭ
		int min = 0; 										// �˻��� ���� �� ���� ���� �� �ʱ�ȭ 
		int max = arr.length - 1; 							// �˻��� ���� �� ���� ū �� �ʱ�ȭ
		int result = 0;										// ã�Ҵ� �� �ƴ� �� ��� �� �ʱ�ȭ
		
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

		// ���� �˻��� ����Լ� ȣ���� ��� �� ���
		result = binarySearch(target, min, max, arr);

		// ���� �ִ� �� ���� �� üũ�ϱ�
		if (result == -1) {
			System.out.println("���� �����ϴ�.");
		} else
			System.out.println((result + 1) + "��° �ֽ��ϴ�.");

		sc.close();
	}

}
