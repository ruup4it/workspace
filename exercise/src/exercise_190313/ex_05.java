package exercise_190313;

import java.util.Scanner;

/*5. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
삼각형이 가능하려면 두 변의 합이 다른 한 변의 길이보다 반드시 커야 합니다. (조건 연산자를 사용하세요)*/
public class ex_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max =0;
		int sum = 0;
		System.out.println("정수를 입력하세요 ");
		num1 = scan.nextInt();
		System.out.println("정수를 입력하세요 ");
		num2 = scan.nextInt();
		System.out.println("정수를 입력하세요 ");
		num3 = scan.nextInt();
		sum = num1+num2+num3;
		

		for(int i=0; i<3;i++) {
			if (num1 > max) 
				max =num1;
			else if(num2 >max)
				max=num2;
			else if(num3>max)
				max=num3;
		}
		
		
		String result = max <sum-max ? "삼각형 맞습니다" : "삼각형 아닙니다";
		
		System.out.println(result);
		scan.close();
	}
}
