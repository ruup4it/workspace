import java.util.Scanner;

/* ������ �Է� �޴´�.
 * 90�� �̻��̸� A
 * 80�� �̻��̸� B
 * 70�� �̻��̸� C
 * 60�� �̻��̸� D
 * 60�� �̸��̸� F
 * */

public class _2_ifScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		String result = score >= 90 ? "A" : 
						score >= 80 ? "B" : 
						score >= 70 ? "C" : 
						score >= 60 ? "D" : "F";
		System.out.println(result);
		scan.close();
	}
}
