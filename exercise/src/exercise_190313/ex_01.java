package exercise_190313;

import java.util.Scanner;
// 1. �����ڸ� �Է¹޽��ϴ�
// �ҹ������� �빮������ �Ǻ��ϼ��� (���� �����ڸ� ����ϼ���)

/*  �ڹ� Scanner���� char �� �ٷ� �Է� �޴� �� ����
 *	1) char chr = sc.next().charAt(0);
 *	2) char chr = sc.next().trim().charAt(0);
 */

/*"�ƽ�Ű�ڵ�(ASCII)" 
�빮�� A~Z������ �ƽ�Ű�ڵ尪�� 65~90�̴�.
�빮�� A : 65
�빮�� Z : 90

�ҹ��� a~z������ �ƽ�Ű�ڵ尪�� 97~122�̴�.
�ҹ��� a : 97
�ҹ��� z : 122*/

//�빮�� 
//1) 65<= char <=90 
//2) 'A'<= char <='Z' 
//�ҹ���
//1) 97<= char <= 122 
//2) 'a'<=char <'z' 

public class ex_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";

		System.out.println("�����ڸ� �Է��ϼ���");
		char ch = scan.next().charAt(0);

		result = (int) ch >= 65 && (int) ch <= 90 ? "�Է��Ͻ� ������ " + ch + "�� �빮���Դϴ�."
				: (int) ch >= 97 && (int) ch <= 122 ? "�Է��Ͻ� ������ " + ch + "�� �ҹ����Դϴ�." : "�߸� �Է��ϼ̽��ϴ�.";

		System.out.println(result);
		
		scan.close();
	}

}
