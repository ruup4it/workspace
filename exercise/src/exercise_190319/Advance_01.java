package exercise_190319;

import java.util.Arrays;
import java.util.Scanner;

//1. 이진 검색을 재귀호출로 작성하세요
public class Advance_01 {
	public static int binarySearch(int target, int min, int max, int[] arr) {
		int mid = (max + min) / 2; 							// 중간 값 구하기

		if (arr[mid] == target) 							// 1. 중간 값이 타겟과 일치 한다면
			return mid; 									// 	    중간 값 반환

		else if (min >= max) 								// 2. min(범위 중 가장 작은 값)이 max(범위 중 가장 큰 값)보다 크거나 같다면
			return -1; 										// 	  -1 반환하기

		else if (arr[mid] < target)							// 3. 중간 값이 타겟보다 작다면
			return binarySearch(target, mid + 1, max, arr); // 	  min을 현재 mid 값보다 한 칸 앞으로 바꾸고 재귀호출
															//    (현재 mid 값이 target과 일치하지 않음을 체크한 상태니까)

		else 												// 4. 중간 값이 타겟보다 크다면
			return binarySearch(target, min, max - 1, arr); //    max를 현재 mid 값보다 한 칸 뒤로 바꾸고 재귀 호출 
															//    (현재 mid 값이 target과 일치하지 않음을 체크한 상태니까)
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				// 입력을 받기위한 Scanner 객체 선언
		int target = 0; 									// 찾고자 하는 값을 담아줄 변수 초기화
		int[] arr = new int[100]; 							// 배열 초기화
		int min = 0; 										// 검색할 범위 중 가장 작은 값 초기화 
		int max = arr.length - 1; 							// 검색할 범위 중 가장 큰 값 초기화
		int result = 0;										// 찾았는 지 아닌 지 결과 값 초기화
		
		// 배열을 랜덤으로 생성된 수로 채워주기
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 1000 + 1);
		}
		
		// 배열 오름차순 정렬하기
		Arrays.sort(arr);

		// 생성된 배열 출력해주기
		System.out.println("생성된 배열");
		System.out.println(Arrays.toString(arr));
		System.out.println();

		// 찾고자하는 수 입력 받기
		System.out.println("찾고자 하는 수를 입력하세요");
		target = sc.nextInt();

		// 이진 검색용 재귀함수 호출후 결과 값 얻기
		result = binarySearch(target, min, max, arr);

		// 값이 있는 지 없는 지 체크하기
		if (result == -1) {
			System.out.println("값이 없습니다.");
		} else
			System.out.println((result + 1) + "번째 있습니다.");

		sc.close();
	}

}
