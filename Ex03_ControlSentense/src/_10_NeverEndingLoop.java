import java.util.Scanner;

/* 무한루프
 * if조건 + break문과 같이 사용될 경우가 많다.
 * 1) while(true)
 * 
 * 2) do{
 * 	  }while(true);
 * 
 * 3) for(;;)
 * */

//숫자를 입력 받아라
//입력받은 숫자를 더해라 
//-1이 입력되면 더한 숫자를 출력하고 
//종료해라
public class _10_NeverEndingLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		// 무한 루프
		for(;;) {
			System.out.print("숫자 입력 (-1이면 종료) : ");
			num = scan.nextInt();
			sum += num;
			if(num == -1)
				break;
		}
		System.out.println("누적 값 :" + sum);
		scan.close();
	}
}
