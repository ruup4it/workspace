﻿package star;


public class square {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
			for (int j = 0; j < 8; j++) {
				if (i == 0 || i == 9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
