package exercise_190314;

import java.util.Scanner;

//	4.  가위 바위 보 게임을 만듭니다
//		컴퓨터는 난수로 생성하고 사용자는 문자열로 입력받습니다
//		10번 진행하고 승 패 비김 을 출력하세요
//	가위1  바위2
//  바위2  보3
//   보3   가위1
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
			System.out.print("무엇을 내시겠습니까? (가위/바위/보)");
			userInput = scan.next();

			switch (com) {
			case 1:
				computerInput = "가위";
				break;
			case 2:
				computerInput = "바위";
				break;
			case 3:
				computerInput = "보";
				break;
			}

			if ((computerInput.equals("가위") && userInput.equals("보"))
					|| (computerInput.equals("바위") && userInput.equals("가위"))
					|| (computerInput.equals("보") && userInput.equals("바위"))) {
				result = "You Lose!!";
				win++;
			} else if ((computerInput.equals("보") && userInput.equals("가위"))
					|| (computerInput.equals("가위") && userInput.equals("바위"))
					|| (computerInput.equals("바위") && userInput.equals("보"))) {
				result = "You Win!!";
				lose++;
			} else {
				result = "Draw!!";
				draw++;
			}

			System.out.println(String.format("======%d번째결과======\n컴퓨터 : %s \n사용자 : %s\n   %s", i + 1, computerInput,
					userInput, result));
		}
		System.out.println("==================");
		System.out.println(String.format("승 : %d, 패 : %d, 무승부: %d", win, lose, draw));
		scan.close();
	}
}
