package exercise_190315;

import java.util.Scanner;

//2. 0���� ū ������ �Է¹ް� �������� 16������ ����ϼ���
public class Middle_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0���� ū ������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		if (num < 0)
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		else {
			System.out.println(num + "�� 2���� �� : " + Integer.toBinaryString(num));
			System.out.println(num + "�� 16���� �� : " + Integer.toHexString(num));
		}
		scan.close();
	}
}
