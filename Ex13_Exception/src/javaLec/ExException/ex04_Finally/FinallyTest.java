package javaLec.ExException.ex04_Finally;

public class FinallyTest {
	public static boolean divider(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("나눗셈 결과는 " + result);
			return true;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}
		/* 예외발생 유무와 관계없이 무조건 실행되는 영역
		 * close();
		 * */
		finally {
			System.out.println("finally 영역 실행");
		}
	}
	public static void main(String[] args) {
		boolean divOK = divider(4, 2);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
		
		divOK = divider(4, 0);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
	}
}









