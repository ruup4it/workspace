package javaLec.ExUsefulClass.ex01_WrapperClass;

import java.math.BigDecimal;

public class DoubleError {
	public static void main(String[] args) {
		double e1 = 1.6;
		double e2 = 0.1;
		System.out.println("두 실수의 덧셈 : " + (e1 + e2));
		System.out.println("두 실수의 곱셈 : " + (e1 * e2));
		
		// 매개변수에 전달될 때 이미 Error가 발생
		BigDecimal b1 = new BigDecimal(1.6);
		BigDecimal b2 = new BigDecimal(0.1);
		System.out.println("두 실수의 덧셈 : " + b1.add(b2));
		System.out.println("두 실수의 곱셈 : " + b1.multiply(b2));
		
		// 오차 없는 실수 표현을 하는데 
		// 반드시 문자열로 값을 전달해야한다.
		BigDecimal b3 = new BigDecimal("1.6");
		BigDecimal b4 = new BigDecimal("0.1");
		System.out.println("두 실수의 덧셈 : " + b3.add(b4));
		System.out.println("두 실수의 곱셈 : " + b3.multiply(b4));

	}
}
