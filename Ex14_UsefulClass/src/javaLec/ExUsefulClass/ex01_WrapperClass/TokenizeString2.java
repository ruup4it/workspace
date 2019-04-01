package javaLec.ExUsefulClass.ex01_WrapperClass;

import java.util.StringTokenizer;

public class TokenizeString2 {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-997-2059";
		String javaCode = "num+=1";
		// default는 공백문자이다.
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		while (st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		// 공백문자와 -를 둘다 token으로 삼는다.
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		StringTokenizer st3 = new StringTokenizer(javaCode, "+=", true);
		while (st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		StringTokenizer st4 = new StringTokenizer(javaCode, "+=", false);
		while (st4.hasMoreTokens())
			System.out.println(st4.nextToken());
		
	}
}
