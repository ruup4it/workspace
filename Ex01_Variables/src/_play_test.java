//import java.util.Scanner;

public class _play_test {
	public static void main(String[] args) {
		String strl = "HelloWorld";
		if (strl.matches("HelloWorld")) {
			System.out.println("HelloWorld");
		}
		if (strl.matches("Hello.....")) {
			System.out.println("Hello.....");
		}
		if (strl.matches("Hel+oWorld")) {
			System.out.println("Hel+oWorld");
		}
		strl = "NiceWorld";
		if (strl.matches("(Hello|Nice)World")) {
			System.out.println("(Hello|Nice)World");
		}
		if (strl.matches("\\w*")) {
			System.out.println("_를 포함한 영숫자");
		}
	}

	/*
	 * boolean bResult; int num0 = 0, num1 = 0;
	 * 
	 * System.out.println("*** 대소 비교 연산을 합니다 ***"); System.out.println();
	 * System.out.println("첫 번째 숫자를 입력하세요");
	 * 
	 * Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성 num0 =
	 * Integer.parseInt(scan.nextLine());
	 * 
	 * 
	 * System.out.println("두 번째 숫자를 입력하세요"); num1 =
	 * Integer.parseInt(scan.nextLine());
	 * 
	 * 
	 * bResult = num0 > num1; System.out.println(); System.out.println("첫번 째 입력 값은 "
	 * + num0 + " 입니다."); System.out.println("두번 째 입력 값은 " + num1 + " 입니다.");
	 * System.out.println(); System.out.println(num0 + "은 " + num1 + "보다 크다는 사실은 " +
	 * bResult + "입니다."); System.out.println();
	 */
}
