package exercise_190401;

import java.util.Scanner;
    
//1. 두 수를 입력받고 최대 공약수를 출력는 순서도를 그리세요 

public class Basic_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		int first = scan.nextInt();
		System.out.println("두 번째 수를 입력하세요");
		int second = scan.nextInt();
		
		int max=0, min=0, n=0;
		
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		while (min != 0) {
			n = max % min;
			max = min;
			min = n;
		}
		
		System.out.println("두 수의 최대 공약수는 " + max + "입니다.");
		
		scan.close();
	}
}
