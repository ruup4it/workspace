import java.util.Random;
import java.util.Scanner;

/* 1 ~ 6 사이의 사용자의 숫자를 입력 받는다.
 * 컴퓨터의 난수를 생성한다.
 * 두 수를 비교하고 큰 숫자를 이겼다고 출력한다
 * 조건문 사용
 * You in!!! or Commputer Win !!! or Draw !!!
 */
public class _3_diceGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String winner = "";

		int computerNum = random.nextInt(6) + 1;

		System.out.println("1부터 6 사이의 숫자를 입력하세요");
		int userNum = scan.nextInt();

		if (computerNum > userNum)
			winner = "Computer Win !!!";
		else if (computerNum < userNum)
			winner = "You Win !!!";
		else
			winner = "Draw !!!";

		System.out.println("컴퓨터 : " + computerNum);
		System.out.println("사용자 : " + userNum);
		System.out.println("결과값 : " +winner);
		scan.close();
	}

}
