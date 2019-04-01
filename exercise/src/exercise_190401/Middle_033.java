package exercise_190401;
//3. "They is students.' 문자열에서 "is"를 "are"로 대체하는 StringSub1클래스를
//작성하세요
//
//<실행결과>
//문자열 입력 >> They is students
//결과 출력 >> They are students

import java.util.StringTokenizer;

class StringSub1{
	String str;
	StringTokenizer st;
	
	// 생성자
	public StringSub1(String str) {
		this.str = str;
	}
	
	// 변환
	
	public String change() {
		st = new StringTokenizer(str);
		String result;
		
		while (st.hasMoreTokens()) { // 다음 값이 있어?
			result=st.nextToken();	// 자른 부분을 담고
			if(result.equals("is")) {	// 비교
				System.out.print("are");  // o -> 변환
			}
			else {							// x -> 그대로 자른 부분 찍기
				System.out.print(result);
			}
			System.out.print(" ");
		}
		return null;
	}
	
}

public class Middle_033 {
	public static void main(String[] args) {
		// 1. 객체를 생성할 때 생성자로 str 보내기 - 선택
		// 2. change의 매개 변수로 보내기(is를 are로 변환하는 메서드)
		String str = "They is students";
		StringSub1 stringSub = new StringSub1(str);
		
		// void -> 메서드 sysout
		// String -> 메인 sysout -선택
		String result = stringSub.change();	
		System.out.println(result);
	}
}
