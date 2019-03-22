/* break, continue는 제어문과 결합해서 사용한다.
 * break : 가장 가까운 (나를 감싼) 반복문을 탈출
 * continue : 더 이상 아래로 계속 가지 말고 돌아가서 계속 진행
 * */

// 0부터 9까지 숫자 중 5 이상인 숫자만 출력
public class _12_continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i<5) 
				continue;
			System.out.print(i);
		}
	}
}
