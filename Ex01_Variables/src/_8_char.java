
public class _8_char {
	public static void main(String[] args) {
		char a = 'A';
		char b = '��';
		System.out.println(a);
		System.out.println(b);
		// ���������� ���ڷ� �����
		int ia = a;
		int ib = b;
		System.out.println(ia);
		System.out.println(ib);
		// char�� ���� ��ȯ�ϸ� �ٽ� ���ƿ�
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
	}
}
