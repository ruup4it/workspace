/* ���������� {} ������ �����ϴ� ����
 * �ż��尡 ȣ��Ǹ� ���� �޸𸮿� �ε��ȴ�
 * ���� �̸��̶� �ٸ� �޸𸮸� ���
 * {}�� ������ ���ÿ��� �������(�÷ȴ� ���ȴ�)
 * �ش� ���������� ����� �� �ְ�
 * ���� �ٸ� ���� ���� �ѱ���� return�� ����ؾ��Ѵ�
 
 */
public class _10_LocalVariable {
	public static void main(String[] args) {
		boolean scope=true;
		if(scope) {
			int num = 1;
			num++;
			System.out.println(num);
		}else {
			int num = 5;
			System.out.println(num);
		}
		simple();
	}
	public static void simple() {
		int num = 3;
		System.out.println(num);
	}
}
