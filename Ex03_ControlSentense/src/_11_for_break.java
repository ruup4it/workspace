import java.util.Scanner;

/* ������ �Է��϶� 
 * �Է� ���� �����߿� 3�ڸ� �� (100~999)�� ���ض�
 * exit�� �Է��ϸ� ���� ���� ����ϰ� �����ض�
 * */
public class _11_for_break {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String exit = "";
		int sum = 0;
		int num = 0;
		for (;;) {
			System.out.print("������ �Է��ϼ��� (���� : exit) : ");
			// next() : ���๮�� ������ / nextLine() : ���๮�� ����
			exit = scan.nextLine();
			if(exit.equals("exit")) 
				break;
			num = Integer.parseInt(exit);
			if(num / 100 > 0 && num / 100 < 10)
				sum += num;
		}
		System.out.println(sum);
		
		
		scan.close();
	}
}
