package exercise_190313;
import java.util.Scanner;

//7. �Է��� ������ ��ȣ�� �ٲپ� ����ϼ���.
//1) ��ȣ �����ڸ� ����ϼ���
//2) 2�� ���������� ��ȣ�� �ٲټ���
//	 ��ǻ�ʹ� 2�� �������� ����ϸ� ����� ������ ���� �ٲ� �� �ֽ��ϴ�
//	 ������ ��Ʈ�� �����ϰ� + 1�� �ϸ� ���� ��ȣ�� �ٲ�� �˴ϴ�
//	 ��Ʈ���������ڴ� ~ �Դϴ�
//	 ~num�� num�� ��Ʈ�� ������ ���Դϴ�.

public class ex_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = scan.nextInt();
		
//		num = ~num +1;
//		System.out.println(num);
		
		System.out.println(" 1) ��ȣ �����ڸ� ����ϼ��� : " + (-num));
		System.out.println(" 2) 2�� ���������� ��ȣ�� �ٲټ��� : " + (~num+1));

		scan.close();
	}
}
