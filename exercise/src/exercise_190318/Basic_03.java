package exercise_190318;

import java.util.Scanner;

/* 3.�ΰ��� �Ǽ�(double)�� �Է¹޾�
 * ���� +, -, *, / �� �Ͽ� ��ȯ�ϴ�
 * �޼��带 4�� �����ϰ� ����غ�����
 * */
public class Basic_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num4 = inputNum(scan); // �Ǽ��� �Է¹޴� �޼��� ȣ��
		double num5 = inputNum(scan); // �Ǽ��� �Է¹޴� �޼��� ȣ��
		printPlus(num4, num5);// �Է¹��� �Ǽ��� �����ϴ� �޼��� ȣ��

		double result = printMinus(num4, num5);
		// System.out.println("���� ������� "+result+"�Դϴ�.");
		printResult(result);

		System.out.println("���ϱ� ������� " + printMultiple(num4, num5) + "�Դϴ�.");

		printResult(printDivision(num4, num5));
		scan.close();
	}

	public static double printDivision(double num1, double num2) {
		return num1 / num2;
	}

	// �Է¹��� �Ǽ��� �����ϴ� �޼��� ���� +
	public static void printPlus(double num1, double num2) {
		// int result = 0;
		// result = num1+num2;
		//System.out.println("���ϱ� : ������� " + result + "�Դϴ�.");
		System.out.println("���ϱ� : ������� " + (num1 + num2) + "�Դϴ�.");
	}

	// �Է¹��� �Ǽ��� �����ϴ� �޼��� ���� -
	public static double printMinus(double num1, double num2) {
		double result = 0;
		result = num1 - num2;
		return result;
	}

	// �Է¹��� �Ǽ��� �����ϴ� �޼��� ���� *
	public static double printMultiple(double num1, double num2) {
		return num1 * num2;
	}

	// �Ǽ��� �Է¹޴� �޼��� ����
	public static double inputNum(Scanner scan) {
		System.out.println("�Ǽ��� �Է��ϼ���");
		double num = scan.nextDouble();
		return num;
	}

	// ����ϴ� �޼���
	public static void printResult(double result) {
		System.out.println("�������" + result + "�Դϴ�.");
	}

}
