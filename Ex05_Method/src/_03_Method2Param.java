/* 매개변수를 일반적으로
 * argument 또는 parameter라고 부른다.
 * 매개변수는 해당 메서드의 지역 변수이다.
 * */
public class _03_Method2Param {
	public static void main(String[] args) {
		double myHeight = 172.9;
		hiEveryOne(12, 12.5);
		hiEveryOne(13, myHeight);
		byEveryOne();
	}

	private static void hiEveryOne(int age, double height) {
		System.out.println("제 나이는" + age + "입니다.");
		System.out.println("저의 키는" + height + "입니다.");
	}

	private static void byEveryOne() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
