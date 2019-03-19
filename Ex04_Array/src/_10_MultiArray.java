import java.util.Arrays;

/* 다차원 배열 (2차원 이상 배열)
 * 실제로 90% 이상 1차원 배열만 쓴다.
 * int[][] arr = new int [저장될 1차원 배열의 수][각 1차원 배열의 길이]
 * */
public class _10_MultiArray {
	public static void main(String[] args) {
		// 자료형 int[] / 변수 scores
		// int[] scores = {10, 20};
		
		// 자료형 int[][] / 변수 arr
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
