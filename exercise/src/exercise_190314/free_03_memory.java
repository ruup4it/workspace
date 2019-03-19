package exercise_190314;

public class free_03_memory {
	static int a = 10;
	static int b = 0;

	public static void function2() {
		int a = 100;
		
		System.out.println(String.format("[function2()] a: %d, b: %d", a,b));
	}

	public static void function1() {
		int a = 1;
		int b = 30;
		function2();
		System.out.println(String.format("[function1()] a: %d, b: %d", a,b));
	}

	public static void main(String[] args) {
		int a = 500;
		function1();
		System.out.println(String.format("[main()] a: %d, b: %d", a,b));
	}
}
