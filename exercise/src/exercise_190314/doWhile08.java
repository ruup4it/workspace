package exercise_190314;

import java.util.Scanner;

//8. ����ڷκ��� ������ �Է¹޽��ϴ�.
//�Է� ���� ���� ��� ���մϴ�
//����ڰ� 0�� �Է��ϸ� ���� ����մϴ�
//���α׷��� �����մϴ�.
public class doWhile08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			System.out.print("������ �Է��ϼ��� : ");
			num = scan.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println(String.format("�հ� : %d",sum));
		scan.close();
	}

}
