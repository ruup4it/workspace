/* 잘못된 재귀호출 사용의 예시
 * StackOverFlowError
 */
public class _14_InfRecul {
	public static void main(String[] args) {
		showHi(3);
	}
//	// 자기자신을 계속 호출하면서 값이 증감하지 않고 3으로 머물러있음
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(cnt--); 
//			return;
//	}
//	 // 1을 검사하기 전에 다시 호출하므로 계속 반복됨
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(--cnt);
//		if(cnt==1)
//			return;
//	}
	public static void showHi(int cnt) {
		System.out.println("Hi~");
		if(cnt==1)
			return;
		showHi(--cnt);
	}
}
