package exercise_190314;

import java.util.Scanner;

//3. 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�. (50, 50)�� (100, 100)��
//	�� ������ �̷���� ���簢���� �ִٰ� ����. 
//	�̶� Ű����κ��� �ٸ� ���簢���� �����ϴ� �� ��(x1, y1), (x2, y2)�� �Է¹޾�
//	�� ���� ���簢���� ���� �浹�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���

public class ex_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(String.format("x1�� �Է��ϼ���"));
		int x1 = scan.nextInt();
		System.out.println(String.format("y1�� �Է��ϼ���"));
		int y1 = scan.nextInt();
		System.out.println(String.format("x2�� �Է��ϼ���"));
		int x2 = scan.nextInt();
		System.out.println(String.format("y2�� �Է��ϼ���"));
		int y2 = scan.nextInt();

		if (((x1 >= 50 && x1 <= 100) || (x2 >= 50 && x2 <= 100))
				&& ((y1 >= 50 && y1 <= 100) || (y2 >= 50 && y2 <= 100)))
			System.out.println("�浹�մϴ�.");
		else
			System.out.println("�浹���� �ʽ��ϴ�.");
		scan.close();
	}
}
