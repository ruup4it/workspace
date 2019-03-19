/* 구구단을 출력하세요
 * 단 구구단의 2~9 단을 뒤의 숫자가 1 ~ 5까지 출력하세요
 * 예를 들어 3x1=3 ... 3x5=15 해서 5까지만 출력하면 됩니다.
 * 1) break를 사용해서 해결하세요
 * 2) continue를 사용해서 해결하세요
 * */
public class _15_break_continue {
	public static void main(String[] args) {
		System.out.println("continue 사용");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j>5) 
					continue;
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}

		System.out.println("break 사용");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j > 5)
					break;
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
