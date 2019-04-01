package exercise_190401;

//1. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램의 순서도를 그리세요

public class Middle_01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j == 9) {
					System.out.println(String.format("%d%d + %d%d = %d%d", i,j,j,i,i+j,j+i));
				}
			}
		}
	}
}
