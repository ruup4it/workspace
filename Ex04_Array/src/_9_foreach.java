import java.util.Arrays;

/* 현업에서 마찬가지인데
 * for문에서 가장 많이 쓰이는 문법은
 * for(int i=0; i<10; i++)
 * */
public class _9_foreach {

	public static void main(String[] args) {
		int[] scores = {89, 99, 100, 21, 10};
		System.out.println(Arrays.toString(scores));
		
		// for문을 이용한 접근
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		System.out.println();
		
		// foreach를 이용한 접근
		for(int score : scores) {
			System.out.print(score+" ");
		}
	}

}
