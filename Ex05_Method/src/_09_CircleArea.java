import java.util.Scanner;

/* ���� �������� �Է¹޴´�
 * ���� ���� ���ϴ� �ż��� ����
 * ���� �ѷ� ���ϴ� �ż��� ����
 */
public class _09_CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ����
		double r=0, area=0, round=0;
		// �ż��� ����
		r = inputRadius(sc,r);
		calcArea(r);
		calcRound(r);
		area = calcArea(r);
		round = calcRound(r);
		System.out.println("���� ���̴� "+area+"�Դϴ�");
		System.out.println("���� ���̴� "+round+"�Դϴ�");
		sc.close();
	}
	// ������ �Է¹޴� �ż���
	public static double inputRadius(Scanner sc,double r2) {

		
		System.out.println("�������� ���� �Է�: ");
		double r = sc.nextDouble();
		return r;
	}
	public static double calcArea(double r) {
		return r*r*3.14;
	}
	public static double calcRound(double r) {		
		return 2*r*3.14;
	}
}
