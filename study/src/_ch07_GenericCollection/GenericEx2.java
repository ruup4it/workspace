package _ch07_GenericCollection;

public class GenericEx2<T> {
	T v;

	public GenericEx2(T n) {
		v = n;
	}

	public void set(T n) {
		v = n;
	}

	public T get() {
		return v;
	}
	public static void main(String[] args) {
		GenericEx2<?> g2 = new GenericEx2<String>("String객체");
		String s = (String)g2.get(); // 반환형은 Object 타입으로 강제 형 변환 (casting) 해주기 
		System.out.println(String.format("g2의 결과 : %s", s));
		
		GenericEx2<?> g3 = new GenericEx2<Integer>(10000);
		System.out.println(String.format("g3의 결과 : %s", g3.get().toString()));
	}
}
