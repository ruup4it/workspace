
public class _17_ArrayDTwo {
	public static void main(String[] args) {
		// 1) 2���� �迭: ������ ������ �ٸ���(���� �迭)
//		int[][] arr2 = new int[3][];
//		arr2[0] = new int[2];
//		arr2[1] = new int[13];
//		arr2[2] = new int[24];
		
		// 2) 2���� �迭: �����迭���� ��Ģ���� ������ ��밡��
//		int[][] arr2 = new int[3][];
//		for(int i=0;i<arr2.length;i++)
//			arr2[i] = new int[4];
		
		// 3) 2���� �迭: ���̺� ������ ������ �迭
		int cnt = 0;
		int[][] arr2 = new int[3][4];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++)
				//arr2[i][j] = i*4 + j*1;
				arr2[i][j]  = cnt++;
		}
		
		int result2 = addTwoArr(arr2);
		System.out.println("2���� �迭�� ���� "+result2);
	}
	// 2���� �迭 �ż���
	public static int addTwoArr(int[][] arr) {
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)  
				result += arr[i][j];
		}
		return result;
	}
}
