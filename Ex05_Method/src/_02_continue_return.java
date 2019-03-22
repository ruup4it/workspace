/* continue는 반복문을 돌려보내서 계속 실행하지만
 * return은 함수를 호출한 곳으로 돌려보낸다(즉, 끝낸다)
 * */
public class _02_continue_return {
	public static void main(String[] args) {
		System.out.println("=========continue=========");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println("\n==========return==========");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0)
				return;
			System.out.print(i + " ");
		}
	}
}
