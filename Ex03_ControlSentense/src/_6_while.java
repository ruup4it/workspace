import java.util.Scanner;

/* while	: �� �� �ݺ��� �� �𸣸�
 * do~while	: 1 ���� �����ϰ� ���� �Ǵ��ϰ� ������
 * for		: ���۰� ���� ��Ȯ�ϸ�
 * but ��ȣȣȯ�� �ȴ�.
 * */

// ����ڷκ��� ���ڸ� �Է� �ް�
// ������ �ش� ���ڸ�ŭ ��������
// ���������� ������ �� ����ϼ���
public class _6_while {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int inputNum = scan.nextInt();
		int count = 0;
		
		while(inputNum>0) {
			System.out.println(++count +"�� ������ϴ�.");
			inputNum--;
		}
		System.out.println("������ ��");
		scan.close();
	}
}
