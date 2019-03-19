/* 연산자 우선순위
 * ; 절대로 연산자 우선 순위를 외워서는 안 된다.
 * 1) = (대입 연산자) 는 반드시 우측 모두 끝나고 좌측에 대입된다.
 * 2) 먼저 계산하고 싶은 대상은 반드시 ()괄호로 묶는다.
 * 
 * */

// 비교 연산자와 논리 연산자의 우선 순위
public class _13_OrderOp {
	public static void main(String[] args) {
		int num0 = 10, num1 = 20, num3 = 10;
		// if(같다면 or 같다면)
		// 만약 헷갈린다면
		//if (num0 == num1 || num0 == num3)
		if ((num0 == num1) || (num0 == num3))
			System.out.println("둘중에 하나는 같다");
	}
}
