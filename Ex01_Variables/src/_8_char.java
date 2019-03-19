
public class _8_char {
	public static void main(String[] args) {
		char a = 'A';
		char b = '가';
		System.out.println(a);
		System.out.println(b);
		// 내부적으로 숫자로 저장됨
		int ia = a;
		int ib = b;
		System.out.println(ia);
		System.out.println(ib);
		// char로 강제 변환하면 다시 돌아옴
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
	}
}
