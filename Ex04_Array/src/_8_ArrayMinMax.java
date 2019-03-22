import java.util.Arrays;
import java.util.Scanner;

/* 배열에 정수 10개를 입력받습니다.
 * 1) for문을 이용해서 비교방식으로 최소값과 최대값을 구하세요
 * 2) Arrays.sort를 이용해서 최소값과 최대값을 구하세요
 * */
public class _8_ArrayMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int max = 0, min = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.format("정수를 입력하세요 %02d/10", i + 1));
			array[i] = scan.nextInt();
			min += array[i];
		}
		// for문 이용
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		// sort이용
//		Arrays.sort(array);
//		max = array[0];
//		min = array[array.length-1];
		
		System.out.println(Arrays.toString(array));
		System.out.println(String.format("최대값은 %d 입니다.", max));
		System.out.println(String.format("최소값은 %d 입니다.", min));
		scan.close();
	}
}
