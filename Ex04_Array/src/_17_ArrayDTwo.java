
public class _17_ArrayDTwo {
	public static void main(String[] args) {
		// 1) 2차원 배열: 각행의 갯수가 다를때(가변 배열)
//		int[][] arr2 = new int[3][];
//		arr2[0] = new int[2];
//		arr2[1] = new int[13];
//		arr2[2] = new int[24];
		
		// 2) 2차원 배열: 가변배열에서 규칙성이 있을때 사용가능
//		int[][] arr2 = new int[3][];
//		for(int i=0;i<arr2.length;i++)
//			arr2[i] = new int[4];
		
		// 3) 2차원 배열: 테이블 형태의 동일한 배열
		int cnt = 0;
		int[][] arr2 = new int[3][4];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++)
				//arr2[i][j] = i*4 + j*1;
				arr2[i][j]  = cnt++;
		}
		
		int result2 = addTwoArr(arr2);
		System.out.println("2차원 배열의 합은 "+result2);
	}
	// 2차원 배열 매서드
	public static int addTwoArr(int[][] arr) {
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)  
				result += arr[i][j];
		}
		return result;
	}
}
