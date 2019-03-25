/* 
 * == 같은 객체를 가리킨다 (즉, hashcode가 같다 true)
 * equals 같은 내용인지 (즉, 문자열이 같으면 true)
 * */

/* String 클래스는 문자열의 내용이 같을 때 새로 객체를 만들지 않고
 * 같은 문자열을 가리키게 한다.
 * 동일한 문자열이 다수 반복되는 경우가 많으므로
 * 처음부터 메모리를 아끼려고 이렇게 설계했다.
 * */
public class _2_ImmutableString {
	public static void main(String[] args) {
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "My String";
		String str4 = "Your String";

		if (str1 == str2)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
		
		if (str1 == str3)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
		
		if (str1 == str4)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");


	}
}
