package exercise_190314;

import java.util.Scanner;

public class ex_03_collision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x_pos1, x_pos2;
		int y_pos1, y_pos2;
		int Xmin, Xmax;
		int Ymin, Ymax;

		System.out.println("�簢���� �� ���� �Է��ϼ���");
		System.out.println("ù��° ���� �Է��ϼ���");
		x_pos1 = sc.nextInt();
		y_pos1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
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
			System.out.println("�浹�մϴ�.");
		} else if (((Xmax >= 50 && Xmax <= 100) && (Ymin >= 50 && Ymin <= 100))
				|| ((Xmax >= 50 && Xmax <= 100) && (Ymax >= 50 && Ymax <= 100))) {
			System.out.println("�浹�մϴ�.");
		} else if (((Xmin <= 50 && Xmax >= 100) && (Ymin <= 50 && Ymax >= 100))) {
			System.out.println("�浹�մϴ�.");
		} else
			System.out.println("�浹 ���մϴ�.");
		sc.close();
	}
}

/*
 * 
 * 3. 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�. (50, 50)�� (100, 100)�� �� ������ �̷���� ���簢���� �ִٰ�
 * ����. �̶� Ű����κ��� �ٸ� ���簢���� �����ϴ� �� ��(x1, y1), (x2, y2)�� �Է¹޾� �� ���� ���簢���� ���� �浹�ϴ���
 * �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���
 * 
 */