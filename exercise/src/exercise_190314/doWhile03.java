package exercise_190314;

//3. do~while문을 이용해서 1부터 10까지 합을 출력하세요
public class doWhile03 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		do {
			++num;
			sum += num;
		} while (num < 10);
		System.out.println(sum);
	}
}
