/*	<<재귀 호출>>
 * 자기 자신을 계속 호출한다
 * 하노이탑, 이진탐색과 같은 반복적인 논리를 수행할때 사용
 * 주의사항) 종료 조건을 명시하지 않으면 스텍에 메모리가 계속 쌓여 에러 발생
 */
public class _13_ReculFactorial {
	public static void main(String[] args) {
		// for문을 이용한 팩토리얼
		System.out.println(forFactorial(5));
		
		// 재귀호출을 이용한 팩토리얼
		System.out.println(factorial(5));
	}
	
	public static int forFactorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++)
			fact *= i;
		return fact;
	}
	public static int factorial(int num) {
		if (num==1)
			return 1;
		else
			return num*factorial(num-1);
	}

}
