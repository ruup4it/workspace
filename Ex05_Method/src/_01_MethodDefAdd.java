/* Method (Java���� �Լ��� ����Ű�� ���)
 * Function
 * 
 * ���� = ��� + ���� = �־� + ����
 * ���α׷��� = �ʵ� + �޼���
 * 
 * �޼��带 ����� ���� 
 * 1) �ڵ尡 ������� �Ǹ� �������� ���Ͽ� ���� ������ �з�
 * 	  ���� �ǹ� �ִ� ������ �з�
 * 	k5 - ��ǰ ���ȭ, 1������ �̻��� ����� �� �κи� ����
 * 	(���� ����� ����)
 * 2) �ߺ� �ڵ带 �̸����θ� ȣ���ϱ� ����
 * 3) ������ ���� �ϱ� ����
 * */

/* static �޼���
 * Ŭ������ ���� �� ��ü�� ������ �ʾƵ� �ٷ� �޸𸮿� �ε�
 * */
/* �޼����� ����
 * 
 * ����			�����		(��)
 * returnValue methodName (argumentValue){
 * 
 * }
 * ���ϰ�(returnValue)�� int, double, int[], Ŭ���� ��
 * return �ش� return��; �� �;� �Ѵ�.
 * ���� ���� void�̸� �ƹ����� ��ȯ���� �ʴ´ٴ� �ǹ��̹Ƿ�
 * return�� �����ϰų� �׳� retuurn�� ���ָ� �ȴ�.
 * return�� �ǹ̴� �� �Լ��� ȣ���� ������ ���ư���
 * */

/* return��   2x+1�� �Լ��� (x�� �Ű�����)
 *    y   =    2x + 1
 * 
 * */
// �� ���Ͽ� public Ŭ������ �ϳ��� ����
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		hiEveryOne(12);
		hiEveryOne(12);
		System.out.println("���α׷��� ��");
	}
	static void hiEveryOne(int age) {
		System.out.println("���� ��ħ �Դϴ�.");
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
		return; // �ƹ� ���� ������ �� ���� ���ư��� ; void�� ��� ���� ����
	}
}

