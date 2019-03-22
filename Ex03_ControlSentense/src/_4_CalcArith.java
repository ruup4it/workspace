import java.util.Scanner;

/* 2개의 숫자를 double로 입력 (nextDouble)
 * 연산자 (+ - * /) (nextLine)
 * 결과 출력
 * */

// nextLine() : 개행 문자를 만났을 때 출력
// nextDouble() > 문자입력 받고 개행 문자도 받음
/* nextInt(), nextDouble() 같은 메서드를 사용한 이휴에
 * nextLine()을 사용하면 버퍼에 남아있는 \n 값을 읽어들이기 때문에
 * nextLine()가 바로 리턴해버린다.(입력 값을 받지 않고도)
 * 그러므로,
 * nextLine()을 호출하기 전에 nextLine()을 한 번 써주면 버퍼에 있는 \n을 
 * 읽어버리므로 그 다음 문자열이 잘 읽힌다.
 * 
 *  C#은 String일 경우는 == 와 Equals를 동일하게 내용물 비교로 구현
 *  Java는 반드시 내용(동일한 문자열인지)을 비교할 때는 equals를 써야만한다.
 *  == : 같은 객체를 참조하는가
 *  equals : 내용물이 같은가 
 *  
 * 1. nextDouble() 사이에 nextLine 넣어주기
 * 2. 연산자 next()로 받기
 * 3. string 값으로 받고(nextLine()) 형변환 Double.parseDouble()해주기
 * */
public class _4_CalcArith {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0;
		
		System.out.println("첫 번째 숫자를 입력하세요");
		double num1 = Double.parseDouble(scan.nextLine());
		
		System.out.println("두 번째 숫자를 입력하세요");
		double num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("연산자를 입력하세요");
		String op = scan.nextLine();
		// String op = scan.next();
		
		/*
		System.out.println("첫 번째 숫자를 입력하세요");
		double num1 = scan.nextDouble();
		scan.nextLine(); // \n 제거를 위함
		System.out.println("두 번째 숫자를 입력하세요");
		double num2 = scan.nextDouble();
		scan.nextLine(); // \n 제거를 위함
		System.out.println("연산자를 입력하세요");
		String op = scan.nextLine();
		// String op = scan.next();
		 * */

		/* switch 방식
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		*/
		
		if (op.equals("+"))
			result = num1 + num2;
		else if (op.equals("-"))
			result = num1 - num2;
		else if (op.equals("*"))
			result = num1 * num2;
		else if (op.equals("/"))
			result = num1 / num2;
		
		System.out.println(result);
		scan.close();

	}
}
