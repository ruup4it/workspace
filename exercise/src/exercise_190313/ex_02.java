package exercise_190313;

import java.util.Scanner;

/*
 * 2. �����ڸ� �Է¹޽��ϴ�
�ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �����ؼ� ����ϼ��� 
(���� �����ڸ� ����ϼ���)
(�ƽ�Ű���̺��� �����ϸ� �˴ϴ�)
*/

/*�ҹ��ڿ� �빮���� �ƽ�Ű �ڵ��� ���̰� 32�ΰ��� Ȱ���Ѵ�.
A -> a : 32�� ���Ѵ�.
a -> A : 32�� ����.

���ĺ� �ƽ�Ű �ڵ�� ������ ����. ���ĺ��� �� 26�� ���ڷ� �Ǿ� ����. 
A-65  Z-90  a-97  z-122 */


public class ex_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��ϼ���");
		
		char ch = scan.next().charAt(0);
		
		char result = ch;
		result = ch >= 65 && ch <= 90 ? result += 32
				: ch >= 97 && ch <= 122 ? result -= 32 : 0;
		if (result == 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�" ); 
		}
		System.out.println("�Է��Ͻ� ���� "+ ch + " -> " + result ); 
		scan.close();
	}
}
