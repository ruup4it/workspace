package exercise_190314;

import java.util.Scanner;

/*
 * 2. ������ �Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1) while ����
 * 2) for ����
 * 3) do while ����
*/
public class free_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i ++) {
			sum += i * 5;
			//System.out.println(i * 5);
		}
		System.out.println("5�� ����� �� : " + sum);
		scan.close();
	}
}
