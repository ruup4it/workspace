import java.util.Arrays;

public class _3_InitializeArray {

	public static void main(String[] args) {
		// 배열의 초기화
		// 이렇게 썼다고 해서 스택에 올라가는 것은 아니다.
		// int[] korScore = new int[5]와 같이 
		// 힙에 올라간다
		// 단, 워낙 배열은 초기화값을 넣어두는 경우가 
		// 많기 때문에 이런 문법을 허용한 것이다.
		int[] korScore = {99, 88, 90, 39, 86};
		System.out.println(Arrays.toString(korScore));
		for(int i=0;i<korScore.length;i++) {
			System.out.println(String.format("%d",korScore[i]));
		}
	}
}
