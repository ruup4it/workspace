import java.util.Arrays;
import java.util.Scanner;

/* �迭 (Array)
 * �� ¦���� �� : ¦
 * �� ���� �� : ������ �� ���ִ�.
 * ���� ������ �ڷ������� ���ӵǾ� ����ȴ�.
 * ex) �л����� ���� ����
 */

// �л� 5���� ���� ����
public class _1_array {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] korScore = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print(String.format("������ �Է��ϼ��� (%d/5): ", i+1));
			korScore[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(korScore));
		scan.close();
	}
}
