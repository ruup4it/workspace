package _ch07_GenericCollection;

public class GenericEx4<T> {
	T v;

	public GenericEx4(T n) {
		v = n;
	}

	public void set(T n) {
		v = n;
	}

	public T get() {
		return v;
	}

	public static void main(String[] args) {
		GenEx3 g3 = new GenEx3();
		GenericEx4<? super GenEx2> g4 = new GenericEx4<GenEx1> (g3);
		GenEx3 test = (GenEx3)g4.get();
		System.out.println(test.msg +","+ test.getMsg());
		System.out.println(String.format("g4의 결과 : %s, %s", test.msg, test.getMsg()));
	}
}
