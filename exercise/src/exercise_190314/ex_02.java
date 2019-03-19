package exercise_190314;

import java.util.Scanner;

//2. 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
//	(50, 50)과 (100, 100)의 두 점으로 이루어진 사각형이 있다고 하자.
//	이 때 키보드로부터 한 점을 구성하는 정수 x와 y를 입력받고
//	점(x, y)가 이 직사각형 안에 있는지 밖에 있는지 판별하는 프로그램을
//	작성하세요
public class ex_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x를 입력하세요");
		int x = scan.nextInt();
		System.out.println("y를 입력하세요");
		int y = scan.nextInt();
		
		if((x>50 && x<100) && (y>50 && y<100)) 
			System.out.println("직사각형 내부에 있습니다.");
		else
			System.out.println("직사각형 내부에 없습니다.");
		scan.close();

	}

}
