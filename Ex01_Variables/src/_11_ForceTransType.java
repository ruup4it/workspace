/* ���� �� ��ȯ (����� �� ��ȯ)
 * ū ������ ���ڸ� ���� ������ ���ڿ� �������� �� ��
 * �׳��� ������ �������� ���ƹ����ϱ�
 * �ʿ��ϸ� ��������� ��ȯ�ϰڴٰ� �����ϴ� �� 
 * 
 * �տ��� �սǳ��µ� �ʰ� ��Ȯ�ϴٸ� ��������� ����ȯ�� ���� �ٲٷ�
 * ex) int : 4 byte / byte : 1 byte 
 * int -> byte�� �ϸ� 3 byte�� �߷�����
 * ������ 10 ������ ����
 * int : 00000110 -> byte : 0110 
 * 
 * */
public class _11_ForceTransType {
	public static void main(String[] args) {
		// �����Ͱ� �߸��� ���
		// byte�� 127���� �ۿ� ǥ���� ���ϴµ� ���� ����ȯ�� ��Ų ��� > -128�� �ٲ�
		int num = 128;
		byte bNum = (byte) num;
		System.out.println(bNum);

		//
		char ch = 'A'; // char�� ���� ����
		// short s = ch; // ���� �߻�(cannot convert from char to short)
		short s = (short) ch; // short�� �������� ����
		// char�� short�� ���� 2byte���� ������ �ٸ�
		// short�� �������� �����Ƿ� char�� ���� ������ ��������� �� �д�.
		System.out.println(s);

		//
		float f = 13.3F;
		// int num = f; // ���� �߻�(cannot convert from float to int)
		// ���� 4byte������ �Ǽ��� float�� ������ ũ��
		int num2 = (int) f; // �Ҽ����� �������.
		System.out.println(f);
		System.out.println(num2);

		// long�� 8byte, float�� 4byte
		// float�� long ���� ũ��� ������ ǥ�� ������ �� �����Ƿ� ����
		// 8byte -> 4 byte �� ������ �Ǽ��� ��ȯ�ؼ� �ִ´�.
		// ǥ�� ������ float > long �̹Ƿ� ���� ����
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
		
	}
}
