import java.util.Scanner;

/* ¦������ Ȧ������ 
 * ���ڿ��� �����ϴ� �޼��带 �����ϰ�
 * 5���� ���� �迭�� �����ϼ���
 * �迭�� ���� 5���� Ű����κ��� �Է� ��������
 * foreach���� ����ؼ� �޼��忡 �迭�� �Է��ϰ�
 * ������� ��� (¦��/Ȧ��)�ϼ���
 * */
public class _05_JudgeTrueFalse {

	public static void main(String[] args) {
		final int ARRAYLENTH = 5;
		int[] arr = inputArray(ARRAYLENTH);// �Է¸޼���
		String[] arrResult = isOddOrEven(arr);// ��� �޼���
		printResult(arrResult);// ��� �޼���
	}

	private static int[] inputArray(int length) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[length];
		int count = 0;
		for (@SuppressWarnings("unused") int item : arr) {
			System.out.println("������ �Է��ϼ���");
			arr[count] = scan.nextInt();
			count++;
		}
		scan.close();
		return arr;
	}

	private static String[] isOddOrEven(int[] arr) {
		String[] arrResult = new String[arr.length];
		int count = 0;
		for(int item : arr) {
			if (item % 2 == 0)
				arrResult[count] = "¦��";
			else
				arrResult[count] = "Ȧ��";
			count++;
		}
		return arrResult;
	}

	private static void printResult(String[] arrResult) {
		for(String item : arrResult) {
			System.out.print(item+ " ");
		}
	}

}
