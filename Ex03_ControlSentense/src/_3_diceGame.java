import java.util.Random;
import java.util.Scanner;

/* 1 ~ 6 ������ ������� ���ڸ� �Է� �޴´�.
 * ��ǻ���� ������ �����Ѵ�.
 * �� ���� ���ϰ� ū ���ڸ� �̰�ٰ� ����Ѵ�
 * ���ǹ� ���
 * You in!!! or Commputer Win !!! or Draw !!!
 */
public class _3_diceGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String winner = "";

		int computerNum = random.nextInt(6) + 1;

		System.out.println("1���� 6 ������ ���ڸ� �Է��ϼ���");
		int userNum = scan.nextInt();

		if (computerNum > userNum)
			winner = "Computer Win !!!";
		else if (computerNum < userNum)
			winner = "You Win !!!";
		else
			winner = "Draw !!!";

		System.out.println("��ǻ�� : " + computerNum);
		System.out.println("����� : " + userNum);
		System.out.println("����� : " +winner);
		scan.close();
	}

}
