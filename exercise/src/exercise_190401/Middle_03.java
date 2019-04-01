package exercise_190401;

import java.util.StringTokenizer;

//3. "They is students.' 문자열에서 "is"를 "are"로 대체하는 StringSub클래스를
// 작성하세요
//
//  <실행결과>
//  문자열 입력 >> They is students
//  결과 출력 >> They are students

class StringSub {
	String strData;

	StringSub(String strData) {
		this.strData = strData;
	}

	String change() {
		//StringBuilder result = new StringBuilder(strData);
		//result.replace(5, 7, "are");

		String temp = "";
		StringTokenizer st = new StringTokenizer(strData);
		StringBuilder result = new StringBuilder();
		while (st.hasMoreTokens()) {
			temp = st.nextToken();
			if (temp.equals("is"))
				result.append("are");
			else
				result.append(temp);
			result.append(" ");
		}
		return result.toString();

	}
}

public class Middle_03 {
	public static void main(String[] args) {
		String str = "They is students";
		StringSub stringSub = new StringSub(str);
		System.out.println("변환 전 : " + str);
		System.out.println("변환 후 : " + stringSub.change());
	}
}
