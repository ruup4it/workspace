package exercise_190314;

import java.util.Scanner;

//5. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
public class doWhile05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("정수를 입력하세요.");
		num = scan.nextInt();
		do {
			++count;
			System.out.println(String.format("감사합니다. %d",count));
		} while (count < num);
		scan.close();
	}
}
