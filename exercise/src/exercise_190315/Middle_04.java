package exercise_190315;

import java.util.Scanner;

//4. 3���� ������ �Է¹ް� ū ���� ��ȯ�ϴ� �޼����
//���� ���� ��ȯ�ϴ� �޼��带 �ۼ��ϰ� ����ϼ���
public class Middle_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int[] inputArr= inputNum();  �迭���� ������
		int first = inputNum(scan);  	// �Է� �޴� �޼���
		int second = inputNum(scan);  	// �Է� �޴� �޼���
		calMax(first,second);   		// ū ���� ��ȯ�ϴ� �޼���
		calMin(first,second); 			// ���� ���� ��ȯ�ϴ� �޼���
		scan.close();
	}

	private static int inputNum(Scanner scan) {
		System.out.print("������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		return num;
	}

	private static void calMax(int num1, int num2) {
		int max = 0;
		if(num1 > num2)
			max = num1;
		else
			max = num2;
		System.out.println(String.format("�� �� ū ���� %d�Դϴ�.",max));
	}

	private static void calMin(int num1, int num2) {
		int min = 0;
		if(num1 < num2)
			min = num1;
		else
			min = num2;
		System.out.println(String.format("�� �� ���� ���� %d�Դϴ�.",min));
	}
}
