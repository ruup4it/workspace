import java.util.Arrays;

/*
 * 10���� int�迭�� �����ϰ�
 * 1���� 10���� �迭�� �����ϰ�, for���� �̿��ؼ� ����ϼ���
 */
public class _4_array {
	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i =0;i<array.length;i++) {
			array[i] = i+1;
		}
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}
}
