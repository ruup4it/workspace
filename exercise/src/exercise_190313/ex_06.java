package exercise_190313;

import java.util.Scanner;

// 6. ���� num�� �Է¹޽��ϴ�
// (num x 4)/8 �� ��Ʈ�̵������ڸ� ����Ͽ� ����ϰ�
// ������� �Ҽ������� ����ϵ��� �ϼ���
public class ex_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int num = scan.nextInt();
		
		num = num << 2; // *4
		num = num >> 3; // *1/8
		
		System.out.println((double)num);
		scan.close();
	}
	
}
