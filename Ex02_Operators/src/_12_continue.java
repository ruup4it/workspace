/* break, continue�� ����� �����ؼ� ����Ѵ�.
 * break : ���� ����� (���� ����) �ݺ����� Ż��
 * continue : �� �̻� �Ʒ��� ��� ���� ���� ���ư��� ��� ����
 * */

// 0���� 9���� ���� �� 5 �̻��� ���ڸ� ���
public class _12_continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i<5) 
				continue;
			System.out.print(i);
		}
	}
}
