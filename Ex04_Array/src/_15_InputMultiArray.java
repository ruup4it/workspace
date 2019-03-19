import java.util.Scanner;

/* (1���� String�迭)
 * 3�� �л��� �̸��� �Է¹ް� ["�л�1","�л�2","�л�3"]
 * (2���� double�迭)[�л�1][��,��,��][�л�2][��,��,��][�л�3][��,��,��]
 * 3�� �л��� ��, ��, �� ������ �Է� �ް� �迭�� ����
 * */
public class _15_InputMultiArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STNUM = 3;
		final int SUBJECT = 3;
		String[] studentArr = new String[STNUM];
		int[][] scoreArr = new int[STNUM][SUBJECT];
		String[] subjectArr = {"����","����","����"};
		double[] sum = new double [SUBJECT];
		double[] avg = new double [SUBJECT];
		for (int i = 0; i < STNUM; i++) {
			System.out.println("�л� �̸��� �ۼ��ϼ���.");
			studentArr[i] = scan.next();
		}
		for(int i = 0; i<scoreArr.length;i++) {
			for(int j =0;j<scoreArr[i].length;j++) {
				System.out.print(String.format("%s�� %s ���� ������ �ۼ��ϼ��� ", studentArr[i],subjectArr[j]));
				scoreArr[i][j] = scan.nextInt();
				sum[i] += (double)scoreArr[i][j];
 			}
			avg[i] = (double)sum[i]/SUBJECT;
		}
		for(int i = 0; i<scoreArr.length;i++) {
			System.out.println(String.format("=======%s=======",studentArr[i]));
			for(int j =0;j<scoreArr[i].length;j++) {
				System.out.println(String.format("%s ���� ���� : %d",subjectArr[j],scoreArr[i][j]));
				}
				System.out.println(String.format("���� : %.2f, ���: %.2f",sum[i],avg[i]));
		}
		
		for(int i=0;i<SUBJECT;i++) {
			System.out.println("================");
			double sum1 = 0;
			for(int j=0;j<STNUM;j++) {
				sum1 += scoreArr[j][i];
			}
			if(i==0) {
				System.out.println("���� ����: " + sum1);
				System.out.println("���� ���: " + sum1/SUBJECT);
			}else if(i==1) {
				System.out.println("���� ����: " + sum1);
				System.out.println("���� ���: " + sum1/SUBJECT);				
			}else {
				System.out.println("���� ����: " + sum1);
				System.out.println("���� ���: " + sum1/SUBJECT);				
			}
		}
		
		scan.close();
	}
}
