package exercise_190315;

import java.util.Scanner;

//4. 3개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요
public class Middle_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int[] inputArr= inputNum();  배열버전 만들어보기
		int first = inputNum(scan);  	// 입력 받는 메서드
		int second = inputNum(scan);  	// 입력 받는 메서드
		calMax(first,second);   		// 큰 값을 반환하는 메서드
		calMin(first,second); 			// 작은 값을 반환하는 메서드
		scan.close();
	}

	private static int inputNum(Scanner scan) {
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		return num;
	}

	private static void calMax(int num1, int num2) {
		int max = 0;
		if(num1 > num2)
			max = num1;
		else
			max = num2;
		System.out.println(String.format("둘 중 큰 값은 %d입니다.",max));
	}

	private static void calMin(int num1, int num2) {
		int min = 0;
		if(num1 < num2)
			min = num1;
		else
			min = num2;
		System.out.println(String.format("둘 중 작은 값은 %d입니다.",min));
	}
}
