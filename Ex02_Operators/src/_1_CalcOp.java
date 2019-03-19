/* 1) 산술 연산자 ( + - * / % ) 계열
  		증감 연산자, 부호 연산자
 * 2) 비교 연산자 ( == != > < >= <= ) 계열
		논리 연산자
 * 3) 비트 연산자
  		비트 논리 연산자, 비트 이동 연산자
 * 4) 기타 연산자 :
		조건 연산자(삼항 연산자)
 * */
public class _1_CalcOp {
	public static void main(String[] args) {
		int x = 33;
		int y = 20;
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		System.out.println("-x = " +-x);
	}
}
