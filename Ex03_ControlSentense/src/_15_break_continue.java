/* �������� ����ϼ���
 * �� �������� 2~9 ���� ���� ���ڰ� 1 ~ 5���� ����ϼ���
 * ���� ��� 3x1=3 ... 3x5=15 �ؼ� 5������ ����ϸ� �˴ϴ�.
 * 1) break�� ����ؼ� �ذ��ϼ���
 * 2) continue�� ����ؼ� �ذ��ϼ���
 * */
public class _15_break_continue {
	public static void main(String[] args) {
		System.out.println("continue ���");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j>5) 
					continue;
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}

		System.out.println("break ���");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j > 5)
					break;
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
