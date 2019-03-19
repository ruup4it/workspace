package exercise_190313;

import java.util.Scanner;

//3. 돈의 액수를 입금하세요
// 입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
// 출력 개수는 단위가 큰 것 순서로 계산합니다
// 예를 들어 78670원이면 
// <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
public class ex_03_ArrayList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int price = scan.nextInt();
		
		int [] money = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int [] priceResult = new int [9];
		
		for(int i=0; i<money.length; i++) {
			priceResult[i] = price/money[i];
			price = price%money[i];
			System.out.println(money[i] + " : " + priceResult[i]);
		}
		
		scan.close();
	}
}
