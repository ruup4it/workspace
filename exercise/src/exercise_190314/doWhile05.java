package exercise_190314;

import java.util.Scanner;

//5. ���� ������ �Է¹ް� �� ����ŭ "�����մϴ�"�� ����ϼ���
public class doWhile05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("������ �Է��ϼ���.");
		num = scan.nextInt();
		do {
			++count;
			System.out.println(String.format("�����մϴ�. %d",count));
		} while (count < num);
		scan.close();
	}
}
