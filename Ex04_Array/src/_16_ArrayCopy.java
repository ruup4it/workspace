import java.util.Arrays;

public class _16_ArrayCopy {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] temp = { 1, 2, 0, 0, 0 };
		// arr �迭 �ε���2���� �����ؼ� temp �迭 �ε���2 ��ġ�� �ٿ� �ִµ� ���̴� 3��ŭ
		//System.arraycopy(arr, 2, temp, 2, 3);// [1, 2, 3, 4, 5]
		
		System.arraycopy(arr, 1, temp, 3, 2); //[1, 2, 0, 2, 3]
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
