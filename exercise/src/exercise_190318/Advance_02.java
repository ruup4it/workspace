package exercise_190318;

import java.util.Random;
import java.util.Scanner;

//2. 0~99까지 임의의 수를 생성합니다
//사용자로부터 숫자를 입력받습니다
//사용자가 임의의 수보다 낮은 값을 입력하면 "더 높게"를 출력하고
//높은 값을 입력하면 "더 낮게"를 출력합니다
//정답을 맞추면 "맞았습니다"를 출력합니다.
//y/n을 묻고 y를 입력하면 다시 게임을 진행하고
//n을 입력하면 종료합니다
public class Advance_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		//int num = (int)Math.random() * 100;
		int num = rand.nextInt(100);
		System.out.println("참고 답)" + num);
		int userNum = 0;
		char question = 'y';
		do {
			System.out.print("숫자를 입력하세요. 입력 : ");
			userNum = scan.nextInt();
			if(num == userNum) {
			System.out.println("정답입니다");
			} else if(num > userNum){
				System.out.println("더 낮게");
			} else if(num < userNum){
				System.out.println("더 높게");
			}
			System.out.println("=========================");
			System.out.print("게임을 더 진행하시겠습니까? (y/n) 입력 : ");
			question = scan.next().charAt(0);
		}while(question=='y');
		System.out.println("=========================");
		System.out.println("이용해주셔서 감사합니다.");
		System.out.println("=========================");
		scan.close();
	}

}
