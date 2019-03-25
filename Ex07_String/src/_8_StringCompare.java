/* 같지 않다 표현 
 * str1이 str4와 다를 경우
 * !str1.equals(str4)
 * str1.equals(str4) == false
 * str1.compareTo(str4)!=0
 * */
/*
 * compareTo는 같은 문자열이면 0을 리턴 
 * 사전상순서(알파벳 정렬순서) 앞에 위치하면 음수 
 * 사전상순서(알파벳 정렬순서) 뒤에 위치하면 양수를 리턴한다.
 */
public class _8_StringCompare {

	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = "Smart";
		String str3 = new String("Smart");
		String str4 = "Simple";

		// 인스턴스(객체) 비교
		System.out.println("#인스턴스(객체) 비교 ==");
		if (str1 == str2)
			System.out.println("str1과 str2 인스턴스 같음");
		if (str1 == str3)
			System.out.println("str1과 str3 인스턴스 같음");
		if (str1 == str4)
			System.out.println("str1과 str4 인스턴스 같음");
		System.out.println();

		// 문자열 내용 비교
		System.out.println("#문자열 내용 비교 equals.()");
		if (str1.equals(str2))
			System.out.println("str1과 str2 문자열 같음");
		if (str1.equals(str3))
			System.out.println("str1과 str3 문자열 같음");
		if (str1.equals(str4))
			System.out.println("str1과 str4 문자열 같음");
		System.out.println();

		// 문자열 내용 비교
		/*
		 * compareTo는 같은 문자열이면 0을 리턴 사전상순서(알파벳 정렬순서) 앞에 위치하면 음수 뒤에 위치하면 양수를 리턴한다.
		 */
		System.out.println("#문자열 내용 비교 compareTo()");
		if (str1.compareTo(str2) == 0)
			System.out.println("str1과 str2 문자열 같음");
		if (str1.compareTo(str3) == 0)
			System.out.println("str1과 str3 문자열 같음");

		int nCmp = str1.compareTo(str4);
		if (nCmp == 0)
			System.out.println("str1과 str4 문자열 같음");
		else if (nCmp < 0)
			System.out.println("str1은 str4의 앞에 위치");
		else
			System.out.println("str1은 str4의 뒤에 위치");

	}
}
