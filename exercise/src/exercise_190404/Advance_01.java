package exercise_190404;

import java.util.Arrays;
import java.util.Scanner;

//1. main메서드에서는 프로그램 사용자로부터 총 다섯개의 정수를 배열로 입력받고
//별도로 생성된 하나의 쓰레드에게 전달하고, 별도로 생성된 쓰레드는 전달받은 수의 총합을 계산해서
//그 결과를 출력하는 프로그램을 작성해보세요.
//이 문제는 main 메서드를 실행하는 main쓰레드와
//main쓰레드로부터 전달받은 수의 총합을 계산하는 별도의 쓰레드간 
//동기화에 관련된 문제이다.

class PrintAddThread extends Thread {
	int[] arr;
	int sum = 0;

	PrintAddThread(int[] arr) {
		this.arr = arr;
	}

	public int getSum() {
		return sum;
	}

	public void run() {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
	}
}

public class Advance_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 " + "[" + (i + 1) + "/3] 입력: ");
			arr[i] = scan.nextInt();
		}
		PrintAddThread at1 = new PrintAddThread(arr);
		at1.start();
		try {
			at1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("입력 배열 : " + Arrays.toString(arr));
		System.out.println("총 합 : " + at1.getSum());
	}
}
