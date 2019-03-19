package exercise_190313;

import java.util.Scanner;

//4. 369게임을 작성합니다.
//1~99까지의 정수를 입력받고
//3,6,9중 하나가 있으면 "박수짝"을 출력하고
//2개가 있으면 "박수짝짝"을 출력하세요
//예를 들어 13은 "박수짝"
//36인 경우는 "박수짝짝"을 출력하면 됩니다.
public class ex_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0; 
		System.out.println("1~99까지의 정수를 입력하세요");
		int inputNum = scan.nextInt();
		int num10 = inputNum / 10 ;
		int num1 = inputNum % 10;
		
		if((num10!=0)&&(num10 % 3 == 0))
			count ++;
		if(num1!=0 && num1 % 3 == 0)
			count ++;
		
//		if((num10!=0)&&(num10 % 3 == 0))
//			count ++;
//		if(num1 % 3 == 0)
//			count ++;
		
		switch(count)
		{
			case 1:
				System.out.println("박수짝");
				break;
			case 2:
				System.out.println("박수짝짝");
				break;
			default :
				System.out.println("3,6,9 값이 없습니다.");
		}
		scan.close();
	}
}
