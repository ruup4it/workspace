package exercise_190319;
//2. RectangleŬ������ �ۼ��ϼ���

import java.util.Scanner;

//intŸ���� x1, y1, x2, y2 : �簢���� �����ϴ� �� ���� ��ǥ
//void set(int x1, int y1, int x2, int y2) : ��ǥ ����
//int square() : �簢�� ���� ����
//void show() : ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
//boolean equals(Rectangle r) : ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ��ǥ�� ���簢���̸� true ����

class Rectangle {
	// �簢���� �����ϴ� �� ���� ��ǥ
	int x1;
	int y1;
	int x2;
	int y2;

	// ��ǥ ����
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// �簢�� ���� ����
	public int square() {
		int horizontal = x1 - x2 > 0 ? x1 - x2 : -(x1 - x2);
		int Vertical = y1 - y2 > 0 ? y1 - y2 : -(y1 - y2);
		return horizontal * Vertical;
	}

	// ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
	public void show() {
		System.out.println(String.format("��ǥ1 : (%d, %d) \n��ǥ2 : (%d, %d)", x1, y1, x2, y2));
	}

	// ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ��ǥ�� ���簢���̸� true ����
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

		System.out.println("ù ��° �簢��");
		rec1.set(50, 50, 100, 100);
		rec1.show();
		System.out.println(String.format("���� : %d\n", rec1.square()));

		do {
			System.out.println("���� �簢�� �Է��ϱ�");
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
			System.out.println("[����ϱ� : 1] [�׸� : 2]");
			check = scan.nextInt();
		} while (check != 2);

		scan.close();
	}

}
