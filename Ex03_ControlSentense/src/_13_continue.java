/* continue�� ����ؼ� ������ �ذ��϶�
 * 1���� 100���� �߿� ¦���� ����϶�
 * */
public class _13_continue {
	public static void main(String[] args) {
		// ��� 1) %
		// i % 2 != 0 > continue
		// i % 2 == 1 > continue
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		
		/*// ��� 2) += 2
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
		*/
	}
}
