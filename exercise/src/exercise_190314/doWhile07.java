package exercise_190314;

import java.util.Scanner;

//7. �Է¹��� ������ �������� ����ϼ���
//���� ��� 3�� �Է��ϸ� 
//3 x 1 = 3
//3 x 2 = 6
//...
//3 x 9 = 27
public class doWhile07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("������ �Է��ϼ���");
		num = scan.nextInt();
		do {
			++count;
			System.out.println(num + " * " + count + " = " + num * count);
		} while (count < 9);
		scan.close();
	}
}
