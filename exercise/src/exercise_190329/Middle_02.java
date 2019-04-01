package exercise_190329;

import java.util.Scanner;

//2. 두개의 실수(double)와 +, -, *, / 중의 1개 연산자를 입력하여 
//   계산하는 순서도를 그리세요

public class Middle_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0, first, second;
		
		System.out.println("첫 번째 수를 입력하세요");
		first = scan.nextDouble();
		
		System.out.println("두 번째 수를 입력하세요");
		second = scan.nextDouble();
		
		scan.nextLine();
		System.out.println("연산자를 입력하세요");
		String operator = scan.nextLine();
		
		switch(operator){
			case "+" :
				result = first + second;
				break;
			case "-":
				result = first - second;
				break;
			case "/":
				result = first / second;
				break;
			case "*":
				result = first * second;
				break;
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
