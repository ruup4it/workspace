/* �Ű������� �Ϲ�������
 * argument �Ǵ� parameter��� �θ���.
 * �Ű������� �ش� �޼����� ���� �����̴�.
 * */
public class _03_Method2Param {
	public static void main(String[] args) {
		double myHeight = 172.9;
		hiEveryOne(12, 12.5);
		hiEveryOne(13, myHeight);
		byEveryOne();
	}

	private static void hiEveryOne(int age, double height) {
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
		System.out.println("���� Ű��" + height + "�Դϴ�.");
	}

	private static void byEveryOne() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
