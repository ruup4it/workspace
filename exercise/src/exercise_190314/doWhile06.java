package exercise_190314;

import java.util.Scanner;

//6. ���� ���� �Է¹ް� �� ����ŭ 3�� ��� ����ϼ���
//���� ��� 5�� �Է¹����� 3 6 9 12 15�� ����ϸ� �˴ϴ�
public class doWhile06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("������ �Է��ϼ���.");
		num = scan.nextInt();
		do {
			++count;
			System.out.print(count*3 + " ");
		} while (count < num);
		scan.close();
	}
}
