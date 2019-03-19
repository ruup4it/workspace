/* 1) 2차원 int 배열 4행 5열에 
 * 		1부터 1개씩 값을 증가시켜 채워 넣어 반환하는 매서드 제작
 *  2) 1번에서 반환한 매서드를 매개변수로 받아서 모두 합을 구해 반환하는 매서드 제작
 *  3) main함수에서는 1, 2번 매서드를 사용
 */
public class _12_MethodMakeDTwoArray {
	public static void main(String[] args) {
		int[][] arr  = getDTowArray(5, 6);		
		int sum = getSumDTwoArray(arr); 
		System.out.println("배열의 합은 "+sum+"입니다");		
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
