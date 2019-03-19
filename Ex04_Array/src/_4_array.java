import java.util.Arrays;

/*
 * 10개의 int배열을 선언하고
 * 1부터 10까지 배열에 저장하고, for문을 이용해서 출력하세요
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
