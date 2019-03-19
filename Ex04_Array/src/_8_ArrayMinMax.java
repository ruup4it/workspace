import java.util.Arrays;
import java.util.Scanner;

/* �迭�� ���� 10���� �Է¹޽��ϴ�.
 * 1) for���� �̿��ؼ� �񱳹������ �ּҰ��� �ִ밪�� ���ϼ���
 * 2) Arrays.sort�� �̿��ؼ� �ּҰ��� �ִ밪�� ���ϼ���
 * */
public class _8_ArrayMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int max = 0, min = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.format("������ �Է��ϼ��� %02d/10", i + 1));
			array[i] = scan.nextInt();
			min += array[i];
		}
		// for�� �̿�
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		// sort�̿�
//		Arrays.sort(array);
//		max = array[0];
//		min = array[array.length-1];
		
		System.out.println(Arrays.toString(array));
		System.out.println(String.format("�ִ밪�� %d �Դϴ�.", max));
		System.out.println(String.format("�ּҰ��� %d �Դϴ�.", min));
		scan.close();
	}
}
