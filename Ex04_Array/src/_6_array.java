import java.util.Arrays;
import java.util.Scanner;

/* 10���� �л��� ������ �Է� �ް��� �Ѵ�.
 * 10�� �迭�� �����ϰ�
 * 10���� ������ �Է� �ް�
 * 10���� ������ �Ųٷ� ����ϼ���
 * ������ ��յ� ����ϼ���
 * */
public class _6_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(String.format("������ �Է��ϼ���  %02d/10 : ",i+1));
			score[i] = scan.nextInt();
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println(Arrays.toString(score));
		for (int i = score.length-1; i >= 0; i--) {
			System.out.print(String.format("%d, ",score[i]));
		}
		System.out.println();
		System.out.println(String.format("���� : %d \n��� : %.2f", sum, avg));
		scan.close();
	}
}
