/* 1) 2���� int �迭 4�� 5���� 
 * 		1���� 1���� ���� �������� ä�� �־� ��ȯ�ϴ� �ż��� ����
 *  2) 1������ ��ȯ�� �ż��带 �Ű������� �޾Ƽ� ��� ���� ���� ��ȯ�ϴ� �ż��� ����
 *  3) main�Լ������� 1, 2�� �ż��带 ���
 */
public class _12_MethodMakeDTwoArray {
	public static void main(String[] args) {
		int[][] arr  = getDTowArray(5, 6);		
		int sum = getSumDTwoArray(arr); 
		System.out.println("�迭�� ���� "+sum+"�Դϴ�");		
	}
	
	public static int[][] getDTowArray(int row, int col) {
		int[][] arr = new int [row][col]; 
		int cnt=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = cnt++;
		}
		return arr;
	}
	public static int getSumDTwoArray(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				sum += arr[i][j];
		}
		return sum;
	}
}
