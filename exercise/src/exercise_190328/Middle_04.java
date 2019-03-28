package exercise_190328;

//4. 다음의 형태로 표현된 2차원 배열이 존재합니다
//1 2 3
//4 5 6
//7 8 9
//
//이러한 int형 2차원 배열이 parameter로 전달되면, 다음의 형태로 배열의 구조를
//변경시키는 메서드를 정의해보세요
//7 8 9
//1 2 3
//4 5 6
public class Middle_04 {
	public static int[][] change(int[][] arr) {
		int[] temp = arr[2];
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;

		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		change(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
