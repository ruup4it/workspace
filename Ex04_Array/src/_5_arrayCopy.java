import java.util.Arrays;
/* 배열 변수에 다른 배열을 대입하면
 * hashCode 값만 복사되므로
 * 같은 힙의 공간을 가리키게 된다.
 *
 * <깊은 복사>
 * Arrays.copyOf(배열명, 길이)
 * Arrays 클래스 이용
 * Arrays.copyOf의 도움을 받으면 깊은 복사가 일어난다
 * 즉, 힙 메모리에 배열 공간이 할당되고 값이 복제된다.
 * 복제된 배열을 가리키는 참조변수는 다른 hashCode를 가지게 된다.
 * */
public class _5_arrayCopy {
	public static void main(String[] args) {
		int[] scores = {100, 88, 95, 65, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		for(int i=0; i<scores2.length;i++) {
			System.out.println(scores2[i]+", ");
		}
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores));
		
		// 얕은 복사일 때 나타나는 현상
		scores[0] = 30;
		System.out.println(scores1[0]);
		System.out.println(scores2[0]);
		
		// 깊은 복사?
		int[] scores4 = 
				Arrays.copyOf(scores, scores.length);
		for(int i=0; i<scores4.length;i++) {
			System.out.println(scores2[i]+", ");
		}
		scores4[0] = 70;
		System.out.println(scores);
		System.out.println(scores4);
	}
}
