// ���� ������ : ���ǹ� ��� ���
// ���� ������ - �׸��� 3���� �̸� ����
// A ? B : C - A �� true�� B�� ���
//			   A �� false�� C�� ���
// ���ǹ� ��� ���̴� ��찡 �ִ�.
public class _7_ThreeParamOp {
	public static void main(String[] args) {
		boolean b = true;
		int num = b? 10: 100;
		System.out.println(num);
		
		b = false;
		num = b? 10:100;
		System.out.println(num);
	}
}
