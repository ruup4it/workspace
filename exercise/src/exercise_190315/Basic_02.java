package exercise_190315;

//2. 1부터 10까지 곱해서 그 결과를 출력하는 프로그램을 작성하세요
public class Basic_02 {
	public static void main(String[] args) {
		int mul = 1;
		for(int i= 1; i<=10;i++) {
			mul *= i;
		}
		System.out.println(mul);
	}
}
