/* continue�� �ݺ����� ���������� ��� ����������
 * return�� �Լ��� ȣ���� ������ ����������(��, ������)
 * */
public class _02_continue_return {
	public static void main(String[] args) {
		System.out.println("=========continue=========");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println("\n==========return==========");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0)
				return;
			System.out.print(i + " ");
		}
	}
}
