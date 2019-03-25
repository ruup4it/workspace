
public class _7_String_vs_StringBuilder {
	public static long getStringSpeed() { // String 속도
		@SuppressWarnings("unused")
		String str = "A";
		String target = "B";
		long start = System.currentTimeMillis(); // 1/1000 초
		for (int i = 0; i < 90000; i++) {
			str += target;
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	public static long getStringBuilderSpeed() { // StringBuilder 속도
		StringBuilder str = new StringBuilder("A");
		String target = "B";
		long start = System.currentTimeMillis(); // 1/1000 초
		for (int i = 0; i < 90000; i++) {
			str.append(target);
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	public static void main(String[] args) {
		long lStrTime = getStringSpeed();
		long lSBTime = getStringBuilderSpeed();

		System.out.println("String 시간\t : " + lStrTime);
		System.out.println("StringBuilder 시간 : " + lSBTime);
	}
}
