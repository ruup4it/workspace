import java.util.Arrays;

/* ������ �迭 (2���� �̻� �迭)
 * ������ 90% �̻� 1���� �迭�� ����.
 * int[][] arr = new int [����� 1���� �迭�� ��][�� 1���� �迭�� ����]
 * */
public class _10_MultiArray {
	public static void main(String[] args) {
		// �ڷ��� int[] / ���� scores
		// int[] scores = {10, 20};
		
		// �ڷ��� int[][] / ���� arr
		int[][] arr = new int[5][];
		System.out.println(arr);
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[2] = new int[3];
		arr[3] = new int[3];
		arr[4] = new int[3];
		System.out.println(Arrays.toString(arr));
		
	}
}
