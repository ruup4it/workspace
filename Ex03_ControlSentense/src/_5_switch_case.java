import java.util.Scanner;

public class _5_switch_case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		System.out.println("���� �Է��ϼ���");
		month = scan.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("�ʿ���");
			break;
		case 7:
		case 8:
			System.out.println("�ѿ���");
			break;
		case 9:
			System.out.println("�ʰ���");
			break;
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
			System.out.println("�ܿ�");
			break;
		case 2:
			System.out.println("�ʺ�");
			break;
		default:
			System.out.println("���� �߸� �ԷµǾ����ϴ�.");
			break;
		}
		scan.close();
	}
}
