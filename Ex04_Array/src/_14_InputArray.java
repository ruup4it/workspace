import java.util.Arrays;
import java.util.Scanner;

/* 7���� double �迭�� �Ҵ��ϼ���
 * ���� 5������ ������ �Է¹ް� 
 * 6��° ����
 * 7��° ����� ����ϰ� �ְ�
 * ����ϼ���
 * */
public class _14_InputArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] arr = new double[7];
		Arrays.fill(arr,0);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("������ �Է��ϼ���");
			arr[i] = scan.nextDouble();
			arr[5] += arr[i];
		}
		arr[6] = arr[5]/5;
		System.out.println(Arrays.toString(arr)+"���� : "+arr[5]+" ��� : " +arr[6]);
		
		scan.close();
	} 
}
