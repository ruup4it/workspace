package exercise_190314;

import java.util.Scanner;

//	4.  ���� ���� �� ������ ����ϴ�
//		��ǻ�ʹ� ������ �����ϰ� ����ڴ� ���ڿ��� �Է¹޽��ϴ�
//		10�� �����ϰ� �� �� ��� �� ����ϼ���
//	����1  ����2
//  ����2  ��3
//   ��3   ����1
public class ex_04 {
	public static void main(String[] args) {
		// Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		int com = 0;
		String userInput = "";
		String computerInput = "";
		String result = "";
		int win = 0, lose = 0, draw = 0;
		for (int i = 0; i < 3; i++) {
			// play = rd.nextInt(3)+1;
			com = (int) (Math.random() * 3 + 1);
			System.out.println("==================");
			System.out.print("������ ���ðڽ��ϱ�? (����/����/��)");
			userInput = scan.next();

			switch (com) {
			case 1:
				computerInput = "����";
				break;
			case 2:
				computerInput = "����";
				break;
			case 3:
				computerInput = "��";
				break;
			}

			if ((computerInput.equals("����") && userInput.equals("��"))
					|| (computerInput.equals("����") && userInput.equals("����"))
					|| (computerInput.equals("��") && userInput.equals("����"))) {
				result = "You Lose!!";
				win++;
			} else if ((computerInput.equals("��") && userInput.equals("����"))
					|| (computerInput.equals("����") && userInput.equals("����"))
					|| (computerInput.equals("����") && userInput.equals("��"))) {
				result = "You Win!!";
				lose++;
			} else {
				result = "Draw!!";
				draw++;
			}

			System.out.println(String.format("======%d��°���======\n��ǻ�� : %s \n����� : %s\n   %s", i + 1, computerInput,
					userInput, result));
		}
		System.out.println("==================");
		System.out.println(String.format("�� : %d, �� : %d, ���º�: %d", win, lose, draw));
		scan.close();
	}
}
