import java.util.Scanner;

public class _5_switch_case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		System.out.println("월을 입력하세요");
		month = scan.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("초여름");
			break;
		case 7:
		case 8:
			System.out.println("한여름");
			break;
		case 9:
			System.out.println("초가을");
			break;
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("초봄");
			break;
		default:
			System.out.println("월이 잘못 입력되었습니다.");
			break;
		}
		scan.close();
	}
}
