import java.util.Random;
import java.util.Scanner;

/* 1 ~ 6 ������ ������� ���ڸ� �Է� �޴´�.
 * ��ǻ���� ������ �����Ѵ�.
 * �� ���� ���ϰ� ū ���ڸ� �̰�ٰ� ����Ѵ�
 * ���� ������ ���
 * You in!!! or Commputer Win !!! or Draw !!!
 */
public class _10_diceGame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String winner = "";
		
		int computerNum = random.nextInt(6)+1;
		
		System.out.println("1���� 6 ������ ���ڸ� �Է��ϼ���");
		int userNum = scan.nextInt();
		
		//winner = computerNum > userNum? "Computer Win !!!" : "You Win !!!";
		//winner = computerNum == userNum? "Draw !!!" : "";
		
		winner = computerNum > userNum? "Computer Win !!!" : 
			     computerNum < userNum? "You Win !!!" :
			    	 "Draw !!!" ;
		
		System.out.println("��ǻ�� : " + computerNum);
		System.out.println("����� : " + userNum);
		System.out.println(winner);
		scan.close();
	}

}
