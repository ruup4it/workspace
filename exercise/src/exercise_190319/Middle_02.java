package exercise_190319;
//2. Rectangle클래스를 작성하세요

import java.util.Scanner;

//int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
//void set(int x1, int y1, int x2, int y2) : 좌표 설정
//int square() : 사각형 넓이 리턴
//void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
//boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴

class Rectangle {
	// 사각형을 구성하는 두 점의 좌표
	int x1;
	int y1;
	int x2;
	int y2;

	// 좌표 설정
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// 사각형 넓이 리턴
	public int square() {
		int horizontal = x1 - x2 > 0 ? x1 - x2 : -(x1 - x2);
		int Vertical = y1 - y2 > 0 ? y1 - y2 : -(y1 - y2);
		return horizontal * Vertical;
	}

	// 좌표와 넓이 등 직사각형 정보의 화면 출력
	public void show() {
		System.out.println(String.format("좌표1 : (%d, %d) \n좌표2 : (%d, %d)", x1, y1, x2, y2));
	}

	// 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
	public boolean equals(Rectangle r) {
		int r1XMin = x1 < x2 ? x1 : x2;
		int r1YMin = y1 < y2 ? y1 : y2;
		int r2XMin = r.x1 < r.x2 ? r.x1 : r.x2;
		int r2YMin = r.y1 < r.y2 ? r.y1 : r.y2;
		
		int r1XMax = x1 > x2 ? x1 : x2;
		int r1YMax = y1 > y2 ? y1 : y2;
		int r2XMax = r.x1 > r.x2 ? r.x1 : r.x2;
		int r2YMax = r.y1 > r.y2 ? r.y1 : r.y2;

		if ((r1XMin == r2XMin && r1YMin == r2YMin)&&(r1XMax == r2XMax && r1YMax == r2YMax))
			return true;
		else
			return false;
	}
}

public class Middle_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int check = 1;
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();

		System.out.println("첫 번째 사각형");
		rec1.set(50, 50, 100, 100);
		rec1.show();
		System.out.println(String.format("넓이 : %d\n", rec1.square()));

		do {
			System.out.println("비교할 사각형 입력하기");
			System.out.print("X1 : ");
			int inputX1 = scan.nextInt();
			System.out.print("Y1 : ");
			int inputY1 = scan.nextInt();
			System.out.print("X2 : ");
			int inputX2 = scan.nextInt();
			System.out.print("Y2 : ");
			int inputY2 = scan.nextInt();
			rec2.set(inputX1, inputY1, inputX2, inputY2);
			System.out.println(rec1.equals(rec2));
			System.out.println("[계속하기 : 1] [그만 : 2]");
			check = scan.nextInt();
		} while (check != 2);

		scan.close();
	}

}
