/*
 * String 클래스는 문자열의 변경이 불가능하다.
 * 				 그래서 문자열이 변경되면 새로 할당한다.
 * StringBuilder 클래스는 문자열의 변경이 가능하다.
 * 				 내부에 char[] 배열 공간이 존재한다.
 * 				 문자열의 크기가 늘어나면 자동으로 증가시켜준다.
 * StringBuffer도 마찬가지(단, 멀티스레드에 안전)
 * 				 
 * */

/* Java String과 StringBuilder 시간 비교
 * 
 */
public class _5_StringBuilder {
	public static void main(String[] args) {
		StringBuilder strBuf = new StringBuilder("AB");
		strBuf.append(25);
		System.out.println(strBuf);
		strBuf.append('Y').append(true);
		System.out.println(strBuf);
		
		strBuf.insert(2, false);
		System.out.println(strBuf);
		strBuf.insert(strBuf.length(), 'Z'); // 맨 뒤에 'Z' 추가 append('Z')
		System.out.println(strBuf);
	}
}
