import java.util.Arrays;

/* �������� ���������ε�
 * for������ ���� ���� ���̴� ������
 * for(int i=0; i<10; i++)
 * */
public class _9_foreach {

	public static void main(String[] args) {
		int[] scores = {89, 99, 100, 21, 10};
		System.out.println(Arrays.toString(scores));
		
		// for���� �̿��� ����
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		System.out.println();
		
		// foreach�� �̿��� ����
		for(int score : scores) {
			System.out.print(score+" ");
		}
	}

}
