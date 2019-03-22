/* 1~100 까지 각각 홀수와 짝수의 합을
 * continue를 이용해서 출력하세요
 * */
public class _14_continue {
	public static void main(String[] args) {
		int oddSum = 0, evenSum = 0;
		
		for(int i = 1; i <= 100; i ++) {
			if(i % 2 == 0) {
				evenSum += i;
				continue;
			}
			oddSum += i;
		}
		System.out.println("짝수의 합 : " + evenSum + "\n홀수의 합 : " + oddSum);
	}
}
