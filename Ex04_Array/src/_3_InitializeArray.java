import java.util.Arrays;

public class _3_InitializeArray {

	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ
		// �̷��� ��ٰ� �ؼ� ���ÿ� �ö󰡴� ���� �ƴϴ�.
		// int[] korScore = new int[5]�� ���� 
		// ���� �ö󰣴�
		// ��, ���� �迭�� �ʱ�ȭ���� �־�δ� ��찡 
		// ���� ������ �̷� ������ ����� ���̴�.
		int[] korScore = {99, 88, 90, 39, 86};
		System.out.println(Arrays.toString(korScore));
		for(int i=0;i<korScore.length;i++) {
			System.out.println(String.format("%d",korScore[i]));
		}
	}
}
