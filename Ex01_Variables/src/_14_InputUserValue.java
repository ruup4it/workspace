import java.util.Scanner;
//import java.util.*; // java.util ���� ��� �� import

public class _14_InputUserValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();

		System.out.println("���ڸ� �Է��ϼ���");
		String string = scan.next();
		
		System.out.println(num);
		System.out.println(string);
		scan.close();
	}
}
