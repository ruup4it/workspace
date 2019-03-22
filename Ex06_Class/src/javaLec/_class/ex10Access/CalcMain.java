package javaLec._class.ex10Access;

import java.util.Scanner;

import javaLec._class.ex09Access.Calculator;

public class CalcMain {
	public static void main(String[] args) {
		// Random rand = new Random();
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int num1 = (int) Math.random() * 10 + 1;
			int num2 = (int) Math.random() * 10 + 1;
			// int num1 = rand.nextInt(10)+1;
			// int num2 = rand.nextInt(10)+1;
			System.out.println("=================");
			System.out.print("[µ¡¼À : 1] [»¬¼À : 2] : ");
			int sel = scan.nextInt();
			System.out.println(String.format("num1 = %d, num2 = %d",num1, num2));
			if (sel == 1)
				
				System.out.println(String.format("µ¡¼À °á°ú : %d",cal.addTwoNumber(num1, num2)));
			else 
				System.out.println(String.format("»¬¼À °á°ú : %d", cal.subTwoNumber(num1, num2)));
		}
		System.out.println("=================");
		cal.showOperatingTimes();
		scan.close();
	}
}
