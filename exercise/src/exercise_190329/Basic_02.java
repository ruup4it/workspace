package exercise_190329;

import java.util.Scanner;

//2. 2개의 정수를 입력받고 큰 값을 반환하는 순서도를 그리세요
public class Basic_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		int first = scan.nextInt();
		System.out.println("두 번째 수를 입력하세요");
		int second = scan.nextInt();
		if(first>second) 
			System.out.println(first);
		else
			System.out.println(second);
		scan.close();
	}
}
