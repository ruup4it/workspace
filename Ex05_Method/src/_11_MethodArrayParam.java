
public class _11_MethodArrayParam {
	public static void main(String[] args) {
		// ���� ����
		int[] arr = {10, 20, 30, 40};
		int[][] arr2 = {
				{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
		};
		// �ż��� ����
		int result = addOneArr(arr);
		int result2 = addTwoArr(arr2);
		// ���
		System.out.println("1���� �迭�� ���� "+result);
		System.out.println("2���� �迭�� ���� "+result2);
	}
	// 1���� �迭 �ż���
	public static int addOneArr(int[] arr) { // �迭�� ���� ���� �ƴ� �ؽ��ڵ� �� ������ ����
		int result = 0;
		for(int i=0;i<arr.length;i++)
			result += arr[i];
		return result;
	}
	/* arr�� 2���� �迭 ��ü�� ����Ű�� reference
	 * arr[i]�� 1���� 1���� �迭�� ����Ű�� reference
	 * arr[i][j] int 1�� ����
	 */
	// 2���� �迭 �ż���
	public static int addTwoArr(int[][] arr) {
		int result = 0;
		for(int i=0;i<arr.length;i++) {		//arr.length = 3
			for(int j=0;j<arr[i].length;j++)  //arr.length = 4
				result += arr[i][j];
		}
		return result;
	}
}
