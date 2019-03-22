import java.util.Arrays;
//[0]
//[3, 4]
//[6, 7, 8]
//[9, 10, 11, 12]
//[12, 13, 14, 15, 16]
public class _13_MuliArray {
	public static void main(String[] args) {
		int[][] arr = new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
		int cnt = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				//arr[i][j] = i*3 + j ;
				arr[i][j] = cnt++ ;
			}
		}
		for(int[] temp :arr) {
			System.out.println(Arrays.toString(temp));
		}
	}
}
