package exercise_190318;

import java.util.Arrays;

//3. 구구단의 결과값을 int 8행 9열의 2차원 배열에 저장하고 출력하세요
public class Advance_03 {

	public static void main(String[] args) {
		int[][] array = new int[8][9];
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				array[i - 2][j - 1] = i * j;
			}
		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + array[i - 2][j - 1]);
			}
		}
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + array[i - 2][j - 1] +"\t");
			}
			System.out.println();
		}


	}

}
