package exercise_190314;

import java.util.Scanner;

public class ex_03_collision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x_pos1, x_pos2;
		int y_pos1, y_pos2;
		int Xmin, Xmax;
		int Ymin, Ymax;

		System.out.println("사각형의 두 점을 입력하세요");
		System.out.println("첫번째 점을 입력하세요");
		x_pos1 = sc.nextInt();
		y_pos1 = sc.nextInt();
		System.out.println("두번째 점을 입력하세요");
		x_pos2 = sc.nextInt();
		y_pos2 = sc.nextInt();
		if (x_pos1 > x_pos2) {
			Xmin = x_pos2;
			Xmax = x_pos1;
		} else {
			Xmin = x_pos1;
			Xmax = x_pos2;
		}
		if (y_pos1 > y_pos2) {
			Ymin = y_pos2;
			Ymax = y_pos1;
		} else {
			Ymin = y_pos1;
			Ymax = y_pos2;
		}
		if (((Xmin >= 50 && Xmin <= 100) && (Ymin >= 50 && Ymin <= 100))
				|| ((Xmin >= 50 && Xmin <= 100) && (Ymax >= 50 && Ymax <= 100))) {
			System.out.println("충돌합니다.");
		} else if (((Xmax >= 50 && Xmax <= 100) && (Ymin >= 50 && Ymin <= 100))
				|| ((Xmax >= 50 && Xmax <= 100) && (Ymax >= 50 && Ymax <= 100))) {
			System.out.println("충돌합니다.");
		} else if (((Xmin <= 50 && Xmax >= 100) && (Ymin <= 50 && Ymax >= 100))) {
			System.out.println("충돌합니다.");
		} else
			System.out.println("충돌 안합니다.");
		sc.close();
	}
}

/*
 * 
 * 3. 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50)과 (100, 100)의 두 점으로 이루어진 직사각형이 있다고
 * 하자. 이때 키보드로부터 다른 직사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력받아 두 개의 직사각형이 서로 충돌하는지
 * 판별하는 프로그램을 작성하세요
 * 
 */