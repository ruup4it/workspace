/* 1~100 ���� ���� Ȧ���� ¦���� ����
 * continue�� �̿��ؼ� ����ϼ���
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
		System.out.println("¦���� �� : " + evenSum + "\nȦ���� �� : " + oddSum);
	}
}
