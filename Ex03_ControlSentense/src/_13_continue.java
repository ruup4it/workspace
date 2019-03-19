/* continue를 사용해서 문제를 해결하라
 * 1부터 100까지 중에 짝수만 출력하라
 * */
public class _13_continue {
	public static void main(String[] args) {
		// 방법 1) %
		// i % 2 != 0 > continue
		// i % 2 == 1 > continue
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		
		/*// 방법 2) += 2
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
		*/
	}
}
