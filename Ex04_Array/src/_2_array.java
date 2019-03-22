import java.util.Arrays;

/* 힙에 올라가는 메모리는 
 * JVM 내의 Garbage Collector(쓰레기 수집기)에 의해
 * 내부 알고리즘이 적용되어 알아서 해제된다.
 * 
 * kor이 가리키는 5개의 데이터 영역은 GC가 해제
 * 
 * 스택에 올라간 메모리는 해당 영역이 끝날 때 소멸된다.
 * stnum과 kor은 main 메서드가 끝날 때 즉시 소명
 * */
public class _2_array {
	public static void main(String[] args) {
		//int stNum = 5 ; // 스택에 올라간다.
		int[] korScore = new int[5]; // 힙에 올라간다.
		korScore[0] = 88;
		korScore[1] = 99;
		korScore[2] = 90;
		korScore[3] = 87;
		korScore[4] = 79;
		
		// 16진수 hashCode 값
		// JVM에 의해 실제 공간을 접근하기 위해
		// 해석되는 약속 숫자 기호
		System.out.println(korScore);
		System.out.println(Arrays.toString(korScore));
	}
}
