package exercise_190313;

import java.util.Scanner;

/*5. ���� 3���� �Է¹ް� �� 3���� ���� �ﰢ���� ���� �� �ִ����� �Ǻ��ϼ���
�ﰢ���� �����Ϸ��� �� ���� ���� �ٸ� �� ���� ���̺��� �ݵ�� Ŀ�� �մϴ�. (���� �����ڸ� ����ϼ���)*/
public class ex_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max =0;
		int sum = 0;
		System.out.println("������ �Է��ϼ��� ");
		num1 = scan.nextInt();
		System.out.println("������ �Է��ϼ��� ");
		num2 = scan.nextInt();
		System.out.println("������ �Է��ϼ��� ");
		num3 = scan.nextInt();
		sum = num1+num2+num3;
		

		for(int i=0; i<3;i++) {
			if (num1 > max) 
				max =num1;
			else if(num2 >max)
				max=num2;
			else if(num3>max)
				max=num3;
		}
		
		
		String result = max <sum-max ? "�ﰢ�� �½��ϴ�" : "�ﰢ�� �ƴմϴ�";
		
		System.out.println(result);
		scan.close();
	}
}
