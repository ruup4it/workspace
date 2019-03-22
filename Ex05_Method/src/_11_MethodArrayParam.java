
public class _11_MethodArrayParam {
	public static void main(String[] args) {
		// 변수 영역
		int[] arr = {10, 20, 30, 40};
		int[][] arr2 = {
				{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
		};
		// 매서드 영역
		int result = addOneArr(arr);
		int result2 = addTwoArr(arr2);
		// 출력
		System.out.println("1차원 배열의 합은 "+result);
		System.out.println("2차원 배열의 합은 "+result2);
	}
	// 1차원 배열 매서드
	public static int addOneArr(int[] arr) { // 배열의 실제 값이 아닌 해시코드 값 복사해 접근
		int result = 0;
		for(int i=0;i<arr.length;i++)
			result += arr[i];
		return result;
	}
	/* arr은 2차원 배열 전체를 가리키는 reference
	 * arr[i]는 1행의 1차원 배열을 가리키는 reference
	 * arr[i][j] int 1개 공간
	 */
	// 2차원 배열 매서드
	public static int addTwoArr(int[][] arr) {
		int result = 0;
		for(int i=0;i<arr.length;i++) {		//arr.length = 3
			for(int j=0;j<arr[i].length;j++)  //arr.length = 4
				result += arr[i][j];
		}
		return result;
	}
}
