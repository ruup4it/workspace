package exercise_190314;

import java.util.Scanner;

//2. 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�.
//	(50, 50)�� (100, 100)�� �� ������ �̷���� �簢���� �ִٰ� ����.
//	�� �� Ű����κ��� �� ���� �����ϴ� ���� x�� y�� �Է¹ް�
//	��(x, y)�� �� ���簢�� �ȿ� �ִ��� �ۿ� �ִ��� �Ǻ��ϴ� ���α׷���
//	�ۼ��ϼ���
public class ex_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x�� �Է��ϼ���");
		int x = scan.nextInt();
		System.out.println("y�� �Է��ϼ���");
		int y = scan.nextInt();
		
		if((x>50 && x<100) && (y>50 && y<100)) 
			System.out.println("���簢�� ���ο� �ֽ��ϴ�.");
		else
			System.out.println("���簢�� ���ο� �����ϴ�.");
		scan.close();

	}

}
