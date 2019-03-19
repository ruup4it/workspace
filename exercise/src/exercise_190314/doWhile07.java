package exercise_190314;

import java.util.Scanner;

//7. 입력받은 숫자의 구구단을 출력하세요
//예를 들어 3을 입력하면 
//3 x 1 = 3
//3 x 2 = 6
//...
//3 x 9 = 27
public class doWhile07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("정수를 입력하세요");
		num = scan.nextInt();
		do {
			++count;
			System.out.println(num + " * " + count + " = " + num * count);
		} while (count < 9);
		scan.close();
	}
}
