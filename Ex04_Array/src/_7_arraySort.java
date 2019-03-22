import java.util.Arrays;
/* 배열의 정렬
 * 둘 다 오름차순 정렬 (작은 것 -> 큰 것)
 * Arrays.sort();			// 데이터가 적을 때
 * Arrays.parallelSort();	// 데이터가 많을 때\
 * 
 * 한 번에 문자열로 배열의 데이터를 확인하려고 할 때
 * Arrays.toString(scores) -> 배열의 모든 값이 문자열
 * */
public class _7_arraySort {
	public static void main(String[] args) {
		int[] scores = {98, 12, 52, 68, 78, 98, 99, 100, 23, 65};
		System.out.println(Arrays.toString(scores));
		// 정렬
		Arrays.sort(scores);
		// Arrays.parallelSort(scores);
		System.out.println(Arrays.toString(scores));
	}
}
