import java.util.Scanner;

/* ���ڸ� �Է� �ް� ¦������ Ȧ������
 * ���ڿ��� �����ϴ� �޼��带 �����ϰ�
 * ����غ�����
 * */
public class _04_JudgeTrueFalse {
	public static void main(String[] args) {
		int num = inputNum(); // �Է� �޴� �޼���
		String result = isOddOrEven(num);// ¦�� Ȧ�� �Ǵ��ϴ� �޼���
		printResult(result);// ��� �޼���
	}

	private static int inputNum() {
		Scanner scan = new Scanner(System.in);
		int numForInput = 0;
		System.out.print("������ �Է��ϼ���");
		numForInput = scan.nextInt();
		scan.close();
		return numForInput;
	}

	private static String isOddOrEven(int num) {
		//String returnString = "";
		if(num%2 ==0) 
			return String.format("�Է��Ͻ� ���� : %d \n��� : ¦���Դϴ�.", num);
			//returnString = String.format("�Է��Ͻ� ���� : %d \n��� : ¦���Դϴ�.", num);
		else 
			return  String.format("�Է��Ͻ� ���� : %d \n��� : ¦���Դϴ�.", num);
			//returnString = String.format("�Է��Ͻ� ���� : %d \n��� : Ȧ���Դϴ�.", num);
		//return returnString;
	}

	private static void printResult(String result) {
		System.out.println(result);
	}
}
