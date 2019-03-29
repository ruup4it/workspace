package exercise_190328;

//3. String str = "ABCDEFGHIJKLMN" 을 StringBuilder를 사용하여 
//역순으로 출력하세요
public class Middle_03 {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		StringBuilder arr = new StringBuilder(str);
		System.out.println(arr.reverse());
		
		
		/*
		String[] strArr = str.split("");
		StringBuilder strBuilder = new StringBuilder();
		for (int i = strArr.length - 1; i >= 0; i--) {
			strBuilder.append(strArr[i]);
		}
		System.out.println(strBuilder.toString());
		*/
	}
}
