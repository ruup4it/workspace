package exercise_190314;

import java.util.Scanner;

//3. 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50)과 (100, 100)의
//	두 점으로 이루어진 직사각형이 있다고 하자. 
//	이때 키보드로부터 다른 직사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력받아
//	두 개의 직사각형이 서로 충돌하는지 판별하는 프로그램을 작성하세요

public class ex_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(String.format("x1를 입력하세요"));
		int x1 = scan.nextInt();
		System.out.println(String.format("y1를 입력하세요"));
		int y1 = scan.nextInt();
		System.out.println(String.format("x2를 입력하세요"));
		int x2 = scan.nextInt();
		System.out.println(String.format("y2를 입력하세요"));
		int y2 = scan.nextInt();

		if (((x1 >= 50 && x1 <= 100) || (x2 >= 50 && x2 <= 100))
				&& ((y1 >= 50 && y1 <= 100) || (y2 >= 50 && y2 <= 100)))
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다.");
		scan.close();
	}
}
