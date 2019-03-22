package exercise_190314;

import java.util.Scanner;

//6. 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요
//예를 들어 5를 입력받으면 3 6 9 12 15를 출력하면 됩니다
public class doWhile06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("정수를 입력하세요.");
		num = scan.nextInt();
		do {
			++count;
			System.out.print(count*3 + " ");
		} while (count < num);
		scan.close();
	}
}
