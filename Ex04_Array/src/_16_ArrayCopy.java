import java.util.Arrays;

public class _16_ArrayCopy {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] temp = { 1, 2, 0, 0, 0 };
		// arr 배열 인덱스2부터 복사해서 temp 배열 인덱스2 위치로 붙여 넣는데 길이는 3만큼
		//System.arraycopy(arr, 2, temp, 2, 3);// [1, 2, 3, 4, 5]
		
		System.arraycopy(arr, 1, temp, 3, 2); //[1, 2, 0, 2, 3]
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
