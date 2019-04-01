package exercise_190329;

import java.util.Arrays;
import java.util.Scanner;

//1. 3개의 정수를 입력받고 작은 값을 반환하는 순서도를 그리세요
public class Middle_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i<3;i++) {
			System.out.println((i+1)+"번째 수를 입력하세요");
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
		scan.close();
	}
}
