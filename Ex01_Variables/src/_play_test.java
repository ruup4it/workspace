//import java.util.Scanner;

public class _play_test {
	public static void main(String[] args) {
		String strl = "HelloWorld";
		if (strl.matches("HelloWorld")) {
			System.out.println("HelloWorld");
		}
		if (strl.matches("Hello.....")) {
			System.out.println("Hello.....");
		}
		if (strl.matches("Hel+oWorld")) {
			System.out.println("Hel+oWorld");
		}
		strl = "NiceWorld";
		if (strl.matches("(Hello|Nice)World")) {
			System.out.println("(Hello|Nice)World");
		}
		if (strl.matches("\\w*")) {
			System.out.println("_�� ������ ������");
		}
	}

	/*
	 * boolean bResult; int num0 = 0, num1 = 0;
	 * 
	 * System.out.println("*** ��� �� ������ �մϴ� ***"); System.out.println();
	 * System.out.println("ù ��° ���ڸ� �Է��ϼ���");
	 * 
	 * Scanner scan = new Scanner(System.in); // ���� �Է��� ���ڷ� Scanner ���� num0 =
	 * Integer.parseInt(scan.nextLine());
	 * 
	 * 
	 * System.out.println("�� ��° ���ڸ� �Է��ϼ���"); num1 =
	 * Integer.parseInt(scan.nextLine());
	 * 
	 * 
	 * bResult = num0 > num1; System.out.println(); System.out.println("ù�� ° �Է� ���� "
	 * + num0 + " �Դϴ�."); System.out.println("�ι� ° �Է� ���� " + num1 + " �Դϴ�.");
	 * System.out.println(); System.out.println(num0 + "�� " + num1 + "���� ũ�ٴ� ����� " +
	 * bResult + "�Դϴ�."); System.out.println();
	 */
}
