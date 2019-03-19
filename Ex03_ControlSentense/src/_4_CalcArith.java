import java.util.Scanner;

/* 2���� ���ڸ� double�� �Է� (nextDouble)
 * ������ (+ - * /) (nextLine)
 * ��� ���
 * */

// nextLine() : ���� ���ڸ� ������ �� ���
// nextDouble() > �����Է� �ް� ���� ���ڵ� ����
/* nextInt(), nextDouble() ���� �޼��带 ����� ���޿�
 * nextLine()�� ����ϸ� ���ۿ� �����ִ� \n ���� �о���̱� ������
 * nextLine()�� �ٷ� �����ع�����.(�Է� ���� ���� �ʰ�)
 * �׷��Ƿ�,
 * nextLine()�� ȣ���ϱ� ���� nextLine()�� �� �� ���ָ� ���ۿ� �ִ� \n�� 
 * �о�����Ƿ� �� ���� ���ڿ��� �� ������.
 * 
 *  C#�� String�� ���� == �� Equals�� �����ϰ� ���빰 �񱳷� ����
 *  Java�� �ݵ�� ����(������ ���ڿ�����)�� ���� ���� equals�� ��߸��Ѵ�.
 *  == : ���� ��ü�� �����ϴ°�
 *  equals : ���빰�� ������ 
 *  
 * 1. nextDouble() ���̿� nextLine �־��ֱ�
 * 2. ������ next()�� �ޱ�
 * 3. string ������ �ް�(nextLine()) ����ȯ Double.parseDouble()���ֱ�
 * */
public class _4_CalcArith {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0;
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���");
		double num1 = Double.parseDouble(scan.nextLine());
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���");
		double num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("�����ڸ� �Է��ϼ���");
		String op = scan.nextLine();
		// String op = scan.next();
		
		/*
		System.out.println("ù ��° ���ڸ� �Է��ϼ���");
		double num1 = scan.nextDouble();
		scan.nextLine(); // \n ���Ÿ� ����
		System.out.println("�� ��° ���ڸ� �Է��ϼ���");
		double num2 = scan.nextDouble();
		scan.nextLine(); // \n ���Ÿ� ����
		System.out.println("�����ڸ� �Է��ϼ���");
		String op = scan.nextLine();
		// String op = scan.next();
		 * */

		/* switch ���
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		*/
		
		if (op.equals("+"))
			result = num1 + num2;
		else if (op.equals("-"))
			result = num1 - num2;
		else if (op.equals("*"))
			result = num1 * num2;
		else if (op.equals("/"))
			result = num1 / num2;
		
		System.out.println(result);
		scan.close();

	}
}
