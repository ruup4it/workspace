package exercise_190314;

import java.util.Scanner;

//1. 연도를 입력받으세요
//	윤년인지 아닌지를 판별하세요
//	4로 나누어 떨어지는 해는 일단 윤년에 포함시킵니다
//	하지만 윤년중에 100으로 나누어떨어지는 해는 평년으로 하되 
//	평년중에 400으로 나누어 떨어지는 해는 윤년에 해당합니다

// 윤년 : 1) 4로 나누어 나머지가 0이고, 100으로 나누었을 때 나머지가 0이 아닐 때
//       2) 100으로 나누었을 때 나머지가 0이더라도, 400으로 나누어 나머지가 0 일때
// 평년 : 100으로 나누었을 때 나머지가 0 

// 윤년 : 4로 나누어 나머지가 0이고 100으로 또는 400으로 나누어 나머지가 0

public class ex_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();

		if((year%4==0 && year%100 !=0) || year%400==0) 
			System.out.println("윤년입니다.");
		else 
			System.out.println("평년입니다.");
		scan.close();
	}
}
