package star;

public class Diamond {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			// 1번 부분
			for (int j = 3 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}

			// 2번 부분
			for (int k = 0; k < i - 1; k++) {
				System.out.print("*");
			}
			for (int j = (3 - i); j > 0; j--) {
				System.out.print(" ");
			}

			System.out.println();
		}

		// 아래쪽 삼각형
		for (int i = 1; i <= 3 - 1; i++) {
			// 3번 부분
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = (3 - i); k > 1; k--) {
				System.out.print("*");
			}

			// 4번 부분
			for (int k = i; k < 3; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
			/*
			 * for (int i = 0; i < 5; i++) { System.out.print("i : " + i); if (i < 3) { for
			 * (int j = 2; j - i > 0; j--) { System.out.print(" "); } System.out.print("*");
			 * for (int j = 1; j < i * 2 + 1; j++) { System.out.print("*"); } } else { for
			 * (int j = 2; i - j > 0; j++) { System.out.print(" "); } //
			 * System.out.print("*"); for (int j = 4; j < i ; j++) { System.out.print("*");
			 * }
			 * 
			 * } System.out.println(); } System.out.print(" ");
			 */
		}
	}
}
