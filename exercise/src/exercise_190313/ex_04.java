package exercise_190313;

import java.util.Scanner;

//4. 369������ �ۼ��մϴ�.
//1~99������ ������ �Է¹ް�
//3,6,9�� �ϳ��� ������ "�ڼ�¦"�� ����ϰ�
//2���� ������ "�ڼ�¦¦"�� ����ϼ���
//���� ��� 13�� "�ڼ�¦"
//36�� ���� "�ڼ�¦¦"�� ����ϸ� �˴ϴ�.
public class ex_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0; 
		System.out.println("1~99������ ������ �Է��ϼ���");
		int inputNum = scan.nextInt();
		int num10 = inputNum / 10 ;
		int num1 = inputNum % 10;
		
		if((num10!=0)&&(num10 % 3 == 0))
			count ++;
		if(num1!=0 && num1 % 3 == 0)
			count ++;
		
//		if((num10!=0)&&(num10 % 3 == 0))
//			count ++;
//		if(num1 % 3 == 0)
//			count ++;
		
		switch(count)
		{
			case 1:
				System.out.println("�ڼ�¦");
				break;
			case 2:
				System.out.println("�ڼ�¦¦");
				break;
			default :
				System.out.println("3,6,9 ���� �����ϴ�.");
		}
		scan.close();
	}
}
