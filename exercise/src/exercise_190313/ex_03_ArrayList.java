package exercise_190313;

import java.util.Scanner;

//3. ���� �׼��� �Ա��ϼ���
// �Ա��� ���� ��������, ������, ��õ����, õ����, 500������, 100������, 50������, 10������, 1������ �� ��� ��ȯ�Ǵ��� ����ϼ���
// ��� ������ ������ ū �� ������ ����մϴ�
// ���� ��� 78670���̸� 
// <������ 1��, ���� 2��, ��õ�� 1��, õ�� 3��, 500�� 1��, 100�� 1��, 50�� 1��, 10�� 2��> �Դϴ�.
public class ex_03_ArrayList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int price = scan.nextInt();
		
		int [] money = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int [] priceResult = new int [9];
		
		for(int i=0; i<money.length; i++) {
			priceResult[i] = price/money[i];
			price = price%money[i];
			System.out.println(money[i] + " : " + priceResult[i]);
		}
		
		scan.close();
	}
}
