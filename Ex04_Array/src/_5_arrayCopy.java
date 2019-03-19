import java.util.Arrays;
/* �迭 ������ �ٸ� �迭�� �����ϸ�
 * hashCode ���� ����ǹǷ�
 * ���� ���� ������ ����Ű�� �ȴ�.
 *
 * <���� ����>
 * Arrays.copyOf(�迭��, ����)
 * Arrays Ŭ���� �̿�
 * Arrays.copyOf�� ������ ������ ���� ���簡 �Ͼ��
 * ��, �� �޸𸮿� �迭 ������ �Ҵ�ǰ� ���� �����ȴ�.
 * ������ �迭�� ����Ű�� ���������� �ٸ� hashCode�� ������ �ȴ�.
 * */
public class _5_arrayCopy {
	public static void main(String[] args) {
		int[] scores = {100, 88, 95, 65, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		for(int i=0; i<scores2.length;i++) {
			System.out.println(scores2[i]+", ");
		}
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores));
		
		// ���� ������ �� ��Ÿ���� ����
		scores[0] = 30;
		System.out.println(scores1[0]);
		System.out.println(scores2[0]);
		
		// ���� ����?
		int[] scores4 = 
				Arrays.copyOf(scores, scores.length);
		for(int i=0; i<scores4.length;i++) {
			System.out.println(scores2[i]+", ");
		}
		scores4[0] = 70;
		System.out.println(scores);
		System.out.println(scores4);
	}
}
