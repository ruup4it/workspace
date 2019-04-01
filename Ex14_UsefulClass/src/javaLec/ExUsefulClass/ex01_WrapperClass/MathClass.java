package javaLec.ExUsefulClass.ex01_WrapperClass;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("원주율: " + Math.PI);
		System.out.println("2의 제곱근: " + Math.sqrt(2));
		System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 Degree: " + Math.toDegrees(2.0 * Math.PI));
		double radian45 = Math.toRadians(45);
		System.out.println("사인 45: " + Math.sin(radian45));
		System.out.println("코사인 45: " + Math.cos(radian45));
		System.out.println("탄젠트 45: " + Math.tan(radian45));
		System.out.println("로그 25: " + Math.log(25));
		System.out.println("2의 4승: " + Math.pow(2, 4));
	}
}
