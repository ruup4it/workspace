import java.util.Scanner;

// 3���� ������ �Է� �ް� ���հ� ����� ����ϼ���
// �Ҽ��� 2��° �ڸ����� �ݿø� 
// String.format("%.2f", ���� or ��)
public class _15_sumAVG {
	public static void main(String[] args) {
		double score1 = 0, score2 =0, score3 = 0, sum = 0, avg = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ���.");
		score1 = scan.nextDouble();
		
		System.out.println("�� ��° ������ �Է��ϼ���.");
		score2 = scan.nextDouble();

		System.out.println("�� ��° ������ �Է��ϼ���.");
		score3 = scan.nextDouble();
		
		sum = score1 + score2 + score3;
		avg = sum/3;
		
		System.out.println("������ " + String.format("%.0f", sum) + "�Դϴ�.");
		System.out.println("����� " + String.format("%.2f", avg) + "�Դϴ�.");
		
		scan.close();
	}
}
