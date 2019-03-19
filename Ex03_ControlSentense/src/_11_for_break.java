import java.util.Scanner;

/* 정수를 입력하라 
 * 입력 받은 숫자중에 3자리 수 (100~999)만 더해라
 * exit를 입력하면 더한 값을 출력하고 종료해라
 * */
public class _11_for_break {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String exit = "";
		int sum = 0;
		int num = 0;
		for (;;) {
			System.out.print("정수를 입력하세요 (종료 : exit) : ");
			// next() : 개행문자 미포함 / nextLine() : 개행문자 포함
			exit = scan.nextLine();
			if(exit.equals("exit")) 
				break;
			num = Integer.parseInt(exit);
			if(num / 100 > 0 && num / 100 < 10)
				sum += num;
		}
		System.out.println(sum);
		
		
		scan.close();
	}
}
